package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_LoginPage 
{
	@FindBy(id="userid") private WebElement userID;
	@FindBy(id="password") private WebElement password;
	@FindBy(xpath="//button[@type='submit']") private WebElement loginButton;
	@FindBy(xpath="//span[text()='Password should be minimum 6 characters.']") private WebElement PasswordErrorMessage;
	
	public Kite_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}	
	
	public void enterUID(String userN)
	{	
		userID.sendKeys(userN);	
	}
	
	public void enterpwd(String passWD)
	{
		password.sendKeys(passWD);	
	}
	
	public void clickOnLogin()
	{
		
		loginButton.click();
	}
	
	public String passwordError()
	{
		
		PasswordErrorMessage.isDisplayed();
		return PasswordErrorMessage.getText();
		
	}
	
	
	
	
	
	
}
