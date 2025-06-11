package liliana.session_17.model.service.ex1;

import liliana.session_17.model.dao.ex1.CustomerDAO;
import liliana.session_17.model.entity.ex1.Customer;
import liliana.session_17.model.entity.ex1.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDAO customerDAO;

    public void save(Customer customer) {
        customer.setRole("USER");
        customer.setStatus(Status.ACTIVE);
        customerDAO.save(customer);
    }

    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    public Customer login(String username, String password) {
        return findAll().stream().filter(c -> c.getUsername().equals(username) && c.getPassword().equals(password)).findFirst().orElse(null);
    }
}
