package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AddClientPage;

public class AddClientSteps extends BaseClass{
	
	AddClientPage steps = new AddClientPage();
	
	@When("User Enter the Valid Email")
	public void user_enter_the_valid_email() throws Exception {
	    steps.user_enter_the_valid_email();
	    log.info("Entered Email Address");
		
	}

	@When("User Enter the Valid Password")
	public void user_enter_the_valid_password() {
	    steps.user_enter_the_valid_password();
	    log.info("Password Entered");
	}

	@Then("User click on the Login")
	public void user_click_on_the_login() throws InterruptedException {
	   steps.user_click_on_the_login();
	   log.info("Clicked on login button");
	}

	@Then("User Select the Test Community")
	public void user_select_the_test_community() throws InterruptedException {
	    steps. user_select_the_test_community();
	    log.info("Select Test Community");
	}

	@When("User click on the Continue")
	public void user_click_on_the_continue() throws InterruptedException {
	    steps.user_click_on_the_continue();
	    log.info("Clicked on Continue button");
	}

	@Then("User Click on the Clients Button")
	public void user_click_on_the_clients_button() {
	   steps.user_click_on_the_clients_button();
	   log.info("Clicked on Client button");
	}

	@Then("User Click on the Add New Client")
	public void user_click_on_the_add_new_client() throws InterruptedException {
	  steps.user_click_on_the_add_new_client();
	  log.info("Clicked on Add New Client button");
	}

	@Then("User Enter the First Name")
	public void user_enter_the_first_name() {
	steps.user_enter_the_first_name();
	log.info("entered first name");
	}

	@Then("User Enter the Last Name")
	public void user_enter_the_last_name() {
	   steps.user_enter_the_last_name();
	   log.info("entered last name");
	}

	@Then("User Enter the Address Line1")
	public void user_enter_the_address_line1() {
	   steps.user_enter_the_address_line1();
	   log.info("entered Address line1");
	}

	@Then("User Enter the Address Line2")
	public void user_enter_the_address_line2() {
	    steps.user_enter_the_address_line2();
	    log.info("entered Address line2");
	}

	@Then("User Enter the Resident ID")
	public void user_enter_the_resident_id() {
	   steps.user_enter_the_resident_id();
	   log.info("entered resident id");
	}

	@Then("User Enter the City")
	public void user_enter_the_city() throws InterruptedException {
	    steps.user_enter_the_city();
	    log.info("entered city name");
	}

	@When("User Select the State")
	public void user_select_the_state() {
	    steps.user_select_the_state();
	    log.info("entered state name");
	}

	@When("User Enter the ZIP code")
	public void user_enter_the_zip_code() {
	    steps.user_enter_the_zip_code();
	    log.info("entered ZIP Code");
	}

	@Then("User Enter the Primary Phone")
	public void user_enter_the_primary_phone() throws InterruptedException {
	   steps.user_enter_the_primary_phone();
	   log.info("entered primary phone no.");
	}

	@Then("User Enter the Secondary Phone")
	public void user_enter_the_secondary_phone() throws InterruptedException {
	    steps.user_enter_the_secondary_phone();
	    log.info("entered secondary phone no.");
	}

	@Then("User Enter the Email")
	public void user_enter_the_email() throws InterruptedException {
	 steps. user_enter_the_email();
	 log.info("entered email address");
	}
	
	@Then("Click the Gender")
	public void click_the_gender() throws InterruptedException {
	    steps.click_the_gender();
	    log.info("select gender");
	}



	@Then("User Select the BirthDate")
	public void user_select_the_birth_date() throws InterruptedException {
	    steps. user_select_the_birth_date();
	    log.info("select gender");
	}

	@Then("User Enter the Marital Status")
	public void user_enter_the_marital_status() {
	   steps.user_enter_the_marital_status();
	   log.info("entered marital status");
	}

