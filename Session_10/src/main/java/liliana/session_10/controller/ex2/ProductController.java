package liliana.session_10.controller.ex2;

import liliana.session_10.model.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @GetMapping("/product/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "ex2/productForm";
    }

    @PostMapping("/product/add")
    public String addProduct (@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product", product);
        return "ex2/display";
    }

}
