package liliana.session_8.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

//đánh dấu đây là 1 lớp dùng để cấu hình
@Configuration
//kích hoạt chức năng của spring mvc
@EnableWebMvc
//đánh dấu chỗ quét các package khi khởi động ứng dụng
@ComponentScan(basePackages = "liliana.session_8")
public class WebConfigs {

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
