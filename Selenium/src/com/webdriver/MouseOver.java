package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	
	driver.findElement(By.name("txtUserName")).sendKeys("admin");
	driver.findElement(By.name("txtPassword")).sendKeys("admin");
	driver.findElement(By.name("Submit")).click();
	
	//MouseHover actions
	
	Actions action=new Actions(driver);
	WebElement pim=driver.findElement(By.xpath("//*[@id='pim']/a/span"));
	action.moveToElement(pim).perform();
	Thread.sleep(1000);
	WebElement addEmp=driver.findElement(By.xpath(".//*[@id='pim']/ul/li[2]/a/span"));
	action.moveToElement(addEmp).build().perform();
	Thread.sleep(1000);
	addEmp.click();
	Thread.sleep(1000);
	driver.close();
	
}
}
