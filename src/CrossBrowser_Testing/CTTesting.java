package CrossBrowser_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CTTesting {
 
	@Parameters("browserName")
	@Test
  public void crossBrowserT(String browser) throws InterruptedException
  {
		WebDriver driver = null;
		
	if (browser.equals("firefox")) 
	{
		System.setProperty("webdriver.gecko.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		   driver=new FirefoxDriver();	
	}  
	  
	else if (browser.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");
		   driver=new ChromeDriver();	
	} 
	  
	  driver.get("https://vctcpune.com/");
	  Thread.sleep(1000);
	  driver.close();
	 
  }
}
