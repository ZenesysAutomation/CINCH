package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Utility {
    private static final String DB_URL = "jdbc:mysql://your-database-url";
    private static final String DB_USER = "your-username";
    private static final String DB_PASSWORD = "your-password";
	private static Utility instance = null;
    
    private Utility() {
        
    }

    public static Utility getInstance() {
        if (instance == null) {
            instance = new Utility();
        }
        return getInstance();
    }
    
    public static void executeDeleteQuery(String query) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}








