package  Day_003_Locators;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.*;

public class TC01_Locators
{
	static WebDriver driver;

	@Test
	public void Test2() throws Exception {
	
		driver = TestBrowser.OpenChromeBrowser();
		
		String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
		findElement(By.cssSelector("input#txtUsername")).clear();
		findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		
		//findElement(By.xpath("//*[@id='txtUsername']")).clear();
		//findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		
		//driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		findElement(By.xpath("//*[@id='txtPassword']")).clear();
		findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("admin123");
		
	/*	<input name="txtUsername" id="txtUsername" type="text">

		//*[@id="txtUsername"]

		//input[  @id='txtUsername' and @name='txtUsername'  ]*/
		
		
		//*[@id='txtUsername']
		//*[@id="txtPassword"]
		
		
		
		//to identify group of similar Web elements
		List<WebElement> numberofTextFields=  driver.findElements(By.xpath("//input[ @type='text']"));
		int lnput_count= numberofTextFields.size();
		System.out.println("Number of Input text fields "+lnput_count);
				
		
		findElement(By.className("button")).click();

		//*[@id='txtPassword']
		
	
	
	findElement(By.linkText("Admin")).click();
	
	findElement(By.partialLinkText("Nationalitä")).click();
	
	//findElement(By.linkText("PIM")).click();
	//findElement(By.linkText("Nationalitäten")).click();

	//findElement(By.partialLinkText("National")).click();
	
	
	
		//driver.findElement(By.className("button")).click();
		
		
		
		
		
	
		//driver.findElement(By.className("button")).click();
        //driver.findElement(By.linkText("Admin"));
		//driver.findElement(By.partialLinkText("Nationali")).click();	
		
		
		/*List<WebElement> links=  driver.findElements(By.tagName("a"));
		int links_count= links.size();
		System.out.println("Number of hyperlinks "+links_count);*/
	
		
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











