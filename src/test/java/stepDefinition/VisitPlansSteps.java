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
	 log.info("entered email address");
	}


@When("User enter the Password")
public void user_enter_the_password() throws InterruptedException {
	visitplan.user_enter_the_password();
	 log.info("entered password");
	}
   
@Then("User Click on the Login")
public void user_click_on_the_login() throws InterruptedException {
	visitplan.user_click_on_the_login();
	log.info("click on login");
	 
}

@Then("User select the Test Community")
public void user_select_the_test_community() throws InterruptedException {
	visitplan.user_select_the_test_community();
	log.info("select test community");
}

@Then("User click on the Continue Button")
public void user_click_on_the_continue_button() throws InterruptedException {
	visitplan.user_click_on_the_continue_button();
	log.info("click on continue button..");
}

@Then("User click on the Visit Plans")
public void user_click_on_the_visit_plans() throws InterruptedException {
	visitplan.user_click_on_the_visit_plans();
	log.info("click on visit plans");
}

@Then("Click on the User first Name")
public void click_on_the_user_first_name() throws InterruptedException {
	visitplan.click_on_the_user_first_name();
	log.info("click on table user first name");
}

//hourly visit
@Then ("Click on the Visit Plans Table")
public void click_on_the_visit_plans_table() throws InterruptedException {
	visitplan.click_on_the_visit_plans_table();
	log.info("click on the table..");
}


@Then("Click on the Add Visit Configuration")
public void click_on_the_add_visit_configuration() throws InterruptedException {
	visitplan.click_on_the_add_visit_configuration();
	log.info("click on add visit configuration");
}

@Then("Select the Single Day")
public boolean select_the_single_day() throws InterruptedException {
	  log.info("Selecting the single day...");
	 return visitplan.select_the_single_day();
	 
}


@Then("Select the Recurrence")
public void select_the_recurrence() throws InterruptedException {
	visitplan.select_the_recurrence();
	log.info("Select the recurrence");
}

@Then("Select the Start Time")
public void select_the_start_time() throws InterruptedException {
	visitplan.select_the_start_time();
	log.info("Select the start time");
}

// Hourly Visit----

@Then ("Select the Hourly Visit")
public void select_the_hourly_visit() throws InterruptedException {
	visitplan.select_the_hourly_visit();
	log.info("Select hourly visit");
}

@And ("Select the End Time")
public void select_the_end_time() throws InterruptedException {
	visitplan.select_the_end_time();
	log.info("Select end time..");
}

@And ("Select the Hourly Rate")
public void select_the_hourly_rate() throws InterruptedException {
	visitplan.select_the_hourly_rate();	
	log.info("Select hourly rate..");
}
//Hourly visit end--

@Then("Select a Duration")
public void select_a_duration() throws InterruptedException {
	visitplan.select_a_duration();
	log.info("Select duration");
}

/*@Then("Select the Recurrence")
public void select_the_recurrence() throws InterruptedException {
	visitplan.select_the_recurrence();
}*/

@Then("Select the Start Date")
public void select_the_start_date() throws InterruptedException {
	visitplan.select_the_start_date();
	log.info("Select start time");
}


@Then("click on the Save Button")
public void click_on_the_save_button() throws InterruptedException {
	visitplan.click_on_the_save_button();
	log.info("click on save button");

	}

@Then ("Save the all Single Visit Details")
public void save_the_all_single_visit_details() throws InterruptedException {
	visitplan.save_the_all_single_visit_details();
	log.info("save all single visit details");
	
}

@Then("Validation Message Should be Shown Visit Plan was saved1")
public void validation_message_should_be_shown_visit_plan_was_saved1() {
	visitplan.validation_message_should_be_shown_visit_plan_was_saved1();
	log.info("Validation message should be shown-Visit Plan was saved");
}

@When("Click on the ADLs Tab")
public void click_on_the_ad_ls_tab() throws InterruptedException {
	visitplan.click_on_the_ad_ls_tab();
	log.info("click on adls.");
}

@Then("Click on the Bathing")
public void click_on_the_bathing() throws InterruptedException {
	visitplan.click_on_the_bathing();
	log.info("click on bathing..");
}

