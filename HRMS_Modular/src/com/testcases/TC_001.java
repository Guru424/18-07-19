package com.testcases;

import com.genlib.General;

public class TC_001 {

	public static void main(String[] args) {
		
		General obj=new General();
		obj.openBrowser();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeBrowser();
	}
}
