package DDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogijnPage 
{
	@FindBy(id="userid") private WebElement UserId;
	@FindBy(id="password") private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']") private WebElement LoginButton;
	
	public LogijnPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	 
	public void enterUserId(String Username)
	{
	UserId.sendKeys(Username);
	}
	
	public void enterPassword(String PWD) 
	{
		Password.sendKeys(PWD);
	}
	
	public void ClickOnLogin() throws InterruptedException 
	{
		LoginButton.click();
		Thread.sleep(500);
	}

	
	
	
	
}
