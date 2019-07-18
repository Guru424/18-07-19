package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.phptravels.net/");
	
	driver.findElement(By.name("checkin")).click();
	
	String month="November 2019";
	String date="6";
	
	WebElement mon = driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[2]"));
	while(true){
		if(mon.getText().equals(month)){
			break;
		}else{
			driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr/th[3]")).click();
			Thread.sleep(1000);
		}
	}
	
	driver.findElement(By.xpath("//div[@class='datepicker-days']/table/tbody/tr/td[contains(text(),'"+date+"')]")).click();
}
}
