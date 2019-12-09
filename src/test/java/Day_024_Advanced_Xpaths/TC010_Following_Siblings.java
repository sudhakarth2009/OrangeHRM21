package Day_024_Advanced_Xpaths;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC010_Following_Siblings {
	
	WebDriver driver;
	
	
	@Test
	public void Test1()throws Exception
	{
		
	
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://demo.guru99.com/v1/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
		
		findElement(By.xpath("//*[@name='uid']"));
		findElement(By.xpath("//*[@name='uid']//following-sibling::label"));
		
		findElement(By.xpath("//*[@name='password']"));
		findElement(By.xpath("//*[@name='password']//following-sibling::label"));
		
		findElement(By.xpath("//*[@type='submit']"));
		findElement(By.xpath("//*[@type='submit']//following-sibling::input"));
		
		//https://opensource-demo.orangehrmlive.com/
		// ----Username---->    //*[@id='divUsername']
		//  ----Password--->    //*[@id='divUsername']//following-sibling::div
		
		//divPassword
		
		
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
