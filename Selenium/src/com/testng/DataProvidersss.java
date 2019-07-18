package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersss {

	WebDriver driver;
	
	@DataProvider(name="multi")
	public static Object[][] credentials(){
		return new Object[][]{{"admin","admin"},{"admin","admin"}};
		
	}
	
	@Test(dataProvider="multi")
	
	public void login(String user,String pwd){
		driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.findElement(By.name("txtUserName")).sendKeys(user);
		driver.findElement(By.name("txtPassword")).sendKeys(pwd);
		driver.findElement(By.name("Submit")).click();
		driver.close();
	}
}
