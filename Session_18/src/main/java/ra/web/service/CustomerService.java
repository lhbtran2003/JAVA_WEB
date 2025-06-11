package ra.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.web.dao.CustomerDao;
import ra.web.entity.Customer;
import ra.web.entity.Status;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerDao customerDAO;



    public List<Customer> findAll() {
        return customerDAO.findAll();
    }

    public Customer login(String username, String password) {
        return findAll().stream().filter(c -> c.getUsername().equals(username) && c.getPassword().equals(password)).findFirst().orElse(null);
    }

    public boolean checkRole (Customer customer) {
        return customerDAO.checkRole(customer);
    }
}