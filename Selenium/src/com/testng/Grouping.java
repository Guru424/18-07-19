package com.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups="smoke")
	public void smoke(){
		System.out.println("This is smoke test cases");
	}
	@Test(groups="smoke")
	public void smoke1(){
		System.out.println("This is smoke test cases");
	}
	@Test(groups="smoke")
	public void smoke2(){
		System.out.println("This is smoke test cases");
	}
	@Test(groups="sanity")
	public void sanity(){
		System.out.println("This is sanity test cses");
	}
	@Test(groups="sanity")
	public void sanity1(){
		System.out.println("This is sanity test cses");
	}
	@Test(groups="sanity")
	public void sanity2(){
		System.out.println("This is sanity test cses");
	}
}
