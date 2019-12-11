 package firstdemo8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class tc_nonstaticparameterslocators1 {
	
	
	static WebDriver driver;
	String UserName="Admin", Password="admin123";
	String Workshift="Morning shift";
	
	@Test
	public void Login_Test() throws Exception
	{
		
		tc_nonstaticparameterslocators1 tc=new tc_nonstaticparameterslocators1();
		
		tc.OpenChromeBrowser();
		tc.OpenOrangeHRM();
		tc.Login(UserName, Password);
		tc.AddJob(Workshift);
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
	
	
	public void  AddJob(String Workshift) throws Exception
	{
		findElement(By.linkText("Admin")).click();
		findElement(By.partialLinkText("Jo")).click();
		findElement(By.xpath("//*[@id=\"menu_admin_workShift\"]")).click();
		findElement(By.cssSelector("input#btnAdd")).click();
		findElement(By.id("workShift_name")).sendKeys(Workshift);
		findElement(By.id("btnSave")).click();
		List<WebElement> numberofTextFields=driver.findElements(By.tagName("input"));
		int Input_count= numberofTextFields.size();
		System.out.println("Number of Input text fields "+Input_count); 
		
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
