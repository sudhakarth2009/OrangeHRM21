package firstdemo8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import firstdemo6.tco3;

public class tc06 {
	
	static WebDriver driver;
	
	static String UserName="Admin", Password="admin123";
	static String skillname="administator2",skilldescription="Administator class two";

	@Test
	public void loginTest() throws Exception
	
	{
		tc06.OpenChromeBrowser();
		tc06.OpenOrangeHRM();
		tc06.Login(UserName,Password);
		tc06.AddQualifications(skillname,skilldescription);
		tc06.CloseBrowser();
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
			findElement(By.id("txtUsername")).sendKeys(UserName);
			findElement(By.id("txtPassword")).sendKeys(Password);
			findElement(By.id("btnLogin")).click();

		}

		public static void AddQualifications(String skillname, String skilldescription) throws Exception

		{
			findElement(By.id("menu_admin_viewAdminModule")).click();
			findElement(By.id("menu_admin_Qualifications")).click();
			findElement(By.id("menu_admin_viewSkills")).click();
			findElement(By.id("btnAdd")).click();
			findElement(By.id("skill_name")).sendKeys(skillname);
			findElement(By.id("skill_description")).sendKeys(skilldescription);
			findElement(By.id("btnSave")).click();
			
		}
		
		public static void CloseBrowser() throws Exception

		{
			  driver.quit();
		}
		
		
	
		
	public  static WebElement findElement(By by) throws Exception 
			{
		
				WebElement elem = driver.findElement(by);  
				
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
				}
				return elem;
			}
		

}
