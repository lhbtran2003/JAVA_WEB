package liliana.session_5.controller;

import liliana.session_5.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ex3")
public class Ex3Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");
        String address = req.getParameter("address");

        String error = null;

        if (name == null || name.trim().isEmpty() ||
                ageStr == null || ageStr.trim().isEmpty() ||
                address == null || address.trim().isEmpty()) {
            error = "Nhập đủ đi bạn êyyy";
        }
        int age = 0;
        try {
            age = Integer.parseInt(ageStr);
            if (age < 1 || age > 120) {
                error = "Tuổi không hợp lệ.";
            }
        } catch (NumberFormatException e) {
            error = "Tuổi phải là số.";
        }

        if (error != null) {
            req.setAttribute("error", error);
            req.getRequestDispatcher("ex3.jsp").forward(req, resp);
        } else {
            Student student = new Student(
                    name, age, address
            );
            req.setAttribute("student", student);
            req.getRequestDispatcher("ex3.jsp").forward(req, resp);
        }
    }
}
