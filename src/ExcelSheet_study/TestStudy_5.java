package ExcelSheet_study;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestStudy_5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream MyFile=new FileInputStream("F:\\JEMINI AUTOMATION NOTES\\Excel sheet\\Book1.xlsx");
		Sheet Mysheet = WorkbookFactory.create(MyFile).getSheet("Sheet3");
		
		int totalRows = Mysheet.getLastRowNum();
		
		int totalCell = Mysheet.getRow(0).getLastCellNum()-1;
		
		for (int i = 0; i <=totalRows; i++) 
		{
			for (int j = 0; j <=totalCell; j++)
			{
			Cell Info = Mysheet.getRow(i).getCell(j);
			CellType Type = Info.getCellType(); //numeric, string, boolean
			
			if (Type==CellType.STRING) 
			{
				String value = Info.getStringCellValue();
				System.out.print(value+" ");
				
			}
			
			else if (Type==CellType.BOOLEAN) 
			{
				boolean value = Info.getBooleanCellValue();
				System.out.print(value+" ");
				
			}
			
			else if (Type==CellType.NUMERIC)
			{
				double value = Info.getNumericCellValue();
				System.out.print(value+" ");
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
