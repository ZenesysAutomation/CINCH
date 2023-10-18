package page;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.netty.handler.timeout.TimeoutException;

import static org.junit.Assert.assertEquals;

public class LoginPage extends BaseClass {
		
	public void Verify_that_user_enter_the_Email_and_Password(String email, String pass){
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		Useremail.sendKeys(email);
		
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement Password= wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
		Password.sendKeys(pass);
		
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
		
	public void Verify_the_Dropdown_and_select_the_Test_Community() throws InterruptedException{
		try {
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void Verify_the_Continue_Button() throws InterruptedException {
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
	
	public void Home_page_should_be_shown() {
	try {
	String expectedResult= "Home";
	String actualResult= driver.findElement(By.xpath("//span[normalize-space()='Home']")).getText();
	assertEquals("Home Page Should be Shown",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
	

	public void user_click_on_the_account_user_name() throws InterruptedException {
		
		By errorElementLocator = By.xpath("//*[contains(text(), 'An unhandled error has occurred.')]");
		 handleExceptionAndReloadPage(driver, errorElementLocator);
		 
	try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement AccountUserName=	driver.findElement(By.xpath("//span[@class='account-user-name']"));
		 wait.until(ExpectedConditions.elementToBeClickable(AccountUserName));
		 AccountUserName.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		 
		 
	}
		public void click_on_the_logout_button() throws InterruptedException {
			
		By errorElementLocator = By.xpath("//*[contains(text(), 'An unhandled error has occurred.')]");
		handleExceptionAndReloadPage(driver, errorElementLocator);
		
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement logout=driver.findElement(By.xpath("(//span[normalize-space()='Logout'])[1]"));
		 wait.until(ExpectedConditions.elementToBeClickable(logout));
		 logout.click();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		public void Sign_In_Page_should_be_shown() {
	
			By errorElementLocator = By.xpath("//*[contains(text(), 'An unhandled error has occurred.')]");
			handleExceptionAndReloadPage(driver, errorElementLocator);
			
		try {
			String expectedResult= "Sign In";
			String actualResult= driver.findElement(By.xpath("//h4[normalize-space()='Sign In']")).getText();
			assertEquals("Sign In Page Should be Shown",expectedResult,actualResult);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		}
		
		public void User_Enter_the_Email_and_Password(String email, String pass) {
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
				Useremail.sendKeys(email);
				
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement Password= wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
				Password.sendKeys(pass);
				
				}
				catch (TimeoutException e ) {
					 e.printStackTrace();
			}
			
		}
		
		public void Click_on_the_login_button() {
			try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
			 wait.until(ExpectedConditions.elementToBeClickable(Login));
			 Login.click();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public void Error_message_is_Displayed(String err) {
			try {
			String Expectedresult = "Invalid Login - Invalid username and or password.";
			String Actualresult=driver.findElement(By.xpath("(//div[@role='alert'])[1]")).getText();
			assertEquals("error message showing",Expectedresult,Actualresult);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public void the_user_submits_blank_email_and_invalid_password(String email,String pass) {
				try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
				WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
				Useremail.clear();
				Useremail.sendKeys(email);
				
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
				WebElement Password= wait2.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
				Password.sendKeys(pass);
				
				}
				catch (TimeoutException e ) {
					 e.printStackTrace();
			}
			
		}
		
		public void the_user_click_on_the_login_button() {
			try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			 WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
			 wait.until(ExpectedConditions.elementToBeClickable(Login));
			 Login.click();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		public void the_user_should_see_an_error_message(String err) {
			try {
			String Expectedresult = "The Logon field is required.";
			String Actualresult=driver.findElement(By.xpath("(//li[normalize-space()='The Logon field is required.'])[1]")).getText();
			assertEquals("error message is showing",Expectedresult,Actualresult);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
				
		}
		
	}

