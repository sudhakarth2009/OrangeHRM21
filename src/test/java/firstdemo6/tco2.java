package firstdemo6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tco2 {
	WebDriver driver;
 
	@Test
	public void loginTest() throws Exception
	
	{
		
		tco2 tc=new tco2();
		tc.OpenChromeBrowser();
		tc.OpenOrangeHRM();
		tc.Login();
		tc.AddJob();
		tc.CloseBrowser();
		
	
		
	}
	
	public void OpenChromeBrowser() throws Exception
	
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		
	}
	
	public  void OpenOrangeHRM() throws Exception
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
    public void Login() throws Exception
	
	{
    	findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.id("btnLogin")).click();
	}
    
    
    public void AddJob() throws Exception
	
	{
    	findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewJobTitleList")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("Administator class");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("Administator first class demo");
		findElement(By.id("btnSave")).click();
	}

    
   public void CloseBrowser() throws Exception
	
	{
	   
	   driver.quit();
	   
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
