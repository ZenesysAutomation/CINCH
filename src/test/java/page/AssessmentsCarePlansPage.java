package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;

public class AssessmentsCarePlansPage extends BaseClass {
	
	
public void user_enter_email() throws InterruptedException {
	WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
	explicitWait(Useremail,20);
	Thread.sleep(4000);
	Useremail.sendKeys("anoop.kumar@zenesys.com");
	Thread.sleep(4000);
	}

public void user_enter_password() {
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	explicitWait(Password,20);
	Password.sendKeys("Testing@123");
	}

public void user_click_on_the_click() throws InterruptedException {
	WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	Login.click();
	Thread.sleep(3000);
    
}

public void user_select_the_test_community() throws InterruptedException {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	Thread.sleep(3000);
    
}
public void user_click_on_the_continue() throws InterruptedException {
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	Thread.sleep(3000);
	Continue.click();
	
}
public void user_click_on_the_clients() throws InterruptedException {
	WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
	explicitWait(Clientbtn,30);
	Thread.sleep(6000);
	Clientbtn.click();	
	   
}

public void click_on_the_user_data_table() throws InterruptedException {
//	WebElement DataTable = driver.findElement(By.xpath("//tr[@class='e-row e-altrow']//td[@aria-label='Automation Column Header First Name'][normalize-space()='Automation']"));
//	Thread.sleep(8000);
//	JavascriptExecutor js =(JavascriptExecutor)driver;
//  js.executeScript("arguments[0].click()", DataTable);
//	Thread.sleep(10000);
//	}

	WebElement DataTable = driver.findElement(By.xpath("(//td[@aria-label='Wilson Column Header Last Name'])[1]"));
	Thread.sleep(8000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", DataTable);
	Thread.sleep(10000);
	}

public void click_on_the_assessment_and_care_plan() throws InterruptedException {
	WebElement Assessment=driver.findElement(By.xpath("//button[normalize-space()='Assessment and Care Plan']"));
	Assessment.click();
	Thread.sleep(6000);
}
	
		 public void user_enter_the_assessment_date() 
		 {
				WebElement Assessmentdate=driver.findElement(By.xpath("//input[@id='assessment-date']"));
				Assessmentdate.clear();
				Assessmentdate.sendKeys("6/28/2023");
		}

			public void user_enter_the_visit_schedule() throws InterruptedException 
			{
			    
				WebElement VisitSchedule=driver.findElement(By.xpath("//textarea[@id='proposed']"));
				explicitWait(VisitSchedule,15);
				Thread.sleep(3000);
				VisitSchedule.clear();
				VisitSchedule.sendKeys("Testing Demo");
			}

			public void user_enter_the_goals_of_service() throws InterruptedException 
			{
				WebElement GoalOfService=driver.findElement(By.xpath("//textarea[@id='goals']"));
				explicitWait(GoalOfService,15);
				Thread.sleep(3000);
				GoalOfService.clear();
				GoalOfService.sendKeys("Testing Demo");
				
			    
			}

			public void user_enter_the_family_social_network() throws InterruptedException 
			{
				WebElement FamilySocialNetwork=driver.findElement(By.xpath("//textarea[@id='family']"));
						
					explicitWait(FamilySocialNetwork,15);
					Thread.sleep(3000);
					FamilySocialNetwork.clear();
				FamilySocialNetwork.sendKeys("Testing Demo");
			    
			}
			public void user_enter_the_special_dietary_needs() throws InterruptedException 
			{
				WebElement DietryNeeds=driver.findElement(By.xpath("//textarea[@id='hobbies']"));
				explicitWait(DietryNeeds,15);
				Thread.sleep(3000);
				DietryNeeds.clear();
				DietryNeeds.sendKeys("Testing Demo");
			    
			}
			public void user_enter_the_precautions() throws InterruptedException 
			{
				WebElement Precautions=driver.findElement(By.xpath("//textarea[@id='precautions']"));
				explicitWait(Precautions,15);
				Thread.sleep(3000);
				Precautions.clear();
				Precautions.sendKeys("Testing Demo");
			}

			public void user_enter_the_functional_limitations_restrictions() throws InterruptedException 
			{
				WebElement Restrictions =driver.findElement(By.xpath("//textarea[@id='functionallimitations']"));
				explicitWait(Restrictions,15);
				Thread.sleep(3000);
				Restrictions.clear();
				Restrictions .sendKeys("Testing Demo");
				Thread.sleep(6000);
			    
			}
			public void user_click_on_the_client_status_tab() throws InterruptedException 
			{
				JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0, -5000)");
				WebElement StatusTab=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Client Status'])[1]"));
				//Thread.sleep(4000);
				StatusTab.click();
				explicitWait(StatusTab,15);
				Thread.sleep(8000);
			}

			public void user_enter_the_condition_notes() throws InterruptedException 
			{
				WebElement ConditionNotes =	driver.findElement(By.xpath("//textarea[@id='conditionnotes']"));
				ConditionNotes.clear();
				ConditionNotes.sendKeys("Testing Environment");
				Thread.sleep(3000);
			}

