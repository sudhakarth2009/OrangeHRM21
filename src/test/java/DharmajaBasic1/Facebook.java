package DharmajaBasic1;
import org.testng.annotations.Test;

import SamSung.OR;

//import Orange_Pim.OR;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.apache.commons.io.FileUtils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.ie.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
import java.sql.Timestamp;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;

import java.io.File;
import java.io.*;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import java.net.*;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.*;
import java.util.NoSuchElementException;

public class Facebook {
	
    public String baseUrl = "https://www.facebook.com/";
    String driverPath = "C:\\chromedriver_win32\\Chrome1\\chromedriver.exe";
    public WebDriver driver ; 

  @Test
  public void b_verifyHomepageTitle() throws Exception{
	  
	
	  
	  driver.findElement(By.xpath(" //*[@id='email'] ")).clear();
	  driver.findElement(By.xpath(" //*[@id='email'] ")).sendKeys("sudhakarth2009@gmail.com");
      driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("babli12345");
      driver.findElement(By.xpath("//input[@value='Log In'  and @aria-label='Log In']")).click();

	  try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
	  
     driver.findElement(By.xpath("//*[@id='pageLoginAnchor']")).click();
  	
     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
					e.printStackTrace();
		}
     
     driver.findElement
     (By.xpath("//li[@class='_54ni navSubmenu _6398 _64kz __MenuItem' and @role='presentation']")).click();
    
	}   // Ends Before Test      
  
 
 
  
  //Starts Before Test
  @BeforeTest
  public void setBaseURL() throws InterruptedException
	{
 	/* ChromeOptions options = new ChromeOptions();
	 options.addArguments("--disable-notifications");
	 System.setProperty("webdriver.chrome.driver",driverPath);
	 driver =new ChromeDriver(options);
	 driver.get(baseUrl);
 	 driver.manage().window().maximize() ;*/
	  System.setProperty("webdriver.ie.driver",driverPath);


		 
		 //DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		 //capabilities.setCapability(InternetExplorerDriver.NATIVE_EVENTS, false);
		// driver = new InternetExplorerDriver(capabilities);
		 driver = new ChromeDriver();
		 
		
		 //driver = new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 driver.get(baseUrl);

		// driver.quit();
	 	 
 	 
 	 
	}
 	 
 	 //Actions actions = new Actions(driver);
 	 
 


	  @AfterTest
	  public  void closeBrowser() throws Exception{
		    if (driver == null) {
		        return;
		    }
		    driver.quit();
		    driver = null;
		}
	  
	  
	  
	  @Test
	  public void MyFAQS() throws Exception{
		  
		  
		  //WebDriver driver1= new FirefoxDriver();
		  WebDriver driver1= new ChromeDriver();
		  EventFiringWebDriver driver2 = new EventFiringWebDriver(driver1);
		  driver2.executeScript("document.getElementById(\"name\")");
		  driver2.executeScript("document.getElementById(\"name\").value=\"test\"  ");
		  
		  
		  
		  //How to Handle Single Main Window
		  String handle= driver.getWindowHandle();
		  driver.findElement(By.xpath("New Message Window")).click(); 
		  		  
		  //How to Handle Multiple Windows
	
			((JavascriptExecutor)driver).executeScript("window.open()");
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			
			//Switch to New tab
			driver.switchTo().window(tabs.get(1));
			driver.get("http://google.com");
			
			driver.switchTo().window(tabs.get(0));
		  
		  // How to maximize window
		  driver.manage().window().maximize();
		  
		  //How to get Window x,y posotions
		  Point position= driver.manage().window().getPosition();
		  position.getX();
		  position.getY();
		  
		  //How to get Webelement  x,y locations
		  Point location= driver.findElement(By.xpath("")).getLocation();
		  location.getX();
		  location.getY();
		  
		  
		 
		  
		  
		  // How to Switch Frames
		  
		  
		  driver.switchTo().frame(0);  // By index
		  driver.switchTo().frame("GooglrFrame"); // By Frame Name
		  driver.switchTo().parentFrame(); // Back to Parent Frame
		  driver.switchTo().defaultContent(); // Default 
		  
		  driver.switchTo().frame("Google_ContactForm");
			driver.switchTo().frame(driver.findElement(By.id("GoogleContactForm")));
		  
		  //Handling alerts
		  
		  driver.findElement(By.name("Alert Box")).click();
		  Alert alert= driver.switchTo().alert();
		 

		  alert.accept();
		  alert.dismiss();
		  alert.getText();
		  alert.sendKeys("UserName");
	
		  driver.switchTo().alert().accept();
		  driver.switchTo().alert().dismiss();
		  driver.switchTo().alert().getText();
		  driver.switchTo().alert().sendKeys("UserName");
		  driver.switchTo().alert().sendKeys("Password");
		  
		  
		  
		  //Alert alert= driver.switchTo().alert()
		
		  
		  // Implicit wait
		  driver.manage().timeouts().implicitlyWait(110, TimeUnit.SECONDS);
		
		  //Explicit Wait
		 // WebElement element=driver.findElement(By.xpath(""));
		  WebDriverWait wait=  new WebDriverWait(driver,350);
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(OR.ADMIN_FOCUS) ) ) ;
		  driver.findElement(By.xpath(OR.ADMIN_FOCUS)).click();
		  
		  //FluentWait
		  WebDriverWait wait2=  new WebDriverWait(driver,240);
		  wait2.pollingEvery(80,TimeUnit.SECONDS);
		  wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  driver.findElement(By.xpath(OR.ADMIN_FOCUS)).click();
		  
		  
		  @SuppressWarnings("deprecation")
		  Wait<WebDriver> wait5 = new FluentWait<WebDriver>(driver)
		  .withTimeout(80,TimeUnit.SECONDS);
		  
		  wait5.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""))); 
		  wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));
		  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		 
		  
		  //Fluent Wait
		// Waiting 30 seconds for an element to be present on the 

		  // checking
		// for its presence once every 5 seconds.
		  WebDriverWait wait4=  new WebDriverWait(driver,60);
		  wait4.pollingEvery(5,TimeUnit.SECONDS);
		  wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("") ) ) ;
		  
		
		  
		// driver wait max 60 seconds for an element to be present on the page.
		// checks for the Web Element for every 5 seconds.	  
		WebElement wait3= new FluentWait<WebDriver>(driver)
		.withTimeout(60, TimeUnit.SECONDS)
		.pollingEvery(5,TimeUnit.SECONDS).
		ignoring(NoSuchElementException.class)
		.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""))); 
		wait3.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//How can we get exact time to load a page using Selenium WebDriver?
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		
		//How to check mouse movement on specific web element and click ?
		WebElement target=driver.findElement(By.xpath("") );
		Actions action = new Actions(driver);
		action.moveToElement(target).build().perform();
		action.moveToElement(target).click().build().perform();
		
        //How to double click specic web element
		action.moveToElement(target).doubleClick();
		
		action.contextClick(target);
		action.sendKeys(target, "UserName");
		action.sendKeys(target, "Password");
		  
		
		// How to drag and drop
		WebElement Source1=driver.findElement(By.xpath("") );
		WebElement Target1=driver.findElement(By.xpath("") );
		action.dragAndDrop(Source1, Target1);
		
	
		
		// How to select Dropdown Values
		Select select = new Select (driver.findElement(By.xpath("")));
		select.selectByIndex(0);
		select.selectByValue("Value");
		select.selectByVisibleText("By Visible Text");
		
		
		 
		// Identify WebELement Locator
		
		  driver.findElement(By.cssSelector(""));
		  driver.findElement(By.className(""));
		  driver.findElement(By.id(""));
		  driver.findElement(By.name(""));
		  driver.findElement(By.linkText(""));
		  driver.findElement(By.partialLinkText(""));
		  driver.findElement(By.tagName(""));
		  driver.findElement(By.xpath(""));
		 
		
		  
		     //check Number of tags present in Dom
		  
	         List<WebElement>  list= driver.findElements(By.tagName("Iframe"));
			 int count=list.size(); 
			 
			 
			 // ruturns zero records if no elements
			 
			 List<WebElement>  list1= driver.findElements(By.tagName("a"));
			 int count1=list1.size();
			 
			 WebElement  ele= driver.findElement(By.tagName("a")); //returens NoSuchELement Visible Exception
			 ele.getText();
			
		
			 
		driver.findElement(By.id("")).getAttribute("").contains("checked");	 
		
		
		driver.findElement(By.id("")).clear();	 
		driver.findElement(By.id("")).submit();
		
		driver.getCurrentUrl();
		driver.close();
		driver.quit();
		driver.get("");
		
	//	what is the difference between driver.get(""); and driver.navigate().to("");
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver will wait until all Web Elements are loading in a page , can't move to next Instruction
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		//driver will wait Immediate navigation and will be ready to execute  next Instruction
		
		
		//Close the current window, quitting the browser if it's the last window currently open.
		driver.close();
		
		//Quits this driver, closing every associated window
		driver.quit();
		
		
		//How to perform browser forward,back and refresh 
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		
		//System.exit(0);
		
		

 
		
		// to verify a WebElment is displayed or not ?
		Boolean str= driver.findElement(By.xpath("")).isDisplayed();
		
		//to verify button is enabled or not ?
		Boolean str1= driver.findElement(By.xpath("")).isEnabled();
		
		//to verify check box is selected or not?
		Boolean str2= driver.findElement(By.xpath("")).isSelected();
		
		
		
		
		//Find element by tagname
		driver.findElements(By.tagName("a"));
		
		
		
		//Find number of Hyperlinks in a webpage
		driver.get("http://www.google.com");
		 List <WebElement> list7 = driver.findElements(By.tagName("a"));
		 System.out.println("Number of links: "+list7.size());

		 //print the above number of links
		 for(int i = 0; i < list7.size(); i++){ 
		 System.out.println(list7.get(i).getText());
		 }
		
	  // How to take screenshot
	  File SRCFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  
	  
	 
	  
	  
	  
	  
	  
	  
	  }	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}                                   
