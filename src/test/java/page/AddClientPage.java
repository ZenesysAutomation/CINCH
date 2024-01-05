package page;
import static org.junit.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ScreenRecorder.MyScreenRecording;
import base.BaseClass;
import io.netty.handler.timeout.TimeoutException;



public class AddClientPage extends BaseClass {
	
public void user_enter_the_valid_email() throws Exception {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
	 Useremail.sendKeys(prop.getProperty("username"));
	}
	catch (TimeoutException e ) {
		 e.printStackTrace();

	}
	MyScreenRecording.startRecording("Add Client");
}
		   
	
public void user_enter_the_valid_password() {
	try {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
	Password.sendKeys(prop.getProperty("password"));
	
	}
	catch (TimeoutException e ) {
		 e.printStackTrace();	

	}
}

public void user_click_on_the_login() throws InterruptedException {
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

public void user_select_the_test_community() throws InterruptedException {
	try {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	Thread.sleep(2000);
	}
	catch (TimeoutException e) {
		e.printStackTrace();
	}	   
}

public void user_click_on_the_continue() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	wait.until(ExpectedConditions.elementToBeClickable(Continue));
	Continue.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

public void user_click_on_the_clients_button() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
	wait.until(ExpectedConditions.elementToBeClickable(Clientbtn));
	Clientbtn.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}		   
}
public void user_click_on_the_add_new_client() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	WebElement Addnewclnt=driver.findElement(By.xpath("(//a[normalize-space()='Add New Client'])[1]"));
	wait.until(ExpectedConditions.elementToBeClickable(Addnewclnt));
	Addnewclnt.click();
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
}

