package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 

public class ExcelDataAccess {
	
	    //identify TestCases column by scanning the entire 1st row
		//once testCases identified then scan entire test case column to identify purchase testCase
		//after you grab purchase test case row = pull all the data of that row and feed into test

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
        File f= new File("D:\\Selenium\\eclipse-java-2022-12-R-win32-x86_64\\eclipse-java-2022-12-R-win32-x86_64\\eclipse\\projects-workspace\\Selenium\\Excel\\ExcelDemo.xlsx");
	    FileInputStream fis= new FileInputStream(f);
	 
	    XSSFWorkbook wb =new XSSFWorkbook(fis);
	    System.out.println(wb.getSheetName(0));
	    // int sheets = wb.getNumberOfSheets();
	    int seets = wb.getNumberOfSheets();
	    for(int i=0;i<seets;i++)
	    {
	    	if(wb.getSheetName(i).equalsIgnoreCase("Testdata"))
	    	{
	    		XSSFSheet sheet = wb.getSheetAt(i);
	    		Iterator<Row> rows=sheet.iterator();
				Row firstRow=rows.next();
				System.out.println(firstRow.getCell(1));
				Iterator<Cell> ce=firstRow.cellIterator();//row is collection of cells
				int k=1;
				int column=0;
				while(ce.hasNext())
				{
				
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("LOC"))
					{
						
						column=k;
				    }
					k++;
					
			}
				System.out.println("Column number :" + column);
	    	}
	    	
	    	
	    	
	    }
	    
				
				
				
		
				

	}

}
