package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import page.LoginPage;

public class LoginPageSteps extends BaseClass{
	
	LoginPage login = new LoginPage();


	@When("Verify that user enter the {string} and {string}")
	public void Verify_that_user_enter_the_Email_and_Password(String email, String pass){
		login.Verify_that_user_enter_the_Email_and_Password(email,pass);
		log.info("entered email address and password ");
	}
	
	
	@When("Click on the Login Button")
	public void click_on_the_login_button() throws InterruptedException {
	   login.click_on_the_login_button();
	   log.info("Clicked on login button");
	}

	@And("Verify the Dropdown and select the Test Community")
	public void Verify_the_Dropdown_and_select_the_Test_Community() throws InterruptedException {
		login.Verify_the_Dropdown_and_select_the_Test_Community();
		log.info("Select Test Community");
	}
	
	@And("Verify the Continue Button")
	public void Verify_the_Continue_Button() throws InterruptedException {
		login.Verify_the_Continue_Button();
		log.info("Clicked on Continue button");
	}
	
	@Then ("Home page should be shown")
	public void Home_page_should_be_shown() {
		login.Home_page_should_be_shown();
		log.info("Home Page Is Showing");
		
	}
	
	@Given ("User Click on the Account User Name")
	public void user_click_on_the_account_user_name() throws InterruptedException {
		login.user_click_on_the_account_user_name();
		log.info("Click on the Account User name");
		
	}
	@And ("Click on the Logout Button")
	public void click_on_the_logout_button() throws InterruptedException {
		login.click_on_the_logout_button();
		log.info("user clicked on logout button");
		
	}
	
	@Then ("Sign In Page should be shown")
	public void Sign_In_Page_should_be_shown() {
		login.Sign_In_Page_should_be_shown();
		log.info("user can view sign in page -test passed.");
		
	}

}
