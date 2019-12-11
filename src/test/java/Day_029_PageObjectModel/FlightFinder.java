package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;

public class FlightFinder
{
	
	WebDriver driver;
	
	public void FlightFinder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	// All xpaths of  Mercury FlightFinderPage by Sudhakar Date:12-Jan-2018
	public static String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
	public static String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";
	public static String MFFPage_PassengersCountListbox="//select[@name='passCount']";
	public static String MFFPage_DepartingFromListbox="//select[@name='fromPort']";
	public static String MFFPage_DepartingStartMonthListbox="//select[@name='fromMonth']";
	public static String MFFPage_DepartingStartDateListbox="//select[@name='fromDay']";
	public static String MFFPage_ArrivingIn="//select[@name='toPort']";
	public static String MFFPage_ReturningEndMonthListbox="//select[@name='toMonth']";
	public static String MFFPage_ReturningEndDateListbox="//select[@name='toDay']";
	public static String MFFPage_EconomyclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Coach']";
	public static String MFFPage_BusinessclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Business']";
	public static String MFFPage_FirstClassRadioButton ="//input[@type='radio' and @name='servClass' and @value='First']";
	public static String MFFPage_AirLineListbox ="//select[@name='airline']";
	public static String MFFPage_ContinueButton ="//*[@name='findFlights']";
	public static String MFFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_flightfinder.gif' and @width='492' and @height='30']";
	//End MercuryFlightFinderPage
	
	
	
	

	public void FlightFinderPage_OneWayBooking() throws Exception {
		// Round trip or Oneway
		driver.findElement(By.xpath(FlightFinder.MFFPage_OneWayRadiobutton)).click();
		
		//Selecting Passengers count
		Select select = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_PassengersCountListbox)));
		select.selectByIndex(1);  //  2 is selected in list box

		//Selecting Departing From
		Select select1 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_DepartingFromListbox)));
		select1.selectByIndex(2); //London is selected in list box
		
		//Selecting Departing Month
		Select select2 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_DepartingStartMonthListbox)));
		select2.selectByIndex(2); //February is selected in list box
	
		//Selecting Departing DD
		Select select3 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_DepartingStartDateListbox)));
		select3.selectByIndex(2); //3 is selected in list box
		
		//Selecting Arriving In
		Select select4 = new Select(driver.findElement(By.xpath(FlightFinder.MFFPage_ArrivingIn)));
		select4.selectByIndex(2); //NewYork is selected in list box

	}
	
	
	
	
	
	
	
	

}












