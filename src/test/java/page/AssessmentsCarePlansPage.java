package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

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

public void user_select_the_test_community() {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
    
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
	WebElement DataTable = driver.findElement(By.xpath("//tr[@class='e-row e-altrow']//td[@aria-label='Automation Column Header First Name'][normalize-space()='Automation']"));
	Thread.sleep(8000);
	JavascriptExecutor js =(JavascriptExecutor)driver;
  js.executeScript("arguments[0].click()", DataTable);
	Thread.sleep(10000);
	}

public void click_on_the_assessment_and_care_plan() throws InterruptedException {
	WebElement Assessment=driver.findElement(By.xpath("//button[normalize-space()='Assessment and Care Plan']"));
	Thread.sleep(4000);
	Assessment.click();
	Thread.sleep(4000);
}

public void user_enter_the_assessment_date() {
	   
}

public void user_enter_the_visit_schedule() {
    
}

public void user_enter_the_goals_of_service() {
    
}

public void user_enter_the_family_social_network() {
    
}
public void user_enter_the_special_dietary_needs() {
    
}
public void user_enter_the_precautions() {
    
}

public void user_enter_the_functional_limitations_restrictions() {
    
}

}



