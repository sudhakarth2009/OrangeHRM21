package FirstDemo9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Login {
	
	WebDriver driver;
	
	String UseName="Admin",Password="admin123";
	String Nationality_text="Indian560";
	
	@Test
	public void Login_Test() throws Exception
	{
		
		TC01_Login TN= new TC01_Login();
		TN.openchromeBrowser();
		TN.Login(UseName,Password);
		TN.AddNationalities(Nationality_text);
		TN.closeBrowser();

	}
	
	
	
	
	public  void openchromeBrowser() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	public void Login(String Uname1, String Pwd1) throws Exception
	{
		driver.findElement(By.name("txtUsername")).sendKeys(Uname1);
		driver.findElement(By.name("txtPassword")).sendKeys(Pwd1);
		driver.findElement(By.name("Submit")).click();
		
	}
	
	public void AddNationalities(String Ntext) throws Exception
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("nationality_name")).sendKeys(Ntext);
		driver.findElement(By.id("btnSave")).click();
	}
	
	
	public void closeBrowser() throws Exception
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
