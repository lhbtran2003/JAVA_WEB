package liliana.session_15.controller.ex1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex1Controller {
    @GetMapping("/ex1")
    public String ex1() {
        return "ex1";
    }
}
