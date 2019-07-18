package com.webdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTables {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	driver.switchTo().frame("rightMenu");
	//Count rows and columns on web table
	int rows=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr")).size();
	List<WebElement> rowss=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr"));
	System.out.println("Total rows="+rowss.size());
	System.out.println(rows);
	
	int columns=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr[1]/td")).size();
	System.out.println("Total columns="+columns);
	
	int rowscolumns=driver.findElements(By.xpath("//table[@class='data-table']/tbody/tr/td")).size();
	
	System.out.println("Total rows and columns="+rowscolumns);
	
	for(int i=1;i<rows;i++)
	{
	String data=driver.findElement(By.xpath("//table[@class='data-table']/tbody/tr["+i+"]/td[3]/a")).getText();
		System.out.println(data);
	}
	driver.close();

	
	
	
	
}
}
