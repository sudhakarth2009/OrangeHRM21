package firstdemo8;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_nonstaticparameters4 {
	
	
	static WebDriver driver;
	String UserName="Admin", Password="admin123";
	String PGGrade="parameters class two";
	
	@Test
	public void Login_Test() throws Exception
	{
		
		tc_nonstaticparameters4 tc=new tc_nonstaticparameters4();
		
		tc.OpenChromeBrowser();
		tc.OpenOrangeHRM();
		tc.Login(UserName, Password);
		tc.Addjob(PGGrade);
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
	
	
	public void  Addjob(String PGGrade) throws Exception
	{
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_Job")).click();
		findElement(By.id("menu_admin_viewPayGrades")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("payGrade_name")).sendKeys( PGGrade);
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