			public void user_enter_the_recent_hospital_rehab_stays() throws InterruptedException 
			{
				WebElement ConditionNotes =	driver.findElement(By.xpath("//textarea[@id='recenthospital']"));
				ConditionNotes.clear();
				ConditionNotes.sendKeys("I recently visit a NearBy Hospital");
				Thread.sleep(3000);
			}

			public void user_enter_the_needs_medication_reminders() throws InterruptedException 
			{
				WebElement MedicationReminders= driver.findElement(By.xpath("//input[@id='reminder']"));
				MedicationReminders.clear();
				MedicationReminders.sendKeys("Testing");
				Thread.sleep(3000);
			    
			}
			public void user_enter_the_how_many_times_per_day() throws InterruptedException 
			{
				WebElement MedicationReminders= driver.findElement(By.xpath("//input[@id='medremindercount']"));
				MedicationReminders.sendKeys("4");
				Thread.sleep(3000);
			    
			}
			public void user_enter_the_allergies_description() throws InterruptedException 
			{
				WebElement Allergies= driver.findElement(By.xpath("//textarea[@id='allergies']"));
				Allergies.clear();
				Allergies.sendKeys("Testing");
				Thread.sleep(3000);
			    
			}

			public void user_enter_the_notes() throws InterruptedException
			{
				WebElement Notes= driver.findElement(By.xpath("//textarea[@id='notes']"));
				Notes.clear();
				Notes.sendKeys("Testing");
				Thread.sleep(3000);
			}

			public void user_select_the_hearing() throws InterruptedException
			{
				WebElement Hearing = driver.findElement(By.xpath("(//span[contains(@aria-owns,'hearing_options')])[1]"));
				Thread.sleep(3000);
				//Hearing.click();	
				Hearing.sendKeys("Good");
				Thread.sleep(4000);
				
			}

			public void user_select_the_speech() throws InterruptedException 
			{
				WebElement Speech = driver.findElement(By.xpath("//span[@aria-owns='speech_options']"));
				
				Thread.sleep(3000);
				Speech.click();
				Speech.sendKeys("Good");	
				Thread.sleep(3000);
			}

			public void user_select_the_swallowing() throws InterruptedException 
			{
				WebElement Swallowing=driver.findElement(By.xpath("//span[@aria-owns='swallowing_options']"));
				Swallowing.click();
				Swallowing.sendKeys("Poor");
				Thread.sleep(3000);
			}
			public void user_select_the_vision() throws InterruptedException 
			{
				WebElement Vision=driver.findElement(By.xpath("(//span[@aria-owns='vision_options'])[1]"));
				Vision.click();
				Vision.sendKeys("Good"); 
				Thread.sleep(3000);
			}
			public void user_enter_the_bathing_deatils() throws InterruptedException
			{
				WebElement Bathing=	driver.findElement(By.xpath("//textarea[@id='bathing']"));
				Bathing.clear();
				Bathing.sendKeys("Testing demo v3");
				
			}

			public void user_enter_the_transfers_mobility_deatils() throws InterruptedException 
			{
				WebElement MobilityDetails =driver.findElement(By.cssSelector("#transfer"));
				MobilityDetails.clear();
				MobilityDetails.sendKeys("Testingg demo v4");
				
			}

			public void user_enter_the_dressing_grooming_details() throws InterruptedException 
			{
				WebElement Grooming =driver.findElement(By.xpath("//textarea[@id='dressing']"));
				Grooming.sendKeys("Testing demo v5.0");
				
				
			}

			public void user_enter_the_continence_toileting() throws InterruptedException
			{
				WebElement ContinenceToileting=driver.findElement(By.xpath("(//textarea[@id='continence'])[1]"));
				ContinenceToileting.sendKeys("Testing demo v5");
				
			}

			public void user_enter_the_eating_details() throws InterruptedException 
			{
				WebElement Eating=driver.findElement(By.xpath("(//textarea[@id='eating'])[1]"));
				Eating.sendKeys("Testing demo v6");
				
			    
			}

			public void user_enter_the_meals_details() throws InterruptedException 
			{
				WebElement MealsDetails=driver.findElement(By.cssSelector("#meals"));
				 MealsDetails.sendKeys("Testing demo v7");
				 
			    
			}

			public void user_enter_the_laundry_details() throws InterruptedException
			{
				WebElement Laundary=driver.findElement(By.cssSelector("#laundry"));
				Laundary.sendKeys("Testing demo v8");
				
			}

			public void user_enter_the_household_tasks_details() throws InterruptedException
			{
				WebElement Household=driver.findElement(By.cssSelector("#household"));
				Thread.sleep(6000);
				Household.sendKeys("Testing demo v9");
				Thread.sleep(8000);
				
			}

