package page;


import java.time.Duration;
import java.util.List;
import java.util.Random;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseClass;

	public class CaregiverAssignmentsPage extends BaseClass  {
	
	public void user_enter_the_email() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Useremail= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='email']")));
		 Useremail.sendKeys(prop.getProperty("username"));
		
	}

	public void user_enter_the_password() throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Password= wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
	Password.sendKeys(prop.getProperty("password"));
	
	
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
//	private String getColorCodeByNumber(int number) {
//		if(number==0)
//			return "rgba(183, 137, 103, 1)";
//		else if(number==1)
//			return "rgba(49, 32, 138, 1)";
//		else if(number==2)
//			return "rgba(46, 55, 255, 1)";
//		else if(number==3)
//			return "rgba(255, 121, 59, 1)";
//		else if(number==4)
//			return "rgba(97, 255, 239, 1)";
//		else
//			return "rgba(46, 55, 255, 1)";
//		
//	}
	public void check_if_color_is_blue_and_active_visit_then_click_on_it() throws InterruptedException {
		List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
		Thread.sleep(2000);
		String elementClassName = "e-schedule-table";
		try {
			for(int i=0;i<=blueElements.size();i++)
			{
				WebElement p=(WebElement) blueElements.toArray()[i];
				Thread.sleep(1000);
				String rgbaValue = p.getCssValue("backgroundColor");
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			    if(rgbaValue.equals("rgba(183, 137, 103, 1)")) {
			    	Thread.sleep(1000);
			    	WebElement element = driver.findElement(By.className(elementClassName));
			    	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
				else if(rgbaValue.equals("rgba(49, 32, 138, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
		
				else if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
				else if(rgbaValue.equals("rgba(255, 121, 59, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
				else if(rgbaValue.equals("rgba(97, 255, 239, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
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
		WebElement SelectTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
		explicitWait(SelectTime, 5);
		SelectTime.click();
		Random random =new Random();
		List<WebElement> liList=driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
		liList.get(random.nextInt(96)).click();	
		Thread.sleep(3000);
	}
		

		public void select_option_move_only_this_occurence() throws InterruptedException {
		
				List<WebElement> SelectOccurences=	driver.findElements(By.xpath("(//input[@id='flexRadioDefault1'])[1]"));
				if(SelectOccurences.size()>0) {
					WebElement selectOccurrence = SelectOccurences.get(0);
					selectOccurrence.click();
					Thread.sleep(2000);
				}
				
			
	}
		
	public void save_the_visit() throws InterruptedException {

    WebElement VisitSvebtn=	driver.findElement(By.className("e-event-save"));	
	VisitSvebtn.click();
	Thread.sleep(20000);
	
}
	public void check_if_color_is_blue_and_active_visit_then_click_on_it2() throws InterruptedException {
		List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
		Thread.sleep(2000);
		String elementClassName = "e-schedule-table";
		try {
			for(int i=0;i<=blueElements.size();i++)
			{
				WebElement p=(WebElement) blueElements.toArray()[i];
				Thread.sleep(1000);
				String rgbaValue = p.getCssValue("backgroundColor");
				JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			    if(rgbaValue.equals("rgba(183, 137, 103, 1)")) {
			    	Thread.sleep(1000);
			    	WebElement element = driver.findElement(By.className(elementClassName));
			    	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
				else if(rgbaValue.equals("rgba(49, 32, 138, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
		
				else if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
				else if(rgbaValue.equals("rgba(255, 121, 59, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
	            	p.click();
					Thread.sleep(5000);
					return;
				}
				else if(rgbaValue.equals("rgba(97, 255, 239, 1)")) {
					Thread.sleep(1000);
					WebElement element = driver.findElement(By.className(elementClassName));
					jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
			    	for(i=1;i<=100;i++) {
			    		if (!p.isDisplayed()) {
			    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
				            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
			            }
			    	}
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

	public void change_the_time() throws InterruptedException {
		
		WebElement SelectTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
		explicitWait(SelectTime, 5);
		SelectTime.click();
		Random random =new Random();
		List<WebElement> liList=driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
		liList.get(random.nextInt(96)).click();	
		Thread.sleep(3000);
	}
		
	
	
	public void select_the_option_move_day_series() throws InterruptedException {
		List<WebElement> SelectMoveDayseries=driver.findElements(By.cssSelector(".form-check-label"));
		Thread.sleep(3000);
		List<WebElement> checkboxList=	driver.findElements(By.cssSelector(".form-check-input"));
		 for (int i=1;i<=SelectMoveDayseries.size();i++) {
			 WebElement element = (WebElement) SelectMoveDayseries.toArray()[i];	
			 if(element.getText().equals("Move day series")) {
				 WebElement radioElement = (WebElement) checkboxList.toArray()[i];
				 Thread.sleep(6000);
				 radioElement.click();
				 break;
				 
			}
			 
	     }
		Thread.sleep(6000);
		
	}

	public void save_the_visit1() throws InterruptedException {
	
	WebElement VisitSvebtn=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	VisitSvebtn.click();
	Thread.sleep(6000);
}
	
public void check_if_color_is_blue_and_active_visit_then_click_on_it3() throws InterruptedException {
	List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
	Thread.sleep(2000);
	String elementClassName = "e-schedule-table";
	try {
		for(int i=0;i<=blueElements.size();i++)
		{
			WebElement p=(WebElement) blueElements.toArray()[i];
			Thread.sleep(1000);
			String rgbaValue = p.getCssValue("backgroundColor");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    if(rgbaValue.equals("rgba(183, 137, 103, 1)")) {
		    	Thread.sleep(1000);
		    	WebElement element = driver.findElement(By.className(elementClassName));
		    	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(49, 32, 138, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
	
			else if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(255, 121, 59, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(97, 255, 239, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
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


public void change_the_time1() throws InterruptedException {
	WebElement SelectTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
	explicitWait(SelectTime, 5);
	SelectTime.click();
	Random random =new Random();
	List<WebElement> liList=driver.findElements(By.cssSelector("div > ul > li.e-list-item"));
	liList.get(random.nextInt(96)).click();	
	Thread.sleep(3000);
}
	
public void select_the_option_move_week_series() throws InterruptedException {
	List<WebElement> SelectMoveDayseries=	driver.findElements(By.cssSelector(".form-check-label"));
	Thread.sleep(3000);
	List<WebElement> checkboxList=	driver.findElements(By.cssSelector(".form-check-input"));
	 for (int i=1;i<=SelectMoveDayseries.size();i++) {
		 WebElement element = (WebElement) SelectMoveDayseries.toArray()[i];	
		 if(element.getText().equals("Move week series")) {
			 WebElement radioElement = (WebElement) checkboxList.toArray()[i];
			 Thread.sleep(6000);
			 radioElement.click();
			 break;
			 
		}
		 
     }
	Thread.sleep(6000);
	
}

public void save_the_visit2() throws InterruptedException {
	WebElement VisitSvebtn=	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
	VisitSvebtn.click();
	Thread.sleep(6000);
	
}


public void click_on_the_visit() throws InterruptedException {

	List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
	Thread.sleep(2000);
	String elementClassName = "e-schedule-table";
	try {
		for(int i=0;i<=blueElements.size();i++)
		{
			WebElement p=(WebElement) blueElements.toArray()[i];
			Thread.sleep(1000);
			String rgbaValue = p.getCssValue("backgroundColor");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    if(rgbaValue.equals("rgba(183, 137, 103, 1)")) {
		    	Thread.sleep(1000);
		    	WebElement element = driver.findElement(By.className(elementClassName));
		    	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(49, 32, 138, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
	
			else if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(255, 121, 59, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(97, 255, 239, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
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

public void change_the_track_from_east1_to_east2() throws InterruptedException {
	WebElement TrackChanged=driver.findElement(By.xpath("(//span[contains(@role,'listbox')])[1]"));
	TrackChanged.click();
	TrackChanged.sendKeys("East2");
	TrackChanged.click();
	Thread.sleep(6000);
}

public void select_move_only_this_occurrence() throws InterruptedException {
	try {
	WebElement Occurence=driver.findElement(By.xpath("(//input[@id='flexRadioDefault1'])[1]"));
	Occurence.click();
	Thread.sleep(4000);
	}
	catch (Exception e) {
		
	}
}

public void save_the_visits() throws InterruptedException {
WebElement SaveVisit =	driver.findElement(By.xpath("(//button[normalize-space()='Save'])[1]"));
SaveVisit.click();
Thread.sleep(5000);

}
public void user_click_on_the_visit() throws InterruptedException {
	
	List<WebElement> blueElements=driver.findElements(By.className("text-wrap"));
	Thread.sleep(2000);
	String elementClassName = "e-schedule-table";
	try {
		for(int i=0;i<=blueElements.size();i++)
		{
			WebElement p=(WebElement) blueElements.toArray()[i];
			Thread.sleep(1000);
			String rgbaValue = p.getCssValue("backgroundColor");
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		    if(rgbaValue.equals("rgba(183, 137, 103, 1)")) {
		    	Thread.sleep(1000);
		    	WebElement element = driver.findElement(By.className(elementClassName));
		    	jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(49, 32, 138, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
	
			else if(rgbaValue.equals("rgba(46, 55, 255, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(255, 121, 59, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
            	p.click();
				Thread.sleep(5000);
				return;
			}
			else if(rgbaValue.equals("rgba(97, 255, 239, 1)")) {
				Thread.sleep(1000);
				WebElement element = driver.findElement(By.className(elementClassName));
				jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
		    	for(i=1;i<=100;i++) {
		    		if (!p.isDisplayed()) {
		    			jsExecutor.executeScript("arguments[0].scrollTop += "+i+";", element);
			            //jsExecutor.executeScript("arguments["+i+"].scrollIntoView(true);", element);
		            }
		    	}
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

public void user_click_on_the_delete_button() throws InterruptedException {
	WebElement DeleteVisit=	driver.findElement(By.xpath("//button[normalize-space()='Delete']"));
	if (!DeleteVisit.isDisplayed()) {
		 Assert.assertTrue(DeleteVisit.isDisplayed(), "Not Able to Delete");
	}
	else {
		DeleteVisit.click();
	}
	
	Thread.sleep(4000);
	
}
	
public void pop_up_will_be_visible_are_you_sure_want_to_delete_this_Item_and_click_on_delete_button() throws InterruptedException {
	WebElement DeletepopUp= driver.findElement(By.xpath("(//button[normalize-space()='Delete'])[1]"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",DeletepopUp);
	Thread.sleep(10000);
	
}
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


