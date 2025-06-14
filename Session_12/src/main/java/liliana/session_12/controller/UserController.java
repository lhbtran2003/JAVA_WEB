package liliana.session_12.controller;


import liliana.session_12.entity.User;
import liliana.session_12.service.UserService;


import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    UserService service = new UserService();

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("users", service.findAll());
        return "ex1/list";
    }

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("user", new User());
        return "ex1/form";
    }

    @PostMapping("/save")
    public String save(@Valid @ModelAttribute("user") User user, BindingResult result) {
        if (result.hasErrors()) {
            return "ex1/form";
        }
        service.save(user);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("user", service.findById(id));
        return "ex1/form";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "redirect:/";
    }
}

