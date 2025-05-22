package liliana.controller;

import liliana.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/product-ex4")
public class ProductEx4Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = Arrays.asList(
                new Product(1, "bánh", 10.000, "ngon" ),
                new Product(2, "kẹo", 10.000, "ngon" ),
                new Product("nước", 3, "ngon")
        );

        req.setAttribute("list", list);
        req.getRequestDispatcher("ex4.jsp").forward(req, resp);
    }
}
