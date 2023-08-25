package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.AssessmentsCarePlansPage;

public class AssessmentsCarePlansSteps extends BaseClass  {
	
	AssessmentsCarePlansPage assessment = new AssessmentsCarePlansPage();
	
	
	@When("user enter Email")
	public void user_enter_email() throws InterruptedException {
		assessment.user_enter_email();
		log.info("Entered Email Address ");
	}

	@Then("user enter Password")
	public void user_enter_password() {
		try {
			assessment.user_enter_password();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("Entered Password");
	}

	@Then("user click on the Login Button")
	public void user_click_on_the_login_button() throws InterruptedException {
	    assessment.user_click_on_the_login_button();
	    log.info("Clicked on login button");
	}

	@Then("user select the testCommunity")
	public void user_select_the_test_community() throws InterruptedException {
	    assessment.user_select_the_test_community();
	    log.info("Select Test Community");
	}

	@Then("user click on the continue")
	public void user_click_on_the_continue() throws InterruptedException {
		assessment.user_click_on_the_continue();
		log.info("Clicked on Continue button");
	}
	
	  
	@Then("user click on the clients")
	public void user_click_on_the_clients() throws InterruptedException {
	   assessment.user_click_on_the_clients();
	   log.info("Clicked on clients button");
	}

	@Then("Click on the User data Table")
	public void click_on_the_user_data_table() throws InterruptedException {
		assessment.click_on_the_user_data_table();
		log.info("Clicked on user data table");
	}
	
	
	@Then("Click on the Assessment and Care Plan")
	public void click_on_the_assessment_and_care_plan() throws InterruptedException {
	    assessment.click_on_the_assessment_and_care_plan();
	    log.info("Clicked on assessment and care plan");
	}
	
	@Then("User Enter the Assessment Date")
	public void user_enter_the_assessment_date() throws InterruptedException {
		assessment.user_enter_the_assessment_date();
		 log.info("entered assessment date");
	}

	@Then("User Enter the Visit Schedule")
	public void user_enter_the_visit_schedule() throws InterruptedException {
		assessment.user_enter_the_visit_schedule();
		 log.info("entered visit schedule");
	}

	@Then("User Enter the Goals of Service")
	public void user_enter_the_goals_of_service() throws InterruptedException {
		assessment.user_enter_the_goals_of_service();
		 log.info("enter goals of service");
	}

	@Then("User Enter the Family\\/Social Network")
	public void user_enter_the_family_social_network() throws InterruptedException {
		assessment.user_enter_the_family_social_network();
		log.info("enterd family social network");
	}

	@Then("User Enter the Special Dietary needs")
	public void user_enter_the_special_dietary_needs() throws InterruptedException {
	    assessment.user_enter_the_special_dietary_needs();
	    log.info("enterd special dietary needs");
	}

	@Then("User Enter the Precautions")
	public void user_enter_the_precautions() throws InterruptedException {
		assessment.user_enter_the_precautions();
		log.info("enterd precautions");
	}

	@Then("User Enter the Functional Limitations\\/Restrictions")
	public void user_enter_the_functional_limitations_restrictions() throws InterruptedException {
		assessment.user_enter_the_functional_limitations_restrictions(); 
		log.info("enterd functional limitations restrictions");
	}
	
	@Then("User click on the Client Status Tab")
	public void user_click_on_the_client_status_tab() throws InterruptedException {
		assessment.user_click_on_the_client_status_tab();
		log.info("clicked client status");
	}

	@Then("User Enter the Condition Notes")
	public void user_enter_the_condition_notes() throws InterruptedException {
		assessment.user_enter_the_condition_notes();
		log.info("entered condition notes");
	}

	@Then("User Enter the Recent Hospital\\/Rehab Stays")
	public void user_enter_the_recent_hospital_rehab_stays() throws InterruptedException {
	   assessment.user_enter_the_recent_hospital_rehab_stays();
	   log.info("entered recent hospital rehab stays");

	}

	@Then("User Enter the Needs Medication Reminders")
	public void user_enter_the_needs_medication_reminders() throws InterruptedException {
	    assessment.user_enter_the_needs_medication_reminders();
	    log.info("entered needs medication reminders");
	}

	@Then("User Enter the How Many Times Per Day")
	public void user_enter_the_how_many_times_per_day() throws InterruptedException {
		assessment.user_enter_the_how_many_times_per_day();
		log.info("entered how many times per day");
	    
	}

	@Then("User Enter the Allergies Description")
	public void user_enter_the_allergies_description() throws InterruptedException {
	    assessment.user_enter_the_allergies_description();
	    log.info("entered allergies description");
	}

	@Then("User Enter the Notes")
	public void user_enter_the_notes() throws InterruptedException {
	    assessment.user_enter_the_notes();
	    log.info("entered notes");
	}

	@Then("User Select the Hearing")
	public void user_select_the_hearing() throws InterruptedException {
	   assessment.user_select_the_hearing();
	   log.info("select hearing");
	}

	@Then("User Select the Speech")
	public void user_select_the_speech() throws InterruptedException {
	assessment.user_select_the_speech();
	log.info("select speech");
	}

	@Then("User Select the Swallowing")
	public void user_select_the_swallowing() throws InterruptedException {
		assessment.user_select_the_swallowing();
		log.info("select swallowing");
	}

	@Then("User Select the Vision")
	public void user_select_the_vision() throws InterruptedException {
		assessment.user_select_the_vision();
		log.info("select vision");
	}

	@Then("User Enter the Bathing Deatils")
	public void user_enter_the_bathing_deatils() throws InterruptedException {
		assessment.user_enter_the_bathing_deatils();
		log.info("entered bathing details");
	}

	@Then("User Enter the Transfers\\/Mobility Deatils")
	public void user_enter_the_transfers_mobility_deatils() throws InterruptedException {
		assessment.user_enter_the_transfers_mobility_deatils();
		log.info("entered transfers mobility deatils");
	}

	@Then("User Enter the Dressing & Grooming Details")
	public void user_enter_the_dressing_grooming_details() throws InterruptedException {
		assessment.user_enter_the_dressing_grooming_details();
		log.info("entered dressing grooming details");
	}

	@Then("User Enter the Continence\\/Toileting")
	public void user_enter_the_continence_toileting() throws InterruptedException {
		assessment.user_enter_the_continence_toileting();
		log.info("entered continence toileting");
	}

	@Then("User Enter the Eating Details")
	public void user_enter_the_eating_details() throws InterruptedException {
		assessment.user_enter_the_eating_details();
		log.info("entered continence toileting");
	}

	@Then("User Enter the Meals Details")
	public void user_enter_the_meals_details() throws InterruptedException {
		assessment.user_enter_the_meals_details();
		log.info("entered meals details");
	}

	@Then("User Enter the Laundry Details")
	public void user_enter_the_laundry_details() throws InterruptedException {
		assessment.user_enter_the_laundry_details();
		log.info("entered laundry details");
	}

	@Then("User Enter the Household Tasks Details")
	public void user_enter_the_household_tasks_details() throws InterruptedException {
		assessment.user_enter_the_household_tasks_details() ;
		log.info("entered household tasks details");
	}
	
	@Then("User click on the Environment tab")
	public void user_click_on_the_environment_tab() throws InterruptedException {
		assessment.user_click_on_the_environment_tab();
		log.info("click environment tab");
	}

	@Then("select the Radio button")
	public void select_the_radio_button() throws InterruptedException {
		assessment.select_the_radio_button();
		log.info("select radio button");
	}

	@Then("Enter the Enviromental Safety Concerns details")
	public void enter_the_enviromental_safety_concerns_details() throws InterruptedException {
		assessment.enter_the_enviromental_safety_concerns_details();
		log.info("entered enviromental safety concerns details");
	}

	@Then("Enter the Notes")
	public void enter_the_notes() throws InterruptedException {
		assessment.enter_the_notes();
		log.info("entered notes");
	} 
	
	@Then("Enter the Economics Status")
	public void enter_the_economics_status() throws InterruptedException {
		assessment.enter_the_economics_status();
		log.info("entered economics status");
	}


	@Then("Complete the Details")
	public void complete_the_details() throws InterruptedException {
		assessment.complete_the_details();
		log.info("complete details");
	}


	@Then("Pop up is showing and click on the Yes\\/Complete button")
	public void pop_up_is_showing_and_click_on_the_yes_complete_button() throws InterruptedException {
		assessment. pop_up_is_showing_and_click_on_the_yes_complete_button();
		log.info("pop up is showing and click on the yes complete button");
	}

	@Then("Click on the Care plan")
	public void click_on_the_care_plan() throws InterruptedException {
		assessment.click_on_the_care_plan();
		log.info("clicked on care plan");
	}

	@Then("Sign as a Craegiver")
	public void sign_as_a_craegiver() throws InterruptedException {
	    assessment.sign_as_a_craegiver(); 
	    log.info("create caregiver sign");
	    
	}

	@Then("Sign as a Client")
	public void sign_as_a_client() throws InterruptedException {
		assessment.sign_as_a_client();
		log.info("create client sign");
	}

	@Then("click on the save Signature Button")
	public void click_on_the_save_signature_button() throws InterruptedException {
	   assessment.click_on_the_save_signature_button();
	   log.info("save the signature button");
	}

	@Then ("Validation message should be shown Assessment was created")
	public void validation_message_should_be_shown_assessment_was_created() {
		assessment.validation_message_should_be_shown_assessment_was_created(); 
		log.info("validation message should be shown assessment was created, test cases passed..");
		
	}


}
