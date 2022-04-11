package UtilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utilityclass 
{
	
	public static String ReadDataFromExcel(String ExcelSheetPath,String sheetName,int row,int column) throws EncryptedDocumentException, IOException
	{
		FileInputStream MyFile=new FileInputStream(ExcelSheetPath);
		Sheet MySheet = WorkbookFactory.create(MyFile).getSheet(sheetName);
		String ValueAtCell = MySheet.getRow(row).getCell(column).getStringCellValue();
		return ValueAtCell;
		
	}
	
	public static void TakeScreenshot(WebDriver driver,String DestinationPath,String Tid ) throws IOException
	{
		RandomString rs=new RandomString(4);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		File Destination=new File(DestinationPath+Tid+rs+".png");
		FileHandler.copy(source, Destination);
	}
	
	
	
}
