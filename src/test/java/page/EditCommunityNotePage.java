package page;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ScreenRecorder.MyScreenRecording;
import base.BaseClass;
import io.netty.handler.timeout.TimeoutException;

public class EditCommunityNotePage extends BaseClass {
	
	public void enter_the_email() throws Exception {
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		 Useremail.sendKeys(prop.getProperty("username"));
		}
		catch (TimeoutException e ) {
			 e.printStackTrace();
		
	}
		MyScreenRecording.startRecording("Edit Community Note");
		
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
		
	public void select_test_community_dropdown() throws InterruptedException {
		try {
			WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
			Dropdown.sendKeys("Test Community");
			Thread.sleep(4000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
		}
		
	public void click_on_the_continue() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
		 wait.until(ExpectedConditions.elementToBeClickable(Continue));
		 Continue.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
	
	
	public void click_on_the_manage_window() throws InterruptedException {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement manage=driver.findElement(By.linkText("Manage"));
			wait.until(ExpectedConditions.elementToBeClickable(manage));
			manage.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		    
		}
		
	
	public void click_on_the_table() throws InterruptedException {
	try {
	 WebElement editNotes = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
     editNotes.click();
     Thread.sleep(6000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
     
	}

public void edit_the_note() throws InterruptedException {
	try {
	WebElement txtUpdateNote = driver.findElement(By.id("note"));
    txtUpdateNote.clear();
    txtUpdateNote.sendKeys(prop.getProperty("EditNote"));
    txtUpdateNote.click();
    Thread.sleep(6000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
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
	catch (Exception e) {
		e.printStackTrace();
	}
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
       
public void click_on_the_save_button() throws Exception {
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement savebtn=driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		wait.until(ExpectedConditions.elementToBeClickable(savebtn));
		savebtn.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	MyScreenRecording.stopRecording();
	    
	}
	  

public void when_attempting_to_edit_a_community_note_with_an_empty_note_field() {
	try {
		WebElement txtUpdateNote = driver.findElement(By.id("note"));
	    txtUpdateNote.clear();
	    txtUpdateNote.sendKeys(prop.getProperty(""));
	    txtUpdateNote.click();
	    Thread.sleep(6000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	

public void save_the_community_note() {
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement savebtn=driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
		wait.until(ExpectedConditions.elementToBeClickable(savebtn));
		Thread.sleep(4000);
		savebtn.click();
		
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}

public void error_message_is_displyed_the_note_field_is_required() {
	try {
		String Expectedresult = "The Note field is required.";
		String Actualresult=driver.findElement(By.xpath("//div[@class='validation-message']")).getText();
		assertEquals("error message is showing",Expectedresult,Actualresult);
		}
		catch (Exception e) {
			e.printStackTrace();
	}
}

}


    
	




