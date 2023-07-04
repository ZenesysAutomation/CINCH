package stepDefinition;

import base.BaseClass;
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



/*@When("Create Visit Plan")
public void create_visit_plan(String recurrence) throws InterruptedException {
	//@When
	visitplan.create_visit_plan("Single");
	Thread.sleep(15000);
	visitplan.create_visit_plan("Weekly");
}*/

@Then("Click on the Add Visit Configuration")
public void click_on_the_add_visit_configuration() throws InterruptedException {
	visitplan.click_on_the_add_visit_configuration();
}

@Then("Select the Days as Sunday")
public void select_the_days_as_sunday() throws InterruptedException {
	visitplan.select_the_days_as_sunday();
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


