package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZerodhaTestWithDDF {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException
	{
     
FileInputStream MyFile= new FileInputStream("D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\exceltest.xlsx");
		
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
		String userName = MySheet.getRow(0).getCell(0).getStringCellValue();
		String password = MySheet.getRow(0).getCell(1).getStringCellValue();
		String pin = MySheet.getRow(0).getCell(2).getStringCellValue();
		
System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Dec-2021 Class\\4thDecEvening\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("userid")).sendKeys(userName);// sending username
		
		driver.findElement(By.id("password")).sendKeys(password);//sending password
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on login button
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("pin")).sendKeys(pin);// sending Pin
		driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on continue button
		
		Thread.sleep(2000);
		
		String expectedUserName = userName;
		
		WebElement UserName = driver.findElement(By.xpath("//span[@class='user-id']"));
		String actualUserName = UserName.getText();
		
		if(expectedUserName.equals(actualUserName))
		{
			System.out.println("User name is matching TC is passed");
		}
		
		else {
			System.out.println("User name is not matching TC is failed");
			
		}

		Thread.sleep(2000);
		UserName.click();// clicking on username
		Thread.sleep(100);
		driver.findElement(By.xpath("//a[@target='_self']")).click();//clicking on logout button
		
		driver.close();
		
		
		
		
	}

}
