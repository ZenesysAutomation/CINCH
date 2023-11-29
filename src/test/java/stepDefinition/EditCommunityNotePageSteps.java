package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.EditCommunityNotePage;

public class EditCommunityNotePageSteps extends BaseClass {
	
	EditCommunityNotePage edit = new EditCommunityNotePage();
	
	@Given("Enter the Email")
	public void enter_the_email() throws Exception {
	    try {
			edit.enter_the_email();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	    log.info("Entered Email Address");
	}

	@Given("Enter the Password")
	public void enter_the_password() {
	  try {
		edit.enter_the_password();
	} catch (InterruptedException e) {
		e.printStackTrace();	
	}
	  log.info("Entered Password");
	}

	@Given("click on the login Button")
	public void click_on_the_login_button() throws InterruptedException {
	   edit.click_on_the_login_button();
	   log.info("click on the login button..");
	}

	@Given("Select TestCommunity Dropdown")
	public void select_test_community_dropdown() {
	    try {
			edit.select_test_community_dropdown();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    log.info("Select Test Community");
	}

	@Given("click on the Continue")
	public void click_on_the_continue() {
	  edit.click_on_the_continue();
	  log.info("Clicked on Continue button");
	}

	@Given("click on the Manage window")
	public void click_on_the_manage_window() throws InterruptedException {
	    edit.click_on_the_manage_window();
	    log.info("Clicked on the manage link");
	}

	
	@When("Click on the Table")
	public void click_on_the_table() throws InterruptedException {
	  edit.click_on_the_table(); 
	  log.info("Clicked on user data table");
	}

	@When("Edit the Note")
	public void edit_the_note() throws InterruptedException {
	    edit.edit_the_note();
	    log.info("edit the notes..");
	}

	@When("Edit the communities")
	public void edit_the_communities() throws InterruptedException {
	  edit.edit_the_communities();
	  log.info("edit the communities..");
	}

	@When("Edit the Start Date")
	public void edit_the_start_date() throws InterruptedException {
	   edit.edit_the_start_date();
	   log.info("edit the start date..");
	}

	@When("Edit the End Date")
	public void edit_the_end_date() throws InterruptedException {
	    edit.edit_the_end_date();
	    log.info("edit the start date..");
	    
	}

	@Then("Click on the save Button")
	public void click_on_the_save_button() throws Exception {
	    edit.click_on_the_save_button();
	    log.info("save the details..");
	}

	@Given ("When attempting to edit a community note with an empty note field")
	public void when_attempting_to_edit_a_community_note_with_an_empty_note_field() {
		edit.when_attempting_to_edit_a_community_note_with_an_empty_note_field();
		
	}
	
	@And ("Save the Community Note")
	public void save_the_community_note() {
		edit.save_the_community_note();
		
	}
	
	@Then ("Error Message Is displyed The Note field is required")
	public void error_message_is_displyed_the_note_field_is_required() {
		edit.error_message_is_displyed_the_note_field_is_required();
		
	}
}

