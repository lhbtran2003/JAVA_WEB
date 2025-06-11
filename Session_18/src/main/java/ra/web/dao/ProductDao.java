package ra.web.dao;

import org.springframework.stereotype.Repository;
import ra.web.entity.Customer;
import ra.web.entity.Product;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductDao {
    @PersistenceContext
    private EntityManager em;

    public List<Product> findAll() {
        return em.createQuery("FROM Product ", Product.class).getResultList();
    }



}
