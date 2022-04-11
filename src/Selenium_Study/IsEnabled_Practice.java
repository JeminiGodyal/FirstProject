package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled_Practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(1000);
		
		//driver.findElement(By.id("mobileNumber")).sendKeys("9923810106");
		WebElement getotpbutton=driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		boolean Buttonstatus=getotpbutton.isEnabled();
		System.out.println("get otp button status is: "+Buttonstatus);
		
		
		
		
		
		
		
		
		
	}

}
