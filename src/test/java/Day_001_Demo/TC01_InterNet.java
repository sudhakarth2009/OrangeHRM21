package Day_001_Demo;

import java.io.File;

//https://selenium-release.storage.googleapis.com/index.html?path=3.150/
//https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver
//https://github.com/bonigarcia/webdrivermanager
//https://github.com/bonigarcia/webdrivermanager

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TC01_InterNet {
	

WebDriver driver;	
	
		@Test	
		public void login_test() throws Exception
		{
			

		
		//WebDriverManager.iedriver().setup();
		//driver =new InternetExplorerDriver();
		
		File extractPath=new File("C:\\IEDriver\\IEDriverServer.exe");
		InternetExplorerDriverService service = new InternetExplorerDriverService.Builder().withExtractPath(extractPath).build();

		driver = new InternetExplorerDriver(service);

		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();		
		
		
		
		
		}
	

}
