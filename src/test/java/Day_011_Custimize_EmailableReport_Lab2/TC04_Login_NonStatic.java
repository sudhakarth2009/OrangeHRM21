package Day_011_Custimize_EmailableReport_Lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC04_Login_NonStatic {
	
	
	static WebDriver driver;
	Reporter1 R1;
	
	@Test
	public void Login_Test() throws Exception
	{
		
		TC04_Login_NonStatic TN1= new TC04_Login_NonStatic();
		
		   TN1.OpenChromeBrowser();
		   TN1.OpenOrangeHRM();
		   TN1.Login();
		   TN1.Addnatialities();
		   TN1.Logout();
		   TN1.closebrowser();
	
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
	 
	
	
	
	
	
	
	
	
	public  void OpenChromeBrowser()
	{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;
	}


	public  void OpenOrangeHRM() throws Exception
	{
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		R1.TakeScreenShotAuto(driver,"Opened Orange HRM","Pass");
	
	}
	


	public  void Login() throws Exception
	{
		findElement(By.name("txtUsername")).sendKeys("Admin");
		R1.TakeScreenShotAuto(driver,"Username Entered","Pass");
		
		findElement(By.name("txtPassword")).sendKeys("admin123");
		R1.TakeScreenShotAuto(driver,"Password Entered","Pass");
		
		findElement(By.name("Submit")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Submit","Pass");
		
		
	}
	

	
	
	public  void Addnatialities() throws Exception
	{
		

		findElement(By.linkText("Admin")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Admin","Pass");
		
		findElement(By.linkText("Nationalities")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Nationalities","Pass");
		
		findElement(By.name("btnAdd")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Add Nationalitis button","Pass");
		
		findElement(By.id("nationality_name")).sendKeys("Kenyas2");
		R1.TakeScreenShotAuto(driver,"Entered Nationality Text","Pass");
		
		findElement(By.id("btnSave")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Save","Pass");
		
	}
	
	
	
	
	public   void closebrowser() throws Exception
	{
		
		 driver.quit();

	}
	
	
	public   void Logout()throws Exception
	 {
		 
		findElement(By.id("welcome")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Welcome ","Pass");
		 

		 findElement(By.linkText("Logout")).click();
		R1.TakeScreenShotAuto(driver,"Clicked on Logout ","Pass");
		 
	 }
	
	
	

}
