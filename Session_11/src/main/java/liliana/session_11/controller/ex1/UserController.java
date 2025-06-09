package liliana.session_11.controller.ex1;

import liliana.session_11.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {
    @GetMapping("/ex1")
    public String ex1(Model model) {
        model.addAttribute("user", new User());
        return "ex1/form";
    }

    @PostMapping("/ex1")
    public String processFormSubmit(@Valid @ModelAttribute("user") User user, BindingResult bind) {
        if (bind.hasErrors()) {
            return "ex1/form";
        }
        return "redirect:/ex1";
    }
}
