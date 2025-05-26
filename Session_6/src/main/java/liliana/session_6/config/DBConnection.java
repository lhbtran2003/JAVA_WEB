package liliana.session_6.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
   private final static String URL = "jdbc:mysql://localhost:3307/luyentapsession6";
   private final static String USERNAME = "root";
   private final static String PASSWORD = "";
   public static Connection getConnection() {

       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           return DriverManager.getConnection(URL, USERNAME, PASSWORD);
       } catch (ClassNotFoundException | SQLException e) {
           e.printStackTrace();
           return null;
       }
   }

   public static void closeConnection(Connection con) {
       if (con != null) {
           try {
               con.close();
           } catch (SQLException e) {
               throw new RuntimeException(e);
           }
       }
   }
}
