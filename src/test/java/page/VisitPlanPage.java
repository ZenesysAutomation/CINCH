package page;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class VisitPlanPage extends BaseClass  {
	
	public void user_enter_the_email() throws InterruptedException {
		WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
		explicitWait(Useremail,20);
		Thread.sleep(4000);
		Useremail.sendKeys("anoop.kumar@zenesys.com");
		Thread.sleep(4000);
		   
	}
	
	public void user_enter_the_password() {
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		explicitWait(Password,20);
		Password.sendKeys("Testing@123");
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
		create_visit_plan("Single");
		create_visit_plan("Weekly");
	}
	
	public void create_visit_plan(String recurrence) throws InterruptedException {
		WebElement addVisitPlan = driver.findElement(By.xpath("(//a[normalize-space()='Add Visit Configuration'])[1]"));
		Thread.sleep(4000);
        addVisitPlan.click();
        TimeUnit.SECONDS.sleep(10);

 

        WebElement checkboxElement = driver.findElement(By.id("daysofweek"));
        Thread.sleep(4000);
        checkboxElement.click();

 

        if (recurrence.equals("Single")) {
            WebElement chkElementsSingle = driver.findElement(By.xpath("//ul[@class='e-list-parent e-ul']/li[@class='e-list-item e-item-focus']/div[@class='e-checkbox-wrapper e-css']"));
            Thread.sleep(4000);
            chkElementsSingle.click();
        } else {
            WebElement chkElementsWeekly = driver.findElement(By.xpath("//div[@class='e-checkbox-wrapper e-css']/span[@class='e-frame e-icons']"));
            chkElementsWeekly.click();
        }

 

        WebElement ddlDuration = driver.findElement(By.id("duration"));
        Thread.sleep(4000);
        ddlDuration.sendKeys("45 Minute Visit");
        WebElement ddlDurations = driver.findElement(By.xpath("//*[@id='duration_popup']/div/ul/li[3]"));
        Thread.sleep(4000);
        ddlDurations.click();

 

        WebElement ddlRecurrence = driver.findElement(By.id("recurrence"));
        TimeUnit.SECONDS.sleep(20);
        ddlRecurrence.sendKeys(recurrence);

 

        WebElement ddlStartTime = driver.findElement(By.xpath("//span[@class='e-input-group-icon e-time-icon e-icons']"));
        ddlStartTime.click();

 

        LocalDateTime currentTime = LocalDateTime.now();
        LocalDateTime roundedTime = roundToNearest15Minutes(currentTime);
        String roundedTimeFormatted = roundedTime.format(DateTimeFormatter.ofPattern("h:mm a"));

 

        TimeUnit.SECONDS.sleep(10);

 

        String visitPlanXPath = String.format("//ul[@class='e-list-parent e-ul']/li[@data-value='%s']", roundedTimeFormatted);
        WebElement visitPlanElement = driver.findElement(By.xpath(visitPlanXPath));
        visitPlanElement.click();

 

        TimeUnit.SECONDS.sleep(30);

        

 

        if (recurrence.equals("Weekly")) {
            LocalDateTime targetDate = LocalDateTime.now().minusDays(7);
            String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            WebElement startDateField = driver.findElement(By.id("visit-start-date"));
            startDateField.click();
            for (int i = 1; i <= 10; i++) {
                startDateField.sendKeys(Keys.BACK_SPACE);
            }
            startDateField.sendKeys(targetDateString);

 

            WebElement checkboxCustomDate = driver.findElement(By.id("custom-date"));
            checkboxCustomDate.click();

 

            LocalDateTime targetEndDate = LocalDateTime.now().plusDays(14);
            String targetEndDateString = targetEndDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            WebElement endDateField = driver.findElement(By.id("visit-end-date"));
            endDateField.click();
            for (int i = 1; i <= 10; i++) {
                endDateField.sendKeys(Keys.BACK_SPACE);
            }
            endDateField.sendKeys(targetEndDateString);
        }

 

        Thread.sleep(4000);
        WebElement saveSingleVisit = driver.findElement(By.id("SaveNewVisit"));
        Thread.sleep(4000);
        saveSingleVisit.click();
    }

 

    public static LocalDateTime roundToNearest15Minutes(LocalDateTime time) {
        int minutes = time.getMinute();
        int remainder = minutes % 15;
        int roundedMinutes = (remainder > 7) ? minutes + (15 - remainder) : minutes - remainder;
        LocalDateTime roundedTime = time.plusMinutes(roundedMinutes - minutes);
        return roundedTime;	   
		
	}

	

}
