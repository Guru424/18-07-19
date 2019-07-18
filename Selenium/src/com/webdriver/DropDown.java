package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/RH0172/Downloads/goBackAndWait%20%283%29.html");
	
	//First Method
	driver.findElement(By.name("OptWeb")).sendKeys("Yahoo");
	driver.findElement(By.name("btnGo")).click();
	
	//Navigate to back
	driver.navigate().back();
	
	//Second Method
	WebElement drop=driver.findElement(By.name("OptWeb"));
	Select select=new Select(drop);
	select.selectByIndex(3);
	driver.findElement(By.name("btnGo")).click();
	
	
	driver.close();
	
}
}
