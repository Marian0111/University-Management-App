package JdbcProiect;

import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (Exception ex) {
            System.err.println("An Exception occured during JDBC Driver loading." + " Details are provided below:");
            ex.printStackTrace(System.err);
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost/proiect?user=root&password=BktAndr3i!01");
            LoginPage x = new LoginPage(connection);
        } catch (SQLException sqlex) {
            System.err.println("An SQL Exception occured. Details are provided below:");
            sqlex.printStackTrace(System.err);
        }
    }
}