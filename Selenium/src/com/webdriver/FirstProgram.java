package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {
public static void main(String[] args) {
	//Open firefox browser	
	WebDriver driver=new FirefoxDriver();
	
	//maximize the window
	driver.manage().window().maximize();
	
	//Open hrms application
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	//Enter the user name
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	
	//Enter the password
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
	
	//Click on login button
	driver.findElement(By.cssSelector(".button")).click();
	
	//Close browser
	driver.close();
	
}
}