@Then("Select the Bathing Assistance Level as a Supervision")
public void select_the_bathing_assistance_level_as_a_supervision() throws InterruptedException {
	visitplan.select_the_bathing_assistance_level_as_a_supervision();
	log.info("select supervision bathing assistance");
}

@Then("Select the Tasks as a Assist With Shower")
public void select_the_tasks_as_a_assist_with_shower() throws InterruptedException {
	visitplan.select_the_tasks_as_a_assist_with_shower();
	log.info("select assist with shower tasks");
}

@Then("Select the Visits Timing")
public void select_the_visits_timing() throws InterruptedException {
	visitplan.select_the_visits_timing();
	log.info("select visits timing");
}

@Then("Enter the Caregiver Instructions")
public void enter_the_caregiver_instructions() throws InterruptedException {
	visitplan.enter_the_caregiver_instructions();
	log.info("entered caregiver instructions notes.");
}

@Then("Click on the Update Button")
public void click_on_the_update_button() throws InterruptedException {
	visitplan.click_on_the_update_button();
	log.info("click on update button");
}

@Then("Save the Bathing Details")
public void save_the_bathing_details() throws InterruptedException {
	visitplan.save_the_bathing_details();
	log.info("save bathing details..");
}

@When("click on the ADLs")
public void click_on_the_ad_ls() throws InterruptedException {
	visitplan.click_on_the_ad_ls();
	log.info("click on adls..");
}


@When("Click on the Continence And Toileting")
public void click_on_the_continence_and_toileting() throws InterruptedException {
	visitplan.click_on_the_continence_and_toileting();
	log.info("click on the continence and toileting..");
}


@Then("Click on the Assistance Level")
public void click_on_the_assistance_level() throws InterruptedException {
	visitplan.click_on_the_assistance_level();
	log.info("click on the assistance level");
}

@Then("save the Continence And Toileting Details")
public void save_the_continence_and_toileting_details() throws InterruptedException {
	visitplan.save_the_continence_and_toileting_details();
	log.info("save continence and toileting deatils");
}


@When("Click on the Again ADLs") 
public void click_on_the_again_ad_ls() throws InterruptedException {
	visitplan.click_on_the_again_ad_ls();
	log.info("click on adls..");
}

@Then("Click on the dressing And Grooming") 
public void click_on_the_dressing_and_grooming() throws InterruptedException{
	visitplan.click_on_the_dressing_and_grooming();
	log.info("click on dressing and grooming..");
}

@Then ("select the Assistance Level as a Supervision")
public void select_the_assistance_as_a_supervision() throws InterruptedException {
	visitplan.select_the_assistance_as_a_supervision();
	log.info("select supervision assistance");
	
}

@Then ("Click on the Apply Lotion Tasks")
public void click_on_the_apply_lotion_tasks() throws InterruptedException {
	visitplan.click_on_the_apply_lotion_tasks();
	log.info("click on apply lotion tasks");
}

@Then ("choose the visits time")
public void choose_the_visits_time() throws InterruptedException {
	visitplan.choose_the_visits_time();
	log.info("select the visit time");
	
}
@Then ("Enter the caregiver Instructions")
public void enter_the_caregiver_instructions3() throws InterruptedException {
	visitplan.enter_the_caregiver_instructions3();
	log.info("enter the caregiver instructions");
}

@Then ("Update the Apply Lotion")
public void update_the_apply_lotion() throws InterruptedException {
	visitplan.update_the_apply_lotion();
	log.info("update apply lotion details..");
	
}
@Then ("Save The Dressing And Grooming Details")
public void save_the_dressing_and_grooming_details() throws InterruptedException {
	visitplan.save_the_dressing_and_grooming_details();
	log.info("save the dressing and grooming details");
	
}

@When("click on the ADLs Tab")
public void click_on_the_ad_ls_tab2() throws InterruptedException {
	visitplan.click_on_the_ad_ls_tab2();
	log.info("click on the adls");
}

@Then("Click on the Eating")
public void click_on_the_eating() throws InterruptedException {
	visitplan.click_on_the_eating();
	log.info("click on the eating");
}

