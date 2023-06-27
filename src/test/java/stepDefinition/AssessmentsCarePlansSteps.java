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
	}

	@Then("user enter Password")
	public void user_enter_password() {
		assessment.user_enter_password();
	}

	@Then("user click on the click")
	public void user_click_on_the_click() throws InterruptedException {
	    assessment.user_click_on_the_click();
	}

	@Then("user select the testCommunity")
	public void user_select_the_test_community() {
	    assessment.user_select_the_test_community();
	}

	@Then("user click on the continue")
	public void user_click_on_the_continue() throws InterruptedException {
		assessment.user_click_on_the_continue();
	}
	
	  
	@Then("user click on the clients")
	public void user_click_on_the_clients() throws InterruptedException {
	   assessment.user_click_on_the_clients();
	}

	@Then("Click on the User data Table")
	public void click_on_the_user_data_table() throws InterruptedException {
		assessment.click_on_the_user_data_table();
	}
	
	
	@Then("Click on the Assessment and Care Plan")
	public void click_on_the_assessment_and_care_plan() throws InterruptedException {
	    assessment.click_on_the_assessment_and_care_plan();
	}
	
	@Then("User Enter the Assessment Date")
	public void user_enter_the_assessment_date() {
	   
	}

	@Then("User Enter the Visit Schedule")
	public void user_enter_the_visit_schedule() {
	    
	}

	@Then("User Enter the Goals of Service")
	public void user_enter_the_goals_of_service() {
	    
	}

	@Then("User Enter the Family\\/Social Network")
	public void user_enter_the_family_social_network() {
	    
	}

	@Then("User Enter the Special Dietary needs")
	public void user_enter_the_special_dietary_needs() {
	    
	}

	@Then("User Enter the Precautions")
	public void user_enter_the_precautions() {
	    
	}

	@Then("User Enter the Functional Limitations\\/Restrictions")
	public void user_enter_the_functional_limitations_restrictions() {
	    
	}

}
