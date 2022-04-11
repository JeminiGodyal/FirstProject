package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
  {
	//Step1. Variable Declaration
	@FindBy(xpath="//span[@class='user-id']") private WebElement userID;
	@FindBy(xpath="//a[@target='_self']") private WebElement LogOutButton;
					
	//Step2. Create constructor
					
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
						
	//Step3. Create Methods
					
	public void ValidUserID()
	{
		 String ExpectedUserID="HD5857";	
				
		String actualUserID=userID.getText();
				
		if (actualUserID.equals(ExpectedUserID)) 
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