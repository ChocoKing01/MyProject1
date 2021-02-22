package someSubject;

import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AllValues {

 public void writeExcel(String filePath,String fileName,String sheetName,String[] dataToWrite) throws IOException{

	     

	        File file =    new File(filePath+"\\"+fileName);

	        FileInputStream inputStream = new FileInputStream(file);

	        Workbook myexcelworkbook = null;
	        
	        String fileExtensionName = fileName.substring(fileName.indexOf("."));

	        if(fileExtensionName.equals(".xlsx")){

	        	myexcelworkbook = new XSSFWorkbook(inputStream);

	        }

	        else if(fileExtensionName.equals(".xls")){

	        	myexcelworkbook = new HSSFWorkbook(inputStream);

	        }        

	    Sheet sheet = myexcelworkbook.getSheet(sheetName);

	    //Get the current count of rows in excel file

	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

	    //Get the first row from the sheet

	    Row row = sheet.getRow(0);

	    //Create a new row and append it at last of sheet

	    Row newRow = sheet.createRow(rowCount+1);

	    //Create a loop over the cell of newly created Row

	    for(int j = 0; j < row.getLastCellNum(); j++){

	        //Fill data in row

	        Cell cell = newRow.createCell(j);

	        cell.setCellValue(dataToWrite[j]);

	    }

	    //Close input stream

	    inputStream.close();

	    //Create an object of FileOutputStream class to create write data in excel file

	    FileOutputStream outputStream = new FileOutputStream(file);

	    //write data in the excel file

	    myexcelworkbook.write(outputStream);

	    //close output stream

	    outputStream.close();
		
	    }

	    public static void main(String...strings) throws IOException{

	        //Create an array with the data in the same order in which you expect to be filled in excel file

	        String[] valueToWrite = {"1","Noida"};

	        //Create an object of current class

	        AllValues objExcelFile = new AllValues();

	        //Write the file using file name, sheet name and the data to be filled

	        objExcelFile.writeExcel(System.getProperty("user.dir")+"\\ExcelFiles","ExportExcel.xlsx","WebTablesValues",valueToWrite);

	    }
	    
}


