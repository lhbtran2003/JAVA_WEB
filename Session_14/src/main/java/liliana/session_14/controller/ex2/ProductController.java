package liliana.session_14.controller.ex2;

import liliana.session_14.entity.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.*;

@Controller
@RequestMapping("/product")
public class ProductController {

    @ModelAttribute("language")
    public String getLanguage(Locale locale) {
        return locale.getLanguage();
    }


    @GetMapping("/add")
    public String showFormAdd(Model model) {
        model.addAttribute("product", new Product());
        return "ex2/add";
    }

    @PostMapping("/add")
    public String processAdd(@Valid @ModelAttribute("product") Product product,
                             Model model,
                             HttpServletRequest request,
                             HttpServletResponse response) {

        // Đọc cookie hiện tại
        String productList = "";
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("productList".equals(c.getName())) {
                    productList = URLDecoder.decode(c.getValue(), StandardCharsets.UTF_8);
                }
            }
        }

        // Thêm sản phẩm mới vào chuỗi
        String newProduct = product.getId() + ":" + product.getName() + ":" + product.getPrice();
        if (!productList.isEmpty()) {
            productList += "|" + newProduct;
        } else {
            productList = newProduct;
        }

        // Lưu lại vào cookie
        Cookie cookie = new Cookie("productList", URLEncoder.encode(productList, StandardCharsets.UTF_8));
        cookie.setPath("/");
        cookie.setMaxAge(7 * 24 * 60 * 60); // 1 tuần
        response.addCookie(cookie);

        return "redirect:/product";
    }

    @GetMapping("")
    public String showList(@CookieValue(value = "productList", defaultValue = "") String productList, Model model) {
        List<Product> list = new ArrayList<>();

        if (!productList.isEmpty()) {
            String decoded = URLDecoder.decode(productList, StandardCharsets.UTF_8);
            String[] items = decoded.split("\\|");
            for (String item : items) {
                String[] parts = item.split(":");
                if (parts.length == 3) {
                    Product p = new Product();
                    p.setId(parts[0]);
                    p.setName(parts[1]);
                    p.setPrice(Double.parseDouble(parts[2]));
                    list.add(p);
                }
            }
        }

        model.addAttribute("products", list);
        return "ex2/home";
    }

    @GetMapping("/delete")
    public String deleteProduct(@RequestParam("id") String id,
                                @CookieValue(value = "productList", defaultValue = "") String productList,
                                HttpServletResponse response) {

        List<String> updatedItems = new ArrayList<>();

        String decoded = URLDecoder.decode(productList, StandardCharsets.UTF_8);
        String[] items = decoded.split("\\|");
        for (String item : items) {
            if (!item.startsWith(id + ":")) {
                updatedItems.add(item);
            }
        }

        String updatedList = String.join("|", updatedItems);
        Cookie cookie = new Cookie("productList", URLEncoder.encode(updatedList, StandardCharsets.UTF_8));
        cookie.setPath("/");
        cookie.setMaxAge(7 * 24 * 60 * 60);
        response.addCookie(cookie);

        return "redirect:/product";
    }
}
