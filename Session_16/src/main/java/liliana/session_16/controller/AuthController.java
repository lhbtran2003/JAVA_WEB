package liliana.session_16.controller;

import liliana.session_16.model.dto.UserDTO;
import liliana.session_16.model.entity.User;
import liliana.session_16.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthController {
    @Autowired
    AuthService authService;

    @GetMapping("/login")
    public String showFormLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String processFormLogin(@Valid @ModelAttribute("user") UserDTO user, BindingResult bind, Model model) {
        // validate ko hợp lệ
        if (bind.hasErrors()) {
            return "login";
        }
        User isExitUser = authService.login(user.getUsername(), user.getPassword());
        if (isExitUser == null) {
            model.addAttribute("loi", "Invalid username or password");
            model.addAttribute("user", user);
            return "login";
        }
        if ("admin".equals(isExitUser.getRole())) {
            return "redirect:/admin";
        }

        return "redirect:/home";
    }

    @GetMapping("/register")
    public String showFormRegister(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String processFormRegister(@Valid @ModelAttribute("user") User user,BindingResult bind, Model model) {
        if (bind.hasErrors()) {
            return "register";
        }
        authService.register(user.getUsername(), user.getPassword(), user.getEmail());
        return "login";
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {
        return "home";
    }

    @GetMapping("/admin")
    public String showAdminPage(Model model) {
        return "admin";
    }
}
