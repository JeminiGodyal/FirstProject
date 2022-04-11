package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage 
{
	//Step1. Variable Declaration
		@FindBy(id="userid") private WebElement UserID;
		@FindBy(id="password") private WebElement Password;	
		@FindBy(xpath="//button[@type='submit']")private WebElement LoginButton;
		
		//Step2. Create constructor
		
		public KiteLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
			
		//Step3. Create Methods
		
		public void enterUserID()
		{
			UserID.sendKeys("HD5857");
		}
			
		public void enterPassword()
		{
			Password.sendKeys("Ajinkya@123");
		}
			
		public void ClickOnLoginButton()	
		{
			LoginButton.click();
		}
}
