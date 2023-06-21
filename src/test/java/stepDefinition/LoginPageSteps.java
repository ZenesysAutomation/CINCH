package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import page.LoginPage;

public class LoginPageSteps extends BaseClass{
	
	LoginPage login = new LoginPage();


	@When("Verify that user enter the {string} and {string}")
	public void Verify_that_user_enter_the_Email_and_Password(String email, String pass){
		login.Verify_that_user_enter_the_Email_and_Password(email,pass);
	}
	
	
	@When("Click on the Login Button")
	public void click_on_the_login_button() {
	   login.click_on_the_login_button();
	}

	@And("Verify the Dropdown and select the Test Community")
	public void Verify_the_Dropdown_and_select_the_Test_Community() {
		login.Verify_the_Dropdown_and_select_the_Test_Community();
	}
	
	@And("Verify the Continue Button")
	public void Verify_the_Continue_Button() {
		login.Verify_the_Continue_Button();
	}

}
