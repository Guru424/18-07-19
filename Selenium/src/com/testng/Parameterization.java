package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {

	WebDriver driver;
	
	@Test
	
	@Parameters({"user","pwd"})
	
	public void login(String user,String pwd){
		driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
	}
}
