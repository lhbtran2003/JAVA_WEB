package liliana.session_17.model.service.ex3;

import liliana.session_17.model.dao.ex3.ProductDAO;
import liliana.session_17.model.entity.ex3.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductDAO productDAO;

   public List<Product> findAll() {
       return productDAO.findAll();
   }
}
