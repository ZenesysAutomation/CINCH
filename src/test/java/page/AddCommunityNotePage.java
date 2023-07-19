package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BaseClass;


public class AddCommunityNotePage extends BaseClass {
	
	
	public void user_enters_email() {
	WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
	explicitWait(Username,20);
	Username.sendKeys(prop.getProperty("username"));
		
	} 
		
	public void user_enters_password() {
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		explicitWait(Password,20);
		Password.sendKeys(prop.getProperty("password"));

	}
	public void Click_on_the_login() throws InterruptedException {
		WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		Login.click();
		Thread.sleep(3000);
		
		   }
	
	public void select_the_test_community() {
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		
	}
	
	public void click_on_the_continue() {
		WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Continue.click();
	}

public void click_on_the_manage() throws InterruptedException {
	WebElement manage=driver.findElement(By.linkText("Manage"));

	Thread.sleep(3000);
	manage.click();
		    
	}

public void click_on_the_add_new_community_note() throws InterruptedException {
	WebElement AddcomNote=driver.findElement(By.xpath("//a[normalize-space()='Add New Community Note']"));
	Thread.sleep(3000);
	AddcomNote.click();
	
    
}
public void enter_the_note() {
	WebElement note=driver.findElement(By.xpath("//textarea[@id='note']"));
	note.sendKeys("This is Testing Env @1213S");
    
}
public void select_communities() {
    WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
    community.click();
    community.sendKeys("Test Community");
    
}

public void choose_a_start_date() {
	WebElement StartDate=driver.findElement(By.xpath("//input[@id='startdate']"));
	StartDate.sendKeys("6/22/2023");
	  
	
}
public void choose_a_end_date() {
	WebElement EndDate=driver.findElement(By.xpath("//input[@id='enddate']"));
	EndDate.sendKeys("6/22/2023");
	explicitWait(EndDate,30);
	
	   
}
public void click_on_the_save_button() {
	WebElement savebtn=driver.findElement(By.cssSelector("button[type='submit']"));
	savebtn.click();
    
}

}
