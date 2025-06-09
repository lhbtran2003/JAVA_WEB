package liliana.session_15.controller.ex5;

import liliana.session_15.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class Ex5Controller {
    Student student1 = new Student(1, "Nguyễn Văn A", 20, "KS23A", "abc@gmail.com", "97 Man Thiện", "0123456789");
    Student student2 = new Student(2, "Nguyễn Văn B", 20, "KS23A", "abc@gmail.com", "97 Man Thiện", "0123456789");
    Student student3 = new Student(3, "Nguyễn Văn C", 20, "KS23A", "abc@gmail.com", "97 Man Thiện", "0123456789");
    List<Student> list = Arrays.asList(student1, student2, student3);

    @GetMapping("/ex5")
    public String ex5(Model model) {
        model.addAttribute("student", new Student());
        return "ex5/form";
    }

    @PostMapping("/ex5")
    public String ex5Submit(@ModelAttribute("student") Student student, Model model) {
        String name = student.getName();
        List<Student> students = list.stream().filter(stu -> stu.getName().equals(name)).collect(Collectors.toList());
        model.addAttribute("students", students);
        return "ex5/result";
    }
}
