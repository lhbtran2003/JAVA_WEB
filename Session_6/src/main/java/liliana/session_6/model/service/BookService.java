package liliana.session_6.model.service;

import liliana.session_6.model.dao.BookDAO;
import liliana.session_6.model.entity.Book;

import java.util.List;

public class BookService {
    private final BookDAO bookDAO;
    private static BookService instance;

    public BookService() {
        bookDAO = BookDAO.getInstance();
    }

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }

    public List<Book> findAll(){
        return bookDAO.findAll();
    }

    public void add(Book book){
        bookDAO.save(book);
    }

    public Book findById(int id){
        return bookDAO.findById(id);
    }

    public void delete(int id){
        bookDAO.delete(id);
    }

    public void update(Book book){
        bookDAO.save(book);
    }
}
