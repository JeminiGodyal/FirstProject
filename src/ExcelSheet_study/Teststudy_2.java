package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Teststudy_2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
	FileInputStream MyFile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
	Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	
	for (int i = 0; i<=2; i++) 
	{
	String value1 = MySheet.getRow(i).getCell(0).getStringCellValue();	
	System.out.print(value1);
	
	}
	System.out.println();
	for (int j = 0; j <=1; j++) 
	{
	String value2 = MySheet.getRow(1).getCell(j).getStringCellValue();
	System.out.println(value2);	
	}
	
	//To get last row number
	int lastRownum = MySheet.getLastRowNum();
	System.out.println(lastRownum);	
	
	for (int i = 0; i < lastRownum; i++)
	{
	String value = MySheet.getRow(i).getCell(0).getStringCellValue();
	System.out.println(value);
	
	}
	
	//To get last cell number
	short LastColumnNumber = MySheet.getRow(0).getLastCellNum();
	System.out.println(LastColumnNumber);	
	int totalCell=LastColumnNumber-1;
		
	for (int i = 0; i <=totalCell; i++) 
	{
	String value = MySheet.getRow(0).getCell(i).getStringCellValue();
	System.out.println(value);
	
	}	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
