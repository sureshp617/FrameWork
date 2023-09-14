package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC003EmployeeList {

	
	@Test
	public void tc003() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General object = new General();
		object.launchBrowser();
		
		Thread.sleep(2000);
		
		object.login();
		Thread.sleep(2000);
		
		object.mouseHoverEmpList();
		Thread.sleep(2000);
		
		object.enterIntoFrame();
		Thread.sleep(2000);
		
		object.employeeListDropDown();
		Thread.sleep(2000);
		
		object.exitIntoFrame();
		Thread.sleep(2000);
		
		object.logOut();
		Thread.sleep(2000);
		
		object.closeBrowser();
		Thread.sleep(2000);
		
		
		
		
        
	}

}
