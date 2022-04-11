package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read__TableData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	//create an object of File input stream and give path along with file name and extension
	FileInputStream Myfile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
    
	//String value1 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	 
	//System.out.println("Data for excel is "+value1);
	
	//double value2 = WorkbookFactory.create(Myfile).getSheet("Sheet1").getRow(0).getCell(2).getNumericCellValue();
	//System.out.println("Data for excel is "+value2 );
	
	Workbook file = WorkbookFactory.create(Myfile);
	Sheet MySheet = file.getSheet("Sheet1");
	//get row will return a row type
	Row myRow = MySheet.getRow(0);
	//get cell will return cell type
	Cell Mycell = myRow.getCell(0);
	//getStringCellValue will return String type value
	String MyValue = Mycell.getStringCellValue();
	System.out.println(MyValue);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
