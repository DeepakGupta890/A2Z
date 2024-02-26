package Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public void readExcel(String filePath,String fileName,String sheetName ) throws IOException

	{

	File file = new File("D:\\Selenium\\eclipse-java-2022-12-R-win32-x86_64\\eclipse-java-2022-12-R-win32-x86_64\\eclipse\\projects-workspace\\Selenium\\Excel\\ExcelDemo.xlsx");

	FileInputStream inputstream = new FileInputStream(file);

	Workbook wb = null;

	String fileExtensionName = fileName.substring(fileName.indexOf(".xlsx"));

	    //Check condition if the file is xlsx file

	    if(fileExtensionName.equals(".xlsx"))

	    {

	      //If it is xlsx file then create object of XSSFWorkbook class

	      wb = new XSSFWorkbook(inputstream);

	    }

	    //Check condition if the file is xls file

	    else if(fileExtensionName.equals(".xls")){

	        //If it is xls file then create object of XSSFWorkbook class

	        wb = new XSSFWorkbook(inputstream);

	    }

	    //Read sheet inside the workbook by its name

	    Sheet sheet = wb.getSheet(sheetName);

	    //Find number of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Create a loop over all the rows of excel file to read it

	    for (int i = 0; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	            //Print Excel data in console

	            System.out.print(row.getCell(j).getStringCellValue()+"|| ");

	        }

	        System.out.println();

	    }

	}



	public static void main(String[] args) throws IOException

	{

	//Create an object of ReadGuru99ExcelFile class

	Excel objExcelFile = new Excel();

	    //Prepare the path of excel file

	    String filePath = System.getProperty("user.dir")+"\\src\\excelExportAndFileIO";

	    //Call read file method of the class to read data

	    objExcelFile.readExcel(filePath,"ExportExcel.xlsx","ExcelData");

	}

}
