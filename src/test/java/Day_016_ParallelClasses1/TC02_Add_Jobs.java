package Day_016_ParallelClasses1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Day_009_Custimize_EmailableReport_Lab1.Reporter1;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TC02_Add_Jobs {
	
WebDriver driver;	
Reporter1 R1;


		@Test
		public void login_test1() throws Exception
		{
			
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
		//driver =TestBrowser.OpenChromeBrowser();
		
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
		driver.manage().window().maximize() ;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//step3 heading purpose
		R1= new Reporter1(driver,"TC01_Add_Jobs");	
			
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		findElement(By.id("txtUsername")).sendKeys("Admin");
		R1.TakeScreenShotAuto(driver,"Username Entered","Pass");
		
		findElement(By.id("txtPassword")).sendKeys("admin123");
		R1.TakeScreenShotAuto(driver,"Password Entered","Pass");
		
		findElement(By.id("btnLogin")).click();		
		R1.TakeScreenShotAuto(driver,"Clicked on Signin","Pass");
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;	
		 
		  WebElement Admin_Element=driver.findElement(By.id("menu_admin_viewAdminModule"));
		  js.executeScript("arguments[0].click();", Admin_Element);
	
		  WebElement Job_Element=driver.findElement(By.id("menu_admin_Job"));
		  js.executeScript("arguments[0].click();", Job_Element);
		
		  WebElement JobTitle_Element=driver.findElement(By.id("menu_admin_viewJobTitleList"));
		  js.executeScript("arguments[0].click();", JobTitle_Element);
		
		findElement(By.id("btnAdd")).click();
		findElement(By.id("jobTitle_jobTitle")).sendKeys("java5");
		findElement(By.id("jobTitle_jobDescription")).sendKeys("java5 learning");
		findElement(By.id("jobTitle_note")).sendKeys("java4 only");
		R1.TakeScreenShotAuto(driver,"Add Job Details","Pass");
		findElement(By.id("btnSave")).click();
	
		driver.quit();
	
		}
		
		
		 public  WebElement findElement(By by) throws Exception 
			{
		
				WebElement elem = driver.findElement(by);  
				
				if (driver instanceof JavascriptExecutor) 
				{
				 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
			 
				}
				return elem;
			}	
		
		
		
	

}
