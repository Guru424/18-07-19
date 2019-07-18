package com.testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void login(){
		WebDriver driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
	String txt=	driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[1]")).getText();
	System.out.println("User name label="+txt);
	
	assertTrue(txt.matches("Login Name :"));
	
	Assert.assertEquals(txt, "Login Name :");
	
	driver.findElement(By.name("txtUserName")).sendKeys("Guru");
	
	
	}
}
