package Day_001_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TC01_Add_Jobs {
	
WebDriver driver;	


		@Test
		public void login_test1() throws Exception
		{
			
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.id("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();		
		
		
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Job")).click();	
		findElement(By.linkText("Job Titles")).click();	
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("java1");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("java1 learning");
		findElement(By.id("jobTitle_note")).sendKeys("java1 only");

		findElement(By.id("btnSave")).click();
	
		driver.quit();
	
		}
		
		
		public void open_browser() throws Exception
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			
			
			
			
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
