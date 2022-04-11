package VerificationUsingTestNG_Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void M1() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);	
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
	   checkBox.click();
		if (checkBox.isSelected())
	   {
		System.out.println("checkbox is already selected hence TC is failed");
	    } 
	   else {
		System.out.println("checkbox is not selected TC is passed");
	       }
	   driver.close();
	   
	   
  }
}
