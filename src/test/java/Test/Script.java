package Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Script {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		ChromeDriver driver= new ChromeDriver(options);
		driver.get("https://cinchccm-client-cinch-test.azurewebsites.net/login?returnPage=");
		driver.manage().window().maximize();
		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		
		WebElement Username=driver.findElement(By.xpath("//input[@id='email']"));
		Username.sendKeys("anoop.kumar@zenesys.com");
		//Thread.sleep(4000);
		WebElement Password=driver.findElement(By.xpath("//input[@id='password']"));
		//Thread.sleep(4000);
		Password.sendKeys("Testing@123");
		
		WebElement Login=driver.findElement(By.xpath("(//span[@class='e-btn-content'])[1]"));
		Login.click();
		WebElement Dropdown=driver.findElement(By.xpath("//span[@role='listbox']"));
		Dropdown.sendKeys("Test Community");
		
		
		WebElement Continue=driver.findElement(By.xpath("//input[@value='Continue']"));
		Thread.sleep(3000);
		Continue.click();
	
			WebElement CgAssignment =driver.findElement(By.xpath("(//span[normalize-space()='Caregiver Assignments'])[1]"));
			CgAssignment.click();
			Thread.sleep(4000);
			
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
					    			 int afterAdding15Minutes=Integer.parseInt(minute)+15;
					    			 newTime=oldTime.split(":")[0]+":"+afterAdding15Minutes+" AM";
					    		 }
					    	}
					    	Thread.sleep(4000);
					    	driver.findElement(By.className("e-timepicker")).sendKeys(newTime);
					    }
					    Thread.sleep(2000);*/
				
				WebElement ddlStartTime = driver.findElement(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
				   ddlStartTime.click();
				    Thread.sleep(6000);
				    
				    Actions action = new Actions(driver);
					action.sendKeys(Keys.chord(Keys.DOWN,Keys.DOWN)).build().perform();
					ddlStartTime.click();
					Thread.sleep(6000);
					    
					    					
				WebElement SelectMoveDayseries=	driver.findElement (By.xpath("//label[normalize-space()='Move day series']"));
				
					SelectMoveDayseries.click();
					Thread.sleep(6000);
			
//				JavascriptExecutor js = (JavascriptExecutor)driver;
//				js.executeScript("arguments[0].click()",SelectMoveDayseries );					
//				Thread.sleep(6000); 
				
				WebElement VisitSvebtn=	driver.findElement(By.xpath("//label[normalize-space()='Move day series']"));
				VisitSvebtn.click();
				Thread.sleep(6000);
}
}

					
					//List<WebElement> dropdownlist2=driver.findElements(By.xpath("(//span[@class='e-input-group-icon e-time-icon e-icons'])[1]"));
					/*List <WebElement> dropdownlist2 = driver.findElements(By.className("e-timepicker"));
					for(WebElement ele2 :dropdownlist2) {
						String value =ele2.getText();
						if(value.equals("12:15 AM")) {
							Thread.sleep(6000);
							ele2.click();
							break;
							
						}*/
						
	
					        
						
//						WebElement SelectOccurence=	driver.findElement(By.xpath("(//input[@id='flexRadioDefault1'])[1]"));
//						SelectOccurence.click();
//						Thread.sleep(3000);
//						
//						WebElement VisitSvebtn=	driver.findElement(By.xpath("//button[normalize-space()='Save']"));
//						VisitSvebtn.click();
//						Thread.sleep(3000);
					


	


			
	
			
					
					
			
			
	
	
	
			
			
			
			
		
	
		
	
		
		/*WebElement manage=driver.findElement(By.linkText("Manage"));	
		Thread.sleep(3000);
		manage.click();
		
		WebElement AddcomNote=driver.findElement(By.linkText("Add New Community Note"));
		AddcomNote.click();
		
		WebElement note=driver.findElement(By.xpath("//textarea[@id='note']"));
		note.sendKeys("This is Testing Env @1213S");
		
		WebElement community=driver.findElement(By.xpath("//input[@id='community']"));
	    community.click();
	    community.sendKeys("Test Community");
	    
	    WebElement StartDate=driver.findElement(By.xpath("//input[@id='startdate']"));
		StartDate.sendKeys("6/22/2023");
		
		WebElement EndDate=driver.findElement(By.xpath("//input[@id='enddate']"));
		EndDate.sendKeys("6/22/2023");
		
		WebElement savebtn=driver.findElement(By.cssSelector("button[type='submit']"));
		savebtn.click();
		
		
        WebElement editNotes = driver.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
        editNotes.click();
        Thread.sleep(4000);
        
        WebElement txtUpdateNote = driver.findElement(By.id("note"));
        txtUpdateNote.clear();
        txtUpdateNote.sendKeys("edit functionlity");
        
        WebElement txtUpdateStartdate = driver.findElement(By.id("startdate"));
        txtUpdateStartdate.clear();
        txtUpdateStartdate.sendKeys("6/25/2023");



        WebElement txtEditEnddate = driver.findElement(By.id("enddate"));
        txtEditEnddate.clear();
        txtEditEnddate.sendKeys(String.valueOf(java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy"))));
        txtEditEnddate.sendKeys("6/27/2023");
        Thread.sleep(30000);
        WebElement btnUpdate = driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
        Thread.sleep(30000);
        btnUpdate.click();
        
        
	}*/
	
	
	

	

