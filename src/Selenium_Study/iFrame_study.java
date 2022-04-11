package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame_study {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	Thread.sleep(1000);
		
	driver.manage().window().maximize();
	driver.switchTo().frame("iframeResult");
	//switching selenium focus to frame
	WebElement ClickMeButton = driver.findElement(By.xpath("//button[contains(text(),'Click me to display Date and Time')]"));	
	Thread.sleep(2000);
	
	//taking action on element
	ClickMeButton.click();
	Thread.sleep(2000);
	//switching back selenium focus to main page
	driver.switchTo().defaultContent();
	Thread.sleep(2000);
	 //taking actions on elements on main page
	
	driver.findElement(By.xpath("(//a[@title='Change Theme'])[1]")).click();
	
		
	}

}
