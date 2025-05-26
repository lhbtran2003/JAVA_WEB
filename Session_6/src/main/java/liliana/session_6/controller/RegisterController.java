package liliana.session_6.controller;

import liliana.session_6.model.entity.User;
import liliana.session_6.model.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterController extends HttpServlet {
    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = UserService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("view/register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");

        if (userService.isUserNameExist(username)) {
            req.setAttribute("message", "Tên đăng nhập đã tồn tại, vui lòng chọn tên khác.");
            try {
                req.getRequestDispatcher("view/register.jsp").forward(req, resp);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            User user = new User(id, username, password, email, phone);
            userService.register(user);
            req.setAttribute("message", "Đăng ký thành công! Mời bạn đăng nhập.");
            req.getRequestDispatcher("view/login.jsp").forward(req, resp);
        }
    }
}
