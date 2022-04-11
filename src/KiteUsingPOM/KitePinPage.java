package KiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage 
{
	//Step1. Variable Declaration
		@FindBy(id="pin") private WebElement Pin;
		@FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;
			
	//Step2. Create constructor
			
	public KitePinPage(WebDriver driver)
	{
	    PageFactory.initElements(driver,this);
	}
				
	//Step3. Create Methods
			
	public void enterPin()
	{
	    Pin.sendKeys("969696");
	}
							
	public void ClickOnContinue()	
	{
	    ContinueButton.click();
	}
				

		}


