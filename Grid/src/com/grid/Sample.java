package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		
		
			DesiredCapabilities caps = DesiredCapabilities.firefox();
			//caps.setVersion("20");
			caps.setPlatform(Platform.WINDOWS);
			URL urlHub = null;
			try {
			urlHub = new URL("http://localhost:4444/wd/hub");
			}
			catch (MalformedURLException e)
			{
			e.printStackTrace();
			}
			RemoteWebDriver driver = new RemoteWebDriver(urlHub, caps);
			driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
			Thread.sleep(2000);
			System.out.println(driver.getTitle());
		
			}
			
	
}