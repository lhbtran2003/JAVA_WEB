package liliana.session_17.model.dao.ex3;

import liliana.session_17.model.entity.ex3.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductDAO {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Product> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Product> query = session.createQuery("FROM Product", Product.class);
        query.setFirstResult(0);
        query.setMaxResults(5);
        return query.list();
    }
}
