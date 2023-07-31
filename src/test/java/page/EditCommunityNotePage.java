package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class EditCommunityNotePage extends BaseClass {
	
	public void enter_the_email() throws InterruptedException {
		WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
		explicitWait(Useremail,20);
		Thread.sleep(6000);
		Useremail.sendKeys(prop.getProperty("username"));
		Thread.sleep(6000);
			
		} 
			
	public void enter_the_password() throws InterruptedException {
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		explicitWait(Password,20);
		Password.sendKeys(prop.getProperty("password"));
		Thread.sleep(4000);

		}
	public void click_on_the_login_button() throws InterruptedException {
			WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
			Login.click();
			Thread.sleep(3000);
			
			   }
		
	public void select_test_community_dropdown() throws InterruptedException {
			WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
			Dropdown.sendKeys("Test Community");
			Thread.sleep(4000);
			
		}
		
	public void click_on_the_continue() {
			WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		Continue.click();
		}
	
	public void click_on_the_manage_window() throws InterruptedException {
		WebElement manage=driver.findElement(By.linkText("Manage"));
		Thread.sleep(3000);
		manage.click();
	}
	
public void click_on_the_table() throws InterruptedException {
	 WebElement editNotes = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
     editNotes.click();
     Thread.sleep(6000);
     
	}

public void edit_the_note() throws InterruptedException {
	WebElement txtUpdateNote = driver.findElement(By.id("note"));
    txtUpdateNote.clear();
    //txtUpdateNote.click();
    txtUpdateNote.sendKeys("Data editable");
    txtUpdateNote.click();
   // JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[0].click()",txtUpdateNote);
    Thread.sleep(6000);
}

public void edit_the_communities() throws InterruptedException {
	try {
	 WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
	    community.clear();
	    Thread.sleep(4000);
	    community.sendKeys("New England Club");
	    community.click();
	    Thread.sleep(6000);
	}
	catch (Exception e) {}
}


public void edit_the_start_date() throws InterruptedException {
	WebElement UpdateStartdate = driver.findElement(By.id("startdate"));
	UpdateStartdate.clear();
	Thread.sleep(3000);
	UpdateStartdate.sendKeys("6/25/2023");
	Thread.sleep(6000);
}
     
public void edit_the_end_date() throws InterruptedException {
	   WebElement EditEnddate = driver.findElement(By.id("enddate"));
       EditEnddate.clear();
       EditEnddate.sendKeys("7/28/2023");
       Thread.sleep(6000);
       
    
}
public void click_on_the_save_button() throws InterruptedException {
	WebElement savebtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	savebtn.click();
	Thread.sleep(6000);
    
}

    
	
}



