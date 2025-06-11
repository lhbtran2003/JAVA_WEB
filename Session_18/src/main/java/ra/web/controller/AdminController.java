package ra.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ra.web.entity.Customer;
import ra.web.service.CustomerService;
import ra.web.service.ProductService;

import javax.servlet.http.HttpSession;

@Controller
public class AdminController {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    private boolean isAdmin(HttpSession session) {
        Customer loggedInCustomer = (Customer) session.getAttribute("loggedInCustomer");
        return loggedInCustomer != null && customerService.checkRole(loggedInCustomer);
    }

    @GetMapping({"/admin", "/admin/dashboard"})
    public String admin(Model model, HttpSession session) {
        if (!isAdmin(session)) {
            model.addAttribute("error", "Trang không tồn tại");
        }
        model.addAttribute("activePage", "dashboard");
        model.addAttribute("contentFragment", "ex1/dashboard");
        return "ex1/admin";
    }

    @GetMapping("/admin/products")
    public String products(Model model) {
        model.addAttribute("activePage", "products");
        model.addAttribute("contentFragment", "ex2/product");

        model.addAttribute("products", productService.findAll());
        return "ex1/admin";
    }
}