@Then("Select the Assistance Level as a No Assistance")
public void select_the_assistance_level_as_a_no_assistance() throws InterruptedException {
	visitplan.select_the_assistance_level_as_a_no_assistance();
	log.info("select the assistance level-no assistance");
	
}
@Then("save the Eating Details")
public void save_the_eating_details() throws InterruptedException {
	visitplan.save_the_eating_details();
	log.info("save the eating details");
	
}
@When("Click on the ADLs")
public void click_on_the_ad_ls2() throws InterruptedException {
	visitplan.click_on_the_ad_ls2();
	log.info("click on adls");
}

@Then ("Click on the Mobility")
public void click_on_the_mobility() throws InterruptedException {
	visitplan.click_on_the_mobility();
	log.info("click on the mobility");
	
}
@Then("Select the Assistance Level as  a Limited Assistance")
public void select_the_assistance_level_as_a_limited_assistance() throws InterruptedException {
	visitplan.select_the_assistance_level_as_a_limited_assistance();
	log.info("select assistance level - limited assistance");
	
}
@Then ("Select the Walk With Client")
public void select_the_walk_with_client() throws InterruptedException {
	visitplan.select_the_walk_with_client();
	log.info("select-walk with client");
}

@And("Select the Visits Time")
public void select_the_visits_time() throws InterruptedException {
	visitplan.select_the_visits_time(); 
	log.info("select the visit time");
	
}

@And("Enter Caregiver Instructions")
public void enter_caregiver_instructions() throws InterruptedException {
	visitplan.enter_caregiver_instructions();
	log.info("enter caregiver instructions notes..");
	
}
@And("Update the Walk with client Details")
public void update_the_walk_with_client_details() throws InterruptedException{
	visitplan.update_the_walk_with_client_details();
	log.info("update- walk with clients details");
	
}
@And ("Save the Mobility Details")
public void save_the_mobility_details() throws InterruptedException {
	visitplan.save_the_mobility_details();
	log.info("save-mobility details");
}

@When ("User Click on the IADLS Tab")
public void user_click_on_the_ia_dls_tab() throws InterruptedException {
	visitplan.user_click_on_the_ia_dls_tab();
	log.info("click on the IADLS");
	
}

@And ("Click on the Household Tasks")
public void click_on_the_household_tasks() throws InterruptedException {
	visitplan.click_on_the_household_tasks();
	log.info("click on the household tasks");
}

@And ("Select the Assistance Level as a Assistance")
public void select_the_assistance_level_as_a_assistance() throws InterruptedException {
	visitplan.select_the_assistance_level_as_a_assistance();
	log.info("select assistance level -assistance");
}

@And ("Click on the Make Bed")
public void click_on_the_make_bed() throws InterruptedException {
	visitplan.click_on_the_make_bed();
	log.info("click on the make bed..");
	
}
@And("Select the Make bed Visits Time")
public void select_the_make_bed_visits_time() throws InterruptedException {
	visitplan.select_the_make_bed_visits_time();
	log.info("select make bed-visits time");
	
}
@Then ("Enter the CareGIVER Instructions")
public void enter_the_caregiver_instructions1() throws InterruptedException {
	visitplan.enter_the_caregiver_instructions1();
	log.info("entered caregiver instructions..");
}


@Then ("Update the Make bed Details")
public void update_the_make_bed_details() throws InterruptedException {
	visitplan.update_the_make_bed_details();
	log.info("update-make bed details");
}

@And ("Save the Household Tasks Details")
public void save_the_household_tasks_details() throws InterruptedException {
	visitplan.save_the_household_tasks_details();
	log.info("save the household details..");
	
}
@Then ("User Again click on the IADLs")
public void user_again_click_on_the_iadls() throws InterruptedException {
	visitplan.user_again_click_on_the_iadls();
	log.info("click on the IADLS..");
	
} 

@And ("Click on the Laundry")
public void click_on_the_laundry() throws InterruptedException {
	visitplan.click_on_the_laundry();
	log.info("click on the laundry..");
}

@Then("Select Laundry Assistance Level as a Assistance")
public void select_laundry_assistance_level_as_a_assistance() throws InterruptedException{
	visitplan.select_laundry_assistance_level_as_a_assistance();
	log.info("select laundry assistance level- Assistance");
}

@Then ("Then Click on the Tasks")
public void click_on_the_tasks() throws InterruptedException {
	visitplan.click_on_the_tasks();
	log.info("click on the tasks..");
} 


