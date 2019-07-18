package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTitle {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	//maximize the window
		driver.manage().window().maximize();
		
		//Open hrms application
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		
		//Verify the hrms title
		
		String title=driver.getTitle();
		if(title.equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title matched");
		}
		else{
			System.out.println("Title not matched");
		}
		//Enter the user name
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		//Enter the password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		
		//Click on login button
		driver.findElement(By.cssSelector(".button")).click();
		
		if(driver.getTitle().equals("OrangeHRM"))
		{
			System.out.println("Title matched");
		}
		else{
			System.out.println("Title not matched");
		}
		//Close browser
		driver.close();
}
}
