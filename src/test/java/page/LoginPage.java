package page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import static org.junit.Assert.assertEquals;

public class LoginPage extends BaseClass {
		
	public void Verify_that_user_enter_the_Email_and_Password(String email, String pass){
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		Useremail.sendKeys(email);
	
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Password= wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys(pass);
	}
	
	
	public void click_on_the_login_button() throws InterruptedException {
		WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		Login.click();
		Thread.sleep(3000);
		   
	}
	
	public void Verify_the_Dropdown_and_select_the_Test_Community() throws InterruptedException{
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		Thread.sleep(3000);
	}

	public void Verify_the_Continue_Button() throws InterruptedException {
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	Thread.sleep(3000);
	Continue.click();
	Thread.sleep(8000);
	}
	
	
	public void Home_page_should_be_shown() {
	String expectedResult= "Home";
	String actualResult= driver.findElement(By.xpath("//span[normalize-space()='Home']")).getText();
	assertEquals("Home Page Should be Shown",expectedResult,actualResult);
		
	}
	
	public void user_click_on_the_account_user_name() throws InterruptedException {
		WebElement AccountUserName=	driver.findElement(By.xpath("//span[@class='account-user-name']"));
		AccountUserName.click();
		Thread.sleep(5000);
		
	}

	public void click_on_the_logout_button() throws InterruptedException {
		WebElement logout=	driver.findElement(By.xpath("(//span[normalize-space()='Logout'])[1]"));
		logout.click();
		Thread.sleep(5000);
	
}
	
public void Sign_In_Page_should_be_shown() {
		
	String expectedResult= "Sign In";
	String actualResult= driver.findElement(By.xpath("(//h4[normalize-space()='Sign In'])[1]")).getText();
	assertEquals("Sign In Page Should be Shown",expectedResult,actualResult);
		
	}

	    
	}

