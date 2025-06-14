package liliana.session_12.configs;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final String url = "jdbc:mysql://localhost:3307/session12?createDatabaseIfNotExist=true";
    private final String user = "root";
    private final String password = "";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
