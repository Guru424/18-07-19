package com.testng;

import org.testng.annotations.Test;

public class Skip {

	@Test
	public void jku(){
		System.out.println("This is Method 1");
	}
	
	@Test(invocationCount=5)
	public void asd(){
		System.out.println("This is Method 2");
	}
	@Test(enabled=false)
	public void het(){
		System.out.println("This is Method 3");
	}
	
	@Test
	public void test(){
		System.out.println("This is Method 4");
	}
}
