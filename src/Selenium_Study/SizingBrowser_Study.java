package Selenium_Study;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizingBrowser_Study {

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	System.out.println(driver.manage().window().getSize());
		//default value(1552,840)
	//create object of dimension class which will accept width and height
	Dimension d=new Dimension(800,700);
	//use setSize method and pass dimension object
	driver.manage().window().setSize(d);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
