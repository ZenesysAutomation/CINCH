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


@Then("Click on the Add Visit Configuration")
public void click_on_the_add_visit_configuration() throws InterruptedException {
	visitplan.click_on_the_add_visit_configuration();
}

@Then("Select the Single Day")
public boolean select_the_single_day() throws InterruptedException {
	 return visitplan.select_the_single_day();
}
@Then("Select the Recurrence")
public void select_the_recurrence() throws InterruptedException {
	visitplan.select_the_recurrence();
}

@Then("Select the Start Time")
public void select_the_start_time() throws InterruptedException {
	visitplan.select_the_start_time();
}

@Then("Select a Duration")
public void select_a_duration() throws InterruptedException {
	visitplan.select_a_duration();
}

/*@Then("Select the Recurrence")
public void select_the_recurrence() throws InterruptedException {
	visitplan.select_the_recurrence();
}*/

@Then("Select the Start Date")
public void select_the_start_date() throws InterruptedException {
	visitplan.select_the_start_date();
}


@Then("click on the Save Button")
public void click_on_the_save_button() throws InterruptedException {
	visitplan.click_on_the_save_button();

	}

@Then ("Save the all Single Visit Details")
public void save_the_all_single_visit_details() throws InterruptedException {
	visitplan.save_the_all_single_visit_details();
	
}

