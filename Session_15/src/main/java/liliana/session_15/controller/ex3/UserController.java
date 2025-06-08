package liliana.session_15.controller.ex3;

import liliana.session_15.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/ex3")
    public String ex3(Model model) {
        model.addAttribute("user", new User());
        return "ex3/ex3";
    }

    @PostMapping("/ex3")
    public String ex3Submit(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "ex3/ex3";
        }
        model.addAttribute("message", "success");
        return "ex3/result";

    }
}
