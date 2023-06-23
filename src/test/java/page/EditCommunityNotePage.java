package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class EditCommunityNotePage extends BaseClass {
	
	public void enter_the_email() {
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		explicitWait(Username,20);
		Username.sendKeys("anoop.kumar@zenesys.com");
			
		} 
			
	public void enter_the_password() {
			WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
			explicitWait(Password,20);
			Password.sendKeys("Testing@123");

		}
	public void click_on_the_login_button() throws InterruptedException {
			WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
			Login.click();
			Thread.sleep(3000);
			
			   }
		
	public void select_test_community_dropdown() {
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
	
	public void click_on_the_manage_window() throws InterruptedException {
		WebElement manage=driver.findElement(By.linkText("Manage"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(manage));
		Thread.sleep(3000);
		manage.click();
	}
	
public void click_on_the_table() {
	 WebElement editNotes = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
     editNotes.click();
     
	}

public void edit_the_note() {
	WebElement txtUpdateNote = driver.findElement(By.id("note"));
    txtUpdateNote.clear();
    txtUpdateNote.sendKeys("edit functionlity");
}

public void edit_the_communities() {
	 WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
	    community.click();
	    community.sendKeys("New England Club");
}
public void edit_the_start_date() {
	WebElement UpdateStartdate = driver.findElement(By.id("startdate"));
	UpdateStartdate.clear();
	UpdateStartdate.sendKeys("6/25/2023");
}
     
public void edit_the_end_date() throws InterruptedException {
	   WebElement EditEnddate = driver.findElement(By.id("enddate"));
       EditEnddate.clear();
       EditEnddate.sendKeys("6/28/2023");
       Thread.sleep(2000);
       
    
}
public void click_on_the_save_button() {
	WebElement savebtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	savebtn.click();
    
}

    
	
}



