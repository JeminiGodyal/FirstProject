package Selenium_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_Study2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("boat bluetooth");
		Thread.sleep(2000);
		List<WebElement> SearchResults = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']"));
		Thread.sleep(2000);
		System.out.println("Total search results are"+SearchResults.size());
		Thread.sleep(1000);
		for (WebElement w : SearchResults)
		{
		System.out.println(w.getText());	
		}
		
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