@Then ("User Select the Visits Time")
public void user_select_the_visits_time() throws InterruptedException {
	visitplan.user_select_the_visits_time();
	log.info("select the visits time..");
	
}
@And ("Enter Caregiver Instruction")
public void enter_caregiver_instruction() throws InterruptedException {
	visitplan.enter_caregiver_instruction();
	log.info("entered caregiver instruction..");
}

@And ("Update the Laundry Details")
public void update_the_laundry_details() throws InterruptedException {
	visitplan.update_the_laundry_details();
	log.info("update the laundry details..");
}

@And ("Save the Laundry Details")
public void save_the_laundry_details() throws InterruptedException {
	visitplan.save_the_laundry_details();
	log.info("save the laundry details..");
}

@Then ("Again Click on the IADLs")
public void again_click_on_the_iadls() throws InterruptedException {
	visitplan.again_click_on_the_iadls(); 
	log.info("click on the IADLs..");
}

@Then ("Click on the Meals")
public void click_on_the_meals() throws InterruptedException {
	visitplan.click_on_the_meals();
	log.info("click on the Meals..");
}

@Then ("Select the Meals Assistance Level No Assistance")
public void select_the_meals_assistance_level_no_assistance() throws InterruptedException {
	visitplan.select_the_meals_assistance_level_no_assistance();
	log.info("select the meals Assistance level- No Assistance.");
	
}
@And ("Save the Meals Details")
public void save_the_meals_details() throws InterruptedException {
	visitplan.save_the_meals_details();
	log.info("save the meals details..");
}

@Then("User Again click on the IADLS")
public void user_again_click_on_the_iadls1() throws InterruptedException {
	visitplan.user_again_click_on_the_iadls1();
	log.info("click on the IADLs..");
		
}

@Then ("User click on the Medication")
public void user_click_on_the_medication() throws InterruptedException {
	visitplan.user_click_on_the_medication();
	log.info("click on the Medication..");
}

@And ("User select the Medication Assistance Level as Assistance")
public void user_select_the_medication_assistance_level_as_assistance() throws InterruptedException {
	visitplan.user_select_the_medication_assistance_level_as_assistance();
	log.info("select the medication assistance level-Assistance..");
}

@Then ("Select the tasks with Check Blood Pressure")
public void select_the_tasks_with_check_blood_pressure() throws InterruptedException {
	visitplan.select_the_tasks_with_check_blood_pressure();
	log.info("select the tasks-Check Blood Pressure..");
}

@And ("I Select the Visits Time")
public void i_select_the_visits_time() throws InterruptedException {
	visitplan.i_select_the_visits_time();
	log.info("select the visits time..");
}
	
	
@And ("Enter the CareGiver Instructions")
public void enter_the_careGiver_instructions() throws InterruptedException {
	visitplan.enter_the_careGiver_instructions(); 
	log.info("entered caregiver instructions..");
}

@And ("Update the Medication Details")
public void update_the_medication_details () throws InterruptedException {
	visitplan.update_the_medication_details();
	log.info("update the medication Details..");
}

@And ("Save the Medication Details")
public void save_the_medication_details () throws InterruptedException {
	visitplan.save_the_medication_details();
	log.info("save the medication Details..");
}

@And ("Click on the IADL")
public void click_on_the_iadl() throws InterruptedException {
	visitplan.click_on_the_iadl();
	log.info("click on the IADLS..");
}


@And ("Click on the Other")
public void click_on_the_other() throws InterruptedException {
	visitplan.click_on_the_other();
	log.info("click on the other button");
}


@And ("Select No Assistance")
public void select_no_assistance() throws InterruptedException {
	visitplan.select_no_assistance();
	log.info("select No Assistance");
}

@Then ("Click on the Add To schedule Button and Finalize Visits")
public boolean click_on_the_add_to_schedule_button_and_finalize_visits() throws InterruptedException {
	log.info("Click on the Add To Schedule and Finalize Visits..");
	return visitplan.click_on_the_add_to_schedule_button_and_finalize_visits();
	
}


@When ("Click on the Visit Plans")
public void click_on_the_visit_plans() throws InterruptedException {
	visitplan.click_on_the_visit_plans();
	log.info("click on visit plans..");
}


