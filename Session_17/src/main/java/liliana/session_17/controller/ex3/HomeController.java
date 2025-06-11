package liliana.session_17.controller.ex3;

import liliana.session_17.model.service.ex3.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping("/ex3")
    public String ex3(Model model) {
        model.addAttribute("products", productService.findAll());
        return "ex3/home";
    }
}
