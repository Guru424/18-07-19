package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebdriverTestNG {

	WebDriver driver;
	
	@BeforeClass
	public void openBrowser(){
		driver=new FirefoxDriver();
		Reporter.log("Firefox browser opned");
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	
	@Test
	public void login(){
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Login completed");
	}
	@Test
	public void logout(){
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout successfully");
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
		Reporter.log("Browser closed");
	}
}
