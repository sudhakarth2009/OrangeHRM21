package  Day_030_PageFactory;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
public class FlightFinder
{
	
	WebDriver driver;
	public FlightFinder(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
// All xpaths of  Mercury FlightFinderPage by Sudhakar Date:12-Jan-2018
public static final String MFFPage_OneWayRadiobutton="//input[@type='radio'and @name='tripType' and @value='oneway' ]";
public static final String MFFPage_RoundTripRadiobutton="//input[@type='radio'and @name='tripType' and @value='roundtrip' ]";
public static final String MFFPage_PassengersCountListbox="//select[@name='passCount']";
public static final String MFFPage_DepartingFromListbox="//select[@name='fromPort']";
public static final String MFFPage_DepartingStartMonthListbox="//select[@name='fromMonth']";
public static final String MFFPage_DepartingStartDateListbox="//select[@name='fromDay']";
public static final String MFFPage_ArrivingIn="//select[@name='toPort']";
public static final String MFFPage_ReturningEndMonthListbox="//select[@name='toMonth']";
public static final String MFFPage_ReturningEndDateListbox="//select[@name='toDay']";
public static final String MFFPage_EconomyclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Coach']";
public static final String MFFPage_BusinessclassRadioButton="//input[@type='radio' and @name='servClass' and @value='Business']";
public static final String MFFPage_FirstClassRadioButton ="//input[@type='radio' and @name='servClass' and @value='First']";
public static final String MFFPage_AirLineListbox ="//select[@name='airline']";
public static final String MFFPage_ContinueButton ="//*[@name='findFlights']";
public static final String MFFPage_SelectFlightImg ="//img[ @src='/images/masts/mast_flightfinder.gif' and @width='492' and @height='30']";
//End MercuryFlightFinderPage
		
		
	
	
	
	// All xpaths of Login Page only
		@FindBy(xpath=MFFPage_OneWayRadiobutton)
	    WebElement OneWay;
		
		@FindBy(xpath=MFFPage_PassengersCountListbox)
	    WebElement Passengers;
		
		@FindBy(xpath=MFFPage_DepartingFromListbox)
	    WebElement Departing_From;
		
		@FindBy(xpath=MFFPage_DepartingStartMonthListbox)
	    WebElement DepartingStartMonth;
		
		@FindBy(xpath=MFFPage_DepartingStartDateListbox)
	    WebElement DepartingStartDate;
		
		@FindBy(xpath=MFFPage_ArrivingIn)
	    WebElement ArrivingIn;
		
	 //end MercuryLoginPage
		
		
		
	
	

public void FlightFinderPage_OneWayBooking() throws Exception {
		
		// Round trip or Oneway
		OneWay.click();
		
		//Selecting Passengers count
		Select select = new Select(Passengers);
		select.selectByIndex(1);  //  2 is selected in list box

		//Selecting Departing From
		Select select1 = new Select(Departing_From);
		select1.selectByIndex(2); //London is selected in list box
		
		//Selecting Departing Month
		Select select2 = new Select(DepartingStartMonth);
		select2.selectByIndex(2); //February is selected in list box
	
		//Selecting Departing DD
		Select select3 = new Select(DepartingStartDate);
		select3.selectByIndex(2); //3 is selected in list box
		
		//Selecting Arriving In
		Select select4 = new Select(ArrivingIn);
		select4.selectByIndex(2); //NewYork is selected in list box
	}
}















