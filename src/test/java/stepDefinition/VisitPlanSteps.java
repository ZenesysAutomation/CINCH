package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.VisitPlanPage;

public class VisitPlanSteps extends BaseClass  {
	
	VisitPlanPage visitplan=new VisitPlanPage();
	

@Given("User enter the Email")
public void user_enter_the_email() throws InterruptedException {
	 visitplan.user_enter_the_email();
	}


@When("User enter the Password")
public void user_enter_the_password() {
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



@When("Create Visit Plan")
public void create_visit_plan(String recurrence) throws InterruptedException {
	//@When
	visitplan.create_visit_plan("Single");
	Thread.sleep(15000);
	visitplan.create_visit_plan("Weekly");
}
}


