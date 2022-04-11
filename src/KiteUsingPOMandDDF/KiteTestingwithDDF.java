package KiteUsingPOMandDDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KiteTestingwithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\JEMINI AUTOMATION NOTES\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");//you are asking not to open the browser
		opt.addArguments("incognito");
		
		
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		FileInputStream MyFile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
		 Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet4");
		 Thread.sleep(1000);
		//fetch UN ,PASSWORD and PIN
		 String UN = MySheet.getRow(0).getCell(0).getStringCellValue();
		 String PWD = MySheet.getRow(0).getCell(1).getStringCellValue();
		   String pIN = MySheet.getRow(0).getCell(2).getStringCellValue();
		 Thread.sleep(2000);
		 
		 KiteLoginPage login=new KiteLoginPage(driver);
		 login.enterUserID(UN);
		 login.enterPassword(PWD);
		 login.ClickOnLoginButton();
		 
		 Thread.sleep(2000);
		 
		 Kite_PinPage kpin=new Kite_PinPage(driver);
		 kpin.EnterPin(pIN);
		 kpin.ClickOnContinueButton();
		 Thread.sleep(1000);
		 
		 Kite_HomePage hp=new Kite_HomePage(driver);
		 hp.ValidateUserID(UN);
		 hp.logout();
		 
		 driver.close();
		 
		 
		  
		 
		 
		
	}

}
