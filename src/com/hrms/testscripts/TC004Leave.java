package com.hrms.testscripts;


import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC004Leave {
	
	@Test
	
	public void Leav() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General object = new General();
		object.launchBrowser();
		object.login();
		Thread.sleep(2000);
		object.mouseHoverLeaveSection();
		Thread.sleep(2000);
		object.enterIntoFrame();
		Thread.sleep(2000);
		object.yearDropDown();
		Thread.sleep(2000);
		object.exitIntoFrame();
		object.logOut();
		object.closeBrowser();
		
	
		
		
		
	}
	

}