@Then ("Click on the User Table")
public void click_on_the_user_table() throws InterruptedException {
	visitplan.click_on_the_user_table();
	log.info("click on the user table..");
}

@Then ("Delete the Everyday visit series")
public void delete_the_everyday_visit_series() throws InterruptedException {
	visitplan.delete_the_everyday_visit_series();
	
}
@And ("Save the Everyday Visit Series")
public void save_the_everyday_visit_series() throws InterruptedException {
	visitplan.save_the_everyday_visit_series();
	
}

@Then ("User Go to the Add Visit Configuration")
public void user_go_to_the_add_visit_configuration() throws InterruptedException {
	visitplan.user_go_to_the_add_visit_configuration();
	log.info("Click on the Add Visit Configuration..");
}

@Given("user select all Days")
public void user_select_all_days() throws InterruptedException {
	visitplan.user_select_all_days();
	log.info("select All Days..");
}

@Then("select start time")
public void select_start_time() throws InterruptedException {
	visitplan.select_start_time();
	log.info("select Start Time..");
}

@Then("select Duration")
public void select_duration() throws InterruptedException {
	visitplan.select_duration();
	log.info("select duration..");
}

@Then("select Weekly recurrence")
public void select_weekly_recurrence() throws InterruptedException {
	visitplan.select_weekly_recurrence();
	log.info("select weekly recurrence..");
}

@Then("select start Date")
public void select_start_date() throws InterruptedException {
	visitplan.select_start_date();
	log.info("select start date..");
}

@Then("select past Date")
public void select_past_date() throws InterruptedException {
	visitplan.select_past_date();
	log.info("select past date..");
}


@Then("User Click on the save Button")
public void user_click_on_the_save_button() throws InterruptedException {
    visitplan.user_click_on_the_save_button();
    log.info("click on save button.");
}

@And ("Save the For All Days Visit Details")
public void save_the_for_all_days_visit_details() throws InterruptedException {
	visitplan.save_the_for_all_days_visit_details();
	log.info("save- All Days Visit Details..");
}

@Then ("Message Should be Shown Visit Plan was saved6")
public void message_should_be_shown_visit_plan_was_saved6() {
	visitplan.message_should_be_shown_visit_plan_was_saved6();
	log.info("Validation msg is showing- Visit plan was saved..");
}

@Then ("Message should be Shown Visit Plan was saved")
public void message_should_be_shown_visit_plan_was_saved() {
	visitplan.message_should_be_shown_visit_plan_was_saved(); 
	log.info("Validation msg is showing- Visit plan was saved..");
}

	
//change task

@Given ("User Click on the ADLs Tab")
public void user_click_on_the_ad_ls_tab() throws InterruptedException {
	visitplan.user_click_on_the_ad_ls_tab();
	log.info("click on the ADLS..");
}

@Then ("User Click on the Bathing")
public void user_click_on_the_bathing() throws InterruptedException {
	visitplan.user_click_on_the_bathing();
	log.info("click on the Bathing..");
}

	
@Then ("Verify if Assist With Shower is Already Checked then Unchecked it")
public void verify_if_assist_with_shower_is_already_checked_then_unchecked_it() throws InterruptedException {
	visitplan.verify_if_assist_with_shower_is_already_checked_then_unchecked_it();
	log.info("unchecked assist with shower.");
}

@And ("Checked the Assist With Sponge Bath")
public void checked_the_assist_with_sponge_bath() throws InterruptedException {
	visitplan.checked_the_assist_with_sponge_bath();
	log.info("click on Assist with Sponge Bath.");
}

@And ("User Select the Visits Timing")
public void user_select_the_visits_timing() throws InterruptedException {
	visitplan.user_select_the_visits_timing();
	log.info("select the visits timing.");
}


@And("Update the Bathing Details")
public void update_the_bathing_details() throws InterruptedException {
	visitplan.update_the_bathing_details();
	log.info("update the Bathing Details.");
}


@And ("Save the Bathing details")
public void save_the_bathing_details1() throws InterruptedException {
	visitplan.save_the_bathing_details1();
	log.info("Save the Bathing Details.");
}


