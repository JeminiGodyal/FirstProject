package Selenium_Study;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectBox_MultiSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Win\\Downloads\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		//1.Identify list box to be handled and store it in reference variable
		WebElement multiselect_box = driver.findElement(By.id("cars"));
		Thread.sleep(1000);
		
		//2.create object of select class
		Select s=new Select(multiselect_box);
		
		//3.checking drop down can have multiselect options
		boolean result = s.isMultiple();
		System.out.println("is multiple result is"+result);
		
		//1.select by visible text,value and index------
		s.selectByVisibleText("Volvo");
		s.selectByValue("opel");
		s.selectByIndex(3);
		
		System.out.println("first selected option is"+s.getFirstSelectedOption().getText());
		s.deselectByIndex(3);
		Thread.sleep(1000);
		s.deselectAll();
		Thread.sleep(1000);
		System.out.println("all selected options are"+s.getAllSelectedOptions());
		
		
		
		
		
		
		
	}

}
