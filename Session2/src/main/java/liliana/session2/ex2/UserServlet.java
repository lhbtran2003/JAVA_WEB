package liliana.session2.ex2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user-info")
public class UserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String name = req.getParameter("name");
        String age = req.getParameter("age");

        req.setAttribute("name", name);
        req.setAttribute("age", age);

        RequestDispatcher rd = getServletContext().getRequestDispatcher("/ex2/user-info.jsp");

    }
}