@When ("User Click on the  ADLs To Enter the Dressing And Grooming details")
public void user_click_on_the_ad_ls_to_enter_the_dressing_and_grooming_details() throws InterruptedException {
	visitplan.user_click_on_the_ad_ls_to_enter_the_dressing_and_grooming_details();
	log.info("click on ADLS and entered the Dressing and Grooming Details.");
	
}
@Then ("User Click on the dressing And Grooming")
public void user_click_on_the_dressing_and_grooming() throws InterruptedException {
	visitplan.user_click_on_the_dressing_and_grooming();
	log.info("click on the Dressing and Grooming.");
}

@Then ("Verify if Apply Lotion Tasks is Already Checked then Unchecked it")
public void verify_if_apply_lotion_tasks_is_already_checked_then_unchecked_it() throws InterruptedException {
	visitplan.verify_if_apply_lotion_tasks_is_already_checked_then_unchecked_it();
	log.info("unchecked Apply Lotion Tasks..");
	
}
@And ("User Ticked on Assist with Oral Care")
public void user_ticked_on_assist_with_oral_care() throws InterruptedException {
	visitplan.user_ticked_on_assist_with_oral_care();
	log.info("Select Assist with Oral Care..");
	
}

@Then ("Select the Visit Time")
public void select_the_visit_time() throws InterruptedException {
	visitplan.select_the_visit_time();
	log.info("Select the visit time..");	
}


@Then ("Update the Assist with Oral Care details")
public void update_the_assist_with_oral_care_details() throws InterruptedException {
	visitplan.update_the_assist_with_oral_care_details();
	log.info("Update Assist With Oral Care Details..");
	
}
@Then ("save The Dressing And Grooming Details")
public void save_the_dressing_and_grooming_details1() throws InterruptedException {
	visitplan.save_the_dressing_and_grooming_details1();
	log.info("save the Dressing and Grooming Details..");
}

@And ("User Click on the ADLS To Enter the Mobility Details")
public void user_click_on_the_ad_ls_to_enter_the_mobility_details() throws InterruptedException {
	visitplan.user_click_on_the_ad_ls_to_enter_the_mobility_details();
	log.info("Click on the ADLS and entered the mobility Details..");
}

@Then ("User Click on the Mobility")
public void user_click_on_the_mobility() throws InterruptedException {
	visitplan.user_click_on_the_mobility();
	log.info("Click on the mobility..");
}

@Then ("Verify if Walk With Client Tasks is Already Checked then Unchecked it")
public void verify_if_walk_with_client_tasks_is_already_checked_then_unchecked_it() throws InterruptedException {
	visitplan.verify_if_walk_with_client_tasks_is_already_checked_then_unchecked_it();
	log.info("unchecked the walk with clients tasks..");
}

@And ("Select the Assist With Transfers")
public void select_the_assist_with_transfers() throws InterruptedException {
	visitplan.select_the_assist_with_transfers();
	log.info("select the assist with transfers..");
}

@And ("User Choose the Visits Time")
public void user_choose_the_visits_time() throws InterruptedException {
	visitplan.user_choose_the_visits_time();
	log.info("select the visits time..");
}

@And ("Update the Assist With Transfers Details")
public void update_the_assist_with_transfers_details() throws InterruptedException {
	visitplan.update_the_assist_with_transfers_details(); 
	log.info("update the assist with transfers details..");
}

@And ("User Click on the Save Button to save the Mobility Details")
public void user_click_on_the_save_button_to_save_the_mobility_details() throws InterruptedException {
	visitplan.user_click_on_the_save_button_to_save_the_mobility_details(); 
	log.info("save the mobility details..");
}

@Then ("User Again click on the IADLS to Enter the Medication Details")
public void user_again_click_on_the_ia_dls_to_enter_the_medication_details() throws InterruptedException {
	visitplan.user_again_click_on_the_ia_dls_to_enter_the_medication_details();
	log.info("click on the IADLs and entered the medication details..");
}

@Then ("click on the Medication")
public void click_on_the_medication() throws InterruptedException {
	visitplan.click_on_the_medication();
	log.info("click on the medication..");
}

@Then ("Verify if Check Blood Pressure Tasks is Already Select then Unselect it")
public void verify_if_check_blood_pressure_tasks_is_already_select_then_unselect_it() throws InterruptedException {
	visitplan.verify_if_check_blood_pressure_tasks_is_already_select_then_unselect_it();
	log.info("unchecked the check blood pressure tasks..");
	
}
@And ("Select the Check Temperature")
public void select_the_check_temperature() throws InterruptedException {
	visitplan.select_the_check_temperature();
	log.info("select the check temperature.");
}

