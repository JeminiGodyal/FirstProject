package DDF2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage
{
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath ="//button[@type='submit']") private WebElement Continue;

	public PinPage(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterPin(String pin)
	{
		PIN.sendKeys(pin);
		
	}
	
	public void clickOnContinue() throws InterruptedException
	{
		
		Continue.click();
		Thread.sleep(500);
	}


}
