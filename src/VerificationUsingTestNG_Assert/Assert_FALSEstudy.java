package VerificationUsingTestNG_Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_FALSEstudy 
{
    @Test
   public void method1() throws InterruptedException
   {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
    	driver.get("https://vctcpune.com/selenium/practice.html#contact");
    	Thread.sleep(500);
    	driver.manage().window().maximize();
    	WebElement checkbox1 = driver.findElement(By.id("checkBoxOption1"));
    	checkbox1.click();
    	//Assert.assertTrue(checkbox1.isSelected(),"TC is pass");
    	Assert.assertFalse(checkbox1.isSelected(),"TC has failed");
    }


}







