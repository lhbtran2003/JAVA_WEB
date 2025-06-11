package liliana.session_17.configs;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement // Bật hỗ trợ @Transactional
public class HibernateConfig {
    // Cấu hình DataSource kết nối đến MySQL, thiết lập nguồn dữ liệu, giúp Hibernate biết cách kết nối đến database.
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver"); // JDBC Driver cho MySQL
        ds.setUrl("jdbc:mysql://localhost:3307/hibernate?createDatabaseIfNotExist=true"); // Đường dẫn DB
        ds.setUsername("root"); // Tên đăng nhập DB
        ds.setPassword(""); // Mật khẩu DB
        return ds;
    }

    // Cấu hình Hibernate SessionFactory
    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
        sf.setDataSource(dataSource()); // Gắn kết với DataSource đã cấu hình
        sf.setPackagesToScan("liliana.session_17.model.entity"); // Chỉ định package chứa các @Entity

        // Cấu hình các thuộc tính Hibernate
        Properties props = new Properties();
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect"); // Dialect cho MySQL
        props.setProperty("hibernate.hbm2ddl.auto", "update"); // Tự động cập nhật bảng DB theo entity
        props.setProperty("hibernate.show_sql", "true"); // In SQL ra console
        props.setProperty("hibernate.format_sql", "true"); // In SQL ra console
        sf.setHibernateProperties(props);

        return sf;
    }

    // Cấu hình Hibernate Transaction Manager để dùng @Transactional
    @Bean
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
        return new HibernateTransactionManager(sessionFactory);
    }
}
