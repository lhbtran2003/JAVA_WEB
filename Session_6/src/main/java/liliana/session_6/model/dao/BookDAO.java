package liliana.session_6.model.dao;


import liliana.session_6.config.DBConnection;
import liliana.session_6.model.entity.Book;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    // CRUD
    private final String FINDALL = "{CALL get_all_books()}";
    private final String FINDBYID = "{CALL get_book_by_id(?)}";
    private final String UPDATE = "{CALL update_book(?,?,?)}";
    private final String DELETE = "{CALL delete_book(?)}";
    private final String INSERT = "{CALL add_book(?,?,)}";

    private static BookDAO instance;

    public static BookDAO getInstance() {
        if (instance == null) {
            instance = new BookDAO();
        }
        return instance;
    }


    // lấy danh sách
    public List<Book> findAll() {
        Connection con = DBConnection.getConnection();
        List<Book> books = new ArrayList<>();
        try {
            CallableStatement call = con.prepareCall(FINDALL);
            ResultSet rs = call.executeQuery();

            while (rs.next()) {
                Book book = new Book(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getBigDecimal("price")
                );

                books.add(book);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBConnection.closeConnection(con);
        }
        return books;
    }

    public void save(Book book) {
        Connection con = DBConnection.getConnection();
        List<Book> books = findAll();
        Book isExited = books.stream().filter((b) -> b.getName().equals(book.getName())).findFirst().orElse(null);


        try {
            CallableStatement call;
            if (isExited != null) {
                call = con.prepareCall(UPDATE);
            } else {
                call = con.prepareCall(INSERT);
            }
            call.setString(1, book.getName());
            call.setBigDecimal(2, book.getPrice());
            call.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Book findById(int id) {
        Connection con = DBConnection.getConnection();
        Book book = null;
        try {
            CallableStatement call = con.prepareCall(FINDBYID);
            call.setInt(1, id);
            ResultSet rs = call.executeQuery();
            if (rs.next()) {
                book = new Book();
                book.setId(rs.getInt("id"));
                book.setName(rs.getString("name"));
                book.setPrice(rs.getBigDecimal("price"));
            }
            return book;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBConnection.closeConnection(con);
        }
    }

    public void delete(int id) {
        Connection con = DBConnection.getConnection();
        try {
            CallableStatement call = con.prepareCall(DELETE);
            call.setInt(1, id);
            call.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
