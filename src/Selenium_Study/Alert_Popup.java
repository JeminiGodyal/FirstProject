package Selenium_Study;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {

	public static void main(String[] args) throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.switchTo().frame("iframeResult");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	Thread.sleep(2000);
	Alert alt=driver.switchTo().alert();
	Thread.sleep(2000);
	
	String alerttxt=alt.getText();
	Thread.sleep(2000);
	System.out.println(alt.getText());
	alt.accept();
	
	
//	driver.switchTo().parentFrame();
//	driver.switchTo().defaultContent();	

	
		
		
		
		
		
		
	}

}
