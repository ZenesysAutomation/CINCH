package page;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class AddClientPage extends BaseClass {
	
public void user_enter_the_valid_email() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
	 Useremail.sendKeys(prop.getProperty("username"));
		    
}
	
public void user_enter_the_valid_password() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
	Password.sendKeys(prop.getProperty("password"));
	
}

public void user_click_on_the_login() throws InterruptedException {
	WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	Login.click();
	Thread.sleep(3000);
		   
}
public void user_select_the_test_community() {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	   
}

public void user_click_on_the_continue() throws InterruptedException {
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
			Thread.sleep(3000);
			Continue.click();   
}
public void user_click_on_the_clients_button() {
	WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
	Clientbtn.click();
	explicitWait(Clientbtn,20);
		   
}
public void user_click_on_the_add_new_client() throws InterruptedException {
	WebElement Addnewclnt=driver.findElement(By.xpath("(//a[normalize-space()='Add New Client'])[1]"));
	Addnewclnt.click();
	Thread.sleep(4000);
}

public void user_enter_the_first_name() {
	WebElement FName=driver.findElement(By.xpath("//input[@id='firstname']"));
	FName.sendKeys("Automation");
	explicitWait(FName,15);
}

public void user_enter_the_last_name() {
   WebElement LName= driver.findElement(By.xpath("//input[@id='lastname']"));
   LName.sendKeys("Testing");
   explicitWait(LName,15);
}

public void user_enter_the_address_line1() {
	 WebElement Addline1=  driver.findElement(By.xpath("//input[@id='address1']"));
	 Addline1.sendKeys("California Hotel House");
	 explicitWait( Addline1,15);
}

public void user_enter_the_address_line2() {
	WebElement Addline2=  driver.findElement(By.xpath("//input[@id='address2']"));
	 Addline2.sendKeys("USA");
	 explicitWait( Addline2,15);
}

public void user_enter_the_resident_id() {
	WebElement ResID=  driver.findElement(By.xpath("//input[@id='residentid']"));
	ResID.sendKeys("244306"); 
	explicitWait( ResID,15);
}

public void user_enter_the_city() throws InterruptedException {
	WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
	City.clear();
	Thread.sleep(2000);
	City.sendKeys("Washington");
	explicitWait( City,10);
	
}
public void user_select_the_state() {
   WebElement State= driver.findElement(By.xpath("//span[@aria-owns='state_options']"));
   State.sendKeys("California");
   explicitWait( State,15);
}

public void user_enter_the_zip_code() {
    WebElement ZipCode=driver.findElement(By.xpath("//input[@id='zip']"));
    ZipCode.sendKeys("110096");
    explicitWait( ZipCode,15);
}

public void user_enter_the_primary_phone() throws InterruptedException {
	  WebElement PrimaryPh= driver.findElement(By.xpath("//input[@id='client-primary-phone']"));
	  Thread.sleep(3000);
	  PrimaryPh.click();
//	  JavascriptExecutor jse = (JavascriptExecutor)driver;
//	   jse.executeScript("arguments[0].value='(222)222-2222';",PrimaryPh);
	  PrimaryPh.sendKeys("9805465639");
	}


public void user_enter_the_secondary_phone() throws InterruptedException {
	WebElement SecondryPh= driver.findElement(By.xpath("//input[@id='client-secondary-phone']"));
	 Thread.sleep(3000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].value='(287)222-2202';",SecondryPh);
	 explicitWait(SecondryPh,15);
}
public void user_enter_the_email() throws InterruptedException {
	WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("Testing123@yopmail.com");
	explicitWait( Email,15);
	
	
}

public void click_the_gender() throws InterruptedException {
  WebElement Gender=  driver.findElement(By.xpath("//span[@aria-owns='gender_options']"));
  Thread.sleep(2000);
  Gender.click();
  Gender.sendKeys("Male");	
		
}
public void user_select_the_birth_date() throws InterruptedException {
	WebElement DOB=driver.findElement(By.xpath("//input[@id='birthdate']"));
    DOB.sendKeys("11/6/1998");
    explicitWait( DOB,15);

	
}

public void user_enter_the_marital_status() {
	WebElement Maritalsts=driver.findElement(By.xpath("//input[@id='marital-status']"));
	Maritalsts.sendKeys("No");
}

public void then_user_enter_the_spouse_name() {
	WebElement SpouseName=driver.findElement(By.xpath("//input[@id='spouse']"));
	SpouseName.sendKeys("xyz");
}

public void user_enter_the_referral_source() {
	WebElement RefSource=driver.findElement(By.xpath("//input[@id='referral']"));
	RefSource.sendKeys("None");
}

public void user_enter_the_essential_information() {
  WebElement EssentialInfo=  driver.findElement(By.xpath("//textarea[@id='essential']"));
  EssentialInfo.sendKeys("its for testing usage");
  explicitWait( EssentialInfo,15);
}

