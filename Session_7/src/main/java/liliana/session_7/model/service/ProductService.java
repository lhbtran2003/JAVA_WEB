package liliana.session_7.model.service;

import liliana.session_7.model.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    List<Product> list = Arrays.asList(
            new Product("bánh", 10, 5.0),
            new Product("kẹo", 20, 2.5),
            new Product("nước", 15, 7.0)
    );

    public List<?> getAllProducts() {
        return list;
    }

    public void addProduct(String name, int quantity, double price) {
         Product p = new Product(name, quantity, price);
         list.add(p);
    }
}
