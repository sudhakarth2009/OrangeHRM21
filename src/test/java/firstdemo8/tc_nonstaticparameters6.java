package firstdemo8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class tc_nonstaticparameters6 {
	
	static WebDriver driver;
	String UserName="Admin", Password="admin123";
    String LocationName="sai",Country="Bangladesh", Provience="Inter", City="Mylavaram", Address="kukutpally", Zipcode="12345", Phone="12345675",Fax="500041",Notes=" information";
	
	@Test
	public void Login_Test() throws Exception
	{
		
		tc_nonstaticparameters6 tc=new tc_nonstaticparameters6();
		
		tc.OpenChromeBrowser();
		tc.OpenOrangeHRM();
		tc.Login(UserName, Password);
	    tc.AddOrganizations(LocationName,Country, Provience, City, Address, Zipcode, Phone, Fax, Notes);
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
	
	
	public void  AddOrganizations(String LocationName ,String Country,String Provience, String City, String Address, String Zipcode, String Phone, String Fax, String Notes   ) throws Exception
	{
		findElement(By.linkText("Admin")).click();
		findElement(By.partialLinkText("Organiz")).click();
		findElement(By.id("menu_admin_viewLocations")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("location_name")).sendKeys(LocationName);
		
		Select dropdown3 = new Select(driver.findElement(By.id("location_country")));
		dropdown3.selectByVisibleText(Country);
		//dropdown3.selectByIndex(2);
	 //dropdown3.selectByValue("6");
		
		List<WebElement> numberofTextFields=driver.findElements(By.tagName("input"));
		int Input_count= numberofTextFields.size();
		System.out.println("Number of Input text fields "+Input_count); 
		
		findElement(By.name("location[province]")).sendKeys( Provience);
		findElement(By.cssSelector("input#location_city.formInput")).sendKeys( City);
		findElement(By.id("location_address")).sendKeys( Address);
		findElement(By.id("location_zipCode")).sendKeys( Zipcode);
		findElement(By.xpath("//*[@id=\"location_phone\"]")).sendKeys( Phone);
		findElement(By.id("location_fax")).sendKeys( Fax);
		findElement(By.id("location_notes")).sendKeys( Notes);	
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
