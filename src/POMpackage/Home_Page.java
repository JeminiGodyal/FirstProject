package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Home_Page 
{
  @FindBy(xpath="//span[@class='user-id']") private WebElement UserID;
  @FindBy(xpath="//a[@target='_self']") private WebElement Logout;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateUserID(String ExpectedUID)
	{
		String ActualUserId = UserID.getText();
		if (ExpectedUID.equals(ActualUserId))
		{
		System.out.println("TC is passed");	
		}
		else 
		{
		System.out.println("TC is failed");	
		}
		
	}
	
	public void ClickLogoutButton() throws InterruptedException
	{
		UserID.click();
		Thread.sleep(300);
		Logout.click();	
		
	}
	
	
	
	
	
	
}
