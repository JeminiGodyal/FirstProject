package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestStudy_3 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	FileInputStream MyFile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
	Sheet MySheet = WorkbookFactory.create(MyFile).getSheet("Sheet1");
	int totalRows = MySheet.getLastRowNum()	;
	int totalCell = MySheet.getRow(0).getLastCellNum()-1;
	
	
	for (int i = 0; i <=totalRows; i++)
	{
		for (int j = 0; j <=totalCell; j++)
		{
			String value = MySheet.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value+" ");
		}
		
		System.out.println();
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
