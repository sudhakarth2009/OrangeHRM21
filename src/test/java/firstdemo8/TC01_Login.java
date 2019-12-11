package firstdemo8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC01_Login {
	
	
	static WebDriver driver;
	
	@Test
	public void Login_Test() throws Exception
	{
		
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	findElement(By.name("txtUsername")).sendKeys("Admin");
	findElement(By.name("txtPassword")).sendKeys("admin123");
	findElement(By.name("Submit")).click();
	
	
	findElement(By.linkText("Admin")).click();
	findElement(By.id("menu_admin_UserManagement")).click();
	findElement(By.partialLinkText("User")).click();
	findElement(By.id("btnAdd")).click();
	Select dropdown3 = new Select(driver.findElement(By.id("systemUser_userType")));
	dropdown3.selectByVisibleText("ESS");
	
	findElement(By.xpath("//*[@id='systemUser_employeeName_empName']")).sendKeys("Fiona Grace");
	findElement(By.id("systemUser_userName")).sendKeys("grace");
	
	Select dropdown4 = new Select(driver.findElement(By.id("systemUser_status")));
	dropdown4.selectByVisibleText("Enabled");

	findElement(By.className("addbutton")).click();

	
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
