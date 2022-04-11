package Selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot2 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(500);
		 
		
		RandomString str=new RandomString(3);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Thread.sleep(500);
		File destination=new File("F:\\JEMINI AUTOMATION NOTES\\screenshotSaved\\jem"+str+".png");
		FileHandler.copy(source, destination);
		
		driver.close();
		
		
		
		
		
		
		
		
	}

}
