package Selenium_Study;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_study {

	public static void main(String[] args) throws InterruptedException
	{
	
	System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("iphone 12");
	Thread.sleep(2000);
	List<WebElement> searchBox = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]"));
	Thread.sleep(1000);
	System.out.println("total results are"+searchBox.size()); //doubt only one output for size
	Thread.sleep(1000);
	for (WebElement w : searchBox) 
	{
	System.out.println(w.getText());	
	}
	Thread.sleep(1000);
	
	
	
	
	
	
	for (WebElement w : searchBox)
	{
	String ExpectedResult = "iPhone 12 pro";
	
	String ActualResult = w.getText();
		
	if (ActualResult.equals(ExpectedResult))
	{
	  w.click();
	  break;
	}
		Thread.sleep(1000);
		driver.findElement(By.linkText("\"/search?q=iphone+12+pro&source=lnms&tbm=isch&sa=X&ved=2ahUKEwimv6m0zr32AhVGr1YBHZZpCC0Q_AUoAnoECAIQBA\"")).click();
	}
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
