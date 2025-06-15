package liliana.session_14.controller.ex1;

import liliana.session_14.dto.LoginRequest;
import liliana.session_14.entity.User;
import liliana.session_14.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserService userService;

    @Autowired
    private HttpServletRequest request;


    @GetMapping
    public String login(Model model) {
        model.addAttribute("user", new User());
        return "ex1/form";
    }

    @PostMapping
    public String loginPost(@Valid @ModelAttribute("user") LoginRequest user, BindingResult result, Model model, HttpSession session) {
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "ex1/form";
        }
        boolean isExitUser = userService.isExitUser(user.getUsername());
        if (!isExitUser) {
            model.addAttribute("errorExisted", "Tài khoản không tồn tại");
            return "ex1/form";
        }

        User user1 = userService.login(user);
        if (user1 == null) {
            model.addAttribute("errorPassword", "Mật khẩu không đúng");
            return "ex1/form";
        }
        session.invalidate();
        HttpSession newSession = request.getSession(true);
        newSession.setAttribute("userSession", user1);
        return "redirect:/login/home";
    }

    @GetMapping("/home")
    public String home(HttpSession session, Model model) {
        model.addAttribute("userSessionInfor", session.getAttribute("userSession"));
        return "ex1/home";
    }
}
