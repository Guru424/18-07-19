//package com.webdriver;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
//
//
//public class DataBase {
//public static void main(String[] args) throws SQLException {
//	
//	/*Connection con=DriverManager.getConnection("");
//	Statement  st=con.createStatement();
//	ResultSet rs=st.executeQuery("");
//	while(rs.next()){
//		
//	}*/
//	
//	WebDriver driver=new FirefoxDriver();
//	driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
//	
//	Wait wait=new FluentWait<WebDriver>(driver)
//			.withTimeout(10, TimeUnit.SECONDS)
//			.pollingEvery(2, TimeUnit.SECONDS)
//			.ignoring(NoSuchElementException.class);
//	//WebElement clicklogin=wait.until(new Function<WebDriver,WebElement>(){
//		
//		/*public WebElement click(WebDriver driver){
//			return driver.findElement(By.name("Submit"));
//		}
//
//		@Override*/
//		public WebElement apply(WebDriver t) {
//			// TODO Auto-generated method stub
//			return driver.findElement(By.name("Submit"));
//		}
//
//		//clicklogin.click();
//		/*@Override
//		public WebElement apply(WebDriver arg0) {
//			// TODO Auto-generated method stub
//			return null;
//		}*/
//	});
//	
//	Set<String> set=driver.getWindowHandles();
//	Iterator<String> ite=set.iterator();
//	while(ite.hasNext()){
//		String rr=ite.next();
//		driver.switchTo().window(rr);
//		
//	}
//}
//}
