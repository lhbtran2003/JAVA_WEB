package liliana.session_14.service;

import liliana.session_14.entity.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products = new ArrayList<Product>();
     public void addProduct(Product product) {
         products.add(product);
     }

     public List<Product> getProducts() {
         return products;
     }
}
