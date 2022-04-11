package Selenium_Study;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_study {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
        File sourcescreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String rs = RandomString.make(4);
        
        File destination=new File("C:\\Users\\Win\\Downloads\\Automation\\new screenshot\\screenshot1"+rs+".png");
        
        FileHandler.copy(sourcescreenshot, destination);
        
        
	}

}
