package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class TC01_Xpath
{
	

	
	static WebDriver driver;
	
	static String  UserName="//*[@id='txtUsername']";
	static String  Password="//*[@id='txtPassword']";
	static String  Loginbutton="//*[@id='btnLogin']";
	static String  Admin="//*[@id='menu_admin_viewAdminModule']/b";
	static String  Nationality="//*[@id='menu_admin_nationality']";
	
	
	//@Test
	public void Test2() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	
		driver.findElement(By.xpath(UserName)).sendKeys("Admin");
		driver.findElement(By.xpath(Password)).sendKeys("admin123");
		driver.findElement(By.xpath(Loginbutton)).click();
		
		driver.findElement(By.xpath(Admin)).click();
		driver.findElement(By.partialLinkText("Nationa")).click();
		
		
		
		

	}
	
	
	
	 @Test
	  public void testTC02() throws Exception {
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Nationalities")).click();
	    
	  }
	
	 
	 @Test
	  public void testTC03() throws Exception {
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Nationalities")).click();
	    
	  }

	
	
	
	
	
	
		
	
	
	 
	
	
}












