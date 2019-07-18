package com.webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class JXLExcel {
public static void main(String[] args) throws BiffException, IOException {
	
	FileInputStream file=new FileInputStream("D:\\Guru\\input.xls");
	Workbook         wb=Workbook.getWorkbook(file);
	Sheet            sh=wb.getSheet(0);
	System.out.println(sh.getName());
	
	int rows=sh.getRows();
	int colums=sh.getColumns();
	System.out.println("Total rows="+rows);
	System.out.println("Total columns="+colums);
	
	//String user=sh.getCell(0, 1).getContents();
	//System.out.println("My username is="+user);
	
	for(int i=0;i<rows;i++)
	{
		String user=sh.getCell(0, i).getContents();
		String pwd=sh.getCell(1, i).getContents();
		System.out.println("My username is="+user);
		System.out.println("My password is="+pwd);
	}
	
}
}
