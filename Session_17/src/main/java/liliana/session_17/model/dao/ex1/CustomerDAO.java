package liliana.session_17.model.dao.ex1;

import liliana.session_17.model.entity.ex1.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAO {
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    public void save(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(customer);
    }

    @Transactional
    public List<Customer> findAll() {
        Session session = sessionFactory.getCurrentSession();
        Query<Customer> query = session.createQuery("from Customer", Customer.class);
        query.setFirstResult(0);
        query.setMaxResults(10);
        return query.list();
    }
}
