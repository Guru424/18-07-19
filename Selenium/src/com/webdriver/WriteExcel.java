package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	
	FileInputStream file=new FileInputStream("D:\\output.xlsx");
	XSSFWorkbook     wb=new XSSFWorkbook(file);
	XSSFSheet        sh=wb.getSheetAt(0);
	
	XSSFRow  row=sh.createRow(4);
	XSSFCell  cell=row.createCell(0);
	
   cell. setCellType(Cell.CELL_TYPE_STRING);
   String d="Hello..Welcome to selenium training";
   cell.setCellValue(d);
   
   FileOutputStream  fo=new FileOutputStream("D:\\output.xlsx");
   wb.write(fo);;
   fo.close();
   
   
	
}
}
