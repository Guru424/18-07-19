package com.testng;

import org.testng.annotations.Test;

public class PriorityClass {

	@Test(priority=1)
	public void jku(){
		System.out.println("This is Method 1");
	}
	
	@Test(priority=0)
	public void asd(){
		System.out.println("This is Method 2");
	}
	@Test(priority=2)
	public void het(){
		System.out.println("This is Method 3");
	}
	
	@Test(priority=0)
	public void test(){
		System.out.println("This is Method 4");
	}
}
