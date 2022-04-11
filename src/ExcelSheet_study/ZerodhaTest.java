package ExcelSheet_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaTest {

	public static void main(String[] args) throws InterruptedException 
	{
      System.setProperty("webDriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver=new ChromeDriver();
	driver.get ("https://kite.zerodha.com/");	
	
	Thread.sleep(1000);
	driver.findElement(By.id("userid")).sendKeys("HD5857"); //sending username
	Thread.sleep(1000);	
	driver.findElement(By.id("password")).sendKeys("Ajinkya@123");
	Thread.sleep(1000); //sending password
		
	driver.findElement(By.id("//button[@type='submit']")).click(); //clicking on continue
	Thread.sleep(1000);	
	
		
	String expectedUserName = "HD5857";
	
	WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
	String actualUserName = UserName.getText();
	
	if(expectedUserName.equals(actualUserName))
	{
		System.out.println("User name is matching TC is passed");
	}
	
	else {
		System.out.println("User name is not matching TC is failed");
		
	}

	Thread.sleep(2000);
	UserName.click();// clicking on username
	Thread.sleep(100);
	driver.findElement(By.xpath("//a[@target='_self']")).click();//clicking on logout button
	
	driver.close();		
			
		
	}

}
