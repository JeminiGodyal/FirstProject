package BasePackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

import UtilityPackage.UtilityClass_usingPropertiesFile;

public class Base_class 
{
	 public WebDriver driver;
	
	public void LaunchBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		Reporter.log("initializing chrome driver", true);
		driver=new ChromeDriver();
		Reporter.log("driver initialized successfully", true);
		Reporter.log("entering url", true);
		//driver.get(url);
		driver.get(UtilityClass_usingPropertiesFile.readDataFromPropertiesFile("URL"));
		Reporter.log("Taken url successfully", true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	}
	
	public void CloseBrowser()
	{
		driver.close();
		Reporter.log("browser is successfully closed", true);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
