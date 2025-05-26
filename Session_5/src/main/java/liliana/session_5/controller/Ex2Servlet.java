package liliana.session_5.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ex2")
public class Ex2Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("name", req.getParameter("name"));
        req.setAttribute("age", req.getParameter("age"));
        req.setAttribute("address", req.getParameter("address"));

        req.getRequestDispatcher("ex2.jsp").forward(req, resp);
    }
}
