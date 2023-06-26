package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddClientPage;

public class AddClientSteps extends BaseClass{
	
	AddClientPage steps = new AddClientPage();
	
	@When("User Enter the Valid Email")
	public void user_enter_the_valid_email() {
	    steps.user_enter_the_valid_email();
	}

	@When("User Enter the Valid Password")
	public void user_enter_the_valid_password() {
	    steps.user_enter_the_valid_password();
	}

	@Then("User click on the Login")
	public void user_click_on_the_login() throws InterruptedException {
	   steps.user_click_on_the_login();
	}

	@Then("User Select the Test Community")
	public void user_select_the_test_community() {
	    steps. user_select_the_test_community();
	}

	@When("User click on the Continue")
	public void user_click_on_the_continue() throws InterruptedException {
	    steps.user_click_on_the_continue();
	}

	@Then("User Click on the Clients Button")
	public void user_click_on_the_clients_button() {
	   steps.user_click_on_the_clients_button();
	}

	@Then("User Click on the Add New Client")
	public void user_click_on_the_add_new_client() throws InterruptedException {
	  steps.user_click_on_the_add_new_client();
	}

	@Then("User Enter the First Name")
	public void user_enter_the_first_name() {
	steps.user_enter_the_first_name();
	}

	@Then("User Enter the Last Name")
	public void user_enter_the_last_name() {
	   steps.user_enter_the_last_name();
	}

	@Then("User Enter the Address Line1")
	public void user_enter_the_address_line1() {
	   steps.user_enter_the_address_line1();
	}

	@Then("User Enter the Address Line2")
	public void user_enter_the_address_line2() {
	    steps.user_enter_the_address_line2();
	}

	@Then("User Enter the Resident ID")
	public void user_enter_the_resident_id() {
	   steps.user_enter_the_resident_id();
	}

	@Then("User Enter the City")
	public void user_enter_the_city() {
	    steps.user_enter_the_city();
	}

	@When("User Select the State")
	public void user_select_the_state() {
	    steps.user_select_the_state();
	}

	@When("User Enter the ZIP code")
	public void user_enter_the_zip_code() {
	    steps.user_enter_the_zip_code();
	}

	@Then("User Enter the Primary Phone")
	public void user_enter_the_primary_phone() throws InterruptedException {
	   steps.user_enter_the_primary_phone();
	}

	@Then("User Enter the Secondary Phone")
	public void user_enter_the_secondary_phone() throws InterruptedException {
	    steps.user_enter_the_secondary_phone();
	}

	@Then("User Enter the Email")
	public void user_enter_the_email() {
	 steps. user_enter_the_email();
	}
	
	@Then("Click the Gender")
	public void click_the_gender() throws InterruptedException {
	    steps.click_the_gender();
	}

//	@Then("User Select the Gender")
//	public void user_select_the_gender() {
//	    
//	}

	@Then("User Select the BirthDate")
	public void user_select_the_birth_date() {
	    steps. user_select_the_birth_date();
	}

	@Then("User Enter the Marital Status")
	public void user_enter_the_marital_status() {
	   steps.user_enter_the_marital_status();
	}

	@Then("Then User Enter the Spouse Name")
	public void then_user_enter_the_spouse_name() {
	steps. then_user_enter_the_spouse_name();
	}

	@Then("User Enter the Referral Source")
	public void user_enter_the_referral_source() {
	    steps.user_enter_the_referral_source();
	}

	@Then("User Enter the Essential Information")
	public void user_enter_the_essential_information() {
	    steps.user_enter_the_essential_information();
	}

	@Then("User Select the Client Type")
	public void user_select_the_client_type() throws InterruptedException {
	   steps.user_select_the_client_type();
	}

	@Then("User Select the Schedule Group")
	public void user_select_the_schedule_group() throws InterruptedException {
	    steps.user_select_the_schedule_group();
	}

	@Then("User Select the Status")
	public void user_select_the_status() throws InterruptedException {
	    steps.user_select_the_status();
	}

	@Then("User select the Track")
	public void user_select_the_track() throws InterruptedException {
	   steps.user_select_the_track();
	}
	
	@Then("Verify that Add new Contact Button")
	public void verify_that_add_new_contact_button() throws InterruptedException {
	   steps.verify_that_add_new_contact_button();
	}

	@Then("Verify the First Name")
	public void verify_the_first_name() throws InterruptedException {
	    steps.verify_the_first_name();
	}

	@Then("Verify the Last Name")
	public void verify_the_last_name() {
	   steps.verify_the_last_name();
	}

	@Then("Verify the Address line1")
	public void verify_the_address_line1() {
	   steps.verify_the_address_line1();
	}

	@Then("Verify the Address line2")
	public void verify_the_address_line2() {
	    steps.verify_the_address_line2();
	}

	@Then("Verify the City")
	public void verify_the_city() throws InterruptedException {
	   steps.verify_the_city();
	}

	@Then("verify the State Dropdown")
	public void verify_the_state_dropdown() throws InterruptedException {
	   steps.verify_the_state_dropdown();
	}

	@Then("Verify the Zip Code")
	public void verify_the_zip_code() throws InterruptedException {
	  steps.verify_the_zip_code();
	}

	@Then("Verify the Primary Phone Number")
	public void verify_the_primary_phone_number() throws InterruptedException {
	    steps.verify_the_primary_phone_number();
	}

	@Then("Verify the Email")
	public void verify_the_email() throws InterruptedException {
	    steps. verify_the_email();
	}

	@Then("select the Relationship")
	public void select_the_relationship() throws InterruptedException {
	   steps.select_the_relationship();
	    
	}

	@Then("Click on the save button")
	public void click_on_the_save_button() {
	    steps.click_on_the_save_button();
	}



	@Then("User Click on the Save")
	public void user_click_on_the_save() throws InterruptedException {
	    steps.user_click_on_the_save();
	}




}