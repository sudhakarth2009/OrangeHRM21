package Day_017_Priorities_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC03_Change_MethodName {
	
	
	static WebDriver driver;
	//TC04_Login_NonStatic TN1;
	
	
	
	
	 public  WebElement findElement(By by) throws Exception 
		{
					
			 WebElement elem = driver.findElement(by);    	    
			
			 
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			
			return elem;
		}
	 
	
	// PASSED: TestA
	// PASSED: TestB
	// PASSED: TestY
	// PASSED: TestZ
	// FAILED: TestD
	// FAILED: TestE
	
	
	
	
	@Test
	public  void TestA()
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	}


	@Test
	public  void TestB() throws Exception
	{
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	
	}
	

	@Test
	public  void TestY() throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.name("Submit")).click();
		
		
	}
	

	
	@Test
	public  void TestD() throws Exception
	{
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Kenyas21");
		findElement(By.id("btnSave")).click();
	}
	
	
	
	
	
	
	@Test
	public   void TestE()throws Exception
	 {
		 findElement(By.id("welcome")).click();	 
		Thread.sleep(300);
		 findElement(By.linkText("Logout")).click();
		 
	 }
	
	
	@Test
	public   void TestZ() throws Exception
	{
		 driver.quit();
	}
	

}
