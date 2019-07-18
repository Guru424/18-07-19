package com.genlib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class General extends Global{

	WebDriver driver;
	public void openBrowser(){
		driver=new FirefoxDriver();
		System.out.println("Firefox browser is opened");
	}
	
	public  void openApplication(){
		driver.get(url);
		System.out.println("HRMS Application opened");
	}
	
	public void login(){
		driver.findElement(By.name(username)).sendKeys(user);
		driver.findElement(By.name(password)).sendKeys(pwd);
		driver.findElement(By.name(loginBtn)).click();
		System.out.println("Login success");
	}
	
	public void logout(){
		driver.findElement(By.linkText(logoutLnk)).click();
		System.out.println("Logout successfully");
	}
	
	public void closeBrowser(){
		driver.close();
		System.out.println("Brwser closed");
	}
	
	public void addEmp(){
		System.out.println("Add new Emp");
	}
}
