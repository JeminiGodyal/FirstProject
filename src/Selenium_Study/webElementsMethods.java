package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webElementsMethods {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	driver.findElement(By.linkText("Sign up for Facebook")).click();
	Thread.sleep(2000);
	//Step1
	WebElement DayDropbox=driver.findElement(By.id("day"));
	
	//Step2
	Select s=new Select(DayDropbox);
	
	//Step3
	s.selectByValue("4");
	
	WebElement MonthDropbox=driver.findElement(By.id("month"));
	Select m=new Select(MonthDropbox);
	m.selectByVisibleText("Oct");
	
		
		
	WebElement YearDropbox=driver.findElement(By.id("year"));
	Select y=new Select(YearDropbox);
	y.selectByIndex(27);
	
		
		
	}

}
