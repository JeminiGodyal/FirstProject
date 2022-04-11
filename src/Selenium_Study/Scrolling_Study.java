package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Study {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
//		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollBy(0,999)");
//		Thread.sleep(1000);
//		
//		js.executeScript("window.scrollBy(0,-500)");
		WebElement mouseButton = driver.findElement(By.xpath("//legend[text()='Mouse Hover Example']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",mouseButton);
		System.out.println(mouseButton.getText());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
