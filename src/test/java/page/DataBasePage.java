package page;

import static org.junit.Assert.assertEquals;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;

import base.BaseClass;

public class DataBasePage extends BaseClass {
	

	public void connectTODatabase() throws SQLException {
		
		 	String url = "jdbc:mysql://localhost:3306/your_database";
		    String username = "your_username";
		    String password = "your_password";
		    
		    Connection connection = null;
		    Statement statement = null;

		    try {
		        connection = DriverManager.getConnection(url, username, password);
		        statement = connection.createStatement();
		     // Use 'connection' and 'statement' for database operations here
		        
		    } catch (SQLException e) {
		        e.printStackTrace();
		    } finally {
		        try {
		           
		            if (statement != null) {
		                statement.close();
		            }
		            
		            if (connection != null) {
		                connection.close();
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
		}

	/*public void specifyTableName() {
		String tableName="your_table_name";
		String sqlQuery = SELECT * FROM + tableName;
		
	}*/
	
	public String buildSelectQuery(String tableName) {
	    String sqlQuery = "SELECT * FROM " + tableName;
	    return sqlQuery;
	}

	public void specifyTableName() {
	    String tableName = "your_table_name";
	    @SuppressWarnings("unused")
		String sqlQuery = buildSelectQuery(tableName);   
	}
	
	
	@SuppressWarnings("null")
	public void executeDeleteQuery() throws SQLException {
		
		String tableName = "my_table"; // Get the table name from previous step
        String deleteQuery = "DROP TABLE " + tableName;

        Statement statement = null;
		statement.executeUpdate(deleteQuery);
	}
	
	
	public void DeleteTable() {
		try {
			String Expectedresult = "Delete Table.";
			String Actualresult=driver.findElement(By.xpath("(//li[normalize-space()='The Logon field is required.'])[1]")).getText();
			assertEquals("error message is showing",Expectedresult,Actualresult);
			}
			catch (Exception e) {
				e.printStackTrace();
			}			
	} 
	
}