@And  ("Users Select the Visits Time")
public void users_select_the_visits_time() {
	visitplan.users_select_the_visits_time();
	log.info("select the visits time.");
}

@And ("User Update the Medication Details")
public void user_update_the_medication_details() throws InterruptedException {
	visitplan.user_update_the_medication_details();
	log.info("update medication details..");
}

@And ("User Save the Medication Details")
public void user_save_the_medication_details() throws InterruptedException {
	visitplan.user_save_the_medication_details();
	log.info("save medication details..");
}

@Then ("User Click on the Add to Schedule and Finalize Visits")
public boolean user_click_on_the_add_to_schedule_and_finalize_visits() throws InterruptedException {
	log.info("click on add to schedule and finalize visits");
	return visitplan.user_click_on_the_add_to_schedule_and_finalize_visits();

}

@Then ("Delete the single visit serise")
public void delete_the_single_visit_serise() throws InterruptedException {
	visitplan.delete_the_single_visit_serise();
}


@And ("Save the Single Visit Series")
public void save_the_single_visit_series() throws InterruptedException {
	visitplan.save_the_single_visit_series();
	
}


// custom date range

@Then("Check the Add Visit Configuration Button")
public void check_the_add_visit_configuration_button() throws InterruptedException {
	visitplan.check_the_add_visit_configuration_button();
	log.info("click on add visit configuration button..");
}


@Given ("user select Single days")
public void user_select_single_days() throws InterruptedException {
	visitplan.user_select_single_days();
	log.info("Select single Days..");
}


@Then("User Select Start Time")
public void user_select_start_time() throws InterruptedException {
	visitplan.user_select_start_time();
	log.info("Select start time..");
}

@Then("User select a Duration")
public void user_select_a_duration() throws InterruptedException {
	visitplan.user_select_a_duration();
	log.info("Select duration..");
}

@Then("User Select the weekly recurrence")
	public void user_select_the_weekly_recurrence() throws InterruptedException {
	visitplan.user_select_the_weekly_recurrence();
	log.info("Select- Weekly Recurrence..");
}


@Then ("User select start date") 
public void user_select_start_date() throws InterruptedException {
	visitplan.user_select_start_date();
	log.info("Select-start date");
}

@Then ("user Click on the Use Custom End Date toggle")
public void user_click_on_the_use_custom_end_date_toggle() throws InterruptedException {
	visitplan.user_click_on_the_use_custom_end_date_toggle();
	log.info("entered the custom end date");
}

@And ("User enter the End Date")
public void user_enter_the_end_date() throws InterruptedException {
	visitplan.user_enter_the_end_date();
	log.info("entered end date");
}


@Then ("Save the visits details")
public void save_the_visits_details() throws InterruptedException {
	visitplan.save_the_visits_details();
	log.info("save the visits details");
}

@Then ("Save the all Visits Plan Details")
public void save_the_all_visits_plan_details() throws InterruptedException {
	visitplan.save_the_all_visits_plan_details();
	log.info("save the All visits details");
}

@Then ("Message should be Shown Visit Plan was saved3")
public void message_should_be_shown_visit_plan_was_saved3() {
	visitplan.message_should_be_shown_visit_plan_was_saved3();
	log.info("validation msg is showing-Visit Plan was saved");
}

@Then ("Click on the Single day Table")
public void click_on_the_single_day_table () throws InterruptedException {
	visitplan.click_on_the_single_day_table();
	log.info("click on the table");
}

@And ("Change The End Date")
public void change_the_end_date() {
	visitplan.change_the_end_date();
	log.info("change the end date");
}

@And ("Update the Visits")
public void update_the_visits() throws InterruptedException {
	visitplan.update_the_visits();
	log.info("update the visits");
}

@And ("Save The Visits")
public void save_the_visits() throws InterruptedException {
	visitplan.save_the_visits();
	log.info("save the visits");
}

@Then ("Message should be Shown Visit Plan was saved4")
public void message_should_be_shown_visit_plan_was_saved4() {
	visitplan.message_should_be_shown_visit_plan_was_saved4();
	log.info("validation message is showing- Visit plan was saved");
}


