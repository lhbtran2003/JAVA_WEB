package liliana.session_15.controller.ex4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex4Controller {
    @GetMapping("/home")
    public String home() {
        return "ex4/home";
    }

    @GetMapping("/about")
    public String about() {
        return "ex4/about";
    }

    @GetMapping("/contact")
    public String contact() {
        return "ex4/contact";
    }
}
