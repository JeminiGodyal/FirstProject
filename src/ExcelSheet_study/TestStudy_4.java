package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestStudy_4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream MyFile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
	Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
	
	//STRING, NUMERIC, BOOLEAN
	CellType type1 = Mysheet.getRow(0).getCell(0).getCellType();
	CellType type2 = Mysheet.getRow(0).getCell(1).getCellType();
	CellType type3 = Mysheet.getRow(0).getCell(2).getCellType();
	CellType type4 = Mysheet.getRow(0).getCell(3).getCellType();
	CellType type5 = Mysheet.getRow(0).getCell(4).getCellType();
	CellType type6 = Mysheet.getRow(0).getCell(5).getCellType();
	
	System.out.println(type1);	
	System.out.println(type2);
	System.out.println(type3);	
	System.out.println(type4);
	System.out.println(type5);
	System.out.println(type6);
		
	String value1 = Mysheet.getRow(0).getCell(0).getStringCellValue();
	String value2 = Mysheet.getRow(0).getCell(1).getStringCellValue();
	String value3 = Mysheet.getRow(0).getCell(2).getStringCellValue();
	boolean value4 = Mysheet.getRow(0).getCell(3).getBooleanCellValue();
	String value5 = Mysheet.getRow(0).getCell(4).getStringCellValue();
    double value6 = Mysheet.getRow(0).getCell(5).getNumericCellValue();
		
	System.out.println(value6);	
	System.out.println(value1);
	System.out.println(value2);
	System.out.println(value3);
	System.out.println(value4);
	System.out.println(value5);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
