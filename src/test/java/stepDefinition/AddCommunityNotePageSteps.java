package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddCommunityNotePage;

public class AddCommunityNotePageSteps extends BaseClass {
	
	AddCommunityNotePage page= new AddCommunityNotePage();
	
	
	@Given("User enters Email")
	public void user_enters_email() {
	    page.user_enters_email();
		
	}
	
	@Given("User enters Password")
	public void user_enters_password() {
		page.user_enters_password();

	}

	@Given("Click on the login")
	public void Click_on_the_login() throws InterruptedException {
		page.Click_on_the_login();

	}


	@Given("Select the TestCommunity")
	public void select_the_test_community() throws InterruptedException {
	   page.select_the_test_community();
	}

	@Given("Click on the Continue")
	public void click_on_the_continue() {
	   page.click_on_the_continue();
	}
	
	@Given("Click on the Manage")
	public void click_on_the_manage() throws InterruptedException {
	   page.click_on_the_manage(); 
	}

	@When("Click on the Add New Community Note")
	public void click_on_the_add_new_community_note() throws InterruptedException {
	    page.click_on_the_add_new_community_note();
	}

	@When("Enter the Note")
	public void enter_the_note() throws InterruptedException {
	    page.enter_the_note();
	}

	@When("Select Communities")
	public void select_communities() throws InterruptedException {
	    page.select_communities();
	}

	@When("Choose a Start Date")
	public void choose_a_start_date() throws InterruptedException {
	  page.choose_a_start_date();
	}

	@When("Choose a End Date")
	public void choose_a_end_date() throws InterruptedException {
	   page.choose_a_end_date();
	}

	@When("Click on the Save Button")
	public void click_on_the_save_button() throws InterruptedException {
	    page.click_on_the_save_button();
	}
	
	@Then ("Community Note was Created Message Should be Shown")
	public void community_note_was_created_message_should_be_shown() {
		page.community_note_was_created_message_should_be_shown();
		
	}

}
