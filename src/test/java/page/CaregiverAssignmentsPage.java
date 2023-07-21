package page;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import base.BaseClass;

public class CaregiverAssignmentsPage extends BaseClass  {
	
public void user_enter_the_email() throws InterruptedException {
	WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
	Thread.sleep(6000);
	Useremail.sendKeys(prop.getProperty("username"));
	Thread.sleep(6000);
		
	}

public void user_enter_the_password() throws InterruptedException {
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	explicitWait(Password,10);
	Password.sendKeys(prop.getProperty("password"));
	Thread.sleep(5000);
	
}

public void user_click_on_the_login_button() throws InterruptedException {
	WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	Login.click();
	Thread.sleep(3000);
	
}

public void select_the_test_community() throws InterruptedException {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
	Dropdown.click();
	Thread.sleep(3000);
	
}

public void user_click_on_the_continue_button() throws InterruptedException {
	WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
	Thread.sleep(3000);
	Continue.click();
	
}

public void click_on_the_caregiver_assignments() throws InterruptedException {
		WebElement CgAssignment =driver.findElement(By.xpath("(//span[normalize-space()='Caregiver Assignments'])[1]"));
		CgAssignment.click();
		explicitWait(CgAssignment,15);
		
	
}

public void check_if_color_is_blue_and_active_visit_then_click_on_it() throws InterruptedException {
	List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
	Thread.sleep(2000);
	try {
		for(int i=0;i<=blueElements.size();i++)
		{
			WebElement p=(WebElement) blueElements.toArray()[i];
			Thread.sleep(1000);
			String rgbaValue = p.getCssValue("backgroundColor");
			if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0, 50000)");
				Thread.sleep(3000);
				p.click();
				Thread.sleep(5000);
				return;
			}
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

public void change_the_time_for_visit() throws InterruptedException {
	/*WebElement oldTimeElement = driver.findElement(By.className("e-timepicker"));
    String oldTime = oldTimeElement.getDomProperty("value");
    String minute="";
    String newTime="";
    if(oldTime!=null && oldTime!="") {
    	if(oldTime.contains("PM")) {
    		 minute=oldTime.split(":")[1].replace(" PM","");
    		 if(minute=="45") {
    			 newTime=(oldTime.split(":")[0]+1)+":"+"00" +" PM"; 
    		 }
    		 else {
    			 newTime=oldTime.split(":")[0]+":"+(Integer.parseInt(minute)+15)+" PM";
    		 }    	}
    	else {
    		 minute=oldTime.split(":")[1].replace(" AM","");
    		 if(minute=="45") {
    			 newTime=(oldTime.split(":")[0]+1)+":"+"00" +" AM"; 
    		 }
    		 else {
    			 newTime=oldTime.split(":")[0]+":"+(Integer.parseInt(minute)+15)+" AM";
    		 }
    	}
    	driver.findElement(By.className("e-timepicker")).sendKeys(newTime);
    }
}*/
	
	WebElement ddlStartTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
   ddlStartTime.click();
    Thread.sleep(6000);
    
//    List<WebElement> allOptions = driver.findElements(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
//    
//
//  for (WebElement option : allOptions) {
//  if (option.getText().equals("3:15 AM")) {
//  option.click();
//  Thread.sleep(6000);
//  break;
//  }
//  }
    
	
	Actions action = new Actions(driver);
	action.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).build().perform();
	ddlStartTime.click();
	Thread.sleep(6000);
    
    //JavascriptExecutor js = (JavascriptExecutor) driver;
   // js.executeScript("arguments[0].value='3:15 AM'", ddlStartTime);
   // ddlStartTime.click();
    
//    Thread.sleep(6000);
//    String desiredTimeText = "12:45 AM";
//    WebElement desiredTimeOption = driver.findElement(By.className("e-control e-timepicker e-lib e-input and text()='" + desiredTimeText + "']"));
//    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", desiredTimeOption);
//    desiredTimeOption.click();
//    Thread.sleep(6000);
}
	
	
	/*WebElement ddlStartTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
    ddlStartTime.click();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement option = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='timepicker-f668114a-c0e3-4923-8156-4673e427eff4'])[1][@data-value='12:45 AM']")));
    option.click();*/
     


