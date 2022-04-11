package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/dragndrop");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement source = driver.findElement(By.xpath("(//div[@id='draggable'])"));
		Thread.sleep(1000);
		WebElement target = driver.findElement(By.xpath("(//div[@id='droppable'])"));
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		//act.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
		act.dragAndDrop(source,target).perform();
		
		
		
		
		
	}

}
