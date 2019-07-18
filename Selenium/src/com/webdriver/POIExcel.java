package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POIExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\Guru\\input.xlsx");
	XSSFWorkbook     wb=new XSSFWorkbook(file);
	XSSFSheet        sh=wb.getSheet("Sheet1");
	
	//count the rows
	int rows=sh.getLastRowNum() - sh.getFirstRowNum()+1;
	System.out.println("Total number of rows="+rows);
	

	XSSFRow  row=sh.getRow(2);
	XSSFCell  cell=row.getCell(0);
	
	System.out.println("Cell data="+cell);
	
	for(int i=0;i<rows;i++)
	{
		Row r=sh.getRow(i);
		for(int j=0;j<r.getLastCellNum();j++){
			System.out.println(r.getCell(j).getStringCellValue());
		}
	}
}
}
