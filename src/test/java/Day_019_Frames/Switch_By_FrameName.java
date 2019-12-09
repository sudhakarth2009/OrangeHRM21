package Day_019_Frames;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Switch_By_FrameName {
	
	//By Index  //driver.switchTo().frame(0); 	driver.switchTo().frame(1);
	//By Name or Id //	driver.switchTo().frame("iframe1");
	//By Web Element //driver.switchTo().frame("id of the element");
	

	
	static WebDriver driver;
	

	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	driver.get("http://www.bhavasri.com/Frames/AllContacts.html");
	
	
		
	driver.switchTo().frame("Google_ContactForm");
	findElement(By.name("firstname")).sendKeys("Ravi");
	findElement(By.name("lastname")).sendKeys("Selenium");
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("Amazon_ContactForm");
	findElement(By.name("firstname")).sendKeys("Kiran");
	findElement(By.name("lastname")).sendKeys("Java");

	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("Google_ContactForm");
	findElement(By.name("firstname")).clear();
	findElement(By.name("firstname")).sendKeys("Sudhakar");
	
	findElement(By.name("lastname")).clear();
	findElement(By.name("lastname")).sendKeys("Selenium and Java");
	
	//driver.quit();
	
}
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	

}
