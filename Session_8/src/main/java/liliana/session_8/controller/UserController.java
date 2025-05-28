package liliana.session_8.controller;

import liliana.session_8.model.entity.UserEx5;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {
    @GetMapping("/users.")
    public ModelAndView showListUser(Model model) {
        List<UserEx5> users = new ArrayList<>(Arrays.asList(
                new UserEx5("Nguyễn Văn A", 25, "1999-02-15", "vana@gmail.com", "0901234567"),
                new UserEx5("Trần Thị B", 30, "1994-07-20", "thib@gmail.com", "0912345678"),
                new UserEx5("Lê Văn C", 22, "2002-01-10", "vanc@gmail.com", "0923456789")
        ));

        ModelAndView modelAndView = new ModelAndView("listUser");
        modelAndView.addObject("users", users);

        return modelAndView;
    }
}
