package com.data.demo.bt5;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/error-example")
public class ErrorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int result = 10/0;
            resp.getWriter().print("<html><body>" + result + "</body></html>");
        } catch (Exception e) {
            req.setAttribute("errorMessage", "Đã xảy ra lỗi: " + e.getMessage());
            RequestDispatcher dispatcher = req.getRequestDispatcher("/bt5/error.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
