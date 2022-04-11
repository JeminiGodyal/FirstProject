package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://byjus.com/free-ias-prep/functions-of-the-parliament/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.className("close")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='UPSC Preparation Strategy']")).click();
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
