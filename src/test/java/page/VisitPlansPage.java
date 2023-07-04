package page;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseClass;

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
	
	public void click_on_the_add_visit_configuration() throws InterruptedException {
		WebElement AddVisitBtn=	driver.findElement(By.xpath("(//a[normalize-space()='Add Visit Configuration'])[1]"));
		AddVisitBtn.click();
		Thread.sleep(6000);
	    
	}
	
	public void select_the_days_as_sunday() throws InterruptedException {
		
		WebElement dropdown=driver.findElement(By.id("daysofweek"));
			dropdown.click();

			WebElement dropdown2 =driver.findElement(By.xpath("//*[@id=\"daysofweek_popup\"]/div[2]/ul/li[2]"));
			dropdown2.click();
		
	}
	
	public void select_the_start_time() throws InterruptedException {
		WebElement StartTime =driver.findElement(By.xpath("//input[@id='start-time']"));
		Thread.sleep(4000);
		StartTime.clear();
		StartTime.sendKeys("12:00 AM");
		StartTime.click();
		Thread.sleep(8000);
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
		StartDate.clear();
		StartDate.sendKeys("7/3/2023");
		Thread.sleep(8000);
		
		
	}
	
	public void click_on_the_save_button() throws InterruptedException {
		WebElement SaveBtn =driver.findElement(By.xpath("//button[@id='SaveNewVisit']"));
		Thread.sleep(4000);
		SaveBtn.click();
		Thread.sleep(6000);
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