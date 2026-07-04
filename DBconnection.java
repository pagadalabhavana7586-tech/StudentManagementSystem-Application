import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // Database URL
    private static final String URL = "jdbc:mysql://localhost:3306/student_management";

    // MySQL Username
    private static final String USERNAME = "root";

    // MySQL Password
    // Change this to your MySQL password
    private static final String PASSWORD = "";

    // Method to get database connection
    public static Connection getConnection() {

        Connection connection = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("Database Connected Successfully!");

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver Not Found!");
            e.printStackTrace();

        } catch (SQLException e) {
            System.out.println("Database Connection Failed!");
            e.printStackTrace();
        }

        return connection;
    }

    // Close Connection
    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database Connection Closed.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
