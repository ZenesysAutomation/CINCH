package page;

import static org.junit.Assert.assertEquals;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;

import base.BaseClass;

public class DataBasePage extends BaseClass {
	
	private static final int SELECT = 0;
	private static final int FROM = 0;


	public void connectTODatabase() throws SQLException {
		
		openConnection();
		
	}

	private void openConnection() {
		
	}

	public void specifyTableName1() {
		String tableName="your_table_name";
		@SuppressWarnings("unused")
		String sqlQuery = SELECT * FROM + tableName;
		
	}
	
	
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


