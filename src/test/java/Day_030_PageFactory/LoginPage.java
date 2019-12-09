package  Day_030_PageFactory;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	// starts MercuryLoginPage by Sudhakar Date:12-Jan-2018
	public static final String MLPage_UserNameTextbox="//input[@type='text'and @name='userName']";
	public static final String MLPage_PasswordTextbox="//input[@type='password' and @name='password']";
	public static final String MLPage_SignInButton="//*[@name='login']";
	//end MercuryLoginPage 
	
	
	// All xpaths of Login Page only
	  @FindBy(xpath=MLPage_UserNameTextbox)
	    WebElement UserName;  

	    @FindBy(xpath=MLPage_PasswordTextbox)
	    WebElement Password;    

	    @FindBy(xpath=MLPage_SignInButton)
	    WebElement SignInButton;

	 //end MercuryLoginPage

	public void Login() throws Exception {
		
		UserName.clear();
		UserName.sendKeys("mercury");
		
		Password.clear();
		Password.sendKeys("mercury");
	
		SignInButton.click();

	}
	
	
	
	
}
















