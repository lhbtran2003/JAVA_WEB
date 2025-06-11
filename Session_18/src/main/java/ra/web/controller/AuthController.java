package ra.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ra.web.dto.LoginRequest;
import ra.web.entity.Customer;
import ra.web.service.CustomerService;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class AuthController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/login")
    public String ex1(Model model){
        model.addAttribute("customer", new Customer());
        return "ex1/login";
    }

    @PostMapping("/login")
    public String ex2(@Valid @ModelAttribute("customer") LoginRequest request, BindingResult bind, Model model, HttpSession session){
        if (bind.hasErrors()) {
            model.addAttribute("customer", request);
            return "ex1/login";
        }
        Customer customer = customerService.login(request.getUsername(), request.getPassword());

        if(customer == null){
            model.addAttribute("error", "Tài khoản ko tồn tại");
            return "ex1/login";
        }
        session.setAttribute("loggedInCustomer", customer);
        if (customerService.checkRole(customer)) {
            return "redirect:/admin";
        }
        model.addAttribute("name", request.getUsername());
        return "ex1/home";

    }
}
