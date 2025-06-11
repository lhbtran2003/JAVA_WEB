package ra.web.dao;

import org.springframework.stereotype.Repository;
import ra.web.entity.Customer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
@Repository
public class CustomerDao {
    @PersistenceContext
    private EntityManager em;

    public List<Customer> findAll() {
        return em.createQuery("FROM Customer", Customer.class).getResultList();
    }

    public Customer login(String username, String password) {
        return findAll().stream().filter(c -> c.getUsername().equals(username) && c.getPassword().equals(password)).findFirst().orElse(null);
    }

    public boolean checkRole(Customer customer) {
        String role = customer.getRole();
        return role.equals("ADMIN");
    }

}
