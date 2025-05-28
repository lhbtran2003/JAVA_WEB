package liliana.session_7.controller;

import liliana.session_7.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
//   @RequestMapping("/products")
//    public String findAllProducts(Model model) {
//       model.addAttribute("list", productService.getAllProducts());
//       return "listProduct";
//   }

    @GetMapping("/products/add")
    public String showFormAdd(Model model) {
         return "addProduct";
    }

//    @PostMapping("/products/add")
//    public String addProduct(@RequestParam("name") String name, @RequestParam("quantity") int quantity, @RequestParam("price") double price, Model model) {
//       productService.addProduct(name, quantity, price);
//       return "redirect:/products";
//    }
}
