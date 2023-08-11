package page;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.netty.handler.timeout.TimeoutException;

public class EditCommunityNotePage extends BaseClass {
	
	public void enter_the_email() throws InterruptedException {
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		 Useremail.sendKeys(prop.getProperty("username"));
		}
		catch (TimeoutException e ) {
			 e.printStackTrace();
		
	}
		} 
			
	public void enter_the_password() throws InterruptedException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys(prop.getProperty("password"));
		}
		catch (TimeoutException e ) {
			 e.printStackTrace();
		
	}
	}
		
	public void click_on_the_login_button() throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		 wait.until(ExpectedConditions.elementToBeClickable(Login));
		 Login.click();
		 
	}
		
	public void select_test_community_dropdown() throws InterruptedException {
			WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
			Dropdown.sendKeys("Test Community");
			Thread.sleep(4000);
			
		}
		
	public void click_on_the_continue() {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
		 wait.until(ExpectedConditions.elementToBeClickable(Continue));
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
    txtUpdateNote.sendKeys("Data editable");
    txtUpdateNote.click();
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
	
	Random random = new Random();
	LocalDateTime targetDate = LocalDateTime.now().plusDays(random.nextInt(20));
    String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

    WebElement endDateField = driver.findElement(By.id("startdate"));
    endDateField.click();

    for (int i = 1; i <= 10; i++) {
        endDateField.sendKeys(Keys.BACK_SPACE);
    }
    
   endDateField.sendKeys(targetDateString);
   Thread.sleep(6000);
			
}
     
public void edit_the_end_date() throws InterruptedException {

	Random random = new Random();
	LocalDateTime targetDate = LocalDateTime.now().plusDays(random.nextInt(50));
    String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

    WebElement endDateField = driver.findElement(By.xpath("//input[@id='enddate']"));
    endDateField.click();

    for (int i = 1; i <= 10; i++) {
        endDateField.sendKeys(Keys.BACK_SPACE);
    }
    
   endDateField.sendKeys(targetDateString);
   Thread.sleep(6000);
			
}
       
public void click_on_the_save_button() throws InterruptedException {
	WebElement savebtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	savebtn.click();
	Thread.sleep(6000);
    
}

    
	
}



