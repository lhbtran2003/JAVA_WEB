package liliana.session_6.controller;

import liliana.session_6.model.entity.User;
import liliana.session_6.model.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet
public class LoginController extends HttpServlet {
    private UserService userService;
    @Override
    public void init() throws ServletException {
        userService = UserService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username = req.getParameter("username");
       String password = req.getParameter("password");
       User user = userService.login(username, password);

       if (user != null) {
           req.setAttribute("message", "Đắng nhap thanh cong");
           req.getRequestDispatcher("view/login.jsp").forward(req, resp);
       }else {
           // đăng nhập thất bại → chuyển đến form đăng ký
           req.setAttribute("message", "Tài khoản không tồn tại. Vui lòng đăng ký.");
           req.getRequestDispatcher("view/register.jsp").forward(req, resp);

       }


    }
}
