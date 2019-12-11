package firstdemo8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_staticparameters05 {
	
	
	static WebDriver driver;
	static String UserName="Admin",Password="admin123";
	static String Workshifts="Evening shifts";
	
	@Test
	public void Login_Test() throws Exception
	{
		
		tc_staticparameters05.OpenChromeBrowser();
		tc_staticparameters05.OpenOrangeHRM();
		tc_staticparameters05.Login(UserName,Password);
		tc_staticparameters05.AddJob(Workshifts);
		tc_staticparameters05.CloseChromeBroeser();
		
	}
	
	public static void OpenChromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;		
	}
	
	
	public static void OpenOrangeHRM() throws Exception
	{

		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	
	
	public static void Login(String UserName,String Password) throws Exception
	{
		
		findElement(By.name("txtUsername")).sendKeys(UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.name("Submit")).click();
	}
	
	
	public static void  AddJob(String Workshifts) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_workShift")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("workShift_name")).sendKeys(Workshifts);
		findElement(By.id("btnSave")).click();
	}
	
	public static void CloseChromeBroeser() throws Exception
	{
		 driver.quit();
	}
	
	 public static WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
	

}
