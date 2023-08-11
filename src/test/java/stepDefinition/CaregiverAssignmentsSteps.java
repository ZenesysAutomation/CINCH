package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.CaregiverAssignmentsPage;

public class CaregiverAssignmentsSteps extends BaseClass  {
	
	CaregiverAssignmentsPage cg = new CaregiverAssignmentsPage();
	 
	@Given ("User Enter The Email")
	public void user_enter_the_email() throws InterruptedException {
		cg.user_enter_the_email();
		 log.info("Entered Email Address..");
	}
	
	@When ("User Enter The Password")
	public void user_enter_the_password() throws InterruptedException {
		cg.user_enter_the_password();
		log.info("Entered password.");
		
	}
	@Then ("User Click on the Login Button")
	public void user_click_on_the_login_button() throws InterruptedException {
		cg.user_click_on_the_login_button();
		log.info("click on login button..");
		
	}
	@Then ("Select the Test Community")
	public void select_the_test_community() throws InterruptedException {
		cg.select_the_test_community();
		log.info("select test community");
		
	}
	@And ("User Click on the Continue Button")
	public void user_click_on_the_continue_button() throws InterruptedException {
		cg.user_click_on_the_continue_button();
		log.info("click on continue button");
	}
	
	@Given ("Click on the Caregiver Assignments")
	public void click_on_the_caregiver_assignments() throws InterruptedException {
		cg.click_on_the_caregiver_assignments();
		log.info("click on caregiver assignments");
	}
	
	@When ("Check if Color is Blue and Active Visit then Click on it")
	public void check_if_color_is_blue_and_active_visit_then_click_on_it() throws InterruptedException {
		cg.check_if_color_is_blue_and_active_visit_then_click_on_it();
		log.info("click on color");
		
	}

	@Then("Change the Time for visit")
	public void change_the_time_for_visit() throws InterruptedException{
		cg.change_the_time_for_visit();
		log.info("change time for visit");
	}
	
	
	
	@And ("Select option Move only this occurrence")
	public void select_option_move_only_this_occurence() throws InterruptedException {
		cg.select_option_move_only_this_occurence();
		log.info("select move only this occurence");
		
	}
	
	@Then ("Save the Visit")
	public void save_the_visit() throws InterruptedException {
		cg.save_the_visit();
		log.info("save the visit");
		
	}	
	
	@When ("Check if Color is Blue and Active Visit then Click on it2")
	public void check_if_color_is_blue_and_active_visit_then_click_on_it2() throws InterruptedException {
		cg.check_if_color_is_blue_and_active_visit_then_click_on_it2();
		log.info("click on color");
		
	}
	
	@Then ("Change the Time")
	public void change_the_time() throws InterruptedException {
		cg.change_the_time();
		log.info("change the time");
	}
	
	@And ("Select the Option Move day series")
	public void select_the_option_move_day_series() throws InterruptedException {
		cg.select_the_option_move_day_series();
		log.info("select move day series..");
		
	}
	
	@Then ("save the visit")
	public void save_the_visit1() throws InterruptedException {
		cg.save_the_visit1();
		log.info("save visit..");
	} 
	
	@When("Check if Color is Blue and Active Visit then Click on it3")
	public void check_if_color_is_blue_and_active_visit_then_click_on_it3() throws InterruptedException {
		cg.check_if_color_is_blue_and_active_visit_then_click_on_it3();
		log.info("click on color");
	}
	
	@Then ("change the time")
	public void change_the_time1() throws InterruptedException {
		cg.change_the_time1();
		log.info("change the time");
	}
	
	@And ("Select the Option Move week series")
	public void select_the_option_move_week_series() throws InterruptedException {
		cg.select_the_option_move_week_series();
		log.info("select move week series");
		
	}
	
	@Then ("Save The Visit")
	public void save_the_visit2() throws InterruptedException {
		cg.save_the_visit2();
		log.info("save visit..");
	}
	
	@Given ("Click on the Visit")
	public void click_on_the_visit() throws InterruptedException {
		cg.click_on_the_visit();
		log.info("click on visit..");
	}
	
	@Then ("Change the Track from East1 to East2")
	public void change_the_track_from_east1_to_east2() throws InterruptedException {
		cg.change_the_track_from_east1_to_east2();
		log.info("change track");
	}
	
	
	@And ("Select Move only this occurrence")
	public void select_move_only_this_occurrence() throws InterruptedException {
		cg.select_move_only_this_occurrence(); 
		log.info("select move only this occurrence");
	}
	
	
	@Then ("Save the Visits")
	public void save_the_visits() throws InterruptedException {
		cg.save_the_visits();
		log.info("save visits..");
	}
	
	@Given ("User Click on the Visit")
	public void user_click_on_the_visit() throws InterruptedException {
		cg.user_click_on_the_visit();
		log.info("click on visit.");
		
	}
	@Then ("User Click on the Delete Button")
	public void user_click_on_the_delete_button() throws InterruptedException {
		cg.user_click_on_the_delete_button();
		log.info("click on delete button.");
		
		
	} 
	
	@Then ("Pop Up will be visible Are You Sure want to Delete this Item and click on Delete Button")
	public void pop_up_will_be_visible_are_you_sure_want_to_delete_this_Item_and_click_on_delete_button() throws InterruptedException {
		cg.pop_up_will_be_visible_are_you_sure_want_to_delete_this_Item_and_click_on_delete_button();
		log.info("pop is showing and delete the item..");
	}

}
