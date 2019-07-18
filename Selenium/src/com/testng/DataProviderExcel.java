package com.testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExcel {

/*	static String xlFilePath="D:\\Guru\\input.xlsx";
	String sheetName="Sheet1";
	//static ExcelApiTest  eat=null;
*/	
	@Test(dataProvider="credentials")
	public void login(String user,String pwd){
		System.out.println("User name is="+user);
		System.out.println("Pwd name is="+pwd);
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}
	@DataProvider
	public Object[][] credentials() throws Exception{
		Object[][] data=DataProviderEx.getData("Sheet1");
		return data;
		
	
	}
}
