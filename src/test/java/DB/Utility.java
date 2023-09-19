/*package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Utility {
	
	    private Connection connection;

	    public void DatabaseUtil() {
	        // Initialize your database connection here
	        try {
	            String url = "jdbc:sqlserver://localhost:1433;databaseName=YourDatabase";
	            String username = "yourUsername";
	            String password = "yourPassword";
	            connection = DriverManager.getConnection(url, username, password);
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void deleteTestCase(int testCaseId) {
	        String deleteQuery = "DELETE FROM TestCases WHERE TestCaseID = ?";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteQuery)) {
	            preparedStatement.setInt(1, testCaseId);
	            preparedStatement.executeUpdate();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public void closeConnection() {
	        try {
	            if (connection != null && !connection.isClosed()) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}*/

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








