package ra.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.web.dao.ProductDao;
import ra.web.entity.Product;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDao productDao;

    public List<Product> findAll() {
        return productDao.findAll();
    }
}