    // Get the current local date and time
   /* LocalDateTime currentTime = LocalDateTime.now();

    // Round the current time to the nearest 15 minutes
    LocalDateTime roundedTime = roundToNearest15Minutes(currentTime);
    ddlStartTime.click();

    // Format the rounded time as "h:mm a"
    String roundedTimeFormatted = roundedTime.format(DateTimeFormatter.ofPattern("h:mm a"));

    // Use the formatted time as needed
    System.out.println("Rounded Time: " + roundedTimeFormatted);
    Thread.sleep(3000);
}*/

public void select_option_move_only_this_occurence() throws InterruptedException {
	WebElement SelectOccurence=	driver.findElement(By.xpath("(//input[@id='flexRadioDefault1'])[1]"));
	SelectOccurence.click();
	Thread.sleep(6000);
	
}

public void save_the_visit() throws InterruptedException {
	WebElement VisitSvebtn=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	VisitSvebtn.click();
	Thread.sleep(9000);
	
}


public void check_if_color_is_blue_and_active_visit_then_click_on_it2() throws InterruptedException {
	List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
	Thread.sleep(2000);
	try {
		for(int i=0;i<=blueElements.size();i++)
		{
			WebElement p=(WebElement) blueElements.toArray()[i];
			Thread.sleep(1000);
			String rgbaValue = p.getCssValue("backgroundColor");
			if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
				Thread.sleep(1000);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollBy(0, 50000)");
				Thread.sleep(3000);
				p.click();
				Thread.sleep(9000);
				return;
			}
			
		}
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

public void change_the_time() {
	
	WebElement oldTimeElement = driver.findElement(By.className("e-timepicker"));
    String oldTime = oldTimeElement.getDomProperty("value");
    String minute="";
    String newTime="";
    if(oldTime!=null && oldTime!="") {
    	if(oldTime.contains("PM")) {
    		 minute=oldTime.split(":")[1].replace(" PM","");
    		 if(minute=="45") {
    			 newTime=(oldTime.split(":")[0]+1)+":"+"00" +" PM"; 
    		 }
    		 else {
    			 newTime=oldTime.split(":")[0]+":"+(Integer.parseInt(minute)+15)+" PM";
    		 }    	}
    	else {
    		 minute=oldTime.split(":")[1].replace(" AM","");
    		 if(minute=="45") {
    			 newTime=(oldTime.split(":")[0]+1)+":"+"00" +" AM"; 
    		 }
    		 else {
    			 newTime=oldTime.split(":")[0]+":"+(Integer.parseInt(minute)+15)+" AM";
    		 }
    	}
    	driver.findElement(By.className("e-timepicker")).sendKeys(newTime);
    }
   
}

public void select_the_option_move_day_series() throws InterruptedException {
	WebElement SelectMoveDayseries=	driver.findElement (By.xpath("(//label[normalize-space()='Move day series'])[1]"));
	SelectMoveDayseries.click();
	Thread.sleep(6000);
	
}

public void save_the_visit1() throws InterruptedException {
	
	WebElement VisitSvebtn=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	VisitSvebtn.click();
	Thread.sleep(6000);
}





    	
    
	
	












//another part
/*public void change_the_time_for_visit() throws InterruptedException{
	
	/*List<WebElement> SelectTime=driver.findElements(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
	for(WebElement ele2 : SelectTime) {
		String value =ele2.getText();
		if(value.equals("01:00 AM")) {
			Thread.sleep(6000);
			ele2.click();
			break;
			
		}
		
		
	}*/
    
    /*WebElement oldTimeElement = driver.findElement(By.className("e-timepicker"));
    String oldTime = oldTimeElement.getDomProperty("value");
    String minute="";
    String newTime="";
    if(oldTime!=null && oldTime!="") {
    	if(oldTime.contains("PM")) {
    		 minute=oldTime.split(":")[1].replace(" PM","");
    		 if(minute=="45") {
    			 newTime=(oldTime.split(":")[0]+1)+":"+"00" +" PM"; 
    		 }
    		 else {
    			 newTime=oldTime.split(":")[0]+":"+(Integer.parseInt(minute)+15)+" PM";
    		 }    	}
    	else {
    		 minute=oldTime.split(":")[1].replace(" AM","");
    		 if(minute=="45") {
    			 newTime=(oldTime.split(":")[0]+1)+":"+"00" +" AM"; 
    		 }
    		 else {
    			 newTime=oldTime.split(":")[0]+":"+(Integer.parseInt(minute)+15)+" AM";
    		 }
    	}
    	driver.findElement(By.className("e-timepicker")).sendKeys(newTime);
    	
    }	
	
}

public void select_option_move_only_this_occurence() throws InterruptedException {
	WebElement SelectOccurence=	driver.findElement(By.xpath("(//input[@id='flexRadioDefault1'])[1]"));
	SelectOccurence.click();
	Thread.sleep(6000);
	
}


public void save_the_visit() throws InterruptedException {
	WebElement VisitSvebtn=	driver.findElement(By.xpath("//button[normalize-space()='Save']"));
	VisitSvebtn.click();
	Thread.sleep(6000);
	
}

public void change_the_time() throws InterruptedException {

	List<WebElement> SelectTime=driver.findElements(By.className("e-timepicker"));
	for(WebElement ele2 : SelectTime) {
		String value =ele2.getText();
		if(value.equals("01:00 AM")) {
			Thread.sleep(6000);
			ele2.click();
			break;
			
		}
		
		
	}
}

public void select_the_option_move_day_series() throws InterruptedException {
	WebElement SelectMoveDayseries=	driver.findElement (By.xpath("(//label[normalize-space()='Move day series'])[1]"));
	SelectMoveDayseries.click();
	Thread.sleep(6000);
}
public void save_the_visit1() throws InterruptedException {
	WebElement VisitSvebtn=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	VisitSvebtn.click();
	Thread.sleep(6000);
	
} 

public void change_the_time1() throws InterruptedException {
	List<WebElement> SelectTime=driver.findElements(By.className("e-timepicker"));
	for(WebElement ele2 : SelectTime) {
		String value =ele2.getText();
		if(value.equals("01:00 AM")) {
			Thread.sleep(6000);
			ele2.click();
			break;
			
		}
		
		
	}
	
}

public void select_the_option_move_week_series() throws InterruptedException {
	WebElement SelectMoveWeekseries=driver.findElement(By.xpath("(//label[normalize-space()='Move week series'])[1]"));
	SelectMoveWeekseries.click();
	Thread.sleep(6000);
}
public void save_the_visit2() throws InterruptedException {
WebElement SaveVisit =	driver.findElement(By.xpath("//button[normalize-space()='Save']"));
SaveVisit.click();
Thread.sleep(6000);
	
}*/


public void click_on_the_visit() throws InterruptedException {
	WebElement VisitClk =	driver.findElement(By.xpath("//div[@aria-label=\"East 1's event - 344 Testing Automation Begin From Thursday, July 20, 2023 1:00:00 AM Ends At Thursday, July 20, 2023 1:15:00 AM\"]//div[@class='text-wrap'][normalize-space()='344 Testing Automation']"));
	VisitClk.click();
	Thread.sleep(9000);
	
}
public void change_the_track_from_east1_to_east2() throws InterruptedException {
	WebElement TrackChanged=driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[1]"));
	TrackChanged.click();
	TrackChanged.sendKeys("East2");
	TrackChanged.click();
	Thread.sleep(6000);
}

public void select_move_only_this_occurrence() throws InterruptedException {
	
	WebElement Occurence=driver.findElement(By.xpath("//label[normalize-space()='Move only this occurrence']"));
	Occurence.click();
	Thread.sleep(4000);
}

public void save_the_visits() throws InterruptedException {
WebElement SaveVisit=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
SaveVisit.click();
Thread.sleep(5000);

}
public void user_click_on_the_visit() throws InterruptedException {
	WebElement VisitClk =	driver.findElement(By.xpath("//div[@aria-label=\"East 1's event - 344 Testing Automation Begin From Thursday, July 20, 2023 1:00:00 AM Ends At Thursday, July 20, 2023 1:15:00 AM\"]//div[@class='text-wrap'][normalize-space()='344 Testing Automation']"));
	VisitClk.click();
	Thread.sleep(9000);
	
}

public void user_click_on_the_delete_button() throws InterruptedException {
	WebElement DeleteVisit=	driver.findElement(By.xpath("//button[normalize-space()='Delete']"));
	DeleteVisit.click();
	Thread.sleep(8000);
	
} 

public void pop_up_will_be_visible_are_you_sure_want_to_delete_this_Item_and_click_on_delete_button() throws InterruptedException {
	WebElement DeletepopUp= driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]"));
	DeletepopUp.click();
	Thread.sleep(8000);
	
}
}
