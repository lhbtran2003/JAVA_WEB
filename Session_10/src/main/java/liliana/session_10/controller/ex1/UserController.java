package liliana.session_10.controller.ex1;

import liliana.session_10.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @GetMapping("/show-form")
    public String home(Model model) {
        model.addAttribute("userSubmitted", new User());
        System.out.println("Home Page");
        return "ex1/userForm";
    }

    @PostMapping("/submit-form")
    public String submitForm(@ModelAttribute("userSubmitted") User user, Model model) {
        model.addAttribute("user", user);
      return "ex1/home";
    }
}
