package KiteUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_HomePage
{
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;
					
	//Step2. Create constructor
					
	public Kite_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
						
	//Step3. Create Methods
					
	public void ValidateUserID(String uN)
	{
		 String ExpectedUsername="un";	
				
		String actualUsername=userID.getText();
				
		if (actualUsername.equals(ExpectedUsername)) 
		   {
			System.out.println("UserId matching test case is passed");	
			}
				
		else 
			
			System.out.println("UserId not matching so test case is failed");	
	}
				
		public void logout() throws InterruptedException
			{
			userID.click();
			Thread.sleep(1000);
			LogOutButton.click();
			}
}
