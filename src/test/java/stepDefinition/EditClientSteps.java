package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.EditClientPage;

public class EditClientSteps extends BaseClass {
	
	EditClientPage editClient = new EditClientPage ();
	
	@Given("Check the User Email")
	public void check_the_user_email() throws InterruptedException {
		editClient.check_the_user_email();
		log.info("Entered Email Address");
	}    

	@When("Check the User Password")
	public void check_the_user_password() throws InterruptedException {
	    editClient.check_the_user_password();
	    log.info("Entered password");
	}

	@Then("Check the Login Button")
	public void check_the_login_button() throws InterruptedException {
	 editClient.check_the_login_button();
	 log.info("click on the login button");
	}

	@Then("Check the Test Community Dropdown")
	public void check_the_test_community_dropdown() throws InterruptedException {
	  editClient.check_the_test_community_dropdown();
	  log.info("select test community ");
	}

	@Then("Click on the Continue Button")
	public void click_on_the_continue_button() throws InterruptedException {
	   editClient.click_on_the_continue_button();
	   log.info("click on continue button");
	}

	@Then("Click on the Clients")
	public void click_on_the_clients() throws InterruptedException {
	    editClient.click_on_the_clients();
	    log.info("click on clients link..");
	}
	
	@Then("click on the User Table")
	public void click_on_the_user_table() throws InterruptedException {
	   editClient.click_on_the_user_table();
	   log.info("click on the user data table..");
	}

	@Then("Click on the Edit Button")
	public void click_on_the_edit_button() throws InterruptedException {
	    editClient.click_on_the_edit_button();
	    log.info("click on the edit button..");
	}
	
	@Then("Change the Status from Active to Discharged")
	public void change_the_status_from_active_to_discharged() throws InterruptedException {
		editClient.change_the_status_from_active_to_discharged();
		log.info("change the status");
	}

	@Then("Enter the Discharge Reason")
	public void enter_the_discharge_reason() throws InterruptedException {
		editClient.enter_the_discharge_reason();
		log.info("entered the discharge reason");
	}

	@Then("save the Data")
	public void save_the_data() throws InterruptedException {
	    editClient.save_the_data();
	    log.info("save data..");
	}




}
