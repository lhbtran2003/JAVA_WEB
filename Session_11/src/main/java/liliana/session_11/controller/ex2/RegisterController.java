package liliana.session_11.controller.ex2;

import liliana.session_11.model.ex2.LoginForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @GetMapping("/ex2")
    public String ex2(Model model) {
        model.addAttribute("registerer", new LoginForm());
        return "ex2/form";
    }

    @PostMapping("/ex2")
    public String ex2(@Valid @ModelAttribute("registerer") LoginForm loginForm, BindingResult bind, Model model) {
        if (bind.hasErrors()) {
            return "ex2/form";
        }
        model.addAttribute("registerer", loginForm);
        return "ex2/form";
    }
}
