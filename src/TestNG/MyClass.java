package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyClass
{
	private static final String priority = null;

	@Test
  public void method1() throws InterruptedException 
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		driver.close();
  }
	@BeforeTest
	public void method2() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://web.whatsapp.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		driver.close();
	}
	
	@Test(priority=-1)
	public void method3() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.close();
		
	}
	
	@Test(invocationCount = 2)
	public void method4() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
}
