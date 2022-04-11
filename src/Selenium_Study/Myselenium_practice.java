
package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Myselenium_practice {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/webhp?authuser=1&pli=1");
	
		Thread.sleep(500);
		
	  //driver.get("https:vctcpune.com/");
	  
	  //Thread.sleep(1000);
	  //driver.close();
	  //driver.manage().window().maximize();
	 // driver.manage().window().minimize();
	  //driver.navigate().back();
	  //driver.navigate().forward();
//	  System.out.println(driver.getTitle());
//	  driver.get("https://www.youtube.com/results?search_query=bum+bum+bole+song+");
//	  Thread.sleep(1000);
//	  driver.findElement(By.xpath("//img[@id='image']")).click();
//	  
	  
	  driver.get("https://www.youtube.com/");
	  Thread.sleep(500);
	  driver.manage().window().maximize();
	  Thread.sleep(1000);
	  Actions act=new Actions(driver);
	 WebElement element = driver.findElement(By.xpath("//input[@id='search']"));
	  act.keyDown("peppa pig").keyDown(Keys.ENTER);
	  //sendKeys("peppa pig",Keys.ENTER);
	  
	  Thread.sleep(200);
	  //driver.findElement(By.id("search-icon-legacy")).click();
	  driver.findElement(By.className("style-scope ytd-video-renderer")).click();
	  
	  
	  
	  
	  
	  
	  
	}

}
