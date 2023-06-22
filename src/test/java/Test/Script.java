package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

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
		
	
		
		WebElement manage=driver.findElement(By.linkText("Manage"));	
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
        
        
	}
	
	
	

}
