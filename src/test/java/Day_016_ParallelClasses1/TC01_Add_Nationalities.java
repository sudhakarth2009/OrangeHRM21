package  Day_016_ParallelClasses1;
import CommonUtil.*;
import Day_009_Custimize_EmailableReport_Lab1.Reporter1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;
public class TC01_Add_Nationalities
{
	WebDriver driver;
	Reporter1 R1;
	
	@Test
	public void Open_OrangeHRM() throws Exception {
		
		
		//OpenChromeVrowser
		driver = TestBrowser.OpenChromeBrowser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step3 heading purpose
		R1= new Reporter1(driver,"TC01_Add_Natinalities");
		
		//OpenUrl
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	
					
				driver.get("https://opensource-demo.orangehrmlive.com/");
				
				findElement(By.id("txtUsername")).sendKeys("Admin");
				R1.TakeScreenShotAuto(driver,"Username Entered","Pass");
				
				findElement(By.id("txtPassword")).sendKeys("admin123");
				R1.TakeScreenShotAuto(driver,"Password Entered","Pass");
				
				findElement(By.id("btnLogin")).click();		
				R1.TakeScreenShotAuto(driver,"Clicked on Signin","Pass");
		
		findElement(By.id("menu_admin_viewAdminModule")).click();
		findElement(By.id("menu_admin_nationality")).click();
		findElement(By.id("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Mexican90");
		R1.TakeScreenShotAuto(driver,"Natiobality Details","Pass");
		
		findElement(By.id("btnSave")).click();
		
		driver.quit();
	}
	
	
	
	
	 public   WebElement findElement(By by) throws Exception 
		{
	
			WebElement elem = driver.findElement(by);  
			
			if (driver instanceof JavascriptExecutor) 
			{
			 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
		 
			}
			return elem;
		}

	
	
	
	
	
	
}                                                  












