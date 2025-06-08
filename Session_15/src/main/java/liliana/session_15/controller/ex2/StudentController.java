package liliana.session_15.controller.ex2;

import liliana.session_15.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {
    @GetMapping("/ex2")
    public String ex2(Model model) {
        Student student1 = new Student(1, "Nguyễn Văn A", 20, "KS23A", "abc@gmail.com", "97 Man Thiện", "0123456789");
        Student student2 = new Student(2, "Nguyễn Văn B", 20, "KS23A", "abc@gmail.com", "97 Man Thiện", "0123456789");
        Student student3 = new Student(3, "Nguyễn Văn C", 20, "KS23A", "abc@gmail.com", "97 Man Thiện", "0123456789");
        List<Student> list = Arrays.asList(student1, student2, student3);
        model.addAttribute("students", list);
        return "ex2";
    }
}
