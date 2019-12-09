package  Day_011_Custimize_EmailableReport_Lab2;
import CommonUtil.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.*;


public class TC01_Test2
{
	
	WebDriver driver;

	
	@Test
	public void TC01_Report_Test() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		

		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		
		driver.get(TestURL);
		takeSnapShot(driver, "c://test2.png") ;
	   
		findElement(By.id("txtUsername")).sendKeys("Admin");
		takeSnapShot(driver, "c://test2.png") ;
		
		findElement(By.id("txtPassword")).sendKeys("admin123");	
		takeSnapShot(driver, "c://test3.png") ;
		
		findElement(By.name("Submit"));
		takeSnapShot(driver, "c://test4.png") ;
		
		findElement(By.name("Submit")).click();
		driver.close();
		
	}
	
	
	

	
	// Draws a red border around the found element. Does not set it back anyhow.
	public  WebElement findElement(By by) throws Exception 
	{
				
		 WebElement elem = driver.findElement(by);    	    
		// draw a border around the found element
		 
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
			
		
	
	
	
	   public static void takeSnapShot(WebDriver driver,String fileWithPath) throws Exception{

	        //Convert web driver object to TakeScreenshot
	        TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	        //Move image file to new destination
	        File DestFile=new File(fileWithPath);

	        //Copy file at destination
	        FileUtils.copyFile(SrcFile, DestFile);

	    }

	
	
	
	
	
	
	
	

}