@Then("Validation Message Should be Shown Visit Plan was saved1")
public void validation_message_should_be_shown_visit_plan_was_saved1() {
	visitplan.validation_message_should_be_shown_visit_plan_was_saved1();
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

@Then ("Click on the Add To schedule Button and Finalize Visits")
public boolean click_on_the_add_to_schedule_button_and_finalize_visits() throws InterruptedException {
	return visitplan.click_on_the_add_to_schedule_button_and_finalize_visits();
	
}



@Then ("User Go to the Add Visit Configuration")
public void user_go_to_the_add_visit_configuration() throws InterruptedException {
	visitplan.user_go_to_the_add_visit_configuration();
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

@Then("select past Date")
public void select_past_date() throws InterruptedException {
	visitplan.select_past_date();
    
}


@Then("User Click on the save Button")
public void user_click_on_the_save_button() throws InterruptedException {
    visitplan.user_click_on_the_save_button();
}

@And ("Save the For All Days Visit Details")
public void save_the_for_all_days_visit_details() throws InterruptedException {
	visitplan.save_the_for_all_days_visit_details();
	
}

@Then ("Message Should be Shown Visit Plan was saved6")
public void message_should_be_shown_visit_plan_was_saved6() {
	visitplan.message_should_be_shown_visit_plan_was_saved6();
	
}

@Then ("Message should be Shown Visit Plan was saved")
public void message_should_be_shown_visit_plan_was_saved() {
	visitplan.message_should_be_shown_visit_plan_was_saved(); 
	
}

	
//change task

@Given ("User Click on the ADLs Tab")
public void user_click_on_the_ad_ls_tab() throws InterruptedException {
	visitplan.user_click_on_the_ad_ls_tab();
	
}
@Then ("User Click on the Bathing")
public void user_click_on_the_bathing() throws InterruptedException {
	visitplan.user_click_on_the_bathing();
}

	
@Then ("Verify if Assist With Shower is Already Checked then Unchecked it")
public void verify_if_assist_with_shower_is_already_checked_then_unchecked_it() throws InterruptedException {
	visitplan.verify_if_assist_with_shower_is_already_checked_then_unchecked_it();
}
@And ("Checked the Assist With Sponge Bath")
public void checked_the_assist_with_sponge_bath() throws InterruptedException {
	visitplan.checked_the_assist_with_sponge_bath();
	
}
@And ("User Select the Visits Timing")
public void user_select_the_visits_timing() throws InterruptedException {
	visitplan.user_select_the_visits_timing();
	
}


@And("Update the Bathing Details")
public void update_the_bathing_details() throws InterruptedException {
	visitplan.update_the_bathing_details();
}
@And ("Save the Bathing details")
public void save_the_bathing_details1() throws InterruptedException {
	visitplan.save_the_bathing_details1();
	
}


@When ("User Click on the  ADLs To Enter the Dressing And Grooming details")
public void user_click_on_the_ad_ls_to_enter_the_dressing_and_grooming_details() throws InterruptedException {
	visitplan.user_click_on_the_ad_ls_to_enter_the_dressing_and_grooming_details();
	
}
@Then ("User Click on the dressing And Grooming")
public void user_click_on_the_dressing_and_grooming() throws InterruptedException {
	visitplan.user_click_on_the_dressing_and_grooming();
	
}

@Then ("Verify if Apply Lotion Tasks is Already Checked then Unchecked it")
public void verify_if_apply_lotion_tasks_is_already_checked_then_unchecked_it() throws InterruptedException {
	visitplan.verify_if_apply_lotion_tasks_is_already_checked_then_unchecked_it();
	
}
@And ("User Ticked on Assist with Oral Care")
public void user_ticked_on_assist_with_oral_care() throws InterruptedException {
	visitplan.user_ticked_on_assist_with_oral_care();
	
}
@Then ("Select the Visit Time")
public void select_the_visit_time() throws InterruptedException {
	visitplan.select_the_visit_time();
	
}
//@Then ("user Enter the caregiver Instructions")
//public void user_enter_the_caregiver_instructions1() throws InterruptedException {
//	visitplan.user_enter_the_caregiver_instructions1();
//}

@Then ("Update the Assist with Oral Care details")
public void update_the_assist_with_oral_care_details() throws InterruptedException {
	visitplan.update_the_assist_with_oral_care_details();
	
}
@Then ("save The Dressing And Grooming Details")
public void save_the_dressing_and_grooming_details1() throws InterruptedException {
	visitplan.save_the_dressing_and_grooming_details1();
	
}

@And ("User Click on the ADLS To Enter the Mobility Details")
public void user_click_on_the_ad_ls_to_enter_the_mobility_details() throws InterruptedException {
	visitplan.user_click_on_the_ad_ls_to_enter_the_mobility_details();
	
}
@Then ("User Click on the Mobility")
public void user_click_on_the_mobility() throws InterruptedException {
	visitplan.user_click_on_the_mobility();
	
}

@Then ("Verify if Walk With Client Tasks is Already Checked then Unchecked it")
public void verify_if_walk_with_client_tasks_is_already_checked_then_unchecked_it() throws InterruptedException {
	visitplan.verify_if_walk_with_client_tasks_is_already_checked_then_unchecked_it();
}

@And ("Select the Assist With Transfers")
public void select_the_assist_with_transfers() throws InterruptedException {
	visitplan.select_the_assist_with_transfers();
	
}
@And ("User Choose the Visits Time")
public void user_choose_the_visits_time() throws InterruptedException {
	visitplan.user_choose_the_visits_time();
	
}

@And ("Update the Assist With Transfers Details")
public void update_the_assist_with_transfers_details() throws InterruptedException {
	visitplan.update_the_assist_with_transfers_details(); 
	
}
@And ("User Click on the Save Button to save the Mobility Details")
public void user_click_on_the_save_button_to_save_the_mobility_details() throws InterruptedException {
	visitplan.user_click_on_the_save_button_to_save_the_mobility_details(); 
	
}

@Then ("User Again click on the IADLS to Enter the Medication Details")
public void user_again_click_on_the_ia_dls_to_enter_the_medication_details() throws InterruptedException {
	visitplan.user_again_click_on_the_ia_dls_to_enter_the_medication_details();
	
}
@Then ("click on the Medication")
public void click_on_the_medication() throws InterruptedException {
	visitplan.click_on_the_medication();
	
}

@Then ("Verify if Check Blood Pressure Tasks is Already Select then Unselect it")
public void verify_if_check_blood_pressure_tasks_is_already_select_then_unselect_it() throws InterruptedException {
	visitplan.verify_if_check_blood_pressure_tasks_is_already_select_then_unselect_it();
	
}
@And ("Select the Check Temperature")
public void select_the_check_temperature() throws InterruptedException {
	visitplan.select_the_check_temperature();
	
}
@And  ("Users Select the Visits Time")
public void users_select_the_visits_time() {
	visitplan.users_select_the_visits_time();
	
}
//@And ("User Enter Caregiver Instructions For Medication")
//public void user_enter_caregiver_instructions_for_medication() throws InterruptedException {
	//visitplan.user_enter_caregiver_instructions_for_medication();
	
//}
@And ("User Update the Medication Details")
public void user_update_the_medication_details() throws InterruptedException {
	visitplan.user_update_the_medication_details();
}
@And ("User Save the Medication Details")
public void user_save_the_medication_details() throws InterruptedException {
	visitplan.user_save_the_medication_details();
	
}
@Then ("User Click on the Add to Schedule and Finalize Visits")
public boolean user_click_on_the_add_to_schedule_and_finalize_visits() throws InterruptedException {
	return visitplan.user_click_on_the_add_to_schedule_and_finalize_visits();
	
}
// change tasks

@Then("Check the Add Visit Configuration Button")
public void check_the_add_visit_configuration_button() throws InterruptedException {
	visitplan.check_the_add_visit_configuration_button();
}


@Given ("user select all the days")
public void user_select_all_the_days() throws InterruptedException {
	visitplan.user_select_all_the_days();
	
}


@Then("User Select Start Time")
public void user_select_start_time() throws InterruptedException {
	visitplan.user_select_start_time();
}
@Then("User select a Duration")
public void user_select_a_duration() throws InterruptedException {
	visitplan.user_select_a_duration();
	
}
@Then("User Select the Weekly recurrence")
	public void user_select_the_weekly_recurrence() throws InterruptedException {
	visitplan.user_select_the_weekly_recurrence();
}	
@Then ("User select start date") 
public void user_select_start_date() throws InterruptedException {
	visitplan.user_select_start_date();
	
}

@Then ("user Click on the Use Custom End Date toggle")
public void user_click_on_the_use_custom_end_date_toggle() throws InterruptedException {
	visitplan.user_click_on_the_use_custom_end_date_toggle();
}

@And ("User enter the End Date")
public void user_enter_the_end_date() throws InterruptedException {
	visitplan.user_enter_the_end_date();
	
}


@Then ("Save the visits details")
public void save_the_visits_details() throws InterruptedException {
	visitplan.save_the_visits_details();
	
}

@Then ("Save the all Visits Plan Details")
public void save_the_all_visits_plan_details() throws InterruptedException {
	visitplan.save_the_all_visits_plan_details();
}

@Then ("Message should be Shown Visit Plan was saved3")
public void message_should_be_shown_visit_plan_was_saved3() {
	visitplan.message_should_be_shown_visit_plan_was_saved3();
}

@Then ("Click on the Everyday Table")
public void click_on_the_everyday_table () throws InterruptedException {
	visitplan.click_on_the_everyday_table ();
}
@And ("Change The End Date")
public void change_the_end_date() {
	visitplan.change_the_end_date();
	
}
@And ("Update the Visits")
public void update_the_visits() throws InterruptedException {
	visitplan.update_the_visits();
	
}
@And ("Save The Visits")
public void save_the_visits() throws InterruptedException {
	visitplan.save_the_visits();
	
}

@Then ("Message should be Shown Visit Plan was saved4")
public void message_should_be_shown_visit_plan_was_saved4() {
	visitplan.message_should_be_shown_visit_plan_was_saved4();
	
}


//Change A visit Duration For Everyday
@Then ("Click on the Visit Table")
public void click_on_the_visit_table() throws InterruptedException {
	visitplan.click_on_the_visit_table();
}
@And ("Change The Visit Duration as 30 Minute Visit")
public void change_the_visit_duration_as_30_minute_visit() throws InterruptedException {
	visitplan.change_the_visit_duration_as_30_minute_visit();
}
@And ("Update the Visit Duration")
public void update_the_visit_duration() throws InterruptedException {
	visitplan.update_the_visit_duration();
	
}
@And ("Save the Details")
public void save_the_details() throws InterruptedException {
	visitplan.save_the_details();
	
}
@Then("Message should be Shown Visit Plan was saved7")
public void message_should_be_shown_visit_plan_was_saved7() {
	visitplan.message_should_be_shown_visit_plan_was_saved7(); 
}

//Single Change Duration

@And ("click on the single Visit table")
public void click_on_the_single_visit_table() throws InterruptedException {
	visitplan.click_on_the_single_visit_table();
	
}

@And ("Change the visit duration as 45 Minute Visit")
public void change_the_visit_duration_as_45_minute_visit() throws InterruptedException {
	visitplan.change_the_visit_duration_as_45_minute_visit();
}

@Then ("click on the update button")
public void click_on_the_update_button1() throws InterruptedException {
	visitplan.click_on_the_update_button1();
}

@And ("Click on the Save button")
public void click_on_the_save_button1() throws InterruptedException {
	visitplan.click_on_the_save_button1();
}

@Then ("Validation Message should be Shown Visit Plan was saved2")
public void validation_message_should_be_shown_visit_plan_was_saved2() {
	visitplan.validation_message_should_be_shown_visit_plan_was_saved2();
}

//Delete for everyday
@Given ("User click on the Delete Icon")
public void user_click_on_the_delete_icon() throws InterruptedException {
	visitplan.user_click_on_the_delete_icon();
	
}
@Then ("Delete visit Configurations Pop Up is opened  and click on the Delete button")
public void delete_visit_configurations_pop_up_is_opened_and_click_on_the_delete_button() throws InterruptedException {
	visitplan.delete_visit_configurations_pop_up_is_opened_and_click_on_the_delete_button();
	
}

@And ("Save the delete Visit Series")
public void save_the_delete_visit_series() {
	try {
		visitplan.save_the_delete_visit_series();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}

@Then ("Message should be Shown Visit Plan was saved8")
public void message_should_be_shown_visit_plan_was_saved8() {
	visitplan.message_should_be_shown_visit_plan_was_saved8();
	
}

//single delete
@And ("Click on the delete Icon and Pop is Displayed Confirm that you want to delete this item")
public void click_on_the_delete_Icon_and_Pop_is_displayed_confirm_that_you_want_to_delete_this_item() throws InterruptedException{
	visitplan.click_on_the_delete_Icon_and_Pop_is_displayed_confirm_that_you_want_to_delete_this_item();
}
@Then ("Click on the Delete Button")
public void click_on_the_delete_button() throws InterruptedException {
	visitplan.click_on_the_delete_button();
	
}

@And ("Save the Single delete Visit Series")
public void save_the_single_delete_visit_series() throws InterruptedException {
	visitplan.save_the_single_delete_visit_series();
}

@Then ("Message should be Shown Visit Plan was saved5")
public void message_should_be_shown_visit_plan_was_saved5() {
	visitplan.message_should_be_shown_visit_plan_was_saved5();
	
}

}

















