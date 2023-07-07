package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.VisitPlansPage;

public class VisitPlansSteps extends BaseClass  {
	
	VisitPlansPage visitplan=new VisitPlansPage();
	

@Given("User enter the Email")
public void user_enter_the_email() throws InterruptedException {
	 visitplan.user_enter_the_email();
	}


@When("User enter the Password")
public void user_enter_the_password() throws InterruptedException {
	visitplan.user_enter_the_password();
	}
   
@Then("User Click on the Login")
public void user_click_on_the_login() throws InterruptedException {
	visitplan.user_click_on_the_login();
	 
}

@Then("User select the Test Community")
public void user_select_the_test_community() throws InterruptedException {
	visitplan.user_select_the_test_community();
}

@Then("User click on the Continue Button")
public void user_click_on_the_continue_button() throws InterruptedException {
	visitplan.user_click_on_the_continue_button();
}

@Then("User click on the Visit Plans")
public void user_click_on_the_visit_plans() throws InterruptedException {
	visitplan.user_click_on_the_visit_plans();
}

@Then("Click on the User first Name")
public void click_on_the_user_first_name() throws InterruptedException {
	visitplan.click_on_the_user_first_name();
}


/*@Then("Click on the Add Visit Configuration")
public void click_on_the_add_visit_configuration() throws InterruptedException {
	visitplan.click_on_the_add_visit_configuration();
}

@Then("Select the Days as Sunday")
public boolean select_the_days_as_sunday() throws InterruptedException {
	return visitplan.select_the_days_as_sunday();
}

@Then("Select the Start Time")
public void select_the_start_time() throws InterruptedException {
	visitplan.select_the_start_time();
}

@Then("Select a Duration")
public void select_a_duration() throws InterruptedException {
	visitplan.select_a_duration();
}

@Then("Select the Recurrence")
public void select_the_recurrence() throws InterruptedException {
	visitplan.select_the_recurrence();
}

@Then("Select the Start Date")
public void select_the_start_date() throws InterruptedException {
	visitplan.select_the_start_date();
}

@Then("click on the Save Button")
public void click_on_the_save_button() throws InterruptedException {
	visitplan.click_on_the_save_button();

	}*/


@Then("Verify that if status is Shows Missing Assigned Tasks")
public void verify_that_if_status_is_shows_missing_assigned_tasks() {
	visitplan.verify_that_if_status_is_shows_missing_assigned_tasks();
}

@When("Click on the ADLs Tab")
public void click_on_the_ad_ls_tab() throws InterruptedException {
	visitplan.click_on_the_ad_ls_tab();
}

@Then("Click on the Bathing")
public void click_on_the_bathing() throws InterruptedException {
	visitplan.click_on_the_bathing();
}

@Then("Select the Bathing Assistance Level as a Supervision")
public void select_the_bathing_assistance_level_as_a_supervision() throws InterruptedException {
	visitplan.select_the_bathing_assistance_level_as_a_supervision();
}

@Then("Select the Tasks as a Assist With Shower")
public void select_the_tasks_as_a_assist_with_shower() throws InterruptedException {
	visitplan.select_the_tasks_as_a_assist_with_shower();
}

@Then("Select the Visits Timing")
public void select_the_visits_timing() throws InterruptedException {
	visitplan.select_the_visits_timing();
}

@Then("Enter the Caregiver Instructions")
public void enter_the_caregiver_instructions() throws InterruptedException {
	visitplan.enter_the_caregiver_instructions();
}

@Then("Click on the Update Button")
public void click_on_the_update_button() throws InterruptedException {
	visitplan.click_on_the_update_button();
}

@Then("Save the Bathing Details")
public void save_the_bathing_details() throws InterruptedException {
	visitplan.save_the_bathing_details();
}

@When("click on the ADLs")
public void click_on_the_ad_ls() throws InterruptedException {
	visitplan.click_on_the_ad_ls();
}
@When("Click on the Continence And Toileting")
public void click_on_the_continence_and_toileting() throws InterruptedException {
	visitplan.click_on_the_continence_and_toileting();
}
@Then("Click on the Assistance Level")
public void click_on_the_assistance_level() throws InterruptedException {
	visitplan.click_on_the_assistance_level();
}

@Then("save the Continence And Toileting Details")
public void save_the_continence_and_toileting_details() throws InterruptedException {
	visitplan.save_the_continence_and_toileting_details();
}


@When("Click on the Again ADLs") 
public void click_on_the_again_ad_ls() throws InterruptedException {
	visitplan.click_on_the_again_ad_ls();
}

@Then("Click on the dressing And Grooming") 
public void click_on_the_dressing_and_grooming() throws InterruptedException{
	visitplan.click_on_the_dressing_and_grooming();
}

@Then ("select the Assistance Level as a Supervision")
public void select_the_assistance_as_a_supervision() throws InterruptedException {
	visitplan.select_the_assistance_as_a_supervision();
	
}

@Then ("Click on the Apply Lotion Tasks")
public void click_on_the_apply_lotion_tasks() throws InterruptedException {
	visitplan.click_on_the_apply_lotion_tasks();
}

@Then ("choose the visits time")
public void choose_the_visits_time() throws InterruptedException {
	visitplan.choose_the_visits_time();
	
}
@Then ("Enter the caregiver Instructions")
public void enter_the_caregiver_instructions3() throws InterruptedException {
	visitplan.enter_the_caregiver_instructions3();
}

@Then ("Update the Apply Lotion")
public void update_the_apply_lotion() throws InterruptedException {
	visitplan.update_the_apply_lotion();
	
}
@Then ("Save The Dressing And Grooming Details")
public void save_the_dressing_and_grooming_details() throws InterruptedException {
	visitplan.save_the_dressing_and_grooming_details();
	
}

@When("click on the ADLs Tab")
public void click_on_the_ad_ls_tab2() throws InterruptedException {
	visitplan.click_on_the_ad_ls_tab2();
}



@Then("Click on the Eating")
public void click_on_the_eating() throws InterruptedException {
	visitplan.click_on_the_eating();
}

@Then("Select the Assistance Level as a No Assistance")
public void select_the_assistance_level_as_a_no_assistance() throws InterruptedException {
	visitplan.select_the_assistance_level_as_a_no_assistance();
	
}
@Then("save the Eating Details")
public void save_the_eating_details() throws InterruptedException {
	visitplan.save_the_eating_details();
	
}
@When("Click on the ADLs")
public void click_on_the_ad_ls2() throws InterruptedException {
	visitplan.click_on_the_ad_ls2();
}

@Then ("Click on the Mobility")
public void click_on_the_mobility() throws InterruptedException {
	visitplan.click_on_the_mobility();
	
}
@Then("Select the Assistance Level as  a Limited Assistance")
public void select_the_assistance_level_as_a_limited_assistance() throws InterruptedException {
	visitplan.select_the_assistance_level_as_a_limited_assistance();
	
}
@Then ("Select the Walk With Client")
public void select_the_walk_with_client() throws InterruptedException {
	visitplan.select_the_walk_with_client();	
}
@And("Select the Visits Time")
public void select_the_visits_time() throws InterruptedException {
	visitplan.select_the_visits_time(); 
	
}

@And("Enter Caregiver Instructions")
public void enter_caregiver_instructions() throws InterruptedException {
	visitplan.enter_caregiver_instructions();
	
}
@And("Update the Walk with client Details")
public void update_the_walk_with_client_details() throws InterruptedException{
	visitplan.update_the_walk_with_client_details();
	
}
@And ("Save the Mobility Details")
public void save_the_mobility_details() throws InterruptedException {
	visitplan.save_the_mobility_details();
}
@When ("User Click on the IADLS Tab")
public void user_click_on_the_ia_dls_tab() throws InterruptedException {
	visitplan.user_click_on_the_ia_dls_tab();
	
}

@And ("Click on the Household Tasks")
public void click_on_the_household_tasks() throws InterruptedException {
	visitplan.click_on_the_household_tasks();
	
}

@And ("Select the Assistance Level as a Assistance")
public void select_the_assistance_level_as_a_assistance() throws InterruptedException {
	visitplan.select_the_assistance_level_as_a_assistance();
	
}

@And ("Click on the Make Bed")
public void click_on_the_make_bed() throws InterruptedException {
	visitplan.click_on_the_make_bed();
	
}
@And("Select the Make bed Visits Time")
public void select_the_make_bed_visits_time() throws InterruptedException {
	visitplan.select_the_make_bed_visits_time();
	
}
@Then ("Enter the CareGIVER Instructions")
public void enter_the_caregiver_instructions1() throws InterruptedException {
	visitplan.enter_the_caregiver_instructions1();
}
@Then ("Update the Make bed Details")
public void update_the_make_bed_details() throws InterruptedException {
	visitplan.update_the_make_bed_details();
	
}

@And ("Save the Household Tasks Details")
public void save_the_household_tasks_details() throws InterruptedException {
	visitplan.save_the_household_tasks_details();
	
}
@Then ("User Again click on the IADLs")
public void user_again_click_on_the_iadls() throws InterruptedException {
	visitplan.user_again_click_on_the_iadls();
	
} 

@And ("Click on the Laundry")
public void click_on_the_laundry() throws InterruptedException {
	visitplan.click_on_the_laundry();
	
}

@Then("Select Laundry Assistance Level as a Assistance")
public void select_laundry_assistance_level_as_a_assistance() throws InterruptedException{
	visitplan.select_laundry_assistance_level_as_a_assistance();
}

@Then ("Then Click on the Tasks")
public void click_on_the_tasks() throws InterruptedException {
	visitplan.click_on_the_tasks();
	
} 
@Then ("User Select the Visits Time")
public void user_select_the_visits_time() throws InterruptedException {
	visitplan.user_select_the_visits_time();
	
}
@And ("Enter Caregiver Instruction")
public void enter_caregiver_instruction() throws InterruptedException {
	visitplan.enter_caregiver_instruction();
	
}

@And ("Update the Laundry Details")
public void update_the_laundry_details() throws InterruptedException {
	visitplan.update_the_laundry_details();
	
}

@And ("Save the Laundry Details")
public void save_the_laundry_details() throws InterruptedException {
	visitplan.save_the_laundry_details();
	
}
@Then ("Again Click on the IADLs")
public void again_click_on_the_iadls() throws InterruptedException {
	visitplan.again_click_on_the_iadls(); 
}

@Then ("Click on the Meals")
public void click_on_the_meals() throws InterruptedException {
	visitplan.click_on_the_meals();
}

@Then ("Select the Meals Assistance Level No Assistance")
public void select_the_meals_assistance_level_no_assistance() throws InterruptedException {
	visitplan.select_the_meals_assistance_level_no_assistance();
	
}
@And ("Save the Meals Details")
public void save_the_meals_details() throws InterruptedException {
	visitplan.save_the_meals_details();
}

@Then("User Again click on the IADLS")
public void user_again_click_on_the_iadls1() throws InterruptedException {
	visitplan.user_again_click_on_the_iadls1();
		
}

@Then ("User click on the Medication")
public void user_click_on_the_medication() throws InterruptedException {
	visitplan.user_click_on_the_medication();
}

@And ("User select the Medication Assistance Level as Assistance")
public void user_select_the_medication_assistance_level_as_assistance() throws InterruptedException {
	visitplan.user_select_the_medication_assistance_level_as_assistance();
	
}
@Then ("Select the tasks with Check Blood Pressure")
public void select_the_tasks_with_check_blood_pressure() throws InterruptedException {
	visitplan.select_the_tasks_with_check_blood_pressure();
	
}

@And ("I Select the Visits Time")
public void i_select_the_visits_time() throws InterruptedException {
	visitplan.i_select_the_visits_time();
}
	
	
@And ("Enter the CareGiver Instructions")
public void enter_the_careGiver_instructions() throws InterruptedException {
	visitplan.enter_the_careGiver_instructions(); 
	
}

@And ("Update the Medication Details")
public void update_the_medication_details () throws InterruptedException {
	visitplan.update_the_medication_details ();
}

@And ("Save the Medication Details")
public void save_the_medication_details () throws InterruptedException {
	visitplan.save_the_medication_details();
	
}

@Then ("Click on the Add to Schedule")
public void click_on_the_add_to_schedule() throws InterruptedException {
	visitplan.click_on_the_add_to_schedule();
	
}
@Then ("Click on the Finalize Visits")
public void click_on_the_finalize_visits() throws InterruptedException{
	visitplan.click_on_the_finalize_visits();
	
}













@Given("user select all Days")
public void user_select_all_days() throws InterruptedException {
	visitplan.user_select_all_days();
}

@Then("select start time")
public void select_start_time() throws InterruptedException {
	visitplan.select_start_time();
}

@Then("select Duration")
public void select_duration() throws InterruptedException {
	visitplan.select_duration();
}

@Then("select Weekly recurrence")
public void select_weekly_recurrence() throws InterruptedException {
	visitplan.select_weekly_recurrence();
}

@Then("select start Date")
public void select_start_date() throws InterruptedException {
	visitplan.select_start_date();
}

@Then("User Click on the save Button")
public void user_click_on_the_save_button() throws InterruptedException {
    visitplan.user_click_on_the_save_button();
}




}


