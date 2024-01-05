package page;
import static org.junit.Assert.assertEquals;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ScreenRecorder.MyScreenRecording;
import base.BaseClass;
import io.cucumber.java.en.When;
import io.netty.handler.timeout.TimeoutException;

public class VisitPlansPage extends BaseClass  {
	
	public void user_enter_the_email() throws Exception {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		 Useremail.sendKeys(prop.getProperty("username"));
		}
		catch (TimeoutException e ) {
			 e.printStackTrace();	
	}
		MyScreenRecording.startRecording("Visit Plans");
	}
	
	public void user_enter_the_password() throws InterruptedException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys(prop.getProperty("password"));
		}
		catch (TimeoutException e ) {
			 e.printStackTrace();
		
	}
	}   
	
	
	public void user_click_on_the_login() throws InterruptedException {
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
	public void user_click_on_the_continue_button() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	 wait.until(ExpectedConditions.elementToBeClickable(Continue));
	 Continue.click();	
}
	
	public void user_click_on_the_visit_plans() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement VisitPlan= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Visit Plans')]")));
		    VisitPlan.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
	}
	
	public void click_on_the_user_first_name() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		
		WebElement FirstName=driver.findElement(By.xpath("(//td[@aria-label='Ankita Column Header First Name'])[1]"));
		Thread.sleep(3000);
		FirstName.click();	
		Thread.sleep(6000);
	}
	
	// Hourly visit---
	
	public void click_on_the_visit_plans_table() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		
		WebElement FirstName=driver.findElement(By.xpath("(//td[@aria-label='Sarah Column Header First Name'])[1]"));
		Thread.sleep(3000);
		FirstName.click();	
		Thread.sleep(6000);
	}
		
		
	public void click_on_the_add_visit_configuration() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement AddVisitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Add Visit Configuration'])[1]")));
		    AddVisitBtn.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}		
	}
	    		
	public boolean  select_the_single_day() throws InterruptedException {
		try {
			WebElement dropdown=driver.findElement(By.id("daysofweek"));
				dropdown.click();
				Thread.sleep(6000);	
				WebElement dropdown2 =driver.findElement(By.xpath("//*[@id=\"daysofweek_popup\"]/div[2]/ul/li[2]"));	
				dropdown2.click();
				Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;	
	}
	
	public void select_the_recurrence() throws InterruptedException {	
	try {	
	WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
	Recurrence.click();
	Recurrence.sendKeys("Single");
	Recurrence.click();
	Thread.sleep(3000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
	
	public void select_the_start_time() throws InterruptedException {
	try {
		WebElement SelectTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
		explicitWait(SelectTime,5);
		SelectTime.click();
		Random random =new Random();
		List<WebElement> liList=driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
		liList.get(random.nextInt(96)).click();	
		Thread.sleep(3000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
		}
	
	//Hourly Visit ---
	
	public void select_the_hourly_visit() throws InterruptedException {
		try {
		WebElement Hourly = driver.findElement(By.xpath("(//input[@id='hourly'])[1]"));
		Hourly.click();	
		Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		}
	

	public void select_the_end_time() throws InterruptedException {
		WebElement SelectTime = driver.findElement(By.xpath("(//span[contains(@class,'e-input-group-icon e-time-icon e-icons')])[2]"));
		explicitWait(SelectTime, 5);
		SelectTime.click();

		List<WebElement> timeOptions = driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
	
		String maxTimeValue = null;
		for (WebElement option : timeOptions) {
		    String optionText = option.getText();
		    if (maxTimeValue == null || optionText.compareTo(maxTimeValue) > 0) {
		        maxTimeValue = optionText;
		    }
		}
		
		List<WebElement> maxTimeOptions = new ArrayList<>();
		for (WebElement option : timeOptions) {
		    if (option.getText().equals(maxTimeValue)) {
		        maxTimeOptions.add(option);
		    }
		}

		Random random = new Random();
		WebElement randomMaxTimeOption = maxTimeOptions.get(random.nextInt(maxTimeOptions.size()));
		randomMaxTimeOption.click();			
	}

	public void select_the_hourly_rate() throws InterruptedException {
		try {
		WebElement HourlyRate= driver.findElement(By.xpath("(//span[contains(@aria-owns,'hourlyduration_options')])[1]"));
		HourlyRate.click();
		HourlyRate.sendKeys("CINCHCCM Test $12.00");
		Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	//Hourly visit end---
	
	public void select_a_duration() throws InterruptedException {
		try {
		WebElement Duration =driver.findElement(By.xpath("(//span[@aria-owns='duration_options'])[1]"));
		Duration.click();
		Duration.sendKeys("15 Minute Visit");
		Duration.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*public void select_the_recurrence() throws InterruptedException {
		WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
		Recurrence.click();
		Recurrence.sendKeys("Single");
		Recurrence.click();
		Thread.sleep(4000);
	}*/
	
	public void select_the_start_date() throws InterruptedException {
		try {
		LocalDateTime targetDate = LocalDateTime.now().plusDays(1);
        String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        WebElement startDateField = driver.findElement(By.id("visit-start-date"));
        startDateField.click();

        for (int i = 1; i <= 10; i++) {
            startDateField.sendKeys(Keys.BACK_SPACE);
        }
        startDateField.sendKeys(targetDateString);
        Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void click_on_the_save_button() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement SaveData=driver.findElement(By.xpath("//button[@id='SaveNewVisit']"));
		
		 wait.until(ExpectedConditions.elementToBeClickable(SaveData));
		 SaveData.click();
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 50000)");
		 Thread.sleep(4000);
	}
	
	public void save_the_all_single_visit_details() throws InterruptedException {
		WebElement SaveVisitdetails= driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		SaveVisitdetails.click();
		Thread.sleep(6000);
		
	}
	
	public void validation_message_should_be_shown_visit_plan_was_saved1() throws Exception {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}			
	} 
	
	
	@When("Click on the ADLs Tab")
	public void click_on_the_ad_ls_tab() throws InterruptedException {
		/*WebElement ADLs =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(4000);
		 ADLs.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement ADLs = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']")));
		    ADLs.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
	
	
	public void click_on_the_bathing() throws InterruptedException {
		try {
		WebElement BathingBtn =driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Bathing'])[1]"));
		BathingBtn.click();
		Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	    
	public void select_the_bathing_assistance_level_as_a_supervision() throws InterruptedException {
		
		try {
		WebElement BathingAssistance = driver.findElement(By.xpath("(//span[@role='listbox'])[1]"));
		BathingAssistance.click();
		Thread.sleep(3000);
		BathingAssistance.sendKeys("Supervision");
		BathingAssistance.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
		try {
		WebElement VisitTiming = driver.findElement(By.xpath("//textarea[@id='notes']"));
		VisitTiming.sendKeys("Testing demo");
		Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void click_on_the_update_button() throws InterruptedException {
		/*WebElement UpdateBtn = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		UpdateBtn.click();
		Thread.sleep(8000);*/
		
		try {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement UpdateBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Update']")));
		    UpdateBtn.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(2000);
	}
	
	public void save_the_bathing_details() throws InterruptedException {
		try {
		WebElement Savedetails = driver.findElement(By.xpath("//button[@id='SaveVisit']"));  
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",Savedetails);
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void click_on_the_ad_ls() throws InterruptedException {
		/*WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement Adls2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']")));
		    Adls2.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
		   
	public void click_on_the_continence_and_toileting() throws InterruptedException {
		try {
		WebElement Continence =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Continence and Toileting']"));
		Continence.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void click_on_the_assistance_level() throws InterruptedException {
		try{
		WebElement Assistance =driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		Assistance.click();
		Assistance.sendKeys("No Assistance");
		Assistance.click();
		Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
			}
		}

		 
	public void save_the_continence_and_toileting_details() throws InterruptedException {
		try {
		WebElement SaveContinence = driver.findElement(By.id("SaveVisit"));
		Thread.sleep(4000);
		
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("arguments[0].click()",SaveContinence );	
		    Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void click_on_the_again_ad_ls() throws InterruptedException {
		/*WebElement Adls3 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls3.click();
		Thread.sleep(8000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement Adls2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']")));
		    Adls2.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
	
	public void click_on_the_dressing_and_grooming() throws InterruptedException{
		try {
		WebElement dressingNgrooming =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Dressing & Grooming']"));
		dressingNgrooming.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
			}
		}
	
	
	public void select_the_assistance_as_a_supervision() throws InterruptedException {
		try {
		WebElement AssistanceSup =driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
		AssistanceSup.click();
		AssistanceSup.sendKeys("Supervision");
		AssistanceSup.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
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
		
		try {
		WebElement VisitTime =driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
		VisitTime.click();
		Thread.sleep(4000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void enter_the_caregiver_instructions3() throws InterruptedException {
		try {
		WebElement Instructions3  = driver.findElement(By.xpath("//textarea[@id='notes']"));
		Instructions3.sendKeys(prop.getProperty("CaregiverInstruction"));
		Thread.sleep(4000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update_the_apply_lotion() throws InterruptedException {
		/*WebElement Update = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		Update.click();
		Thread.sleep(6000);*/
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    WebElement Update = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Update']")));
	    Update.click();
		 
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
		/*WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2.click();
		Thread.sleep(8000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement Adls2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']")));
		    Adls2.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
	
	public void click_on_the_eating() throws InterruptedException {
		try {
		WebElement Eating =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Eating']"));
		Eating.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}				
	}
	
	public void select_the_assistance_level_as_a_no_assistance() throws InterruptedException {
		try {
			WebElement AssistanceLevel =driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
			AssistanceLevel.click();
			AssistanceLevel.sendKeys("No Assistance");
			AssistanceLevel.click();
			Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}

	public void save_the_eating_details() throws InterruptedException {
		WebElement EatingSaveBtn =driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",EatingSaveBtn);
		Thread.sleep(6000);
	}
	
	public void click_on_the_ad_ls2() throws InterruptedException {
		/*WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2 .click();
		Thread.sleep(6000);*/
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement Adls2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']")));
		    Adls2.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}		
	}
		
	public void click_on_the_mobility() throws InterruptedException {
		WebElement MobilityClick =driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Mobility'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MobilityClick);
		Thread.sleep(6000);	
	}
	
	public void select_the_assistance_level_as_a_limited_assistance() throws InterruptedException {
		try {
		WebElement LimitedAssistance =driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		LimitedAssistance.click();
		LimitedAssistance.sendKeys("Limited Assistance");
		LimitedAssistance.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);	
		}
	catch (Exception e) {
		e.printStackTrace();
		
	}
		
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
		
		try {
		WebElement VisitsTime=driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
		VisitsTime.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	public void enter_caregiver_instructions() throws InterruptedException {
		try {
		WebElement Notes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		Notes.sendKeys(prop.getProperty("CaregiverNotes"));
		Thread.sleep(4000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update_the_walk_with_client_details() throws InterruptedException{
		WebElement UpdateWalkwithClient=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		UpdateWalkwithClient.click();
		Thread.sleep(4000);	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(3000);	
	}
	
	public void save_the_mobility_details() throws InterruptedException {
		WebElement MobilityDetails=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MobilityDetails);
		Thread.sleep(8000);
	}
	
	public void user_click_on_the_ia_dls_tab() throws InterruptedException {
		/*WebElement IADLSBtn=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLSBtn.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement IADLSBtn= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]")));
		    IADLSBtn.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
		
	public void click_on_the_household_tasks() throws InterruptedException {
		try {
		WebElement HouseHold=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Household Tasks']"));
		HouseHold.click();
		Thread.sleep(4000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_the_assistance_level_as_a_assistance() throws InterruptedException {
		
		try {
		WebElement AssistanceLevel=driver.findElement(By.xpath("//span[@role='listbox']"));
		AssistanceLevel.click();
		AssistanceLevel.sendKeys("Assistance");
		AssistanceLevel.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public void enter_the_caregiver_instructions1() throws InterruptedException {
		try {
		WebElement CaregiverInstructions1Note= driver.findElement(By.xpath("//textarea[@id='notes']"));
		CaregiverInstructions1Note.sendKeys(prop.getProperty("Notes"));
		Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
		
		/*WebElement IADLSBtn2=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLSBtn2.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement IADLSBtn2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]")));
		    IADLSBtn2.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
	
	public void click_on_the_laundry() throws InterruptedException {
		WebElement Laundry=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Laundry']"));
		Laundry.click();
		Thread.sleep(4000);	
	}
	
	public void select_laundry_assistance_level_as_a_assistance() throws InterruptedException{
		try {
			WebElement LaundryAssistance=driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
			LaundryAssistance.click();
			LaundryAssistance.sendKeys("Assistance");
			LaundryAssistance.click();
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0, 50000)");
			Thread.sleep(4000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
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
		try {
		WebElement Notes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		Notes.sendKeys(prop.getProperty("CaregiverNote"));
		Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
		/*WebElement IADLS=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLS.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement IADLS= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]")));
		    IADLS.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
	
	}
	
	public void click_on_the_meals() throws InterruptedException {
		try {
	WebElement Meals =driver.findElement(By.xpath("//div[contains(@role,'presentation')][normalize-space()='Meals']"));
	Meals.click();
	Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_the_meals_assistance_level_no_assistance() throws InterruptedException {
		try {
		WebElement MealsAssistance=	driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
		 MealsAssistance.click();
		 MealsAssistance.sendKeys("No Assistance");
		 MealsAssistance.click();
		 
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		 Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save_the_meals_details() throws InterruptedException {
		WebElement saveMealsDetails =driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",saveMealsDetails);
		Thread.sleep(6000);
	}
	
	public void user_again_click_on_the_iadls1() throws InterruptedException {
		/*WebElement IADLS=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLS.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement IADLS= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]")));
		    IADLS.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
	
	}
	
	public void user_click_on_the_medication() throws InterruptedException {
		try {
		
		WebElement MedicationClk=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Medication']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MedicationClk);
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void user_select_the_medication_assistance_level_as_assistance() throws InterruptedException {
		try {
		WebElement AssistanceLevel=driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		AssistanceLevel.click();
		AssistanceLevel.sendKeys("Assistance");
		AssistanceLevel.click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
			e.printStackTrace();
		}
	}
	public void enter_the_careGiver_instructions() throws InterruptedException {
		try {
		WebElement CareGiverNotes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		CareGiverNotes.sendKeys(prop.getProperty("Caregiverinstruction"));
		Thread.sleep(2000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public void update_the_medication_details () throws InterruptedException {
		WebElement UpdateMedicationDetails=driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",UpdateMedicationDetails);
		Thread.sleep(4000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(3000);
		
	}
	public void save_the_medication_details () throws InterruptedException {
		WebElement saveMedicationDetails=driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",saveMedicationDetails);
		Thread.sleep(6000);
		
	}
	
	public void click_on_the_iadl() throws InterruptedException {
		/*WebElement IADLS=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLS.click();
		Thread.sleep(6000);*/
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement IADLS= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]")));
		    IADLS.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
	
	}
		
	public void click_on_the_other() throws InterruptedException {
		WebElement other=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Other'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", other);
		
		Thread.sleep(4000);
	}
	
	public void select_no_assistance() throws InterruptedException {
		try {
		WebElement Assistance=	driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[2]"));
		 Assistance.click();
		 Assistance.sendKeys("No Assistance");
		 Assistance.click();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0, 50000)");
		 Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean click_on_the_add_to_schedule_button_and_finalize_visits() throws Exception {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);
		
		try{
			
		if(isAddToSchedueElementPresent()){
			WebElement AddToSchedue=driver.findElement(By.xpath("//span[normalize-space()='Add To Schedule']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", AddToSchedue);
			Thread.sleep(8000);	
			
			WebElement FinalizeVisits=driver.findElement(By.xpath("(//button[normalize-space()='Finalize Visits'])[1]"));
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].click()", FinalizeVisits);
			Thread.sleep(6000);
			
			
			WebElement	FinalizeVisitsFinal=driver.findElement(By.xpath("(//button[normalize-space()='Yes, Finalize'])[1]"));
			FinalizeVisitsFinal.click();
			Thread.sleep(5000);
			
		}
		else {
			
			WebElement FinalizeVisits=driver.findElement(By.cssSelector("button[id='Finalize'] span[class='e-btn-content']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", FinalizeVisits);
			Thread.sleep(6000);
			
			WebElement FinalizeVisits2nd=driver.findElement(By.cssSelector(".mt-1.btn.btn-danger"));
			FinalizeVisits2nd.click();
			Thread.sleep(6000);
			
			WebElement	FinalizeVisitsFinal=driver.findElement(By.xpath("(//button[normalize-space()='Yes, Finalize'])[1]"));
			FinalizeVisitsFinal.click();
			Thread.sleep(5000);
		}
		
		}
	 catch (Exception e) {
		 e.printStackTrace();
		 
	 }
		MyScreenRecording.stopRecording();
		return false;
		
	}
	private boolean isAddToSchedueElementPresent() {
	    try {
	    	driver.findElement(By.xpath("//span[normalize-space()='Add To Schedule']"));
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	//past visit
	
	public void click_on_the_visit_plans() throws InterruptedException {
	
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement VisitPlan= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), 'Visit Plans')]")));
		    VisitPlan.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}		
	}
	
	
	public void click_on_the_user_table() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		
		WebElement FirstName=driver.findElement(By.xpath("(//td[@aria-label='Ankita Column Header First Name'])[1]"));
		Thread.sleep(3000);
		FirstName.click();	
		Thread.sleep(6000);
		
	}
	
	public void delete_the_everyday_visit_series() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement DeleteBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-danger btn-sm e-flat dripicons-trash']")));
		    DeleteBtn.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}

		WebElement DeletePopUp=	driver.findElement(By.xpath("//input[@value='Delete']"));
		DeletePopUp.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);
	}
		
	public void save_the_everyday_visit_series() throws InterruptedException {
		try {
		WebElement DeleteVisitSeries=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		DeleteVisitSeries.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void user_go_to_the_add_visit_configuration() throws InterruptedException {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement AddVisitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[normalize-space()='Add Visit Configuration'])[1]")));
		    AddVisitBtn.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
		
	}
	    
	public void user_select_all_days() throws InterruptedException {
		try {
		WebElement dropdown=driver.findElement(By.id("daysofweek"));
		dropdown.click();
		
		WebElement dropdown2=driver.findElement(By.xpath("//*[@id=\"daysofweek_popup\"]/div[1]/span"));
		dropdown2.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		    
	}
	
	public void select_start_time() throws InterruptedException {
			WebElement SelectTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
			explicitWait(SelectTime, 5);
			SelectTime.click();
			Random random =new Random();
			List<WebElement> liList=driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
			liList.get(random.nextInt(96)).click();	
			Thread.sleep(3000);
	}
	
	public void select_duration() throws InterruptedException {
		try {
		WebElement Duration =driver.findElement(By.xpath("//span[contains(@aria-owns,'duration_options')]"));
		Duration.click();
		Duration.sendKeys("45 Minute Visit");
		Duration.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_weekly_recurrence() throws InterruptedException {
		try {
		WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
		Recurrence.click();
		Recurrence.sendKeys("Weekly");
		Recurrence.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_start_date() throws InterruptedException {
		try {
		 LocalDateTime targetDate = LocalDateTime.now().plusDays(1);
	        String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

	        WebElement startDateField = driver.findElement(By.id("visit-start-date"));
	        startDateField.click();

	        for (int i = 1; i <= 10; i++) {
	            startDateField.sendKeys(Keys.BACK_SPACE);
	        }

	        startDateField.sendKeys(targetDateString);
	        Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void select_past_date() throws InterruptedException {
		try {
		 LocalDateTime targetDate = LocalDateTime.now().minusDays(7);
	        String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

	        WebElement startDateField = driver.findElement(By.id("visit-start-date"));
	        startDateField.click();

	        for (int i = 1; i <= 10; i++) {
	            startDateField.sendKeys(Keys.BACK_SPACE);
	        }

	        startDateField.sendKeys(targetDateString);
	        Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void user_click_on_the_save_button() throws InterruptedException {
		WebElement SaveBtn =driver.findElement(By.xpath("//button[@id='SaveNewVisit']"));
		Thread.sleep(4000);
		SaveBtn.click();
		Thread.sleep(6000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(3000);
	}
	
	public void save_the_for_all_days_visit_details() throws InterruptedException {
		WebElement SaveAllDaysdetails= driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		SaveAllDaysdetails.click();
		Thread.sleep(7000);
		
	}
	
	public void message_should_be_shown_visit_plan_was_saved6() {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();		
		}	
	}
	
	public void message_should_be_shown_visit_plan_was_saved()
	{
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//change task
	
	public void user_click_on_the_ad_ls_tab() throws InterruptedException {
		try {
		WebElement ADLs =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(4000);
		 ADLs.click();
		Thread.sleep(6000); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void user_click_on_the_bathing() throws InterruptedException {
		WebElement Bathing =driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Bathing'])[1]"));
		Bathing.click();
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
	}
	
	public void user_select_the_bathing_assistance_level_as_a_supervision() throws InterruptedException {
		try {
		WebElement BathingAssistance = driver.findElement(By.xpath("(//span[@role='listbox'])[1]"));
		BathingAssistance.click();
		Thread.sleep(3000);
		BathingAssistance.sendKeys("Supervision");
		BathingAssistance.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void verify_if_assist_with_shower_is_already_checked_then_unchecked_it() throws InterruptedException {
		
		WebElement AssistwithShower = driver.findElement(By.xpath("//input[@id='1798']"));
		if(AssistwithShower.isSelected()) {
			AssistwithShower.click();
		Thread.sleep(6000);
		
		}
			}
	
	
	public void checked_the_assist_with_sponge_bath() throws InterruptedException {
		WebElement SpongeBath = driver.findElement(By.xpath("(//input[@id='1799'])[1]"));
		SpongeBath.click();
		if(SpongeBath.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			SpongeBath.click();
			if(!SpongeBath.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(6000);
	}
	
	public void user_select_the_visits_timing() throws InterruptedException {
		try {
		WebElement VisitTimingslt = driver.findElement(By.xpath("//*[@id=\"visitconfig\"]/ul/li/div[2]/div[1]"));
		VisitTimingslt.click();
		WebElement VisitTiming1 = driver.findElement(By.xpath("//*[@id=\"visitconfig_active\"]/div[2]/div[2]/span"));
		Thread.sleep(4000);
		VisitTiming1.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void update_the_bathing_details() throws InterruptedException {
		try {
		WebElement UpdateBt = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		UpdateBt.click();
		Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void save_the_bathing_details1() throws InterruptedException {
		try {
		WebElement Savedetail = driver.findElement(By.xpath("//button[@id='SaveVisit']"));  
		Savedetail.click();
		Thread.sleep(6000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void user_click_on_the_ad_ls_to_enter_the_dressing_and_grooming_details() throws InterruptedException {
		try {
		WebElement Adls3 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls3 .click();
		Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void user_click_on_the_dressing_and_grooming() throws InterruptedException {
		try {
		WebElement dressingNgrooming =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Dressing & Grooming']"));
		dressingNgrooming.click();
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void verify_if_apply_lotion_tasks_is_already_checked_then_unchecked_it() throws InterruptedException {
		WebElement LotionTasks =driver.findElement(By.xpath("//input[@id='1804']"));
		if(LotionTasks.isSelected()) {
			LotionTasks.click();
		Thread.sleep(6000);
		
	}
	}
	
	public void user_ticked_on_assist_with_oral_care() throws InterruptedException {
		
		WebElement AssistWithOralcare =	driver.findElement(By.xpath("(//input[@id='1806'])[1]"));
		if(AssistWithOralcare.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			AssistWithOralcare.click();
			 
			if(!AssistWithOralcare.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);
		
	}
	
	public void select_the_visit_time() throws InterruptedException {
		
	try {
	WebElement VisitTime =driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
	VisitTime.click();
	Thread.sleep(6000);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
}
		
	public void update_the_assist_with_oral_care_details() throws InterruptedException {
		try {
		
		WebElement Update = driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		Update.click();
		Thread.sleep(6000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		
	}
	
	public void save_the_dressing_and_grooming_details1() throws InterruptedException {
		try {
		WebElement GroomingDetails =driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		Thread.sleep(6000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",GroomingDetails);
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void user_click_on_the_ad_ls_to_enter_the_eating_details() throws InterruptedException {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement Adls2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']")));
		    Adls2.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}		
	}
	
	public void user_click_on_the_ad_ls_to_enter_the_mobility_details() throws InterruptedException {
		try {
		WebElement Adls2 =driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='ADLs']"));
		Thread.sleep(6000);
		Adls2 .click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void user_click_on_the_mobility() throws InterruptedException {
		WebElement MobilityClick =driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='Mobility'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MobilityClick);
		Thread.sleep(6000);	
		
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
	}
		
	
	public void verify_if_walk_with_client_tasks_is_already_checked_then_unchecked_it() throws InterruptedException {
		
		WebElement WalkWithClient=driver.findElement(By.xpath("(//input[@id='1812'])[1]"));
		if(WalkWithClient.isSelected()) {
			WalkWithClient.click();
		Thread.sleep(6000);
		}	
	}
	
	public void select_the_assist_with_transfers() throws InterruptedException {
		WebElement AssistWithTransfer = driver.findElement(By.xpath("(//input[@id='1810'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",AssistWithTransfer );
		Thread.sleep(4000);
	
		if(AssistWithTransfer.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			AssistWithTransfer.click();
			 
			if(!AssistWithTransfer.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);		
	}
	
	public void user_choose_the_visits_time() throws InterruptedException {
	try {
	WebElement VisitsTime=driver.findElement(By.xpath("(//span[@class='e-frame e-icons'])[1]"));
	VisitsTime.click();
	Thread.sleep(6000);
	}
	catch (Exception e){
		e.printStackTrace();
	}
	}
	 
	
	public void update_the_assist_with_transfers_details() throws InterruptedException {
		try {
		WebElement Updateassistwithtransfers=driver.findElement(By.xpath("//button[normalize-space()='Update']"));
		Updateassistwithtransfers.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void user_click_on_the_save_button_to_save_the_mobility_details() throws InterruptedException {
		WebElement MobilityDetails=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MobilityDetails);
		Thread.sleep(8000);	
	}
	
	public void user_again_click_on_the_ia_dls_to_enter_the_medication_details() throws InterruptedException {
		try {
		WebElement IADLS=driver.findElement(By.xpath("(//div[@role='presentation'][normalize-space()='iADLS'])[1]"));
		IADLS.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void click_on_the_medication() throws InterruptedException {
		try {
		WebElement MedicationClk=driver.findElement(By.xpath("//div[@role='presentation'][normalize-space()='Medication']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",MedicationClk);
		Thread.sleep(6000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public void select_the_medication_assistance_evel_as_assistance() throws InterruptedException {
		try {
		WebElement AssistanceLevel=driver.findElement(By.xpath("(//span[@role='listbox'])[2]"));
		AssistanceLevel.click();
		AssistanceLevel.sendKeys("Assistance");
		AssistanceLevel.click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public void verify_if_check_blood_pressure_tasks_is_already_select_then_unselect_it() throws InterruptedException {
		WebElement BloodPressuretasks=driver.findElement(By.xpath("(//input[@id='1852'])[1]"));
		
		if(BloodPressuretasks.isSelected()) {
			BloodPressuretasks.click();	
		Thread.sleep(4000);	
	}
	}
	
	public void select_the_check_temperature() throws InterruptedException {
		WebElement CheckTemp=driver.findElement(By.xpath("(//input[@id='1852'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",CheckTemp);
		
		if( CheckTemp.isSelected()) {
			System.out.println("Checkbox is toggled On");
		}
		else {
			
			System.out.println("Checkbox is toggled Off");
			
			CheckTemp.click();
			
			if( !CheckTemp.isSelected()) {
				System.out.println("Checkbox is now toggle off");
			}
		}
		Thread.sleep(4000);
	}
	public void users_select_the_visits_time() {
		try {
			WebElement VisitsTime=driver.findElement(By.cssSelector(".e-frame.e-icons"));
			VisitsTime.click();
			Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void user_enter_caregiver_instructions_for_medication() throws InterruptedException {
		try {
		WebElement CareGiverNotes=driver.findElement(By.xpath("//textarea[@id='notes']"));
		CareGiverNotes.sendKeys("testing v6.0");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void user_update_the_medication_details() throws InterruptedException {
		try {
		WebElement UpdateMedicationDetails=driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",UpdateMedicationDetails);
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void user_save_the_medication_details() throws InterruptedException {
		WebElement saveMedicationDetails=driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",saveMedicationDetails);
		Thread.sleep(8000);
		
	}
	public boolean user_click_on_the_add_to_schedule_and_finalize_visits() throws InterruptedException {
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);
		
		try{
			
		if(isAddToSchedueElementPresent2()){
			WebElement AddToSchedue=driver.findElement(By.xpath("//span[normalize-space()='Add To Schedule']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", AddToSchedue);
			Thread.sleep(8000);	
			
			WebElement FinalizeVisits=driver.findElement(By.xpath("(//button[normalize-space()='Finalize Visits'])[1]"));
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].click()", FinalizeVisits);
			Thread.sleep(6000);
			
			
			WebElement	FinalizeVisitsFinal=driver.findElement(By.xpath("(//button[normalize-space()='Yes, Finalize'])[1]"));
			FinalizeVisitsFinal.click();
			Thread.sleep(5000);		
		}
		else {
			
			WebElement FinalizeVisits=driver.findElement(By.cssSelector("button[id='Finalize'] span[class='e-btn-content']"));
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()", FinalizeVisits);
			Thread.sleep(6000);
			
			WebElement FinalizeVisits2nd=driver.findElement(By.cssSelector(".mt-1.btn.btn-danger"));
			FinalizeVisits2nd.click();
			Thread.sleep(6000);
			
			WebElement FinalizeVisitsFinal=driver.findElement(By.xpath("(//button[normalize-space()='Yes, Finalize'])[1]"));
			FinalizeVisitsFinal.click();
			Thread.sleep(5000);
		}
		
		}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
		return false;
		
	}
	private boolean isAddToSchedueElementPresent2() {
	    try {
	    	driver.findElement(By.xpath("//span[normalize-space()='Add To Schedule']"));
	        return true;
	    } catch (org.openqa.selenium.NoSuchElementException e) {
	        return false;
	    }
	}
	
	public void delete_the_single_visit_serise() throws InterruptedException {
		WebElement DeleteIcon=driver.findElement(By.xpath("//a[@class='btn btn-danger btn-sm e-flat dripicons-trash']"));
		DeleteIcon.click();
		Thread.sleep(8000);
		
		WebElement DeleteIcon2=	driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]"));
		DeleteIcon2.click();
		Thread.sleep(8000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);		
	}
	
	public void save_the_single_visit_series() throws InterruptedException {
		try {
		WebElement DeleteVisitSeries=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		DeleteVisitSeries.click();
		Thread.sleep(8000);	
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
	//custom date 

	public void check_the_add_visit_configuration_button() throws Exception {
		try {
		WebElement AddVisitBtn=	driver.findElement(By.xpath("(//a[normalize-space()='Add Visit Configuration'])[1]"));
		AddVisitBtn.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		MyScreenRecording.startRecording("Add Custom Date");
	}
	
	public boolean user_select_single_days() throws InterruptedException {
		try {

			WebElement dropdown=driver.findElement(By.id("daysofweek"));
				dropdown.click();
				Thread.sleep(6000);
				WebElement dropdown2 =driver.findElement(By.xpath("//*[@id=\"daysofweek_popup\"]/div[2]/ul/li[2]"));
				dropdown2.click();
				Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
			return true;
		}
		return false;		
	}
	
	public void user_select_the_weekly_recurrence() throws InterruptedException {
		try {
		WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
		Recurrence.click();
		Recurrence.sendKeys("Weekly");
		Recurrence.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void user_select_start_time() throws InterruptedException {
	try {
		WebElement SelectTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
		explicitWait(SelectTime, 5);
		SelectTime.click();
		Random random =new Random();
		List<WebElement> liList=driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
		liList.get(random.nextInt(96)).click();	
		Thread.sleep(3000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public void user_select_a_duration() throws InterruptedException {
		try {
		WebElement Duration =driver.findElement(By.xpath("//span[contains(@aria-owns,'duration_options')]"));
		Duration.click();
		Duration.sendKeys("15 Minute Visit");
		Duration.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	/*public void user_select_the_single_recurrence() throws InterruptedException {
		WebElement Recurrence =driver.findElement(By.xpath("(//span[@class='e-ddl e-lib e-input-group e-control-container e-control-wrapper e-valid-input'])[1]"));
		Recurrence.click();
		Recurrence.sendKeys("Single");
		Recurrence.click();
		Thread.sleep(4000);
		
		
	}*/	
	
	public void user_select_start_date() throws InterruptedException {
		try {
		 LocalDateTime targetDate = LocalDateTime.now().plusDays(1);
	        String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

	        WebElement startDateField = driver.findElement(By.id("visit-start-date"));
	        startDateField.click();

	        for (int i = 1; i <= 10; i++) {
	            startDateField.sendKeys(Keys.BACK_SPACE);
	        }

	        startDateField.sendKeys(targetDateString);
	        Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void user_click_on_the_use_custom_end_date_toggle() throws InterruptedException {
		try {
		WebElement Toggleon = driver.findElement(By.xpath("(//input[@id='custom-date'])[1]"));
		Toggleon.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void user_enter_the_end_date() throws InterruptedException {
		try {
		LocalDateTime targetDate = LocalDateTime.now().plusDays(generateRandomNumber(2,100));
	    String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	    WebElement endDateField = driver.findElement(By.xpath("//input[@id='visit-end-date']"));
	    endDateField.click();
	    for (int i = 1; i <= 10; i++) {
	        endDateField.sendKeys(Keys.BACK_SPACE);
	    }  
	   endDateField.sendKeys(targetDateString);
	   Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}			
	}
	private static int generateRandomNumber(int start, int end) {
	    Random random = new Random(); 
	    if (start > end) {
	        throw new IllegalArgumentException("Start value must be less than or equal to the end value.");
	    }
	    int range = end - start + 1;
	    int randomNumber = random.nextInt(range) + start;
	    return randomNumber;
	}
		
	
	public void save_the_visits_details() throws InterruptedException {
		WebElement SaveBtn =driver.findElement(By.xpath("//button[@id='SaveNewVisit']"));
		Thread.sleep(4000);
		SaveBtn.click();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(8000);
	}
	
	
	public void save_the_all_visits_plan_details() throws InterruptedException {
		WebElement SaveVisitsplan=driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		SaveVisitsplan.click();
		Thread.sleep(8000);
	}
	
	public void message_should_be_shown_visit_plan_was_saved3() throws Exception {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch (Exception e) {
		e.printStackTrace();
		}	
		
		MyScreenRecording.stopRecording();
	}
	
	public void click_on_the_single_day_table() throws InterruptedException {
		try {
		WebElement TableClick=driver.findElement(By.xpath("//a[normalize-space()='Mon']"));
		TableClick.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void change_the_end_date() {
		try {
		 LocalDateTime targetDate = LocalDateTime.now().plusDays(6);
	        String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

	        WebElement startDateField = driver.findElement(By.xpath("(//input[@id='visit-end-date'])[1]"));
	        startDateField.click();

	        for (int i = 1; i <= 10; i++) {
	            startDateField.sendKeys(Keys.BACK_SPACE);
	        }

	        startDateField.sendKeys(targetDateString);
	        try {
				Thread.sleep(8000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update_the_visits() throws InterruptedException {
	WebElement UpdateVisits =driver.findElement(By.xpath("(//button[normalize-space()='Update'])[1]"));
	UpdateVisits.click();
	Thread.sleep(6000);
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0, 50000)");
	Thread.sleep(8000);
	}
	
	public void save_the_visits() throws InterruptedException {
		WebElement SaveVisits =	driver.findElement(By.xpath("//button[@id='SaveVisit']"));
		SaveVisits.click();
		Thread.sleep(8000);
	}
	
	public void message_should_be_shown_visit_plan_was_saved4() {
		try {
		
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	
	
	// Change A visit Duration For Everyday
	public void click_on_the_visit_table() throws Exception {
		try {
		WebElement tableClk= driver.findElement(By.xpath("//a[normalize-space()='Every Day']"));
		tableClk.click();
		Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		MyScreenRecording.startRecording("Change Duration -Everyday visit");
	}
	
	public void change_the_visit_duration_as_30_minute_visit() throws InterruptedException {
		try {
		WebElement Duration =driver.findElement(By.xpath("//span[contains(@aria-owns,'duration_options')]"));
		Duration.click();
		Duration.sendKeys("30 Minute Visit");
		Duration.click();
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void update_the_visit_duration() throws InterruptedException {
		try {
		WebElement EditBtn=driver.findElement(By.xpath("//button[@id='UpdateNewVisit']"));
		EditBtn.click();
		Thread.sleep(4000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public void save_the_details() throws InterruptedException {
		try {
		WebElement saveDetailsbtn =	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
		saveDetailsbtn.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
	}
		
	}
	
	public void message_should_be_shown_visit_plan_was_saved7() throws Exception {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		MyScreenRecording.stopRecording();
	}
	
	
	//Single Change Duration
	public void click_on_the_single_visit_table() throws Exception {
		try {
		WebElement tableclick =	driver.findElement(By.xpath("//a[normalize-space()='Mon']"));
		tableclick.click();
		Thread.sleep(8000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		MyScreenRecording.startRecording("Change Duration -Single visit");
	}
	
	public void change_the_visit_duration_as_45_minute_visit() throws InterruptedException {
		try {
		WebElement DurationClk =driver.findElement(By.xpath("//span[contains(@aria-owns,'duration_options')]"));
		DurationClk.click();
		DurationClk.sendKeys("45 Minute Visit");
		DurationClk.click();
		Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public void click_on_the_update_button1() throws InterruptedException {
		WebElement updateBtn=driver.findElement(By.xpath("//button[@id='UpdateNewVisit']"));
		updateBtn.click();
		Thread.sleep(9000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);
	}
	
	public void click_on_the_save_button1() throws InterruptedException {
		WebElement saveDetailsbtn =	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
		saveDetailsbtn.click();
		Thread.sleep(8000);
	}
	
	public void validation_message_should_be_shown_visit_plan_was_saved2() throws Exception {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		MyScreenRecording.stopRecording();
	}
	
	
	//Delete for Everyday visit Series
	
	public void user_click_on_the_delete_icon() throws Exception {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement DeleteBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-danger btn-sm e-flat dripicons-trash']")));
		    DeleteBtn.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
		
		MyScreenRecording.startRecording("Delete EveryDay Visit Series");	
	}
		
	public void delete_visit_configurations_pop_up_is_opened_and_click_on_the_delete_button() throws InterruptedException {
		WebElement DeletePopUp=	driver.findElement(By.xpath("//input[@value='Delete']"));
		DeletePopUp.click();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 50000)");
		Thread.sleep(6000);
	}
	
	public void save_the_delete_visit_series() throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement DeleteVisitSeries = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='SaveVisit']")));
		    DeleteVisitSeries.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
	}
	
	public void message_should_be_shown_visit_plan_was_saved8() throws Exception {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Plan was Created",expectedResult,actualResult);	
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		MyScreenRecording.stopRecording();
	}
	
		
//delete for single series
	public void click_on_the_delete_Icon_and_Pop_is_displayed_confirm_that_you_want_to_delete_this_item() throws Exception{
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement DeleteIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='btn btn-danger btn-sm e-flat dripicons-trash']")));
		    DeleteIcon.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}
		
		MyScreenRecording.startRecording("Delete Single Visit Series");		
	}
	
	public void click_on_the_delete_button() throws InterruptedException {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement DeleteIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[normalize-space()='Delete'])[1]")));
		    DeleteIcon.click();
	 
		    JavascriptExecutor js = (JavascriptExecutor)driver;
		    js.executeScript("window.scrollBy(0, 50000)");
		    Thread.sleep(6000);	
	}
	
	public void save_the_single_delete_visit_series() throws InterruptedException  {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    WebElement DeleteVisitSeries = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='SaveVisit']")));
		    DeleteVisitSeries.click();
		} catch (Exception e) {
		    e.printStackTrace(); 
		}	
	}
	
	public void message_should_be_shown_visit_plan_was_saved5() throws Exception {
		try {
		String expectedResult= "Visit Plan was saved.";
		String actualResult= driver.findElement(By.className("e-toast-content")).getText();
		assertEquals("Visit Plan was Created",expectedResult,actualResult);	
		}
		catch (Exception e) {
			e.printStackTrace();	
		}
		
		MyScreenRecording.stopRecording();	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	