	@Then("Then User Enter the Spouse Name")
	public void then_user_enter_the_spouse_name() {
	steps. then_user_enter_the_spouse_name();
	log.info("entered spouse name");
	}

	@Then("User Enter the Referral Source")
	public void user_enter_the_referral_source() throws InterruptedException {
	    steps.user_enter_the_referral_source();
	    log.info("entered referral source");
	}

	@Then("User Enter the Essential Information")
	public void user_enter_the_essential_information() {
	    steps.user_enter_the_essential_information();
	    log.info("entered essential information");
	}

	@Then("User Select the Client Type")
	public void user_select_the_client_type() throws InterruptedException {
	   steps.user_select_the_client_type();
	   log.info("select client type");
	} 

	@Then("User Select the Schedule Group")
	public void user_select_the_schedule_group() throws InterruptedException {
	    steps.user_select_the_schedule_group();
	    log.info("select schedule group");
	}

	@Then("User Select the Status")
	public void user_select_the_status() throws InterruptedException {
	    steps.user_select_the_status();
	    log.info("select status");
	}

	@Then("User select the Track")
	public void user_select_the_track() throws InterruptedException {
	   steps.user_select_the_track();
	   log.info("select track");
	}
	
	@And ("select the Service Type")
	public void select_the_service_type() throws InterruptedException {
		steps.select_the_service_type();
		log.info("select service type");
	}
	
	@Then("Verify that Add new Contact Button")
	public void verify_that_add_new_contact_button() throws InterruptedException {
	   steps.verify_that_add_new_contact_button();
	   log.info("Click add new contact button");
	}

	@Then("Verify the First Name")
	public void verify_the_first_name() throws InterruptedException {
	    steps.verify_the_first_name();
	    log.info("Entered first name");
	}

	@Then("Verify the Last Name")
	public void verify_the_last_name() {
	   steps.verify_the_last_name();
	   log.info("Entered last name");
	}

	@Then("Verify the Address line1")
	public void verify_the_address_line1() throws InterruptedException {
	   steps.verify_the_address_line1();
	   log.info("Entered address line1");
	}

	@Then("Verify the Address line2")
	public void verify_the_address_line2() throws InterruptedException {
	    steps.verify_the_address_line2();
	    log.info("Entered address line2");
	}

	@Then("Verify the City")
	public void verify_the_city() throws InterruptedException {
	   steps.verify_the_city();
	   log.info("Entered city name");
	}

	@Then("verify the State Dropdown")
	public void verify_the_state_dropdown() throws InterruptedException {
	   steps.verify_the_state_dropdown();
	   log.info("select state");
	}

	@Then("Verify the Zip Code")
	public void verify_the_zip_code() throws InterruptedException {
	  steps.verify_the_zip_code();
	  log.info("entered ZIP Code");
	}

	@Then("Verify the Primary Phone Number")
	public void verify_the_primary_phone_number() throws InterruptedException {
	    steps.verify_the_primary_phone_number();
	    log.info("entered primary phone number");
	}

	@Then("Verify the Email")
	public void verify_the_email() throws InterruptedException {
	    steps. verify_the_email();
	    log.info("entered email address");
	}

	@Then("select the Relationship")
	public void select_the_relationship() throws InterruptedException {
	   steps.select_the_relationship();
	   log.info("select relationship");
	}

	@Then("Save the New Contact Details")
	public void save_the_new_contact_details() throws InterruptedException {
	    steps.save_the_new_contact_details();
	    log.info("save contact details");
	}



	@Then("Save the New client Details")
	public void save_the_new_client_details() throws InterruptedException {
	    steps.save_the_new_client_details();
	    log.info("save client details");
	}
	
	
	@Then ("Validation Message Should be Shown Client was Created")
	public void validation_Message_should_be_shown_client_was_created() throws Exception {
		steps.validation_Message_should_be_shown_client_was_created();
		log.info("validation Message should be shown client was created test passed..");
		
	}
	
	
}
