package base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.logging.log4j.*;


public class BaseClass {
	public static WebDriver driver;
	public static Properties prop;
	public static Logger log;
	
	static {
		
		try {
			FileInputStream file= new FileInputStream("TestData/TestData.properties");
			FileInputStream file2= new FileInputStream("TestData/Config.properties");
			//FileInputStream file3= new FileInputStream("TestData/TestDataRandom.properties");
			 prop =new Properties();
			prop.load(file);
			prop.load(file2);
			//prop.load(file3);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
	
	 public void mouseHover(WebElement ele) {//GENERIC METHOD 
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).build().perform();
		 
	 }
	 
	 public static void handleExceptionAndReloadPage(WebDriver driver, By errorElementLocator) {  //unhandled error..
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	            wait.until(ExpectedConditions.invisibilityOfElementLocated(errorElementLocator));
	        } catch (Exception e) {
	            if (isErrorMessageDisplayed(driver)) {
	                log.error("An unhandled error occurred. Reloading the page.");
	                reloadPage(driver);
	            } else {
	                log.error("Another exception occurred: " + e.getMessage());
	            }
	        }
	    }

	    public static void reloadPage(WebDriver driver) {
	        driver.navigate().refresh();
	    }

	    public static boolean isErrorMessageDisplayed(WebDriver driver) {
	        
	        return false; 
	    }
	

		 public void selectByVisibleText(WebElement ele, String value) { //generic method
			 Select s = new Select(ele);
			 s.selectByVisibleText(value);
			 
		 }
		 
		
		public void selectByIndex(WebElement ele,  int value) { //generic method
			 
			 Select s = new Select(ele);
			 s.selectByIndex(value);
		
		}
		 
		 public void javaExecutor(WebElement element) {
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();",element);
		 }
		 
		 public void explicitWait(WebElement element, int timeouts) {
			 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			 wait.until(ExpectedConditions.visibilityOf(element));	 
		 }
		 
		 public void JavaPopUpAlert( int timeouts) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			 wait.until(ExpectedConditions.alertIsPresent());	
			Alert a= driver.switchTo().alert();
			a.accept();
		 }
		 
		 public void waitForElementClickable(WebElement ele, int timeouts) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 }
		 
		 
		 public void getScreenshot() {
			 
			 TakesScreenshot ts =  (TakesScreenshot)driver;						
			 File srcFile= ts.getScreenshotAs(OutputType.FILE);
			 
			 File destFile= new File("C:\\Users\\AnoopKumar\\eclipse-workspace\\COM.CINCHCCM\\Screenshot\\"+System.currentTimeMillis()+".png");
			 try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		 }
}
	

	
	


