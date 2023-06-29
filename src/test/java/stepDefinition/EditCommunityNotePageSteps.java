package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.EditCommunityNotePage;

public class EditCommunityNotePageSteps extends BaseClass {
	
	EditCommunityNotePage edit = new EditCommunityNotePage();
	
	

	@Given("Enter the Email")
	public void enter_the_email() {
	    edit.enter_the_email();
	}

	@Given("Enter the Password")
	public void enter_the_password() {
	  edit.enter_the_password();
	}

	@Given("click on the login Button")
	public void click_on_the_login_button() throws InterruptedException {
	   edit.click_on_the_login_button();
	}

	@Given("Select TestCommunity Dropdown")
	public void select_test_community_dropdown() {
	    edit.select_test_community_dropdown();
	}

	@Given("click on the Continue")
	public void click_on_the_continue() {
	  edit.click_on_the_continue();
	}

	@Given("click on the Manage window")
	public void click_on_the_manage_window() throws InterruptedException {
	    edit.click_on_the_manage_window();
	}

	
	@When("Click on the Table")
	public void click_on_the_table() {
	  edit.click_on_the_table();  
	}

	@When("Edit the Note")
	public void edit_the_note() throws InterruptedException {
	    edit.edit_the_note();
	}

	@When("Edit the communities")
	public void edit_the_communities() throws InterruptedException {
	  edit.edit_the_communities();
	}

	@When("Edit the Start Date")
	public void edit_the_start_date() throws InterruptedException {
	   edit.edit_the_start_date();
	}

	@When("Edit the End Date")
	public void edit_the_end_date() throws InterruptedException {
	    edit.edit_the_end_date();
	}

	@Then("Click on the save Button")
	public void click_on_the_save_button() throws InterruptedException {
	    edit.click_on_the_save_button();
	}

}

