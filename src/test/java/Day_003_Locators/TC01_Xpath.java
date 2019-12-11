package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.*;

public class TC01_Xpath
{
	

	
	static WebDriver driver;
	
	
	//step1
	static String  UserName="//*[@id='txtUsername']";
	static String  Password="//*[@id='txtPassword']";
	static String  Loginbutton="//*[@id='btnLogin']";
	static String  Admin="//*[@id='menu_admin_viewAdminModule']/b";
	static String  Nationality="//*[@id='menu_admin_nationality']";
	
	String  UserName1="input#txtUsername";
	String  Password1="input#txtPassword";
	String  Loginbutton1="input#btnLogin.button";
	
	
	//@Test
	public void Test2() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
	
		driver.findElement(By.xpath(UserName)).sendKeys("Admin");
		driver.findElement(By.xpath(Password)).sendKeys("admin123");
		driver.findElement(By.xpath(Loginbutton)).click();
		
		driver.findElement(By.xpath(Admin)).click();
		driver.findElement(By.xpath(Nationality)).click();

	}
	
	
	
	
	@Test
	public void Test210() throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
		driver.findElement(By.cssSelector(UserName1)).sendKeys("Admin");
		driver.findElement(By.cssSelector(Password1)).sendKeys("admin123");
		//driver.findElement(By.cssSelector(Loginbutton1)).click();
		
		driver.findElement(By.className("button")).click();
		
		List<WebElement> links2=  driver.findElements(By.tagName("a"));	
		int links_count= links2.size();
		System.out.println("Number of hyperlinks is :"+links_count);
		
		
		
		driver.findElement(By.linkText("Admin")).click(); //tag name starts with <a
		
		driver.findElement(By.partialLinkText("Nationa")).click(); //tag name starts with <a by partial text "Inbox(123)
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	 //@Test
	  public void testTC02() throws Exception {
	    driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Nationalities")).click();
	    
	  }
	
	 
	// @Test
	  public void testTC03() throws Exception {
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	 
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    
	    driver.findElement(By.linkText("Admin")).click();
	    driver.findElement(By.linkText("Nationalities")).click();
	    
	  }

	
	
	
	
	
	
		
	
	
	 
	
	
}












