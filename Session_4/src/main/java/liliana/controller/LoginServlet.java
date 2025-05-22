package liliana.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");


        if (username.equals("admin") && password.equals("123456")) {
            req.setAttribute("correct", true);
            req.getRequestDispatcher("form.jsp").forward(req, resp);
        } else {
            req.setAttribute("correct", false);
            req.getRequestDispatcher("form.jsp").forward(req, resp);
        }
    }
}
