package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.hrms.lib.General;

public class TC005Benifts {
	
	
	@Test
	
	public void benifts() throws Exception
	{
	   DOMConfigurator.configure("log4j.xml");
		General object = new General();
		object.launchBrowser();
		Thread.sleep(5000);
		object.login();
		Thread.sleep(5000);
		object.benefits();
		Thread.sleep(5000);
		object.enterIntoFrame();
		Thread.sleep(5000);
		object.SavingsPlans();
		Thread.sleep(5000);
		object.exitIntoFrame();
		object.logOut();
		Thread.sleep(5000);
		object.closeBrowser();
		Thread.sleep(5000);
		
	}
	

}
