package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest 
{
  @Test
  public void f() throws InterruptedException
  {
	  System.setProperty("webdriver.gecko.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(500);
	  driver.close();
  }
  
  
  
  
  
}
