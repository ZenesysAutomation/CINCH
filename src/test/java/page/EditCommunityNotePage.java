package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseClass;

public class EditCommunityNotePage extends BaseClass {
	
public void click_on_the_table() {
	 WebElement editNotes = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
     editNotes.click();
     
	}

public void edit_the_note() {
	WebElement txtUpdateNote = driver.findElement(By.id("note"));
    txtUpdateNote.clear();
    txtUpdateNote.sendKeys("edit functionlity");
}

public void edit_the_communities() {
	 WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
	    community.click();
	    community.sendKeys("New England Club");
}
public void edit_the_start_date() {
	WebElement UpdateStartdate = driver.findElement(By.id("startdate"));
	UpdateStartdate.clear();
	UpdateStartdate.sendKeys("6/25/2023");
}
     
public void edit_the_end_date() throws InterruptedException {
	   WebElement EditEnddate = driver.findElement(By.id("enddate"));
       EditEnddate.clear();
       EditEnddate.sendKeys("6/28/2023");
       Thread.sleep(2000);
       
    
}
public void click_on_the_save_button() {
	WebElement savebtn = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	savebtn.click();
    
}

    
	
}



