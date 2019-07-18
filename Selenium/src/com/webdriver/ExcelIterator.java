package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelIterator {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\Guru\\input.xlsx");
	XSSFWorkbook     wb=new XSSFWorkbook(file);
	XSSFSheet        sh=wb.getSheet("Sheet1");
	
	//count the rows
	int rows=sh.getLastRowNum() - sh.getFirstRowNum()+1;
	System.out.println("Tootal number of rows="+rows);
	
	Iterator<Row> iterator=sh.iterator();
	while(iterator.hasNext())
	{
		Row rownxt=iterator.next();
		Iterator<Cell> celliterator=rownxt.iterator();
		while(celliterator.hasNext())
		{
			Cell cell=celliterator.next();
			
			switch(cell.getCellType())
			{
			case Cell.CELL_TYPE_STRING:
				System.out.print(cell.getStringCellValue());
				break;
			case Cell.CELL_TYPE_NUMERIC:
				System.out.print(cell.getNumericCellValue());
				break;
			case Cell.CELL_TYPE_BOOLEAN:
				System.out.print(cell.getBooleanCellValue());
				break;
			}
			System.out.print(" ");
		}
		System.out.println(" ");
	}
	
	
}
}
