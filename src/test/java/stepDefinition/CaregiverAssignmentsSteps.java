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
		
	}
	
	@When ("User Enter The Password")
	public void user_enter_the_password() throws InterruptedException {
		cg.user_enter_the_password();
		
	}
	@Then ("User Click on the Login Button")
	public void user_click_on_the_login_button() throws InterruptedException {
		cg.user_click_on_the_login_button();
		
	}
	@Then ("Select the Test Community")
	public void select_the_test_community() throws InterruptedException {
		cg.select_the_test_community();
		
	}
	@And ("User Click on the Continue Button")
	public void user_click_on_the_continue_button() throws InterruptedException {
		cg.user_click_on_the_continue_button();
		
	}
	
	@Given ("Click on the Caregiver Assignments")
	public void click_on_the_caregiver_assignments() throws InterruptedException {
		cg.click_on_the_caregiver_assignments();
		
	}
	
	@When ("Check if Color is Blue and Active Visit then Click on it")
	public void check_if_color_is_blue_and_active_visit_then_click_on_it() throws InterruptedException {
		cg.check_if_color_is_blue_and_active_visit_then_click_on_it();
		
	}

	
	@Then("Change the Time for visit")
	public void change_the_time_for_visit() throws InterruptedException{
		cg.change_the_time_for_visit();
	}
	
	
	
	@And ("Select option Move only this occurrence")
	public void select_option_move_only_this_occurence() throws InterruptedException {
		cg.select_option_move_only_this_occurence();
		
	}
	
	@Then ("Save the Visit")
	public void save_the_visit() throws InterruptedException {
		cg.save_the_visit();
		
	}	
	
	@When ("Check if Color is Blue and Active Visit then Click on it2")
	public void check_if_color_is_blue_and_active_visit_then_click_on_it2() throws InterruptedException {
		cg.check_if_color_is_blue_and_active_visit_then_click_on_it2();
		
	}
	
	@Then ("Change the Time")
	public void change_the_time() throws InterruptedException {
		cg.change_the_time();
	}
	
	@And ("Select the Option Move day series")
	public void select_the_option_move_day_series() throws InterruptedException {
		cg.select_the_option_move_day_series(); 
		
	}
	
	@Then ("save the visit")
	public void save_the_visit1() throws InterruptedException {
		cg.save_the_visit1();
	} 
	
	/*@Then ("change the time")
	public void change_the_time1() throws InterruptedException {
		cg.change_the_time1();
	}
	
	@And ("Select the Option Move week series")
	public void select_the_option_move_week_series() throws InterruptedException {
		cg.select_the_option_move_week_series();
		
	}
	
	@Then ("Save The Visit")
	public void save_the_visit2() throws InterruptedException {
		cg.save_the_visit2();
		
	}*/
	
	@Given ("Click on the Visit")
	public void click_on_the_visit() throws InterruptedException {
		cg.click_on_the_visit();
		
	}
	
	@Then ("Change the Track from East1 to East2")
	public void change_the_track_from_east1_to_east2() throws InterruptedException {
		cg.change_the_track_from_east1_to_east2();
	}
	@And ("Select Move only this occurrence")
	public void select_move_only_this_occurrence() throws InterruptedException {
		cg.select_move_only_this_occurrence(); 
		
	}
	
	@Then ("Save the Visits")
	public void save_the_visits() throws InterruptedException {
		cg.save_the_visits();
	}
	
	@Given ("User Click on the Visit")
	public void user_click_on_the_visit() throws InterruptedException {
		cg.user_click_on_the_visit();
		
	}
	@Then ("User Click on the Delete Button")
	public void user_click_on_the_delete_button() throws InterruptedException {
		cg.user_click_on_the_delete_button();
		
	} 
	
	@Then ("Pop Up will be visible Are You Sure want to Delete this Item and click on Delete Button")
	public void pop_up_will_be_visible_are_you_sure_want_to_delete_this_Item_and_click_on_delete_button() throws InterruptedException {
		cg.pop_up_will_be_visible_are_you_sure_want_to_delete_this_Item_and_click_on_delete_button();
	}

}
