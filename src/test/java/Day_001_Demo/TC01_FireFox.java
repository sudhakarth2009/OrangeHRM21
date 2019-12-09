package Day_001_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import static io.github.bonigarcia.wdm.DriverManagerType.CHROME;

public class TC01_FireFox {
	

WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			

		
		WebDriverManager.firefoxdriver().setup();

		driver =new FirefoxDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();		
		
		
		
		
		}
	

}
