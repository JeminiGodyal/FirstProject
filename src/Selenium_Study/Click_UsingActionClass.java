package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_UsingActionClass {  //ContextClick example

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
	Thread.sleep(1000);
	
	Actions act=new Actions(driver);
	Thread.sleep(1000);
	
	//act.moveToElement(rightClickButton).perform();
	//act.contextClick().perform(); this method is for right click on element
	
	
	act.contextClick(rightClickButton).perform();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
