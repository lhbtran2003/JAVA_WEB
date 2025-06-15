package liliana.session_14.controller.ex4;

import liliana.session_14.dto.CartRequest;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.*;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Controller
public class CartController {

    @GetMapping("/add")
    public String showForm(Model model) {
        model.addAttribute("product", new CartRequest());
        return "ex4/addToCart";
    }

    @PostMapping("/add")
    public String addToCart(@ModelAttribute("product") CartRequest product,
                            HttpSession session,
                            HttpServletRequest request,
                            HttpServletResponse response) {

        // 1. Thêm vào session (giỏ hàng)
        List<CartRequest> cart = (List<CartRequest>) session.getAttribute("cart");
        if (cart == null) cart = new ArrayList<>();
        cart.add(product);
        session.setAttribute("cart", cart);

        // 2. Lưu tên sản phẩm vào cookie (để lưu sản phẩm từng thêm)
        String cookieValue = "";
        Cookie[] cookies = request.getCookies();
        for (Cookie c : cookies != null ? cookies : new Cookie[0]) {
            if ("products".equals(c.getName())) {
                cookieValue = URLDecoder.decode(c.getValue(), StandardCharsets.UTF_8);
                break;
            }
        }

        if (!cookieValue.contains(product.getName())) {
            cookieValue = cookieValue.isEmpty() ? product.getName() : cookieValue + "," + product.getName();
        }

        Cookie cookie = new Cookie("products", URLEncoder.encode(cookieValue, StandardCharsets.UTF_8));
        cookie.setPath("/");
        cookie.setMaxAge(7 * 24 * 60 * 60); // 1 tuần
        response.addCookie(cookie);

        return "redirect:/cart/view";
    }

    @GetMapping("/view")
    public String viewCart(HttpSession session,
                           @CookieValue(value = "products", defaultValue = "") String products,
                           Model model) {
        List<CartRequest> cart = (List<CartRequest>) session.getAttribute("cart");
        if (cart == null) cart = new ArrayList<>();

        model.addAttribute("cart", cart);
        model.addAttribute("recentCartRequests", Arrays.asList(products.split(",")));

        return "ex4/view";
    }

    @GetMapping("/delete")
    public String deleteItem(@RequestParam("name") String name, HttpSession session) {
        List<CartRequest> cart = (List<CartRequest>) session.getAttribute("cart");
        if (cart != null) {
            cart.removeIf(p -> p.getName().equals(name));
            session.setAttribute("cart", cart);
        }
        return "redirect:/cart/view";
    }
}
