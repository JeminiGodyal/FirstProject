package POMpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PinPage
{
	@FindBy(id="pin") private WebElement pin;
	@FindBy(xpath="//button[@type='submit']") private WebElement continueButton;
	
	public Kite_PinPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void enterPin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickOnContinue()
	{
		continueButton.click();
	}
}
