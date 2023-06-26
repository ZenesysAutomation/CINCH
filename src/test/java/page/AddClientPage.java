package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;


import base.BaseClass;

public class AddClientPage extends BaseClass {
	
public void user_enter_the_valid_email() {
	WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
	explicitWait(Useremail,20);
	Useremail.sendKeys("anoop.kumar@zenesys.com");
		    
}
	
public void user_enter_the_valid_password() {
	
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	explicitWait(Password,20);
	Password.sendKeys("Testing@123");
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

public void user_enter_the_city() {
	WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
	City.sendKeys("Washington");
	explicitWait( City,15);
	
}
public void user_select_the_state() {
   WebElement State= driver.findElement(By.xpath("//span[@aria-owns='state_options']"));
   State.sendKeys("California");
   explicitWait( State,15);
}

public void user_enter_the_zip_code() {
    WebElement ZipCode=driver.findElement(By.xpath("//input[@id='zip']"));
    ZipCode.sendKeys("12345");
    explicitWait( ZipCode,15);
}

public void user_enter_the_primary_phone() throws InterruptedException {
	  WebElement PrimaryPh= driver.findElement(By.xpath("//input[@id='client-primary-phone']"));
	  Thread.sleep(3000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	   jse.executeScript("arguments[0].value='(222)222-2222';",PrimaryPh);
	}


public void user_enter_the_secondary_phone() throws InterruptedException {
	WebElement SecondryPh= driver.findElement(By.xpath("//input[@id='client-secondary-phone']"));
	 Thread.sleep(3000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].value='(287)222-2202';",SecondryPh);
	 explicitWait(SecondryPh,15);
}
public void user_enter_the_email() {
	WebElement Email=driver.findElement(By.xpath("//input[@id='email']"));
	Email.sendKeys("Testing123@yopmail.com");
	explicitWait( Email,15);
}

public void click_the_gender() throws InterruptedException {
//  WebElement Gender=  driver.findElement(By.xpath("//span[@aria-owns='gender_options']"));
//  Thread.sleep(2000);
//  Gender.sendKeys("Male");	
	
	WebElement select = driver.findElement(By.xpath("//span[@aria-owns='gender_options']"));
	List<WebElement> options = select.findElements(By.tagName("span"));
	for (WebElement option : options) {
	   if("Male".equals(option.getText()))
	       option.click();   
	}	
	
}
public void user_select_the_birth_date() {
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
	WebElement ddlClienttypeBtn = driver.findElement(By.id("clientype"));
    ddlClienttypeBtn.sendKeys("Nursing Services");
    Thread.sleep(2000);
    WebElement ddlClienttydpeBtn = driver.findElement(By.xpath("//*[@id=\"clientype_popup\"]/div/ul/li[2]"));
    ddlClienttydpeBtn.click();
    Thread.sleep(2000);
	   
}

public void user_select_the_schedule_group() throws InterruptedException {
;
	
	WebElement ScheduleGroupBtn = driver.findElement(By.id("scheduleGroup"));
    Thread.sleep(3000);
    ScheduleGroupBtn.sendKeys("East Wing");
    WebElement ScheduleGroupBtn2 = driver.findElement(By.xpath("//*[@id=\"scheduleGroup_popup\"]/div/ul/li[1]"));
    ScheduleGroupBtn2.click();
    Thread.sleep(2000);		

}

public void user_select_the_status() throws InterruptedException {
	WebElement Status=driver.findElement(By.xpath("//span[contains(@aria-owns,'scheduleGroup_options')]"));
	Status.click();
	Thread.sleep(3000);
	Status.sendKeys("Active");
	
}

public void user_select_the_track() throws InterruptedException {
//	  WebElement TrackBtn1 = driver.findElement(By.cssSelector(".e-ddl.e-lib.e-input-group.e-control-container.e-control-wrapper.e-success.e-valid-input.modified.valid[aria-live='assertive'][aria-haspopup='true'][aria-activedescendant='null'][aria-owns='clientype_options']"));
//	  TrackBtn1.sendKeys("East 1");
//	  Thread.sleep(2000);
	 
	  WebElement TrackBtn = driver.findElement(By.xpath("//input[@placeholder=\"Select a Track\"]"));
      Thread.sleep(2000);
      TrackBtn.sendKeys("East 2");
      WebElement Trackbtn2 = driver.findElement(By.xpath("//*[@id=\"clientype_popup\"]/div/ul/li[2]"));
      Trackbtn2.click();
      Thread.sleep(2000);
	      
}

public void verify_that_add_new_contact_button() throws InterruptedException {
	WebElement contactbtn=driver.findElement(By.xpath("//a[normalize-space()='Add New Contact']"));
	Thread.sleep(3000);
	contactbtn.click();
	
	
	    
}
public void verify_the_first_name() throws InterruptedException {
	WebElement Fname=driver.findElement(By.xpath("//input[@id='first-contact']"));
	Fname.sendKeys("Automation Testing");
	Thread.sleep(3000);
}
public void verify_the_last_name() {
	WebElement Lname=driver.findElement(By.xpath("//input[@id='last-contact']"));
	Lname.sendKeys("Framework");
	   
}

public void verify_the_address_line1() {
	WebElement Addressline1=driver.findElement(By.cssSelector("#address1-contact"));
	Addressline1.sendKeys("USA");
	   
}

public void verify_the_address_line2() {
   WebElement Addressline2= driver.findElement(By.xpath("//input[@id='address2-contact']"));
   Addressline2.sendKeys("UK");
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
   Thread.sleep(2000);
   JavascriptExecutor jse = (JavascriptExecutor)driver;
   jse.executeScript("arguments[0].value='(222)222-2222';", primaryphnumber);
}

public void verify_the_email() throws InterruptedException {
	WebElement email=driver.findElement(By.xpath("//input[@id='email-contact']"));
	Thread.sleep(3000);
	email.sendKeys("testing123@yopmail.cpm");
    
}
public void select_the_relationship() throws InterruptedException {
	WebElement Relationship=driver.findElement(By.xpath("//span[@aria-owns='relationship-contact_options']"));
	Relationship.sendKeys("Daughter");
	Thread.sleep(3000);
	Relationship.click();
    
}
public void click_on_the_save_button() {
	WebElement Savebtn=driver.findElement(By.xpath("//button[@id='ClientContactSave']"));
	Savebtn.click();
}
public void user_click_on_the_save() throws InterruptedException {
	
    WebElement Savebtn=driver.findElement(By.xpath("//button[@id='ClientSave']"));
    Thread.sleep(3000);
    JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click()", Savebtn);

}

}