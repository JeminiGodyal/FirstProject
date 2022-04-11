package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Teststudy_1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream Myfile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
	Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet2");
	String value1 = Mysheet.getRow(2).getCell(4).getStringCellValue();	
	String value2 = Mysheet.getRow(2).getCell(0).getStringCellValue();	
	String value3 = Mysheet.getRow(2).getCell(1).getStringCellValue();	
	System.out.println(value1);	
	System.out.println(value2);
	System.out.println(value3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
