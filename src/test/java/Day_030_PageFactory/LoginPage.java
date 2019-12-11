package  Day_030_PageFactory;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage
{
	
	WebDriver driver;
	
	
	public void  LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

	// starts MercuryLoginPage by Sudhakar Date:12-Jan-2018

	
	//end MercuryLoginPage 
	

	
	
	//WebElement UserName=driver.findElement(By.name("userName"));
	
	//WebElement UserName1=driver.findElement(By.name("userName"));
	
	//WebElement Password1=driver.findElement(By.name("password"));
	
	//public static final String MLPage_SignInButton="//*[@name='login']";
	
	 	@FindBy(name="userName")
	    WebElement UserName1;  


	    @FindBy(name="password")
	    WebElement Password1;  
	    
	    @FindBy(name="login")
	    WebElement SignInButton1;  

	    //@FindBy(xpath=MLPage_SignInButton)
	   // WebElement SignInButton1;

	 //end MercuryLoginPage

	public void Login() throws Exception {
		
	
		UserName1.sendKeys("mercury");
		Password1.sendKeys("mercury");
		SignInButton1.click();

	}
	
	
	
	
}
















