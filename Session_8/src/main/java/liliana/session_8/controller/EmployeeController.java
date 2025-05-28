package liliana.session_8.controller;

import liliana.session_8.model.entity.Employee;
import liliana.session_8.model.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public String getListEmployee(Model model) {
        model.addAttribute("list", employeeService.getEmployees());
        return "listEmployee";
    }

    @GetMapping("/employees/add")
    public String showFormAdd() {
        return "addEmployee";
    }

    @PostMapping("/employees/add")
    public String addEmployee(@RequestParam String name, @RequestParam String email, @RequestParam String position, Model model) {
        employeeService.addEmployees(name,email,position);
        return "redirect:/employees";
    }
}
