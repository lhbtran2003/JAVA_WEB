package liliana.session_17.controller.ex1;

import liliana.session_17.model.dao.ex1.CustomerDAO;
import liliana.session_17.model.entity.ex1.Customer;
import liliana.session_17.model.entity.ex2.CustomerDTO;
import liliana.session_17.model.service.ex1.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class AuthController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/ex1")
    public String ex1(Model model){
        model.addAttribute("customer", new Customer());
        return "ex1/registerForm";
    }

    @PostMapping("/ex1")
    public String ex1(@Valid @ModelAttribute("customer")Customer customer, BindingResult bind, Model model){
        if (bind.hasErrors()) {
            model.addAttribute("customer", customer);
            return "ex1/registerForm";
        }

        customerService.save(customer);

        model.addAttribute("messageSuccess", "Đăng kí thành công");
        return "ex2/loginForm";
    }

    @GetMapping("/ex2")
    public String ex2(Model model){
        model.addAttribute("customer", new Customer());
        return "ex2/loginForm";
    }

    @PostMapping("/ex2")
    public String ex2(@Valid @ModelAttribute("customer") CustomerDTO customerDto, BindingResult bind, Model model){
        if (bind.hasErrors()) {
            model.addAttribute("customer", customerDto);
            return "ex2/loginForm";
        }
        Customer customer = customerService.login(customerDto.getUsername(), customerDto.getPassword());

        if(customer == null){
            model.addAttribute("error", "Tài khoản ko tồn tại");
            return "ex2/loginForm";
        }
        model.addAttribute("name", customerDto.getUsername());
        return "ex2/home";

    }
}
