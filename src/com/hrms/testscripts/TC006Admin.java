package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.hrms.lib.General;

public class TC006Admin {
	
	@Test
	
	public void Admin() throws Exception 
	{
	   DOMConfigurator.configure("log4j.xml");
		General object = new General();
		object.launchBrowser();
		Thread.sleep(5000);
		object.login();
		Thread.sleep(5000);
		object.admin();
		Thread.sleep(5000);
		//object.EnterIntoAdminFram();
		Thread.sleep(5000);
	}
	
	
	
	

}
