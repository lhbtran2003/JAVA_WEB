package liliana.session_12.service;



import liliana.session_12.dao.ProductDap;
import liliana.session_12.entity.Product;

import java.util.List;

public class ProductService {
    private final ProductDap productDAO = new ProductDap();

    public List<Product> getAll() {
        return productDAO.findAll();
    }

    public void save(Product p) {
        if (p.getId() == 0) {
            productDAO.insert(p);
        } else {
            productDAO.update(p);
        }
    }

    public void delete(int id) {
        productDAO.delete(id);
    }

    public Product findById(int id) {
        return productDAO.findById(id);
    }
}

