package com.data.demo.bt3;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bt3", value = "/bt3")
public class Bt3Servlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        Student student = new Student();
        student.setName("Tran");
        student.setAge(20);

        // Gửi dữ liệu sang JSP
        req.setAttribute("student",student);


        // Chuyển tiếp sang trang JSP
        RequestDispatcher dispatcher = req.getRequestDispatcher("/bt3/bt3.jsp");
        dispatcher.forward(req, resp);

    }
}
