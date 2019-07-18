package com.webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePrompt {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/Users/RH0172/Downloads/answerOnNextPrompt.html.html");
	
	driver.findElement(By.linkText("Click here to enter your name")).click();
	
	Alert alert=driver.switchTo().alert();
	alert.sendKeys("Guruprakash");
	alert.accept();
	
	Thread.sleep(3000);
	
	driver.close();
}
}
