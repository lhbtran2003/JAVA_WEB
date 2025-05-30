package liliana.controller;

import liliana.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/product")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "bánh", 10.000, "giòn giòn"));
        list.add(new Product(2, "kẹo", 10.000, "giòn giòn"));
        list.add(new Product(3, "nước", 10.000, "giòn giòn"));

        req.setAttribute("list", list);
        req.getRequestDispatcher("productList.jsp").forward(req, resp);
    }
}
