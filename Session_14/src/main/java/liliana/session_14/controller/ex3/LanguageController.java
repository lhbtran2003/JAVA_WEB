package liliana.session_14.controller.ex3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

@Controller
public class LanguageController {
    @ModelAttribute("language")
    public String getLanguage(Locale locale) {
        return locale.getLanguage();
    }
    @PostMapping("/change-language")
    public String changeLanguage(@RequestParam("language") String lang, HttpServletResponse response) {
        Cookie cookie = new Cookie("lang", lang);
        cookie.setMaxAge(5*60); // lưu 30 ngày
        cookie.setPath("/");
        response.addCookie(cookie);
        return "redirect:/home";
    }
}
