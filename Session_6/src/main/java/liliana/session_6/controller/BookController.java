package liliana.session_6.controller;

import liliana.session_6.model.entity.Book;
import liliana.session_6.model.service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet("/books")
public class BookController extends HttpServlet {
    private BookService bookService;

    @Override
    public void init() throws ServletException {
        bookService = BookService.getInstance();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "list";
        }

        switch (action) {
            case "list":
                List<Book> books = bookService.findAll();
                req.setAttribute("listBook", books);
                req.getRequestDispatcher("/view/listBook.jsp").forward(req, resp);
                break;
            case "new":
                req.getRequestDispatcher("/view/add-book.jsp").forward(req, resp);
                break;
            case "edit":
                int id = Integer.parseInt(req.getParameter("id"));
                req.setAttribute("book", bookService.findById(id));
                req.getRequestDispatcher("/view/editBook.jsp").forward(req, resp);
                break;
            case "delete":
                int idDeleted = Integer.parseInt(req.getParameter("id"));
                bookService.delete(idDeleted);
                resp.sendRedirect(req.getContextPath() + "/books");
                break;

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                Book newBook = new Book(
                        BigDecimal.valueOf(Long.parseLong(req.getParameter("price"))),
                        req.getParameter("name")
                );
                bookService.add(newBook);
                resp.sendRedirect(req.getContextPath() + "/books");
                break;
                case "update":
                    int id = Integer.parseInt(req.getParameter("id"));
                    String name = req.getParameter("name");
                    BigDecimal price = BigDecimal.valueOf(Long.parseLong(req.getParameter("price")));
                    bookService.update(new Book(id, name, price));
                    resp.sendRedirect(req.getContextPath() + "/books");
        }
    }
}
