package liliana.session_7.controller.ex5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/contact")
    public String contact() {
        return "ex5/contact";
    }
}
