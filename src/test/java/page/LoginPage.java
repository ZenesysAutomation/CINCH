package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class LoginPage extends BaseClass {
		
	public void Verify_that_user_enter_the_Email_and_Password(String email, String pass){
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		
		explicitWait(Username,20);
		Username.sendKeys(email);
	
	   
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		explicitWait(Password,20);
		Password.sendKeys(pass);
		
	}
	
	
	public void click_on_the_login_button() {
		WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		Login.click();
		   
	}
	
	public void Verify_the_Dropdown_and_select_the_Test_Community(){
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		
	}

	public void Verify_the_Continue_Button() {
		WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
		Continue.click();
		
	}
	    
	}

