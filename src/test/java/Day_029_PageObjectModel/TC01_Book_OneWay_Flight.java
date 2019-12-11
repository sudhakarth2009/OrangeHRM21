
package  Day_029_PageObjectModel;
import org.testng.annotations.Test;
import CommonUtil.*;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.*;
public class TC01_Book_OneWay_Flight
{
	WebDriver driver;
	public void Test1(WebDriver driver)
	{
		this.driver = driver;
	}
	
	@BeforeTest 
	public void  TestSetup()throws Exception {
		
		driver = TestBrowser.OpenChromeBrowser();
		String TestURL = " http://newtours.demoaut.com/";
		driver.get(TestURL);
	}
	
	@Test
	public void Book_OneWay_Flight() throws Exception {
		
		LoginPage L1 = new LoginPage();
		L1.LoginPage(driver);
		L1.Login();
		
		FlightFinder F1= new FlightFinder();
		F1.FlightFinder(driver);
		F1.FlightFinderPage_OneWayBooking();
		
		driver.quit();
	}
}












