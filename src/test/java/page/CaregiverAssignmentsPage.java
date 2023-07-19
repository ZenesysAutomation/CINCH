package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class CaregiverAssignmentsPage extends BaseClass  {
	
public void user_enter_the_email() throws InterruptedException {
	WebElement Useremail=driver.findElement(By.xpath("//input[@id='email']"));
	explicitWait(Useremail,10);
	Thread.sleep(6000);
	Useremail.sendKeys(prop.getProperty("username"));
	Thread.sleep(6000);
		
	}

public void user_enter_the_password() throws InterruptedException {
	WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
	explicitWait(Password,10);
	Password.sendKeys(prop.getProperty("password"));
	Thread.sleep(4000);
	
}

public void user_click_on_the_login_button() throws InterruptedException {
	WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
	Login.click();
	Thread.sleep(3000);
	
}

public void select_the_test_community() throws InterruptedException {
	WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
	Dropdown.sendKeys("Test Community");
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
		explicitWait(CgAssignment,10);
		Thread.sleep(8000);
	
}

public void check_if_color_is_blue_and_active_visit_then_click_on_it() throws InterruptedException {
	WebElement Visittask= driver.findElement(By.className("text-wrap"));
	Visittask.click();
	Thread.sleep(8000);
}

public void change_the_time_for_visit() throws InterruptedException{
	
	/*List<WebElement> SelectTime=driver.findElements(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
	for(WebElement ele2 : SelectTime) {
		String value =ele2.getText();
		if(value.equals("01:00 AM")) {
			Thread.sleep(6000);
			ele2.click();
			break;
			
		}
		
		
	}*/
    
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
	
}
public void change_the_track_from_east1_to_east2() throws InterruptedException {
	WebElement TrackChanged=driver.findElement(By.xpath("(//div[@class='text-wrap'][normalize-space()='34 testing Today'])[1]"));
	TrackChanged.click();
	TrackChanged.sendKeys("East2");
	TrackChanged.click();
	Thread.sleep(4000);
}

public void select_move_only_this_occurrence() throws InterruptedException {
	
	WebElement Occurence=driver.findElement(By.xpath("(//input[@id='flexRadioDefault1'])[1]"));
	Occurence.click();
	Thread.sleep(4000);
}

public void save_the_visits() throws InterruptedException {
WebElement SaveVisit=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
SaveVisit.click();
Thread.sleep(5000);

}



}
