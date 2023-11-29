package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddCommunityNotePage;

public class AddCommunityNotePageSteps extends BaseClass {
	
	AddCommunityNotePage page= new AddCommunityNotePage();
	
	
	@Given("User enters Email")
	public void user_enters_email() throws Exception {
	    page.user_enters_email();
	    log.info("entered Email Address ");
	}
	
	@Given("User enters Password")
	public void user_enters_password() {
		page.user_enters_password();
		log.info("Password Entered");
	}

	@Given("Click on the login")
	public void Click_on_the_login() throws InterruptedException {
		page.Click_on_the_login();
		log.info("Clicked on login button");
	}


	@Given("Select the TestCommunity")
	public void select_the_test_community() throws InterruptedException {
	   page.select_the_test_community();
	   log.info("Select Test Community");
	}

	@Given("Click on the Continue")
	public void click_on_the_continue() {
	   page.click_on_the_continue();
	   log.info("Clicked on Continue button");
	}
	
	@Given("Click on the Manage")
	public void click_on_the_manage() throws InterruptedException {
	   page.click_on_the_manage(); 
	   log.info("Clicked on the Manage link");
	}

	@When("Click on the Add New Community Note")
	public void click_on_the_add_new_community_note() throws InterruptedException {
	    page.click_on_the_add_new_community_note();
	    log.info("Clicked on add new community note");
	}

	@When("Enter the Note")
	public void enter_the_note() throws InterruptedException {
	    page.enter_the_note();
	    log.info("entered note");
	}

	@When("Select Communities")
	public void select_communities() throws InterruptedException {
	    page.select_communities();
	    log.info("select communities");
	}

	@When("Choose a Start Date")
	public void choose_a_start_date() throws InterruptedException {
	  page.choose_a_start_date();
	  log.info("select communities");
	}

	@When("Choose an End Date")
	public void choose_an_end_date() throws InterruptedException {
	   page.choose_an_end_date();
	   log.info("select an end date");
	}

	@When("Click on the Save Button")
	public void click_on_the_save_button() throws InterruptedException {
	    page.click_on_the_save_button();
	    log.info("saved the data");
	}
	
	@Then ("Community Note was Created Message Should be Shown")
	public void community_note_was_created_message_should_be_shown() throws Exception {
		page.community_note_was_created_message_should_be_shown();
		log.info("validation msg showing - note was created");
		
	}
	
	 @Given("User Enter their Email and Password")
	    public void UserEntertheirEmailandPassword() throws Exception {
		 page.UserEntertheirEmailandPassword();
		 log.info("User Enter Email and Password");
		 
	    }

	    @Then("Click the Login button")
	    public void clickLoginButton() {
	       page.clickLoginButton();
	       log.info("Click to login Button");
	    }

	    @And("Select the Testcommunity")
	    public void selectTestCommunity() {
	        page.selectTestCommunity();
	        log.info("Select Test Community");
	    }

	    @And("Click the Continue button")
	    public void clickContinueButton() {
	        page.clickContinueButton();
	        log.info("Click on the continue button");
	    }

	    @And("Click the Manage button")
	    public void clickManageButton() {
	    	page.clickManageButton();
	    	log.info("Click on the Manage Button");
	    }

	    @And("Click on the Add New Community Note option")
	    public void clickAddNewCommunityNote() {
	        page.clickAddNewCommunityNote();
	        log.info("Click on the Add New Community Note");
	    }

	    @And("Attempt to create a community note without entering the required information")
	    public void attemptToCreateCommunityNoteWithoutInformation() throws InterruptedException {
	        page.attemptToCreateCommunityNoteWithoutInformation();
	        log.info("click on the notes field");
	    }

	    @And("Click the Save button")
	    public void clickSaveButton() throws InterruptedException {
	        page.clickSaveButton();
	        log.info("Click on the Save button");
	    }
	    
	    @Then ("Validation Message The Note field is required is Displayed")
	    public void ValidationMessageTheNotefieldisrequiredisDisplayed() throws Exception {
	    	page.ValidationMessageTheNotefieldisrequiredisDisplayed();
	    	log.info("Validation message is displayed-The Note field is required");
	    }
}
