package liliana.session_6.controller;

import liliana.session_6.model.dao.BookDAO;
import liliana.session_6.model.entity.Book;
import liliana.session_6.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

@WebServlet("/add-book")
public class AddBookServlet extends HttpServlet {
    private final BookService bookService;

    public AddBookServlet() {
        bookService = BookService.getInstance();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/view/add-book.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book newBook = new Book(
                BigDecimal.valueOf(Long.parseLong(req.getParameter("price"))),
                req.getParameter("name")
        );

        bookService.add(newBook);
        req.setAttribute("message", "Đã thêm sách thành công");
        req.getRequestDispatcher("/view/formAdd.jsp").forward(req, resp);
    }
}
