package page;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ScreenRecorder.MyScreenRecording;
import base.BaseClass;
import io.netty.handler.timeout.TimeoutException;

public class AssessmentsCarePlansPage extends BaseClass {
	
	
public void user_enter_email() throws Exception {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
	 Useremail.sendKeys(prop.getProperty("username"));
	}
	catch (TimeoutException e ) {
		 e.printStackTrace();
	}
	
	MyScreenRecording.startRecording("Assessment & Care Plan");
	
	}

public void user_enter_password() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
	Password.sendKeys(prop.getProperty("password"));
	}
	catch (TimeoutException e ) {
		 e.printStackTrace();
	}
	}

public void user_click_on_the_login_button() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	 WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	 wait.until(ExpectedConditions.elementToBeClickable(Login));
	 Login.click();
	}
	catch (Exception e) {
		System.out.println("Login button was not clickable within 20 seconds.");
	}
	    
}

public void user_select_the_test_community() throws InterruptedException {
	try {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	Thread.sleep(3000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
    
}
public void user_click_on_the_continue() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	wait.until(ExpectedConditions.elementToBeClickable(Continue));
	Continue.click();
	}


public void user_click_on_the_clients() throws InterruptedException {
	WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
	Thread.sleep(6000);
	Clientbtn.click();	
	Thread.sleep(4000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 50000)");
	Thread.sleep(4000);
	   
}

public void click_on_the_user_data_table() throws InterruptedException {
	List<WebElement> table=driver.findElements(By.className("e-row"));
	Random random= new Random();
	int randomValue=random.nextInt(table.size());
	Thread.sleep(8000);
	WebElement exactRow=(WebElement) table.toArray()[randomValue];
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	Thread.sleep(8000);
	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", exactRow);
	try {
    	for(int i=1;i<=100;i++) {
    		if (!exactRow.isDisplayed()) {
    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", exactRow);
            }
    	}
    	exactRow.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}

public void click_on_the_assessment_and_care_plan() throws InterruptedException {
	if(!isAssessmentandCarePlanPresent()){
		 driver.findElement(By.xpath("//button[normalize-space()='Assessment and Care Plan']")).click();
	}	
	else {
	driver.navigate().back();
	Thread.sleep(5000);
	List<WebElement> table=driver.findElements(By.className("e-row"));
	Random random= new Random();
	int randomValue=random.nextInt(table.size());
	Thread.sleep(8000);
	WebElement exactRow=(WebElement) table.toArray()[randomValue];
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	Thread.sleep(8000);
	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", exactRow);
	try {
    	for(int i=1;i<=100;i++) {
    		if (!exactRow.isDisplayed()) {
    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", exactRow);
            }
    	}
    	exactRow.click();
    	Thread.sleep(5000);
    	click_on_the_assessment_and_care_plan();
    	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	}		
}

private boolean isAssessmentandCarePlanPresent() {
    try {
    	WebElement element = driver.findElement(By.xpath("//button[normalize-space()='Assessment and Care Plan']"));
    	 boolean isDisabled = !element.isEnabled();
        return isDisabled;
    } catch (org.openqa.selenium.NoSuchElementException e) {
        return false;
    }
}
	
		public void user_enter_the_assessment_date() throws InterruptedException {
		LocalDateTime targetDate = LocalDateTime.now().plusDays(1);
        String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        WebElement startDateField = driver.findElement(By.xpath("//input[@id='assessment-date']"));
        startDateField.click();
        for (int i = 1; i <= 10; i++) {
            startDateField.sendKeys(Keys.BACK_SPACE);
        }
        startDateField.sendKeys(targetDateString);
        Thread.sleep(8000);
			     
	}
		
			public void user_enter_the_visit_schedule() throws InterruptedException 
			{
			    try {
				WebElement VisitSchedule=driver.findElement(By.xpath("//textarea[@id='proposed']"));
				explicitWait(VisitSchedule,15);
				Thread.sleep(3000);
				VisitSchedule.clear();
				VisitSchedule.sendKeys(prop.getProperty("VisitSchedule"));
			    }
			    catch (Exception e) {
			    	e.printStackTrace();
			    }
			}

			public void user_enter_the_goals_of_service() throws InterruptedException 
			{
				try {
				WebElement GoalOfService=driver.findElement(By.xpath("//textarea[@id='goals']"));
				explicitWait(GoalOfService,15);
				Thread.sleep(3000);
				GoalOfService.clear();
				GoalOfService.sendKeys(prop.getProperty("GoalOfService"));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			    
			}

			public void user_enter_the_family_social_network() throws InterruptedException 
			{
				try {
				WebElement FamilySocialNetwork=driver.findElement(By.xpath("//textarea[@id='family']"));
						
					explicitWait(FamilySocialNetwork,15);
					Thread.sleep(3000);
					FamilySocialNetwork.clear();
					FamilySocialNetwork.sendKeys(prop.getProperty("FamilySocialNetwork"));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void user_enter_the_special_dietary_needs() throws InterruptedException 
			{
				try {
				WebElement DietryNeeds=driver.findElement(By.xpath("//textarea[@id='hobbies']"));
				explicitWait(DietryNeeds,15);
				Thread.sleep(3000);
				DietryNeeds.clear();
				DietryNeeds.sendKeys(prop.getProperty("DietryNeeds"));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void user_enter_the_precautions() throws InterruptedException 
			{
				try {
				WebElement Precautions=driver.findElement(By.xpath("//textarea[@id='precautions']"));
				Thread.sleep(3000);
				Precautions.clear();
				Precautions.sendKeys(prop.getProperty("Precautions"));
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_functional_limitations_restrictions() throws InterruptedException 
			{
				try {
				WebElement Restrictions =driver.findElement(By.xpath("//textarea[@id='functionallimitations']"));
				explicitWait(Restrictions,15);
				Thread.sleep(3000);
				Restrictions.clear();
				Restrictions.sendKeys(prop.getProperty("Restrictions"));
				Thread.sleep(4000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}	    
			}
			
			public void user_click_on_the_client_status_tab() throws InterruptedException 
			{
				JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0, -5000)");
				WebElement StatusTab=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Client Status'])[1]"));
				
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				 jse.executeScript("arguments[0].click()",StatusTab);
				Thread.sleep(6000);
			}

			public void user_enter_the_condition_notes() throws InterruptedException 
				{
				try {
				WebElement ConditionNotes =	driver.findElement(By.xpath("//textarea[@id='conditionnotes']"));
				Thread.sleep(4000);
				ConditionNotes.sendKeys(prop.getProperty("ConditionNotes"));
				Thread.sleep(4000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_recent_hospital_rehab_stays() throws InterruptedException 
				{
				try {
				WebElement rcnthospital =driver.findElement(By.xpath("//textarea[@id='recenthospital']"));
				rcnthospital.clear();
				rcnthospital.sendKeys(prop.getProperty("RecentHospitalStays"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_needs_medication_reminders() throws InterruptedException 
			{
				try {
				WebElement MedicationReminders= driver.findElement(By.xpath("//input[@id='reminder']"));
				MedicationReminders.clear();
				MedicationReminders.sendKeys(prop.getProperty("MedicationReminders"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			    
			}
			public void user_enter_the_how_many_times_per_day() throws InterruptedException 
			{
				try {
				WebElement MedicationReminders= driver.findElement(By.xpath("//input[@id='medremindercount']"));
				MedicationReminders.clear();
				MedicationReminders.sendKeys("4");
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			    
			}
			public void user_enter_the_allergies_description() throws InterruptedException 
			{
				try {
				WebElement Allergies= driver.findElement(By.xpath("//textarea[@id='allergies']"));
				Allergies.clear();
				Allergies.sendKeys(prop.getProperty("AllergiesDescription"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			    
			}

			public void user_enter_the_notes() throws InterruptedException
			{
				try {
				WebElement Notes= driver.findElement(By.xpath("//textarea[@id='notes']"));
				Notes.clear();
				Notes.sendKeys(prop.getProperty("Note"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_select_the_hearing() throws InterruptedException
			{
				try {
				WebElement Hearing = driver.findElement(By.xpath("(//span[contains(@aria-owns,'hearing_options')])[1]"));
				Thread.sleep(3000);	
				Hearing.sendKeys("Good");
				Thread.sleep(4000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}

			public void user_select_the_speech() throws InterruptedException 
			{
				try {
				WebElement Speech = driver.findElement(By.xpath("//span[@aria-owns='speech_options']"));
				
				Thread.sleep(3000);
				Speech.click();
				Speech.sendKeys("Good");	
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();		
				}
			}

			public void user_select_the_swallowing() throws InterruptedException 
			{
				try {
				WebElement Swallowing=driver.findElement(By.xpath("//span[@aria-owns='swallowing_options']"));
				Swallowing.click();
				Swallowing.sendKeys("Good");
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void user_select_the_vision() throws InterruptedException 
			{
				try {
				WebElement Vision=driver.findElement(By.xpath("(//span[@aria-owns='vision_options'])[1]"));
				Vision.click();
				Vision.sendKeys("Good"); 
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void user_enter_the_bathing_deatils() throws InterruptedException
			{
				try {
				WebElement Bathing=	driver.findElement(By.xpath("//textarea[@id='bathing']"));
				Bathing.clear();
				Bathing.sendKeys(prop.getProperty("BathingDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_transfers_mobility_deatils() throws InterruptedException 
			{
				try {
				WebElement MobilityDetails =driver.findElement(By.cssSelector("#transfer"));
				MobilityDetails.clear();
				MobilityDetails.sendKeys(prop.getProperty("MobilityDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_dressing_grooming_details() throws InterruptedException 
			{
				try {
				WebElement Grooming =driver.findElement(By.xpath("//textarea[@id='dressing']"));
				Grooming.clear();
				Grooming.sendKeys(prop.getProperty("DressingGroomingDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}		
			}

			public void user_enter_the_continence_toileting() throws InterruptedException
			{
				try {
				WebElement ContinenceToileting=driver.findElement(By.xpath("(//textarea[@id='continence'])[1]"));
				ContinenceToileting.clear();
				ContinenceToileting.sendKeys(prop.getProperty("ContinenceToiletingDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_eating_details() throws InterruptedException 
			{
				try {
				WebElement Eating=driver.findElement(By.xpath("(//textarea[@id='eating'])[1]"));
				Eating.clear();
				Eating.sendKeys(prop.getProperty("EatingDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			    
			}

			public void user_enter_the_meals_details() throws InterruptedException 
			{
				try {
				WebElement MealsDetails=driver.findElement(By.cssSelector("#meals"));
				MealsDetails.clear();
				MealsDetails.sendKeys(prop.getProperty("MealsDetails"));
				 Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}	    
			}

			public void user_enter_the_laundry_details() throws InterruptedException
			{
				try {
				WebElement Laundary=driver.findElement(By.cssSelector("#laundry"));
				Laundary.clear();
				Laundary.sendKeys(prop.getProperty("LaundaryDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void user_enter_the_household_tasks_details() throws InterruptedException
			{
				try {
				WebElement Household=driver.findElement(By.cssSelector("#household"));
				Thread.sleep(6000);
				Household.sendKeys(prop.getProperty("HouseholdTaskDetails"));
				Thread.sleep(6000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}

			public void user_click_on_the_environment_tab() throws InterruptedException 
			{
				try {
				JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0, -5000)");
				WebElement Environment=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Environment']"));
				Thread.sleep(6000);
				Environment.click();
				Thread.sleep(6000);	 
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void select_the_radio_button() throws InterruptedException 
			{
				try {
				WebElement RadioButton=driver.findElement(By.xpath("//span[normalize-space()='Yes']"));
				
				RadioButton.click();
				Thread.sleep(2000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}

			public void enter_the_enviromental_safety_concerns_details() throws InterruptedException 
			{
				try {
				WebElement Enviromental= driver.findElement(By.xpath("//textarea[@id='saftey']"));
				Thread.sleep(3000);
				Enviromental.clear();
				Enviromental.sendKeys(prop.getProperty("EnviromentalSafteyConcernDetails"));
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}			  
			}

			public void enter_the_economics_status() throws InterruptedException
			{
				try {
				WebElement EconomicsStatus = driver.findElement(By.xpath("//textarea[@id='economic-status']"));
				Thread.sleep(3000);
				EconomicsStatus.clear();
				EconomicsStatus.sendKeys(prop.getProperty("EconomicsStatus"));
				Thread.sleep(5000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			public void enter_the_notes() throws InterruptedException 
			{
				try {
				WebElement EnvironmentNotes =  driver.findElement(By.id("environment-notes"));
				EnvironmentNotes.sendKeys("enter notes for Testing");
				driver.findElement(By.className("container-fluid")).click();
				Thread.sleep(3000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
			}


			public void complete_the_details() throws InterruptedException
			{
			WebElement Cmpltbtn=  driver.findElement(By.xpath("(//button[normalize-space()='Complete'])[1]"));				
			Thread.sleep(4000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
			  js.executeScript("arguments[0].click()",Cmpltbtn);
				Thread.sleep(8000);	
				
			}
			
			
			public void pop_up_is_showing_and_click_on_the_yes_complete_button() throws InterruptedException {
				try {
				WebElement Popup=driver.findElement(By.xpath("//button[normalize-space()='Yes, Complete']"));
				Thread.sleep(3000);
				Popup.click();
				Thread.sleep(6000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void click_on_the_care_plan() throws InterruptedException {
				WebElement CarePlan=driver.findElement(By.xpath("//div[@class ='e-toolbar-items']//div[5]"));
				Thread.sleep(4000);
			    CarePlan.click();
			    Thread.sleep(5000);
			    JavascriptExecutor js = (JavascriptExecutor)driver;
			    js.executeScript("window.scrollBy(0, 50000)");
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
				   WebElement canvaas2 = driver.findElement(By.xpath("(//canvas[@aria-label='signature'])[2]"));
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
				try {
				WebElement btnSaveSignature = driver.findElement(By.xpath("//button[contains(text(),'Save signature')]"));
				Thread.sleep(8000);
                btnSaveSignature.click();
                Thread.sleep(8000);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			public void validation_message_should_be_shown_assessment_was_created() throws Exception {
				try {
				String expectedResult= "Assessment was created.";
				String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
				assertEquals("Assessment created",expectedResult,actualResult);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				MyScreenRecording.stopRecording();	
			}
	}

		 






