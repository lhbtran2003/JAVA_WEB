package liliana.session_5.controller;

import liliana.session_5.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/ex4")
public class Ex4Servlet extends HttpServlet {
    public static List<Student> list = Arrays.asList(
            new Student(1, "A", 20, "hhaha"),
            new Student(2, "B", 20, "hhaha"),
            new Student(3, "C", 20, "hhaha"),
            new Student(4, "D", 20, "hhaha")
    );
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String idParam = req.getParameter("id");
        if (idParam != null) {
            int id = Integer.parseInt(idParam);
            Student isExit = list.stream().filter((student) -> student.getId() == id).findFirst().orElse(null);
            req.setAttribute("student", isExit);
            req.getRequestDispatcher("ex4-form.jsp").forward(req, resp);
        } else {
            req.setAttribute("list", list);
            req.getRequestDispatcher("ex4.jsp").forward(req, resp);
        }


    }
}
