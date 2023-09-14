package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

import com.hrms.lib.General;

public class TC001LoginPage 
{

	@Test
		public void tc001() throws Exception
		{
	    DOMConfigurator.configure("log4j.xml");
		General obj= new General();
		obj.launchBrowser();
		Thread.sleep(3000);
		obj.login();
		
		Thread.sleep(3000);
		obj.logOut();
	    obj.closeBrowser();
		
		}
	

}