public void user_enter_the_first_name() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  FName = driver.findElement(By.xpath("//input[@id='firstname']"));
	wait.until(ExpectedConditions.visibilityOf(FName));
	FName.sendKeys(prop.getProperty("FirstName"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_last_name() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  LName = driver.findElement(By.xpath("//input[@id='lastname']"));
	wait.until(ExpectedConditions.visibilityOf(LName));
	LName.sendKeys(prop.getProperty("LastName"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_address_line1() { 
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  Addline1 = driver.findElement(By.xpath("//input[@id='address1']"));
	wait.until(ExpectedConditions.visibilityOf(Addline1));
	Addline1.sendKeys(prop.getProperty("AddressLine1"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_address_line2() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  Addline2 = driver.findElement(By.xpath("//input[@id='address2']"));
	wait.until(ExpectedConditions.visibilityOf(Addline2));
	Addline2.sendKeys(prop.getProperty("AddressLine2"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_resident_id() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  ResID = driver.findElement(By.xpath("//input[@id='residentid']"));
	wait.until(ExpectedConditions.visibilityOf(ResID));
	ResID.sendKeys(prop.getProperty("ResidentID"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_city() throws InterruptedException {
	try {
	WebElement City=driver.findElement(By.xpath("//input[@id='city']"));
	City.clear();
	Thread.sleep(2000);
	City.sendKeys("Washington");
	explicitWait( City,10);
	}
	catch (Exception e){
		e.printStackTrace();
	}	
}
public void user_select_the_state() {
	try {
   WebElement State= driver.findElement(By.xpath("//span[@aria-owns='state_options']"));
   State.sendKeys("California");
   explicitWait(State,15);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_zip_code() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  ZipCode = driver.findElement(By.xpath("//input[@id='zip']"));
	wait.until(ExpectedConditions.visibilityOf(ZipCode));
	ZipCode.clear();
	ZipCode.sendKeys(prop.getProperty("ZipCode"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}		
}

public void user_enter_the_primary_phone() throws InterruptedException {
	try {
	  WebElement PrimaryPh= driver.findElement(By.xpath("//input[@id='client-primary-phone']"));
	  Thread.sleep(3000);
	  PrimaryPh.click();
	  PrimaryPh.sendKeys(prop.getProperty("PrimaryPhone"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}

public void user_enter_the_secondary_phone() throws InterruptedException {
	try {
	WebElement SecondryPh= driver.findElement(By.xpath("//input[@id='client-secondary-phone']"));
	 Thread.sleep(3000);
	 JavascriptExecutor jse = (JavascriptExecutor)driver;
	 jse.executeScript("arguments[0].value='(287)222-2202';",SecondryPh);
	 explicitWait(SecondryPh,15);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void user_enter_the_email() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  Email = driver.findElement(By.xpath("//input[@id='email']"));
	wait.until(ExpectedConditions.visibilityOf(Email));
	Email.sendKeys(prop.getProperty("Email"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}		
}

public void click_the_gender() throws InterruptedException {
	try {
  WebElement Gender=  driver.findElement(By.xpath("//span[@aria-owns='gender_options']"));
  Thread.sleep(2000);
  Gender.click();
  Gender.sendKeys("Male");	
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
}

public void user_select_the_birth_date() throws InterruptedException {
	try {
	    WebElement DOB = driver.findElement(By.xpath("//input[@id='birthdate']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(DOB));
	    DOB.sendKeys(prop.getProperty("Birthdate"));
	} catch (Exception e) {
	    e.printStackTrace();
	}	
}

public void user_enter_the_marital_status() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  Maritalsts = driver.findElement(By.xpath("//input[@id='marital-status']"));
	wait.until(ExpectedConditions.visibilityOf(Maritalsts));
	Maritalsts.sendKeys(prop.getProperty("MaritalStatus"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}	
}

public void then_user_enter_the_spouse_name() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  SpouseName = driver.findElement(By.xpath("//input[@id='spouse']"));
	wait.until(ExpectedConditions.visibilityOf(SpouseName));
	SpouseName.sendKeys(prop.getProperty("SpouseName"));
	}
	catch (Exception e) {
		e.printStackTrace();
		}
}

	public void user_enter_the_referral_source() throws InterruptedException {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement  RefSource = driver.findElement(By.xpath("//input[@id='referral']"));
		wait.until(ExpectedConditions.visibilityOf(RefSource));
		RefSource.sendKeys(prop.getProperty("ReferralSource"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void user_enter_the_essential_information() {
		try {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement  EssentialInfo = driver.findElement(By.xpath("//textarea[@id='essential']"));
		wait.until(ExpectedConditions.visibilityOf(EssentialInfo));
		EssentialInfo.sendKeys(prop.getProperty("EssentialInformation"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
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
	catch (Exception e) {
		e.printStackTrace();
	}
	   
	}

	public void user_select_the_schedule_group() throws InterruptedException {
		try {
	WebElement ScheduleGroupBtn = driver.findElement(By.xpath("//span[contains(@aria-owns,'scheduleGroup_options')]"));
	ScheduleGroupBtn.click();
    ScheduleGroupBtn.sendKeys("East Wing");
    ScheduleGroupBtn.click();
    Thread.sleep(3000);		

	}
		catch (Exception e) {
		e.printStackTrace();
	}
	}

	public void user_select_the_status() throws InterruptedException {
	try {
	WebElement Status=driver.findElement(By.xpath("//span[contains(@aria-owns,'scheduleGroup_options')]"));
	Status.click();
	Thread.sleep(3000);
	Status.sendKeys("Active");
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
	}

	public void user_select_the_track() throws InterruptedException {
		try {
	  WebElement TrackBtn = driver.findElement(By.xpath("//input[@placeholder=\"Select a Track\"]"));
      Thread.sleep(2000);
      TrackBtn.sendKeys("East 2");
      WebElement Trackbtn2 = driver.findElement(By.xpath("//*[@id=\"clientype_popup\"]/div/ul/li[2]"));
      Trackbtn2.click();
      Thread.sleep(2000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}      
	}

	public void select_the_service_type() throws InterruptedException {
	try {
	  WebElement Servicetype = driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[7]"));
	  Servicetype.click();
	  Servicetype.sendKeys("Community");
	  Servicetype.click();
	  Thread.sleep(3000);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

	public void verify_that_add_new_contact_button() throws InterruptedException {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	WebElement contactbtn=driver.findElement(By.xpath("//a[normalize-space()='Add New Contact']"));
	wait.until(ExpectedConditions.elementToBeClickable(contactbtn));
	contactbtn.click();
}

	public void verify_the_first_name() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement  Fname = driver.findElement(By.xpath("//input[@id='first-contact']"));
	wait.until(ExpectedConditions.visibilityOf(Fname));
	 Fname.sendKeys(prop.getProperty("firstName"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}

	public void verify_the_last_name() {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Lname = driver.findElement(By.xpath("//input[@id='last-contact']"));
	wait.until(ExpectedConditions.visibilityOf(Lname));
	Lname.sendKeys(prop.getProperty("lastName"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

	public void verify_the_address_line1() throws InterruptedException {
		try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Addressline1 = driver.findElement(By.cssSelector("#address1-contact"));
	wait.until(ExpectedConditions.visibilityOf(Addressline1));
	Addressline1.sendKeys(prop.getProperty("addressLine1"));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
}

	public void verify_the_address_line2() throws InterruptedException {
		try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Addressline2 = driver.findElement(By.xpath("//input[@id='address2-contact']"));
	wait.until(ExpectedConditions.visibilityOf(Addressline2));
	 Addressline2.sendKeys(prop.getProperty("addressLine2"));
		}
		catch (Exception e) {
	 e.printStackTrace();
		}
   
	}

	public void verify_the_city() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement City = driver.findElement(By.xpath("//input[@id='city-contact']"));
	wait.until(ExpectedConditions.visibilityOf(City));
	City.sendKeys(prop.getProperty("city"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}	   
}

public void verify_the_state_dropdown() throws InterruptedException {
	try {
	WebElement stateDropdown= driver.findElement(By.xpath("//span[@aria-owns='state-contact_options']"));
	Thread.sleep(3000);
	stateDropdown.sendKeys("Arizona");
	}
	catch(Exception e) {
		e.printStackTrace();
	}	
}

public void verify_the_zip_code() throws InterruptedException {
try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement zipCode = driver.findElement(By.xpath("//input[@id='zip-contact']"));
	wait.until(ExpectedConditions.visibilityOf(zipCode));
	 zipCode.sendKeys(prop.getProperty("zipcode"));
}
catch (Exception e) {
	e.printStackTrace();
	}
}

public void verify_the_primary_phone_number() throws InterruptedException {
	try {
   WebElement primaryphnumber = driver.findElement(By.xpath("//input[@id='primary-phone-contact']"));  
   Thread.sleep(3000);
   primaryphnumber.click();
   primaryphnumber.sendKeys(prop.getProperty("primaryphnumber"));
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void verify_the_email() throws InterruptedException {
	try {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement email = driver.findElement(By.xpath("//input[@id='email-contact']"));
	wait.until(ExpectedConditions.visibilityOf(email));
	email.sendKeys(prop.getProperty("email"));  
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}

public void select_the_relationship() throws InterruptedException {
	try {
	WebElement ClientTypeBtn = driver.findElement(By.id("relationship-contact"));
    ClientTypeBtn.sendKeys("Daughter-In-Law");
    Thread.sleep(3000);
	}
	catch (Exception e) {
	e.printStackTrace();
	}
       
	}

public void save_the_new_contact_details()throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement Savebtn1=driver.findElement(By.xpath("//button[@id='ClientContactSave']"));
	 wait.until(ExpectedConditions.elementToBeClickable(Savebtn1));
	 Savebtn1.click();
	 Thread.sleep(3000);
}
	
	
 public void save_the_new_client_details() throws InterruptedException {
	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	WebElement Savebtn=driver.findElement(By.xpath("//button[@id='ClientSave']"));
		 wait.until(ExpectedConditions.elementToBeClickable(Savebtn));
		 Savebtn.click();
		 Thread.sleep(3000);
	}
 
 
 public void validation_Message_should_be_shown_client_was_created() throws Exception {
	 try {
	 	String expectedResult= "Client was created.";
		String actualResult= driver.findElement(By.xpath("//div[@class='e-toast-content']")).getText();
		assertEquals("Successfully created",expectedResult,actualResult);	
	 }
	 catch (Exception e) {
		 e.printStackTrace();
	 }
		MyScreenRecording.stopRecording();
	}
 
 public void user_enter_the_email_and_password() throws Exception {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
			WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
			 Useremail.sendKeys(prop.getProperty("username"));
			}
			 catch (TimeoutException e ) {
				 e.printStackTrace();			 
		}
			
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
			Password.sendKeys(prop.getProperty("password"));
			}
			catch (TimeoutException e ) {
				 e.printStackTrace();		
		}   
	 MyScreenRecording.startRecording("Add Client-Negative Test");
 }
		
	
 public void user_login_the_application() {
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
 
 public void choose_the_test_community() throws InterruptedException {
	 try {
			WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
			Dropdown.sendKeys("Test Community");
			Thread.sleep(2000);
			}
			catch (TimeoutException e) {
				e.printStackTrace();
			}		   
	}
 
 public void user_click_on_continue_button () {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
			wait.until(ExpectedConditions.elementToBeClickable(Continue));
			Continue.click();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
 
 public void click_on_the_client_button() {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement Clientbtn=driver.findElement(By.xpath("//span[normalize-space()='Clients']"));
			wait.until(ExpectedConditions.elementToBeClickable(Clientbtn));
			Clientbtn.click();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
 
 public void click_on_the_add_new_client() {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement Addnewclnt=driver.findElement(By.xpath("(//a[normalize-space()='Add New Client'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(Addnewclnt));
			Addnewclnt.click();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
 
 public void leave_the_first_name_fields_empty() {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement  FName = driver.findElement(By.xpath("//input[@id='firstname']"));
			wait.until(ExpectedConditions.visibilityOf(FName));
			FName.sendKeys(prop.getProperty(""));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
 
 public void enter_the_last_name() {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement  LName = driver.findElement(By.xpath("//input[@id='lastname']"));
			wait.until(ExpectedConditions.visibilityOf(LName));
			LName.sendKeys(prop.getProperty("LastName"));
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
 
 public void leave_the_address_line2_fields_empty() {
	 try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			WebElement  Addline2 = driver.findElement(By.xpath("//input[@id='address2']"));
			wait.until(ExpectedConditions.visibilityOf(Addline2));
			Addline2.sendKeys(prop.getProperty(""));
			}
			catch (Exception e) {
				e.printStackTrace();
		}	
	}
 
 public void select_the_gender() {
	 try {
		  WebElement Gender=  driver.findElement(By.xpath("//span[@aria-owns='gender_options']"));
		  Thread.sleep(2000);
		  Gender.click();
		  Gender.sendKeys("Male");	
			}
			catch (Exception e) {
				e.printStackTrace();
			}	
	}
 
 public void select_the_birthDate() {
	 try {
		    WebElement DOB = driver.findElement(By.xpath("//input[@id='birthdate']"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		    wait.until(ExpectedConditions.elementToBeClickable(DOB));
		    DOB.sendKeys(prop.getProperty("Birthdate"));
		} catch (Exception e) {
		    e.printStackTrace();
		}
		
	}
 
 public void select_the_client_type() {
	 try {
			WebElement ddlClienttypeBtn = driver.findElement(By.id("clientype"));
		    ddlClienttypeBtn.sendKeys("Nursing Services");
		    Thread.sleep(2000);
		    WebElement ddlClienttydpeBtn = driver.findElement(By.xpath("//*[@id=\"clientype_popup\"]/div/ul/li[2]"));
		    ddlClienttydpeBtn.click();
		    Thread.sleep(3000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
	}
 
 public void select_the_schedule_group() {
	 try {
			WebElement ScheduleGroupBtn = driver.findElement(By.xpath("//span[contains(@aria-owns,'scheduleGroup_options')]"));
			ScheduleGroupBtn.click();
		    ScheduleGroupBtn.sendKeys("East Wing");
		    ScheduleGroupBtn.click();
		    Thread.sleep(3000);		

			}
				catch (Exception e) {
				e.printStackTrace();
			} 								
	}
 
 public void select_service_type() {
	 try {
		  WebElement Servicetype = driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[7]"));
		  Servicetype.click();
		  Servicetype.sendKeys("Community");
		  Servicetype.click();
		  Thread.sleep(3000);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
 
 public void save_the_data() throws InterruptedException {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	 	WebElement Savebtn=driver.findElement(By.xpath("//button[@id='ClientSave']"));
		 wait.until(ExpectedConditions.elementToBeClickable(Savebtn));
		 Savebtn.click();
		 Thread.sleep(3000);
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
			Thread.sleep(3000);
 	}
 
 public void error_message_displayed_first_name_is_required() {
	 try {
			String Expectedresult = "First Name is required";
			String Actualresult=driver.findElement(By.xpath("(//div[normalize-space()='First Name is required'])[1]")).getText();
			assertEquals("error message showing",Expectedresult,Actualresult);
			}
			catch (Exception e) {
				e.printStackTrace();
			}	
	}
 
 public void error_message_displayed_address2_is_required() throws Exception {	
	 try {
			String Expectedresult = "Address2 is required";
			String Actualresult=driver.findElement(By.xpath("(//div[normalize-space()='Address2 is required'])[1]")).getText();
			assertEquals("error message showing",Expectedresult,Actualresult);
			}
			catch (Exception e) {
				e.printStackTrace();
			}	
	 MyScreenRecording.stopRecording(); 
		}
 }





