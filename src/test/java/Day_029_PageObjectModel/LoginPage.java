package  Day_029_PageObjectModel;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;

public class LoginPage
{
	
	WebDriver driver;
	
	public void LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	// starts MercuryLoginPage only by Sudhakar Date:12-Jan-2018
	public static String MLPage_UserNameTextbox="//input[@type='text'and @name='userName']";
	public static String MLPage_PasswordTextbox="//input[@type='password' and @name='password']";
	public static String MLPage_SignInButton="//*[@name='login']";
	//end MercuryLoginPage 
	
	public void Login() throws Exception {
		
		driver.findElement(By.xpath(LoginPage.MLPage_UserNameTextbox)).clear();
		driver.findElement(By.xpath(LoginPage.MLPage_UserNameTextbox)).sendKeys("mercury");
	
		driver.findElement(By.xpath(LoginPage.MLPage_PasswordTextbox)).clear();
		driver.findElement(By.xpath(LoginPage.MLPage_PasswordTextbox)).sendKeys("mercury");
	
		driver.findElement(By.xpath(LoginPage.MLPage_SignInButton)).click();

	}
}















