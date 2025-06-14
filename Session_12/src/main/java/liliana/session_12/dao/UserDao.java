package liliana.session_12.dao;

import liliana.session_12.entity.User;
import java.sql.*;
import java.util.*;

public class UserDao {
    private final String JDBC_URL = "jdbc:mysql://localhost:3306/studentdb";
    private final String USER = "root";
    private final String PASSWORD = "your_password";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
    }

    public List<User> getAll() {
        List<User> list = new ArrayList<>();
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM student")) {
            while (rs.next()) {
                User s = new User();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setDob(rs.getDate("dob"));
                list.add(s);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void insert(User s) {
        String sql = "INSERT INTO student(name, email, dob) VALUES (?, ?, ?)";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setDate(3, new java.sql.Date(s.getDob().getTime()));
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(User s) {
        String sql = "UPDATE student SET name=?, email=?, dob=? WHERE id=?";
        try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getEmail());
            ps.setDate(3, new java.sql.Date(s.getDob().getTime()));
            ps.setInt(4, s.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id) {
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement("DELETE FROM student WHERE id = ?")) {
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public User findById(int id) {
        User s = null;
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM student WHERE id = ?")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s = new User();
                s.setId(rs.getInt("id"));
                s.setName(rs.getString("name"));
                s.setEmail(rs.getString("email"));
                s.setDob(rs.getDate("dob"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }
}

