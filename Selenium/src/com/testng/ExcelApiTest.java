package com.testng;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelApiTest {
	public FileInputStream fis = null;
	   public static XSSFWorkbook workbook = null;
	   public static XSSFSheet sheet = null;
	   public static XSSFRow row = null;
	   public XSSFCell cell = null;
	   String xlFilePath;
	 
	   public ExcelApiTest(String xlFilePath) throws Exception
	   {
	       this.xlFilePath = xlFilePath;
	       fis = new FileInputStream(xlFilePath);
	       workbook = new XSSFWorkbook(fis);
	       fis.close();
	   }
	 
	   public int getRowCount(String sheetName)
	   {
	       sheet = workbook.getSheet(sheetName);
	       int rowCount = sheet.getLastRowNum()+1;
	       return rowCount;
	   }
	 
	   public int getColumnCount(String sheetName)
	   {
	       sheet = workbook.getSheet(sheetName);
	       row = sheet.getRow(0);
	       int colCount = row.getLastCellNum();
	       return colCount;
	   }

	public static String[][] getCellData(String sheetName, int j, int i) {
		
		int col_Num=-1;
		sheet=workbook.getSheet(sheetName);
		row=sheet.getRow(0);
		int rowcount = sheet.getLastRowNum();
		  int cellcount = sheet.getRow(0).getLastCellNum();
		  String data[][] = new String[rowcount][cellcount];
		  for ( i = 1; i <= rowcount; i++) {
		   Row r = sheet.getRow(i);
		   for (j = 0; j < cellcount; j++) {
		   Cell c = r.getCell(j);
		try {
		if (c.getCellType() == c.CELL_TYPE_STRING) {
		      data[i - 1][j] = c.getStringCellValue();
		} 
		else
		 {
		      data[i - 1][j] = String.valueOf(c.getNumericCellValue());
		}
		} catch (Exception e) {
		     e.printStackTrace();
		}
		   }
		  }
		  return data;
}
}
