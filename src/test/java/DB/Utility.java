package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
    private static Connection connection;

    public static Connection getConnection() {
    	
        if (connection == null) {
            try {
                String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
                String username = "your_username";
                String password = "your_password";
                connection = DriverManager.getConnection(jdbcUrl, username, password);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

	
}









