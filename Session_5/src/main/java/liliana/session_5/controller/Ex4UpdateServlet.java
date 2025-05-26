package liliana.session_5.controller;

import liliana.session_5.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ex4-update")
public class Ex4UpdateServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        int age = Integer.parseInt(req.getParameter("age"));
        String address = req.getParameter("address");


        for (Student student : Ex4Servlet.list) {
            if (student.getId() == id) {
                student.setName(name);
                student.setAge(age);
                student.setAddress(address);
                break;
            }
        }
       resp.sendRedirect(req.getContextPath()+"/ex4");
    }
}
