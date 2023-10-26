package page;

import static org.junit.Assert.assertEquals;
import java.time.Duration;
import java.time.LocalDate;
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


public class AddCommunityNotePage extends BaseClass {
	
	
	public void user_enters_email() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		 Useremail.sendKeys(prop.getProperty("username"));
		}
		 catch (TimeoutException e ) {
			 e.printStackTrace();
				
	}
	}
			
	public void user_enters_password() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys(prop.getProperty("password"));
		}
		catch (TimeoutException e ) {
			 e.printStackTrace();
		
	}
	}

	public void Click_on_the_login() throws InterruptedException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		 WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		 wait.until(ExpectedConditions.elementToBeClickable(Login));
		 Login.click();
		}
		catch (TimeoutException e) {
			 System.out.println("Login button was not clickable within 20 seconds.");
		}
	}
	
	
	public void select_the_test_community() throws InterruptedException {
		try {
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		Thread.sleep(3000);
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
		}


	public void click_on_the_manage() throws InterruptedException {
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

	public void click_on_the_add_new_community_note() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement AddcomNote=driver.findElement(By.xpath("//a[normalize-space()='Add New Community Note']"));
	wait.until(ExpectedConditions.elementToBeClickable(AddcomNote));
	AddcomNote.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	    
}

	public void enter_the_note() throws InterruptedException {
	try {
	WebElement note=driver.findElement(By.xpath("//textarea[@id='note']"));
	note.sendKeys(prop.getProperty("note"));
	Thread.sleep(2000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
    
}

	public void select_communities() throws InterruptedException {
	try {
	WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
    community.click();
    community.sendKeys("New England Club");
    
	}
	catch (Exception e) {
		e.printStackTrace();
	}	   
}

	public void choose_a_start_date() throws InterruptedException {
		try {	
	WebElement startDateField = driver.findElement(By.xpath("//input[@id='startdate']"));
	  LocalDate currentDate = LocalDate.now();
	  String formattedDate = currentDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
	  startDateField.sendKeys(formattedDate);
	  Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}

	public void choose_a_end_date() throws InterruptedException {
	
	LocalDateTime targetDate = LocalDateTime.now().plusDays(generateRandomNumber(2,100));
    String targetDateString = targetDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));

    WebElement endDateField = driver.findElement(By.xpath("//input[@id='enddate']"));
    endDateField.click();

    for (int i = 1; i <= 10; i++) {
        endDateField.sendKeys(Keys.BACK_SPACE);
    }
    
   endDateField.sendKeys(targetDateString);
   Thread.sleep(6000);
			
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
	
	public void click_on_the_save_button() throws InterruptedException {
		try {
	WebElement savebtn=driver.findElement(By.cssSelector("button[type='submit']"));
	savebtn.click();
    Thread.sleep(5000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}
	
	public void community_note_was_created_message_should_be_shown() {
	try {
	String expectedResult= "Community Note was created.";
	String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
	assertEquals("Community note",expectedResult,actualResult);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
	}

}
