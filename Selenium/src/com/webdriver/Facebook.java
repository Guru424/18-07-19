package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static void main(String[] args) {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.className("inputtext")).sendKeys("9553663707");
}
}
