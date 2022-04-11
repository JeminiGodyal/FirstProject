package KiteUsingPOMandDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kite_PinPage
{
    @FindBy(id="pin") private WebElement Pin;
    @FindBy(xpath="//button[@type='submit']") private WebElement ContinueButton;
    
    public Kite_PinPage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }
    
	public void EnterPin(String realpin)
    {
    	Pin.sendKeys(realpin);
    }
    
    public void ClickOnContinueButton()
    {
    	ContinueButton.click();
    }
 
}
