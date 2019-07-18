package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataProviderEx {

	static XSSFWorkbook book;
	static XSSFSheet sheet;
	public static String excelpath="D:\\Guru\\input.xlsx";
	
	public static Object[][] getData(String sheetName) throws IOException{
		FileInputStream file=null;
		file =new FileInputStream(excelpath);
		book=new XSSFWorkbook(file);
		sheet=book.getSheet(sheetName);
		
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for(int i=0;i<sheet.getLastRowNum();i++){
			for(int j=0;j<sheet.getRow(0).getLastCellNum();j++){
				
				data[i][j] =sheet.getRow(i+1).getCell(j).toString();
			}
		}
		return data;
		
	}
}
