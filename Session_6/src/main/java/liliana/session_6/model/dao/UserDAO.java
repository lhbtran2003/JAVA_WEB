package liliana.session_6.model.dao;

import liliana.session_6.config.DBConnection;
import liliana.session_6.model.entity.User;

import java.sql.*;

public class UserDAO {
    private static UserDAO instance;
    private final String LOGIN = "{CALL check_user_login(?,?)}";
    private final String REGISTER = "{CALL insert_user(?,?,?,?)}";

    public static UserDAO getInstance() {
        if (instance == null) {
            instance = new UserDAO();
        }
        return instance;
    }

    public User login(String username, String password) {
        Connection con = DBConnection.getConnection();
        User user = null;
        try {
            CallableStatement call = con.prepareCall(LOGIN);
            call.setString(1, username);
            call.setString(2, password);
            ResultSet rs = call.executeQuery();
            if (rs.next()) {
                user = new User();
                user.setId(rs.getInt("username"));
                user.setName(rs.getString("password"));
            }
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            DBConnection.closeConnection(con);
        }
    }

    public void register(User user) {
        try (Connection conn = DBConnection.getConnection();
             CallableStatement stmt = conn.prepareCall(REGISTER)) {
            stmt.setInt(1, user.getId());
            stmt.setString(2, user.getName());
            stmt.setString(3, user.getPassword());
            stmt.setString(4, user.getEmail());
            stmt.setString(5, user.getPhone());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean isUsernameExists(String username) {
        boolean isExist = false;
        try (Connection conn = DBConnection.getConnection();
             CallableStatement stmt = conn.prepareCall("{CALL check_username_exists(?, ?)}")) {

            stmt.setString(1, username);
            stmt.registerOutParameter(2, Types.BOOLEAN);
            stmt.execute();

            isExist = stmt.getBoolean(2);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return isExist;
    }

}
