package DDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page 
{

	@FindBy(xpath = "//span[@class='user-id']") private WebElement AUserName;
	@FindBy(xpath = "//a[@target='_self']") private WebElement LogOut;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void ValidateUsername(String Eusername)
	{
		String ActualUsername = AUserName.getText();
		if (Eusername.equals(ActualUsername)) 
		{
			System.out.println("TC is pass");
		}
		else 
		{
		System.out.println("TC is failed");	
		}
	}		
		public void ClickOnLogout() throws InterruptedException
		{   
			AUserName.click();
			Thread.sleep(500);
			LogOut.click();
		}
	
	
}	
	

