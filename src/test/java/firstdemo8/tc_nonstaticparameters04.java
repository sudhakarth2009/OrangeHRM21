 package firstdemo8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_nonstaticparameters04 {
	
	
	static WebDriver driver;
	String UserName="Admin", Password="admin123";
	String SkillName="Parameters",SkillDescription="parameters class two";
	
	@Test
	public void Login_Test() throws Exception
	{
		
		tc_nonstaticparameters04 tc=new tc_nonstaticparameters04();
		
		tc.OpenChromeBrowser();
		tc.OpenOrangeHRM();
		tc.Login(UserName, Password);
		tc.AddQualifications(SkillName, SkillDescription);
		tc.CloseChromeBroeser();
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
	
	
	
	public void Login(String UserName,String Password) throws Exception
	{
		
		findElement(By.name("txtUsername")).sendKeys( UserName);
		findElement(By.name("txtPassword")).sendKeys(Password);
		findElement(By.name("Submit")).click();
	}
	
	
	public void  AddQualifications(String SkillName,String SkillDescription) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Qualifications")).click();
		findElement(By.id("menu_admin_viewSkills")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("skill_name")).sendKeys( SkillName);
		findElement(By.id("skill_description")).sendKeys( SkillDescription);
		findElement(By.id("btnSave")).click();
		
	}
	
	public void CloseChromeBroeser() throws Exception
	{
		 driver.quit();
	}
	
	 public WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
	
	

}
