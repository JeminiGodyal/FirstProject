package DDF2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestingApp {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);
		
		FileInputStream Myfile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet4");
		 String UN = Mysheet.getRow(0).getCell(0).getStringCellValue();
		 String PWD = Mysheet.getRow(0).getCell(1).getStringCellValue();
		 String PIN = Mysheet.getRow(0).getCell(2).getStringCellValue();
		
		LogijnPage login=new LogijnPage(driver);
		login.enterUserId(UN);
		login.enterPassword(PWD);
		login.ClickOnLogin();
	
		PinPage pin=new PinPage(driver);
		pin.enterPin(PIN);
		pin.clickOnContinue();
		
		Home_Page Hm= new Home_Page(driver);
		Hm.ValidateUsername(UN);
		Hm.ClickOnLogout();
		driver.close();
	}
	

}
