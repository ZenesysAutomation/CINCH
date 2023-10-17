/*package stepDefinition;	
import DB.DataFetcher;
import io.cucumber.java.en.When;

	public class DataBaseSteps {
	    @When("I fetch data from the database")
	    public void fetchDataFromDatabase() {
	        String query = "SELECT column_name FROM table_name WHERE condition;"; // Replace with your query
	        String data = DataFetcher.fetchDataFromDatabase(query);
	        // Use 'data' in your test
	        System.out.println("Fetched data from the database: " + data);
	    }
	}*/

package stepDefinition;
import java.sql.SQLException;
import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.DataBasePage;


public class DataBaseSteps extends BaseClass{
	
	DataBasePage db = new DataBasePage ();
	
	@Given("I have a Connection to the MySql Database")
	public void connectTODatabase() throws SQLException {
		db.connectTODatabase();
		log.info("connected to the database");
		
	}
	
	@And("I want to delete a table named {string}")
	public void specifyTableName(String tableName) {
		db.specifyTableName();
		log.info("select a table");
	}
	
	@When("I Excecute the Delete table SQL Query")
	public void executeDeleteQuery() throws SQLException {
		db.executeDeleteQuery();
		log.info("Delete a Table");
		
	}
	
	@Then("The Table {string} should be deleted Successfully")
	public void DeleteTable(String tableName) {
		db.DeleteTable();
		log.info("Validation Message showing-Table Successfully Deleted");
			
	} 
	
}