			public void user_click_on_the_environment_tab() throws InterruptedException 
			{
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0, -5000)");
				WebElement Environment=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Environment']"));
				Thread.sleep(6000);
				Environment.click();
				Thread.sleep(6000);	   
			}

			public void select_the_radio_button() 
			{
				WebElement RadioButton=driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
//				 boolean isSelected = RadioButton.isSelected();
//			     System.out.println("Is radio button selected? " + isSelected);
			//
//			     if (!isSelected) {
//			    	 RadioButton.click();
//			     }
				RadioButton.click();
			}

			public void enter_the_enviromental_safety_concerns_details() throws InterruptedException 
			{
				WebElement Enviromental= driver.findElement(By.xpath("//textarea[@id='saftey']"));
				Thread.sleep(3000);
				Enviromental.sendKeys("Testing demo v10");
				Thread.sleep(3000);
				  
			}

			public void enter_the_economics_status() throws InterruptedException
			{
				WebElement EconomicsStatus = driver.findElement(By.xpath("//textarea[@id='economic-status']"));
				Thread.sleep(3000);
				EconomicsStatus.sendKeys("Testing Demo v11");
				Thread.sleep(5000);
			}
			public void enter_the_notes() throws InterruptedException 
			{
				WebElement EnvironmentNotes =  driver.findElement(By.id("environment-notes"));
				EnvironmentNotes.sendKeys("Testing Demo v1");
				driver.findElement(By.className("container-fluid")).click();
				Thread.sleep(3000);
				
			}

//			public void save_the_details() throws InterruptedException 
//			{
//				WebElement Save=driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
//				Thread.sleep(4000);
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				  js.executeScript("arguments[0].click()",Save);
//				//Save.click();
//				Thread.sleep(6000);
//			    
//			}

			public void complete_the_details() throws InterruptedException
			{
			WebElement Cmpltbtn=  driver.findElement(By.xpath("(//button[normalize-space()='Complete'])[1]"));
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//				wait.until(ExpectedConditions.elementToBeClickable(Cmpltbtn));
			Thread.sleep(4000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()",Cmpltbtn);
				Thread.sleep(8000);	
				
			}
			
			public void pop_up_is_showing_and_click_on_the_yes_complete_button() throws InterruptedException {
				WebElement Popup=driver.findElement(By.xpath("//button[normalize-space()='Yes, Complete']"));
				Thread.sleep(3000);
				Popup.click();
				Thread.sleep(6000);
			}
			
			public void click_on_the_care_plan() throws InterruptedException {
				WebElement CarePlan=driver.findElement(By.xpath("//div[@class ='e-toolbar-items']//div[5]"));
				Thread.sleep(40000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0, 8000)");
			    CarePlan.click();
			    Thread.sleep(4000);
			}
			
			
			public void sign_as_a_craegiver() throws InterruptedException {
				WebElement canvas = driver.findElement(By.xpath("//canvas[@class=\"e-signature\"]"));
				Thread.sleep(10000);
                // Create an instance of the Actions class
                Actions builder = new Actions(driver);
                // Move the mouse to the top-left corner of the canvas
                builder.moveToElement(canvas, 0, 0);
                // Click and hold the left mouse button
                builder.clickAndHold();
                // Draw the "A"
                builder.moveByOffset(10, 50);
                builder.moveByOffset(20, -50);
                builder.moveByOffset(10, 25);
                builder.moveByOffset(-20, 0);
                builder.moveByOffset(10, -25);
                builder.moveByOffset(20, 0);
                // Release the left mouse button
                builder.release();
                // Perform the actions
                builder.build().perform();
                Thread.sleep(10000);
				
				
			}
			
			public void sign_as_a_client() throws InterruptedException {
				
				   WebElement canvaas2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[2]/div/div[2]/div/div/form/div[2]/div/div/div[1]/div[2]/div[2]/div[2]/div/div[11]/div[2]/canvas"));
				   Thread.sleep(10000);
	                // Create an instance of the Actions class
	                Actions builder2 = new Actions(driver);
	                // Move the mouse to the top-left corner of the canvas
	               builder2.moveToElement(canvaas2, 0, 0);
	             
	               // Click and hold the left mouse button
	                builder2.clickAndHold();
	                // Draw the "A"
	                builder2.moveByOffset(10, 50);
	                builder2.moveByOffset(20, -50);
	                builder2.moveByOffset(10, 25);
	                builder2.moveByOffset(-20, 0);
	                builder2.moveByOffset(10, -25);
	                builder2.moveByOffset(20, 0);
	                // Release the left mouse button
	                builder2.release();
	                // Perform the actions
	                
	                builder2.build().perform();
	                Thread.sleep(10000);
				
			}

			public void click_on_the_save_signature_button() throws InterruptedException {
				WebElement btnSaveSignature = driver.findElement(By.xpath("//button[contains(text(),'Save signature')]"));
				Thread.sleep(8000);
                btnSaveSignature.click();
                Thread.sleep(8000);
			}
	}

		 






