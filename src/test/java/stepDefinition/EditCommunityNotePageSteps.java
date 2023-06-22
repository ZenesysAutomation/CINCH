package stepDefinition;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditCommunityNotePageSteps extends BaseClass  {
	
	EditCommunityNotePageSteps edit = new EditCommunityNotePageSteps();
	
	@When("Click on the Table")
	public void click_on_the_table() {
	  edit.click_on_the_table();  
	}

	@When("Edit the Note")
	public void edit_the_note() {
	    edit.edit_the_note();
	}

	@When("Edit the communities")
	public void edit_the_communities() {
	  edit.edit_the_communities();
	}

	@When("Edit the Start Date")
	public void edit_the_start_date() {
	   edit.edit_the_start_date();
	}

	@When("Edit the End Date")
	public void edit_the_end_date() {
	    edit.edit_the_end_date();
	}

	@Then("Click on the save Button")
	public void click_on_the_save_button() {
	    edit.click_on_the_save_button();
	}




}
