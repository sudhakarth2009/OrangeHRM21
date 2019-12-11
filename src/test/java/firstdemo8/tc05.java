package firstdemo8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import firstdemo6.tco3;

public class tc05 {
	
	WebDriver driver;

	@Test
	public void loginTest() throws Exception
	
	{
		tc05 tc=new tc05();
		tc.OpenChromeBrowser();
		tc.OpenOrangeHRM();
		tc.Login();
		tc.AddQualifications();
		tc.CloseBrowser();
		
	}	
	
		public void OpenChromeBrowser() throws Exception
		
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.manage().window().maximize() ;	
				
		}
		
		public void OpenOrangeHRM() throws Exception

		{
			driver.get("https://opensource-demo.orangehrmlive.com/");
				
		}
		
		
		public void Login() throws Exception

		{
			findElement(By.name("txtUsername")).sendKeys("Admin");
			findElement(By.name("txtPassword")).sendKeys("admin123");
			findElement(By.id("btnLogin")).click();

		}

		public void AddQualifications() throws Exception

		{
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Qualifications")).click();
			findElement(By.id("menu_admin_viewSkills")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("skill_name")).sendKeys("Administator2");
			findElement(By.id("skill_description")).sendKeys("Administator class two");
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
