package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import base.BaseClass;

public class AddCommunityNotePage extends BaseClass {
	

public void click_on_the_manage() throws InterruptedException {
	WebElement manage=driver.findElement(By.linkText("Manage"));
//	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//	wait.until(ExpectedConditions.visibilityOf(manage));
	Thread.sleep(3000);
	manage.click();
		    
	}

public void click_on_the_add_new_community_note() {
	WebElement AddcomNote=driver.findElement(By.linkText("Add New Community Note"));
	AddcomNote.click();
	explicitWait(AddcomNote,30);
    
}
public void enter_the_note() {
	WebElement note=driver.findElement(By.xpath("//textarea[@id='note']"));
	note.sendKeys("This is Testing Env @1213S");
    
}
public void select_communities() {
    WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
    community.click();
    community.sendKeys("Test Community");
}
public void choose_a_start_date() {
	WebElement StartDate=driver.findElement(By.xpath("//input[@id='startdate']"));
	StartDate.sendKeys("6/22/2023");
	  
}
public void choose_a_end_date() {
	WebElement EndDate=driver.findElement(By.xpath("//input[@id='enddate']"));
	EndDate.sendKeys("6/22/2023");
	explicitWait(EndDate,30);
	
	   
}
public void click_on_the_save_button() {
	WebElement savebtn=driver.findElement(By.cssSelector("button[type='submit']"));
	savebtn.click();
    
}

}
