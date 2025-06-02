package liliana.session_9.controller.ex1;

import liliana.session_9.model.entity.ex1.LoginDTO;
import liliana.session_9.model.service.ex1.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    @Autowired
    LoginServiceImpl loginService;
    @PostMapping("/login")
    public String processLogin(@RequestParam("username") String username, @RequestParam("password") String password, Model model) {
       boolean isValid = true;
        if (username.isEmpty()) {
            String usernameErr = "Username ko được rỗng";
            model.addAttribute("usernameErr", usernameErr);
            isValid = false;
        }
        if (password.isEmpty()) {
            String passwordErr = "Mật khẩu ko được để trống";
            model.addAttribute("passwordErr", passwordErr);
            isValid = false;
        }

        if (isValid) {
            String inform = loginService.login(new LoginDTO(username, password));
            System.out.println(inform);
            model.addAttribute("inform", inform);
            if ("Đăng nhập thành công".equals(inform)) {
                return "ex2/home";
            }
        }
        return "ex1/login";
    }

    @GetMapping("/abc")
    public String showFormLogin() {
        return "ex1/login";
    }
}
