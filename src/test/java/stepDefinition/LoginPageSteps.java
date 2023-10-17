package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.LoginPage;

public class LoginPageSteps extends BaseClass{
	
	LoginPage login = new LoginPage();


	@Given("Verify that user enter the {string} and {string}")
	public void Verify_that_user_enter_the_Email_and_Password(String email, String pass){
		login.Verify_that_user_enter_the_Email_and_Password(email,pass);
		log.info("entered email address and password ");
	}
	
	
	@When("Click on the Login Button")
	public void click_on_the_login_button() throws InterruptedException {
	   login.click_on_the_login_button();
	   log.info("Clicked on the login button");
	}

	@And("Verify the Dropdown and select the Test Community")
	public void Verify_the_Dropdown_and_select_the_Test_Community() throws InterruptedException {
		login.Verify_the_Dropdown_and_select_the_Test_Community();
		log.info("Select Test Community");
	}
	
	@When("Verify the Continue Button")
	public void Verify_the_Continue_Button() throws InterruptedException {
		login.Verify_the_Continue_Button();
		log.info("Clicked on the Continue button");
	}
	
	@Then ("Home page should be shown")
	public void Home_page_should_be_shown() {
		login.Home_page_should_be_shown();
		log.info("Home Page Is Showing");
		
	}
	
	@Given("User Click on the Account User Name")
	public void user_click_on_the_account_user_name() throws InterruptedException {
		login.user_click_on_the_account_user_name();
		log.info("Click on the Account User name");
		
	}
	@And ("Click on the Logout Button")
	public void click_on_the_logout_button() throws InterruptedException {
		login.click_on_the_logout_button();
		log.info("user clicked on the logout button");
		
	}
	
	@Then ("Sign In Page should be shown")
	public void Sign_In_Page_should_be_shown() {
		login.Sign_In_Page_should_be_shown();
		log.info("user can view sign in page -test passed.");
		
	}

	//invalid 
	
	@Given ("User Enter the {string} and {string}")
	public void User_Enter_the_Email_and_Password(String email, String pass) {
		login.User_Enter_the_Email_and_Password(email, pass);
		log.info("user enter the invalid email & password -test passed.");
	}
	
	
	@When ("Click on the login button")
	public void Click_on_the_login_button() throws InterruptedException {
		login.click_on_the_login_button();
		log.info("user click on the login button..");
	}
	
	@Then ("Error message is Displayed {string}")
	public void Error_message_is_Displayed(String err) {
		login.Error_message_is_Displayed(err);
		log.info("error message is displayed-invalid Username and Password");
	}
	
	//blank credentials
	
	@Given ("The User submits blank {string} and Invalid {string}")
	public void the_user_submits_blank_email_and_invalid_password(String email,String pass) {
		login.the_user_submits_blank_email_and_invalid_password(email,pass);
		log.info("user enter the blank email address and invalid password..");
	}
	
	@When ("The user click on the Login button")
	public void the_user_click_on_the_login_button() {
		login.the_user_click_on_the_login_button();
		log.info("user click on the login button..");
	}
	
	
	@Then ("The User should see an Error Message {string}")
	public void the_user_should_see_an_error_message(String err) {
		login.the_user_should_see_an_error_message(err);
		log.info("error message is showing");
		
	}

}
