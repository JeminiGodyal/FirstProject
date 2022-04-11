package Selenium_Study;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositioningBrowser_Study {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/");
	Thread.sleep(1000);
	//driver.manage().window().maximize();
	Thread.sleep(1000);
	
	//1.create object of point class which will accept x and y value 
	Point pt=new Point(100,400);
	
	//2.use set position and pass object
		driver.manage().window().getPosition();
		
		driver.manage().window().setPosition(pt);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
