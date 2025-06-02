package liliana.session_10.controller.ex3;

import liliana.session_10.model.entity.Account;
import liliana.session_10.model.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {
    @GetMapping("/account/add")
    public String showAddProductForm(Model model) {
        model.addAttribute("account", new Account());
        return "ex3/registerForm";
    }

    @PostMapping("/account/add")
    public String addProduct (@ModelAttribute("account") Account account, Model model) {
        model.addAttribute("account", account);
        return "ex3/display";
    }
}
