package com.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {

	@BeforeClass
	public void M1(){
		System.out.println("This is BeforeClass");
	}
	@AfterClass
	public void M2(){
		System.out.println("This is AfterClass");
	}
	@BeforeMethod
	public void M3(){
		System.out.println("This is BeforeMethod");
	}
	@AfterMethod
	public void M4(){
		System.out.println("This is AfterMethid");
	}
	@BeforeTest
	public void M5(){
		System.out.println("This is BeforeTest");
	}
	@AfterTest
	public void M6(){
		System.out.println("This is AfterTest");
	}
	@BeforeSuite
	public void M7(){
		System.out.println("This is BeforeSuite");
	}
	@AfterSuite
	public void M9(){
		System.out.println("This is AfterSuite");
	}
	@Test
	public void M10(){
		System.out.println("This is test1");
		Reporter.log("This is Test1");
	}
	@Test
	public void M11(){
		System.out.println("This is Test2");
		Reporter.log("This is Test2");
	}
	@Test
	public void M12(){
		System.out.println("This is Test3");
		Reporter.log("This is Test3");
	}
	
}