public void user_select_the_client_type() throws InterruptedException {
	try {
	WebElement ddlClienttypeBtn = driver.findElement(By.id("clientype"));
    ddlClienttypeBtn.sendKeys("Nursing Services");
    Thread.sleep(2000);
    WebElement ddlClienttydpeBtn = driver.findElement(By.xpath("//*[@id=\"clientype_popup\"]/div/ul/li[2]"));
    ddlClienttydpeBtn.click();
    Thread.sleep(3000);
	}
	catch (Exception e) {}
	   
}

public void user_select_the_schedule_group() throws InterruptedException {

	
	WebElement ScheduleGroupBtn = driver.findElement(By.xpath("//span[contains(@aria-owns,'scheduleGroup_options')]"));
	ScheduleGroupBtn.click();
    ScheduleGroupBtn.sendKeys("East Wing");
    ScheduleGroupBtn.click();
 
    Thread.sleep(5000);		

}

public void user_select_the_status() throws InterruptedException {
	try {
	WebElement Status=driver.findElement(By.xpath("//span[contains(@aria-owns,'scheduleGroup_options')]"));
	Status.click();
	Thread.sleep(3000);
	Status.sendKeys("Active");
	}
	catch (Exception e) {}
	
}

public void user_select_the_track() throws InterruptedException {

	  WebElement TrackBtn = driver.findElement(By.xpath("//input[@placeholder=\"Select a Track\"]"));
      Thread.sleep(2000);
      TrackBtn.sendKeys("East 2");
      WebElement Trackbtn2 = driver.findElement(By.xpath("//*[@id=\"clientype_popup\"]/div/ul/li[2]"));
      Trackbtn2.click();
      Thread.sleep(2000);
	      
}

public void select_the_service_type() throws InterruptedException {
	try {
	  WebElement Servicetype = driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[7]"));
	  Servicetype.click();
	  Servicetype.sendKeys("Community");
	  Servicetype.click();
	  Thread.sleep(3000);
	}
	catch (Exception e) {}
}

public void verify_that_add_new_contact_button() throws InterruptedException {
	WebElement contactbtn=driver.findElement(By.xpath("//a[normalize-space()='Add New Contact']"));
	Thread.sleep(3000);
	contactbtn.click();
	Thread.sleep(3000);
	
	    
}
public void verify_the_first_name() throws InterruptedException {
	WebElement Fname=driver.findElement(By.xpath("//input[@id='first-contact']"));
	Fname.sendKeys("Automation ");
	Thread.sleep(3000);
}
public void verify_the_last_name() {
	WebElement Lname=driver.findElement(By.xpath("//input[@id='last-contact']"));
	Lname.sendKeys("Selenium");
	   
}

public void verify_the_address_line1() {
	WebElement Addressline1=driver.findElement(By.cssSelector("#address1-contact"));
	Addressline1.sendKeys("California");
	   
}

public void verify_the_address_line2() {
   WebElement Addressline2= driver.findElement(By.xpath("//input[@id='address2-contact']"));
   Addressline2.sendKeys("USA");
}

public void verify_the_city() throws InterruptedException {
	WebElement City=driver.findElement(By.xpath("//input[@id='city-contact']"));
	Thread.sleep(3000);
	City.sendKeys("California");
	   
}
public void verify_the_state_dropdown() throws InterruptedException {
	WebElement stateDropdown= driver.findElement(By.xpath("//span[@aria-owns='state-contact_options']"));
	Thread.sleep(3000);
	stateDropdown.sendKeys("Arizona");
}
public void verify_the_zip_code() throws InterruptedException {
	WebElement zipCode=driver.findElement(By.xpath("//input[@id='zip-contact']"));
	Thread.sleep(3000);
	zipCode.sendKeys("183090");
}
public void verify_the_primary_phone_number() throws InterruptedException {
   WebElement primaryphnumber = driver.findElement(By.xpath("//input[@id='primary-phone-contact']"));  
   Thread.sleep(3000);
   primaryphnumber.click();
   primaryphnumber.sendKeys("9086568990");
  
}

public void verify_the_email() throws InterruptedException {
	WebElement email=driver.findElement(By.xpath("//input[@id='email-contact']"));
	Thread.sleep(5000);
	email.sendKeys("testing1234@gmail.com");
    
}
public void select_the_relationship() throws InterruptedException {

	WebElement ClientTypeBtn = driver.findElement(By.id("relationship-contact"));
    ClientTypeBtn.sendKeys("Daughter-In-Law");
    Thread.sleep(3000);
       
}
public void save_the_new_contact_details()throws InterruptedException {
	WebElement Savebtn1=driver.findElement(By.xpath("//button[@id='ClientContactSave']"));
	Thread.sleep(6000);
	/*JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()", Savebtn1);*/
	Savebtn1.click();
	Thread.sleep(4000);
	
		
}
 public void save_the_new_client_details() throws InterruptedException {
	
    WebElement Savebtn=driver.findElement(By.xpath("//button[@id='ClientSave']"));
   Thread.sleep(10000);
    /*JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()", Savebtn);*/
   	Savebtn.click();
    Thread.sleep(10000);    
}
 
 public void client_was_created_message_should_be_shown() {
	 	String expectedResult= "client was created";
		String actualResult= driver.findElement(By.xpath("")).getText();
		assertEquals("client was created",expectedResult,actualResult);
		
	}
}