package liliana.session_6.controller;

import liliana.session_6.model.entity.Book;
import liliana.session_6.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet ("/books")
public class FindAllBookServlet extends HttpServlet {
    private final BookService bookService;

    public FindAllBookServlet() {
        bookService = BookService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Book> books = bookService.findAll();
        req.setAttribute("listBook",books);
        req.getRequestDispatcher("/view/listBook.jsp").forward(req, resp);
    }
}
