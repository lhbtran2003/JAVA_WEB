package liliana.session_7.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", "Chào mừng đến với ứng dụng của chúng tôi!");
        return "welcome";
    }
}
