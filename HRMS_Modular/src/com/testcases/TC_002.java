package com.testcases;

import com.genlib.General;

public class TC_002 {
public static void main(String[] args) {
	
	General obj=new General();
	obj.openBrowser();
	obj.openApplication();
	obj.login();
	obj.addEmp();
	obj.logout();
	obj.closeBrowser();
}
}