//Change A visit Duration For Everyday
@Then ("Click on the Visit Table")
public void click_on_the_visit_table() throws InterruptedException {
	visitplan.click_on_the_visit_table();
	log.info("click on visit table");
}

@And ("Change The Visit Duration as 30 Minute Visit")
public void change_the_visit_duration_as_30_minute_visit() throws InterruptedException {
	visitplan.change_the_visit_duration_as_30_minute_visit();
	log.info("change the visit duration");
}

@And ("Update the Visit Duration")
public void update_the_visit_duration() throws InterruptedException {
	visitplan.update_the_visit_duration();
	log.info("update the visit duration");
}

@And ("Save the Details")
public void save_the_details() throws InterruptedException {
	visitplan.save_the_details();
	log.info("save the details");
}

@Then("Message should be Shown Visit Plan was saved7")
public void message_should_be_shown_visit_plan_was_saved7() {
	visitplan.message_should_be_shown_visit_plan_was_saved7(); 
	log.info("Validation message should be shown-Visit Plan was Saved");
}

//Single Change Duration

@And ("click on the single Visit table")
public void click_on_the_single_visit_table() throws InterruptedException {
	visitplan.click_on_the_single_visit_table();
	log.info("click on the single visit table");
}

@And ("Change the visit duration as 45 Minute Visit")
public void change_the_visit_duration_as_45_minute_visit() throws InterruptedException {
	visitplan.change_the_visit_duration_as_45_minute_visit();
	log.info("change the visit duration");
}

@Then ("click on the update button")
public void click_on_the_update_button1() throws InterruptedException {
	visitplan.click_on_the_update_button1();
	log.info("click on the update button");
}

@And ("Click on the Save button")
public void click_on_the_save_button1() throws InterruptedException {
	visitplan.click_on_the_save_button1();
	log.info("click on the save button");
}

@Then ("Validation Message should be Shown Visit Plan was saved2")
public void validation_message_should_be_shown_visit_plan_was_saved2() {
	visitplan.validation_message_should_be_shown_visit_plan_was_saved2();
	log.info("Validation message should be shown-Visit Plan was Saved");
}

//Delete for everyday
@Given ("User click on the Delete Icon")
public void user_click_on_the_delete_icon() throws InterruptedException {
	visitplan.user_click_on_the_delete_icon();
	log.info("click on the delete icon..");	
}

@Then ("Delete visit Configurations Pop Up is opened  and click on the Delete button")
public void delete_visit_configurations_pop_up_is_opened_and_click_on_the_delete_button() throws InterruptedException {
	visitplan.delete_visit_configurations_pop_up_is_opened_and_click_on_the_delete_button();
	log.info("pop up is showing and click on the delete icon..");	
}

@And ("Save the delete Visit Series")
public void save_the_delete_visit_series() {
	try {
		visitplan.save_the_delete_visit_series();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	log.info("save delete visit series..");
}

@Then ("Message should be Shown Visit Plan was saved8")
public void message_should_be_shown_visit_plan_was_saved8() {
	visitplan.message_should_be_shown_visit_plan_was_saved8();
	log.info("validation message should be shown - Visit Plan was saved.");
}

//single delete
@And ("Click on the delete Icon and Pop is Displayed Confirm that you want to delete this item")
public void click_on_the_delete_Icon_and_Pop_is_displayed_confirm_that_you_want_to_delete_this_item() throws InterruptedException{
	visitplan.click_on_the_delete_Icon_and_Pop_is_displayed_confirm_that_you_want_to_delete_this_item();
	log.info("delete the single details.");
}

@Then ("Click on the Delete Button")
public void click_on_the_delete_button() throws InterruptedException {
	visitplan.click_on_the_delete_button();
	log.info("click on delete button");
}

@And ("Save the Single delete Visit Series")
public void save_the_single_delete_visit_series() throws InterruptedException {
	visitplan.save_the_single_delete_visit_series();
	log.info("save the single delete visit series");
}

@Then ("Message should be Shown Visit Plan was saved5")
public void message_should_be_shown_visit_plan_was_saved5() {
	visitplan.message_should_be_shown_visit_plan_was_saved5();
	log.info("validation message should be shown - Visit Plan was saved.");
}

}

















