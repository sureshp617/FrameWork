package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC002AddAdress {

	
		@Test
		
 		public void  tc002() throws Exception
 	
	     {
	
	    DOMConfigurator.configure("log4j.xml");
		General object= new General();
		object.launchBrowser();
		object.login();
		
		Thread.sleep(3000);
		object.mouseHover();
		object.enterIntoFrame();
		
		Thread.sleep(3000);
		object.enterEmpDetails();
		
		object.exitIntoFrame();
		Thread.sleep(3000);
		object.logOut();
		Thread.sleep(3000);
		object.closeBrowser();
		

 		}

}
