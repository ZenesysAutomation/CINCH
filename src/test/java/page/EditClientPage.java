package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class EditClientPage extends BaseClass{

public void check_the_user_email() throws InterruptedException {
	WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
	explicitWait(Useremail,20);
	Thread.sleep(6000);
	Useremail.sendKeys("anoop.kumar@zenesys.com");
	Thread.sleep(6000);	    
		
	} 

public void check_the_user_password() throws InterruptedException {
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	explicitWait(Password,20);
	Password.sendKeys("Testing@123");
	Thread.sleep(4000);
}

public void check_the_login_button() throws InterruptedException {
	WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	Login.click();
	Thread.sleep(3000);
}

public void check_the_test_community_dropdown() throws InterruptedException {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	Thread.sleep(3000);
}

public void click_on_the_continue_button() throws InterruptedException {
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	Thread.sleep(3000);
	Continue.click();
}

public void click_on_the_clients() throws InterruptedException {
	WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
	explicitWait(Clientbtn,30);
	Thread.sleep(6000);
	Clientbtn.click();
			   
}
public void click_on_the_user_table() throws InterruptedException {
	/*WebElement EditTable=driver.findElement(By.xpath("//tbody/tr[21]/td[1]"));
	Thread.sleep(8000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
  js.executeScript("arguments[0].click()", EditTable);
	Thread.sleep(10000);
	}*/
	
	
	WebElement EditTable=driver.findElement(By.xpath("(//td[@aria-label='Piyush Column Header First Name'])[1]"));
	Thread.sleep(8000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()", EditTable);
	Thread.sleep(10000);
	}
	
	

public void click_on_the_edit_button() throws InterruptedException {
	WebElement Editbtn=driver.findElement(By.xpath("(//button[normalize-space()='Edit'])[1]"));
	Thread.sleep(6000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",Editbtn);
	  Thread.sleep(8000);
	  
	  JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("window.scrollBy(0, 50000)");
		 Thread.sleep(8000);
	
}

public void change_the_status_from_active_to_discharged() throws InterruptedException {
	WebElement Discharged=driver.findElement(By.xpath("//span[@aria-owns='client-status_options']"));
	Discharged.click();
	Thread.sleep(4000);
	Discharged.sendKeys("Discharged");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",Discharged);
	Thread.sleep(6000);
	
}
public void enter_the_discharge_reason() throws InterruptedException {
	
	   WebElement DischargeReason=driver.findElement(By.xpath("(//span[@aria-owns='discharge-reason_options'])[1]"));
		
	   Thread.sleep(4000);
	   DischargeReason.click();
	   DischargeReason.sendKeys("Moved out of area");
	   DischargeReason.click();
       Thread.sleep(8000);
}

public void save_the_data() throws InterruptedException {
	WebElement SaveData=driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	Thread.sleep(3000);
	SaveData.click();
	Thread.sleep(6000);
}


}
