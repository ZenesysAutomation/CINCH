package page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VisitPlansPage extends BaseClass  {
	
	public void user_enter_the_email() throws InterruptedException {
		WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
		explicitWait(Useremail,20);
		Thread.sleep(6000);
		Useremail.sendKeys("anoop.kumar@zenesys.com");
		Thread.sleep(6000);
		   
	}
	
	public void user_enter_the_password() throws InterruptedException {
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		explicitWait(Password,20);
		Password.sendKeys("Testing@123");
		Thread.sleep(4000);
		}
		   
	
	
	public void user_click_on_the_login() throws InterruptedException {
		WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		Login.click();
		Thread.sleep(3000);
		  
	}
	
	public void user_select_the_test_community() throws InterruptedException {
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		Thread.sleep(3000);
		   
	}
	public void user_click_on_the_continue_button() throws InterruptedException {
		WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
		Thread.sleep(3000);
		Continue.click();
	    
	}
	
	public void user_click_on_the_visit_plans() throws InterruptedException {
		
		WebElement VisitPlan=driver.findElement(By.xpath("//span[contains(text(), 'Visit Plans')]"));
		Thread.sleep(3000);
		VisitPlan.click();
		Thread.sleep(6000);
	}
	
	public void click_on_the_user_first_name() throws InterruptedException {
		WebElement FirstName=driver.findElement(By.xpath("//td[@aria-label='Piyush Column Header First Name']"));
		Thread.sleep(3000);
		FirstName.click();
		Thread.sleep(6000);
	}
	
	/*public void click_on_the_add_visit_configuration() throws InterruptedException {
		WebElement AddVisitBtn=	driver.findElement(By.xpath("(//a[normalize-space()='Add Visit Configuration'])[1]"));
		AddVisitBtn.click();
		Thread.sleep(6000);
	    
	}
	
	public boolean select_the_days_as_sunday() throws InterruptedException {
		try {

			WebElement dropdown=driver.findElement(By.id("daysofweek"));
				dropdown.click();
				
				WebElement dropdown2 =driver.findElement(By.xpath("//*[@id=\"daysofweek_popup\"]/div[2]/ul/li[2]"));
				
				dropdown2.click();
				Thread.sleep(6000);
		}
		catch (Exception e) {
			return true;
		}
		return false;
			
	}
	
	
	public void select_the_start_time() throws InterruptedException {
		WebElement StartTime =driver.findElement(By.xpath("(//input[@id='start-time'])[1]"));
		Thread.sleep(4000);
		StartTime.clear();
		StartTime.sendKeys("12:15 AM");
		StartTime.click();
		Thread.sleep(4000);
	}
	
	public void select_a_duration() throws InterruptedException {
		WebElement Duration =driver.findElement(By.xpath("(//span[@aria-owns='duration_options'])[1]"));
		Duration.click();
		Duration.sendKeys("65 Minute Visit");
		Duration.click();
		Thread.sleep(4000);
	}
	
	public void select_the_recurrence() throws InterruptedException {
		WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
		Recurrence.click();
		Recurrence.sendKeys("Single");
		Recurrence.click();
		Thread.sleep(4000);
	}
	
	public void select_the_start_date() throws InterruptedException {
		WebElement StartDate =driver.findElement(By.xpath("//input[@id='visit-start-date']"));
		Thread.sleep(4000);
		StartDate.sendKeys(Keys.BACK_SPACE);
		Thread.sleep(10000);
		StartDate.sendKeys("7/3/2023");
		Thread.sleep(4000);
//		StartDate.clear();
//		Actions actions = new Actions(driver);
//        int dateLength = 10;
//        for (int i = 0; i < dateLength; i++) {
//            actions.sendKeys(Keys.BACK_SPACE);
//        }
//        StartDate.sendKeys("7/5/2023");
//        actions.perform();
			
		
	}
	
	public void click_on_the_save_button() throws InterruptedException {
		WebElement SaveBtn =driver.findElement(By.xpath("//button[@id='SaveNewVisit']"));
		Thread.sleep(4000);
		SaveBtn.click();
		Thread.sleep(6000);

			
	}*/
	
	public void verify_that_if_status_is_shows_missing_assigned_tasks() {

	
		boolean getValidationText=  driver.findElement(By.xpath("//tbody/tr[@role='row']/td[contains(@aria-label,'is template cell Column Header Status')]/div/span[1]")).getText()==" Missing Assigned Tasks"?true:false;

	}
	
	@When("Click on the ADLs Tab")
	public void click_on_the_ad_ls_tab() throws InterruptedException {
		WebElement ADLs =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(4000);
		 ADLs.click();
		Thread.sleep(6000);   
	}
	public void click_on_the_bathing() throws InterruptedException {
		WebElement BathingBtn =driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Bathing'])[1]"));
		BathingBtn.click();
		Thread.sleep(2000);
	    
	}

	public void select_the_bathing_assistance_level_as_a_supervision() throws InterruptedException {
		WebElement BathingAssistance = driver.findElement(By.xpath("(//span[@role='listbox'])[1]"));
		BathingAssistance.click();
		Thread.sleep(3000);
		BathingAssistance.sendKeys("Supervision");
		BathingAssistance.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		   
	}
	public void select_the_tasks_as_a_assist_with_shower() throws InterruptedException {
		WebElement AssistwithShower = driver.findElement(By.xpath("//input[@id='1798']"));
		AssistwithShower.click();
		if(AssistwithShower.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			AssistwithShower.click();
			if(!AssistwithShower.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);
	}
	
	public void select_the_visits_timing() throws InterruptedException {
		WebElement VisitTiming1 = driver.findElement(By.xpath("//*[@id=\"visitconfig\"]/ul/li/div[2]/div[1]"));
		VisitTiming1.click();
		WebElement VisitTiming = driver.findElement(By.xpath("//*[@id=\"visitconfig_active\"]/div[2]/div[2]/span"));
		Thread.sleep(4000);
		VisitTiming.click();
		Thread.sleep(4000);
	}
	public void enter_the_caregiver_instructions() throws InterruptedException {
		WebElement VisitTiming = driver.findElement(By.xpath("//textarea[@id='notes']"));
		VisitTiming.sendKeys("Testing demo");
		Thread.sleep(6000);
	}
	public void click_on_the_update_button() throws InterruptedException {
		WebElement UpdateBtn = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		UpdateBtn.click();
		Thread.sleep(8000);
		
	}
	
	public void save_the_bathing_details() throws InterruptedException {
		WebElement Savedetails = driver.findElement(By.xpath("//button[@id='SaveVisit']"));  
		Savedetails.click();
		Thread.sleep(6000);
		
	}
	
	public void click_on_the_ad_ls() throws InterruptedException {
		WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2 .click();
		Thread.sleep(8000);
		   
	}
	public void click_on_the_continence_and_toileting() throws InterruptedException {
		WebElement Continence =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Continence and Toileting']"));
		Continence.click();
		Thread.sleep(2000);
	}
	
	public void click_on_the_assistance_level() throws InterruptedException {
		WebElement Assistance =driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		Assistance.click();
		Assistance.sendKeys("No Assistance");
		Assistance.click();
		Thread.sleep(6000);

		 
	}
	public void save_the_continence_and_toileting_details() throws InterruptedException {
	WebElement SaveContinence = driver.findElement(By.id("SaveVisit"));
	Thread.sleep(4000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",SaveContinence );	
	  Thread.sleep(6000);
	    
	}
	public void click_on_the_again_ad_ls() throws InterruptedException {
		WebElement Adls3 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls3 .click();
		Thread.sleep(8000);
		
	}
	
	public void click_on_the_dressing_and_grooming() throws InterruptedException{
		WebElement dressingNgrooming =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Dressing & Grooming']"));
		dressingNgrooming.click();
		Thread.sleep(6000);
	}
	
	public void select_the_assistance_as_a_supervision() throws InterruptedException {
		WebElement AssistanceSup =driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
		AssistanceSup.click();
		AssistanceSup.sendKeys("Supervision");
		AssistanceSup.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		
	}
	
	public void click_on_the_apply_lotion_tasks() throws InterruptedException {
		WebElement LotionTasks =driver.findElement(By.xpath("//input[@id='1804']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",LotionTasks );
		if(LotionTasks.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			LotionTasks.click();
			 
			if(!LotionTasks.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);	
	}
	
	public void choose_the_visits_time() throws InterruptedException {
		/*try {
			WebElement VisitTime =driver.findElement(By.xpath("//*[@id=\"visitconfig_active\"]/div[2]/div[1]"));
			VisitTime.click();
			WebElement VisitTimeSelect =driver.findElement(By.xpath("//*[@id=\"visitconfig_active\"]/div[2]/div[2]/span"));
			Thread.sleep(4000);
			VisitTimeSelect.click();
			Thread.sleep(4000);	
		}
		catch(Exception e) {}*/
		
		WebElement VisitTime =driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
		VisitTime.click();
		Thread.sleep(4000);	
	}
	
	
	public void enter_the_caregiver_instructions3() throws InterruptedException {
		WebElement Instructions3  = driver.findElement(By.xpath("//textarea[@id='notes']"));
		Instructions3 .sendKeys("Testing v3.0");
		Thread.sleep(4000);	
	}
	
	public void update_the_apply_lotion() throws InterruptedException {
		WebElement Update = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		Update.click();
		Thread.sleep(6000);	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);	
		
	}
	
	public void save_the_dressing_and_grooming_details() throws InterruptedException {
		WebElement GroomingDetails =driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",GroomingDetails);
		Thread.sleep(6000);	
		
	}
	public void click_on_the_ad_ls_tab2() throws InterruptedException {
		WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2 .click();
		Thread.sleep(8000);
			
	}
	
	public void click_on_the_eating() throws InterruptedException {
		WebElement Eating =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Eating']"));
		Eating.click();
		Thread.sleep(4000);
	}

	
	public void select_the_assistance_level_as_a_no_assistance() throws InterruptedException {
		try {
			WebElement AssistanceLevel =driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
			AssistanceLevel.click();
			AssistanceLevel.sendKeys("No Assistance");
			AssistanceLevel.click();
			Thread.sleep(6000);
		}
		catch (Exception e) {}	
		
	}

	public void save_the_eating_details() throws InterruptedException {
		WebElement EatingSaveBtn =driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",EatingSaveBtn);
		Thread.sleep(6000);
	}
	
	public void click_on_the_ad_ls2() throws InterruptedException {
		WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2 .click();
		Thread.sleep(6000);
	}
	
	public void click_on_the_mobility() throws InterruptedException {
		WebElement MobilityClick =driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Mobility'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MobilityClick);
		Thread.sleep(6000);	
	}
	
	public void select_the_assistance_level_as_a_limited_assistance() throws InterruptedException {
		WebElement LimitedAssistance =driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		LimitedAssistance.click();
		LimitedAssistance.sendKeys("Limited Assistance");
		LimitedAssistance.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);	
		}
	
	public void select_the_walk_with_client() throws InterruptedException {
		WebElement WalkWithClient=driver.findElement(By.xpath("(//input[@id='1812'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",WalkWithClient );
	
		if(WalkWithClient.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			WalkWithClient.click();
			 
			if(!WalkWithClient.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);	
	}
	
	
	
	public void select_the_visits_time() throws InterruptedException {
		/*try {
			WebElement VisitsTime=driver.findElement(By.xpath("//*[@id=\"visitconfig_active\"]/div[2]/div[1]"));
			VisitsTime.click();
			WebElement VisitsTime2=driver.findElement(By.xpath("//*[@id=\"visitconfig_active\"]/div[2]/div[2]/span"));
			VisitsTime2.click();
			Thread.sleep(4000);
		}
		catch(Exception e) {}*/
		
		WebElement VisitsTime=driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
		VisitsTime.click();
		Thread.sleep(6000);
		
		
	}
	public void enter_caregiver_instructions() throws InterruptedException {
		WebElement Notes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		Notes.sendKeys("Testing v3.1");
		Thread.sleep(4000);	
	}
	
	public void update_the_walk_with_client_details() throws InterruptedException{
		WebElement UpdateWalkwithClient=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		UpdateWalkwithClient.click();
		Thread.sleep(4000);	
	}
	
	public void save_the_mobility_details() throws InterruptedException {
		WebElement MobilityDetails=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MobilityDetails);
		Thread.sleep(8000);
	}
	
	public void user_click_on_the_ia_dls_tab() throws InterruptedException {
		WebElement IADLSBtn=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLSBtn.click();
		Thread.sleep(6000);
		
	}
	
	public void click_on_the_household_tasks() throws InterruptedException {
		WebElement HouseHold=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Household Tasks']"));
		HouseHold.click();
		Thread.sleep(4000);
		
		
	}
	
	public void select_the_assistance_level_as_a_assistance() throws InterruptedException {
		WebElement AssistanceLevel=driver.findElement(By.xpath("//span[@role='listbox']"));
		AssistanceLevel.click();
		AssistanceLevel.sendKeys("Assistance");
		AssistanceLevel.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);	
		
	}
	
	public void click_on_the_make_bed() throws InterruptedException {
		WebElement MakeBed=driver.findElement(By.xpath("(//input[@id='1815'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MakeBed);
		if(MakeBed.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			 MakeBed.click();
			 
			if(!MakeBed.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);	
	}
	
	public void select_the_make_bed_visits_time() throws InterruptedException {
		try{
			WebElement MakeBedVisitsTime =driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
			MakeBedVisitsTime.click();
			Thread.sleep(3000);
		}
		catch(Exception e){}
		
	}
	
	public void enter_the_caregiver_instructions1() throws InterruptedException {
		WebElement CaregiverInstructions1Note= driver.findElement(By.xpath("//textarea[@id='notes']"));
		CaregiverInstructions1Note.sendKeys("testing v4.0");
		Thread.sleep(3000);
	}
	
	public void update_the_make_bed_details() throws InterruptedException {
		WebElement UpdateMakeBedDetails= driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",UpdateMakeBedDetails);
		 Thread.sleep(3000);	
		
	}
	
	public void save_the_household_tasks_details() throws InterruptedException {
		WebElement SaveHouseHold = driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",SaveHouseHold);
		 Thread.sleep(6000);
	}
	
	public void user_again_click_on_the_iadls() throws InterruptedException {
		
		WebElement IADLSBtn2=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLSBtn2.click();
		Thread.sleep(6000);
	}
	
	
	public void click_on_the_laundry() throws InterruptedException {
		WebElement Laundry=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Laundry']"));
		Laundry.click();
		Thread.sleep(4000);
		
	}
	
	public void select_laundry_assistance_level_as_a_assistance() throws InterruptedException{
			WebElement LaundryAssistance=driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
			LaundryAssistance.click();
			LaundryAssistance.sendKeys("Assistance");
			LaundryAssistance.click();
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 50000)");
			Thread.sleep(4000);
	
	}
	
	public void click_on_the_tasks() throws InterruptedException {
		
		WebElement Tasks=driver.findElement(By.xpath("(//input[@id='1823'])[1]"));
		Tasks.click();
		if( Tasks.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			 Tasks.click();
			 
			if( !Tasks.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);
	}
	
	public void user_select_the_visits_time() throws InterruptedException {
		try {
			WebElement VisitsTime=driver.findElement(By.xpath("//span[@class='e-frame e-icons']"));
			VisitsTime.click();
			Thread.sleep(4000);
		}
		catch (Exception e) {}
	}
	public void enter_caregiver_instruction() throws InterruptedException {
		WebElement Notes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		Notes.sendKeys("Testing v5.0");
		Thread.sleep(4000);
		
	}
	public void update_the_laundry_details() throws InterruptedException {
		WebElement UpdateLaundryDtls=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",UpdateLaundryDtls);
		Thread.sleep(6000);
		
	}
	
	public void save_the_laundry_details() throws InterruptedException {
		WebElement SaveLaundryDtls=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",SaveLaundryDtls);
		Thread.sleep(6000);
		
	}
	
	public void again_click_on_the_iadls() throws InterruptedException {
		WebElement IADLS=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLS.click();
		Thread.sleep(6000);
	}
	
	public void click_on_the_meals() throws InterruptedException {
	WebElement Meals =	driver.findElement(By.xpath("//div[contains(@role,'presentation')][normalize-space()='Meals']"));
	Meals.click();
	Thread.sleep(3000);
	}
	
	public void select_the_meals_assistance_level_no_assistance() throws InterruptedException {
		WebElement MealsAssistance=	driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
		 MealsAssistance.click();
		 MealsAssistance.sendKeys("No Assistance");
		 MealsAssistance.click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		 Thread.sleep(4000);
	}
	
	public void save_the_meals_details() throws InterruptedException {
		WebElement saveMealsDetails =driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",saveMealsDetails);
		Thread.sleep(6000);
	}
	
	public void user_again_click_on_the_iadls1() throws InterruptedException {
		WebElement IADLS=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLS.click();
		Thread.sleep(6000);
		
	}
	
	public void user_click_on_the_medication() throws InterruptedException {
		
		WebElement MedicationClk=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Medication']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MedicationClk);
		Thread.sleep(6000);
	}
	
	public void user_select_the_medication_assistance_level_as_assistance() throws InterruptedException {
		WebElement AssistanceLevel=driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		AssistanceLevel.click();
		AssistanceLevel.sendKeys("Assistance");
		AssistanceLevel.click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
	}
	
	
	public void select_the_tasks_with_check_blood_pressure() throws InterruptedException {
		WebElement BloodPressuretasks=driver.findElement(By.xpath("(//input[@id='1852'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",BloodPressuretasks);
		
		if( BloodPressuretasks.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			
			BloodPressuretasks.click();
			
			if( !BloodPressuretasks.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);
			
	}
	
	public void i_select_the_visits_time() throws InterruptedException {
		try {
			WebElement VisitsTime=driver.findElement(By.cssSelector(".e-frame.e-icons"));
			VisitsTime.click();
			Thread.sleep(6000);
		}
		catch (Exception e) {
			
		}
	}
	public void enter_the_careGiver_instructions() throws InterruptedException {
		WebElement CareGiverNotes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		CareGiverNotes.sendKeys("testing v6.0");
		Thread.sleep(4000);
		
	}
	public void update_the_medication_details () throws InterruptedException {
		WebElement UpdateMedicationDetails=driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",UpdateMedicationDetails);
		Thread.sleep(4000);
	}
	public void save_the_medication_details () throws InterruptedException {
		WebElement saveMedicationDetails=driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",saveMedicationDetails);
		Thread.sleep(8000);
		
	}
	
	
	public void click_on_the_add_to_schedule() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);
		
		
		/*WebElement AddToSchedue=driver.findElement(By.xpath("//span[normalize-space()='Add To Schedule']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", AddToSchedue);
		Thread.sleep(8000);*/
		
		boolean AddToSchedue=driver.findElement(By.xpath("//span[normalize-space()='Add To Schedule']")).isDisplayed();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", AddToSchedue);
		Thread.sleep(8000);
	}
	
	
	public void click_on_the_finalize_visits() throws InterruptedException{
		WebElement FinalizeVisits=driver.findElement(By.xpath("(//span[normalize-space()='Finalize Visits'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", FinalizeVisits);
		Thread.sleep(8000);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	public void user_select_all_days() throws InterruptedException {
		WebElement dropdown=driver.findElement(By.id("daysofweek"));
		dropdown.click();
		WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"daysofweek_popup\"]/div[1]/span"));
		dropdown2.click();
		
	    
	}
	
	public void select_start_time() throws InterruptedException {
		WebElement StartTime =driver.findElement(By.xpath("//input[@id='start-time']"));
		Thread.sleep(4000);
		StartTime.clear();
		StartTime.sendKeys("12:15 AM");
		StartTime.click();
		Thread.sleep(8000);
	}
	
	public void select_duration() throws InterruptedException {
		WebElement Duration =driver.findElement(By.xpath("(//span[@aria-owns='duration_options'])[1]"));
		Duration.click();
		Duration.sendKeys("45 Minute Visit");
		Duration.click();
		Thread.sleep(4000);
	}
	public void select_weekly_recurrence() throws InterruptedException {
		WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
		Recurrence.click();
		Recurrence.sendKeys("Weekly");
		Recurrence.click();
		Thread.sleep(4000);
	}
	
	public void select_start_date() throws InterruptedException {
		WebElement StartDate =driver.findElement(By.xpath("//input[@id='visit-start-date']"));
		
		Thread.sleep(4000);
		StartDate.clear();
		StartDate.sendKeys("7/1/2023");
		Thread.sleep(6000);
	}
	
	public void user_click_on_the_save_button() throws InterruptedException {
		WebElement SaveBtn =driver.findElement(By.xpath("//button[@id='SaveNewVisit']"));
		Thread.sleep(4000);
		SaveBtn.click();
		Thread.sleep(6000);
	}
}