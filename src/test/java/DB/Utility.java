package DB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Utility {
   
	    private String url;
	    private String username;
	    private String password;
	    private Connection connection;

	    public String getUrl() {
	        return url;
	    }

	    public void setUrl(String url) {
	        this.url = url;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public void openConnection() {
	        try {
	            if (connection == null || connection.isClosed()) {
	                connection = DriverManager.getConnection(url, username, password);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }

	    public Connection getConnection() {
	        return connection;
	    }
	    
	    
	    //close connection 

	    public void closeConnection() {
	        try {
	            if (connection != null && !connection.isClosed()) {
	                connection.close();
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


	










