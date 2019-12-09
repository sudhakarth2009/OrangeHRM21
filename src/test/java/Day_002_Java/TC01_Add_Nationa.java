package Day_002_Java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_Nationa {
	
	static WebDriver driver;
	
	@Test
	public void test1()throws Exception
	{
		TC01_Add_Nationa.OpenBrowser();
		TC01_Add_Nationa.Login();
		TC01_Add_Nationa.AddNatioalities();
		
	}
	
	
	public static void OpenBrowser()throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	public static void Login()throws Exception
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	
	}
	
	public static void AddNatioalities()throws Exception
	{
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_nationality")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("nationality_name")).sendKeys("Indians445");
		driver.findElement(By.name("btnSave")).click();

	}
	
	

}
