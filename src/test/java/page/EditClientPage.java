package page;

import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;
import io.netty.handler.timeout.TimeoutException;

public class EditClientPage extends BaseClass{

public void check_the_user_email() throws InterruptedException {
	
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
	 Useremail.sendKeys(prop.getProperty("username"));
	}
	catch (TimeoutException e ) {
		 e.printStackTrace();
	
}

}

public void check_the_user_password() throws InterruptedException {
	
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
	Password.sendKeys(prop.getProperty("password"));
	}
	catch (TimeoutException e ) {
		 e.printStackTrace();
	
}
}

public void check_the_login_button() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	 wait.until(ExpectedConditions.elementToBeClickable(Login));
	 Login.click();
}

public void check_the_test_community_dropdown() throws InterruptedException {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	Thread.sleep(3000);
}

public void click_on_the_continue_button() throws InterruptedException {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	wait.until(ExpectedConditions.elementToBeClickable(Continue));
	Continue.click();
	}

public void click_on_the_clients() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
	 wait.until(ExpectedConditions.elementToBeClickable(Clientbtn));
	 Clientbtn.click();
			   
}
public void click_on_the_user_table() throws InterruptedException {
	
//	WebElement EditTable=driver.findElement(By.xpath("//td[@aria-label='Agnes Column Header First Name']"));
//	Thread.sleep(8000);
//	JavascriptExecutor js = (JavascriptExecutor)driver;
//	js.executeScript("arguments[0].click()", EditTable);
//	Thread.sleep(10000);
//	}
//	
	
	List<WebElement> table=driver.findElements(By.className("e-row"));
	Random random= new Random();
	int randomValue=random.nextInt(table.size());
	Thread.sleep(8000);
	WebElement exactRow=(WebElement) table.toArray()[randomValue];
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	Thread.sleep(8000);
	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", exactRow);
	try {
    	for(int i=1;i<=100;i++) {
    		if (!exactRow.isDisplayed()) {
    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", exactRow);
            }
    	}
    	exactRow.click();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
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
	Thread.sleep(3000);
	Discharged.sendKeys("Discharged");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click()",Discharged);
	Thread.sleep(3000);
	
}

	public void enter_the_discharge_reason() throws InterruptedException {
	
	   WebElement DischargeReason=driver.findElement(By.xpath("(//span[@aria-owns='discharge-reason_options'])[1]"));
		
	   Thread.sleep(3000);
	   DischargeReason.click();
	   DischargeReason.sendKeys("Moved out of area");
	   DischargeReason.click();
       Thread.sleep(5000);
}

	public void save_the_data() throws InterruptedException {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement SaveData=driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	 wait.until(ExpectedConditions.elementToBeClickable(SaveData));
	 SaveData.click();
}


}
