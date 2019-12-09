package Day_024_Advanced_Xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC008_Child {
	
	WebDriver driver;
	
	
	
	@Test
	public void Test1()throws Exception
	{
		
		//*[@id="txtUsername"]//following::input[1]
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://www.guru99.com");
		
		

		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		
		
		//*[@id='java_technologies']/child::li  ---> 1 of 93

		findElement(By.xpath("//*[@id='java_technologies']/child::li[1]"));
		findElement(By.xpath("//*[@id='java_technologies']/child::li[2]"));
		findElement(By.xpath("//*[@id='java_technologies']/child::li[3]"));
		findElement(By.xpath("//*[@id='java_technologies']/child::li[4]"));
		

		
		
			
		
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
