package liliana.session_8.controller;

import liliana.session_8.model.entity.User;
import liliana.session_8.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
    @Autowired
    private UserService userService;

    @GetMapping("/users/form")
    public String form() {
        return "registration";
    }
   @PostMapping("/users/register")
    public String registerUser(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") String phone, Model model) {
        boolean isValid = true;
       if (name.isEmpty() ) {
           model.addAttribute("errorName", "Name is required");
           isValid = false;
       }
       if (email.isEmpty() ) {
           model.addAttribute("errorEmail", "Email is required");
           isValid = false;
       } else if (userService.isExitByEmail(email)) {
           model.addAttribute("errorEmail", "Email is already in use");
           isValid = false;
       }

       if (phone.isEmpty() ) {
           model.addAttribute("errorPhone", "Phone is required");
           isValid = false;
       }

       if (isValid) {
           userService.registerUser(new User(name, email, phone));
           return "redirect:/";
       }
       model.addAttribute("name", name);
       model.addAttribute("email", email);
       model.addAttribute("phone", phone);
       return "registration";

   }
}
