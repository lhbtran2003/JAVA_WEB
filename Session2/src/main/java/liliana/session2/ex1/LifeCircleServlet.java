package liliana.session2.ex1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ex1")
public class LifeCircleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("Vào init");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        System.out.println("Vào doGet");
    }

    @Override
    public void destroy() {
        System.out.println("vào destroy.");
    }
}
