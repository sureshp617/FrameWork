package com.hrms.lib;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utility.Log;

public class General extends Global {
	
	
	
	public void launchBrowser()
	{
	   // System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
	 	driver=new FirefoxDriver();
	 	driver.get(url);
	 	System.out.println("Launch Browser ");
	 	Log.info("Launch Browser");
	}
	  
	public void login() throws Exception
	{
		driver.findElement(By.name(txt_User_Name)).sendKeys(userName);
		driver.findElement(By.name(txt_Password)).sendKeys(passWord);
		driver.findElement(By.name(loginBtn)).click();
		System.out.println("Login Successfully done !!!");
		Log.info("Loin Comleted");
			
	}
	public void enterIntoFrame()
	{
		driver.findElement(By.id("rightMenu"));
		driver.switchTo().frame(0);
		System.out.println("Enter into frame");
		
	}
		public void enterEmpDetails()
		{
		driver.findElement(By.xpath(last_name)).sendKeys(lastname);
		driver.findElement(By.xpath(first_name)).sendKeys(firstname);
		driver.findElement(By.xpath(midle_name)).sendKeys(midlename);
		driver.findElement(By.xpath(midle_name)).sendKeys(nickname);
		driver.findElement(By.xpath(saveBtn)).click();
		System.out.println("Enter Emp deatails Done");
		}
		
		public void employeeListDropDown() throws Exception
		{
		  Select dd = new Select(driver.findElement(By.id("loc_code")));
		  
		  dd.selectByVisibleText("Emp. ID");
		  System.out.println("Select BY emp ID");
		  Thread.sleep(3000);
		  driver.findElement(By.name("chkLocID[]")).click();
		  driver.findElement(By.xpath("//input[@type='button'][@value='Delete']")).click();
		  
		  //dd.selectByIndex(2);
			/*
			 * for(int i=0; i<dd.getOptions().size();i++) { dd.selectByIndex(i); }
			 * Thread.sleep(7000); //dd.deselectAll(); Thread.sleep(1000);
			 */ 
		}
		  
		  public void mouseHoverLeaveSection()throws Exception
		  {
			  Actions a = new Actions(driver);
			 // a.moveToElement(driver.findElement(By.xpath("(//a[@class=\"l1_link\"]/span)[3]"))).perform();
			  WebElement leave =driver.findElement(By.xpath("(//a[@class=\"l1_link\"]/span)[3]"));
			  a.moveToElement(leave).perform();
			  System.out.println("leave mousehoverdone");
			  Thread.sleep(3000);
			 
			  WebElement leave_Summary = driver.findElement(By.linkText("Leave Summary"));
			  a.moveToElement(leave_Summary).perform();
			  Thread.sleep(3000);
			  System.out.println("leavesummary mousehoverdone");
			  
			  WebElement employee_Leave = driver.findElement(By.xpath("//span[text()='Employee Leave Summary']"));
			  employee_Leave.click();
			  System.out.println("employee leave clickrdone");
			  Thread.sleep(3000);
			  
		  }
			  public void admin() throws Exception
			  {
				 Actions a2 = new Actions(driver);
				 WebElement admin1= driver.findElement(By.xpath("(//a[@class=\"l1_link\"]/span)[1] "));
				 a2.moveToElement(admin1).perform();
				 System.out.println("mouse hover on admin!!!");
				 Thread.sleep(5000);
				 
				 WebElement admin2 = driver.findElement(By.xpath("//a[@class='l2_link parent companyinfo']/span"));
				 a2.moveToElement(admin2).perform();
				 System.out.println("mouse hover on company info!!!");
				 Thread.sleep(5000);
				 
				 WebElement admin3= driver.findElement(By.xpath("(//a[@class='companyinfo']/span)[1]"));
				 admin3.click();
				 System.out.println("click on general!!!!");
				 Thread.sleep(5000);
				 
				 
				 driver.findElement(By.id("rightMenu"));
				 driver.switchTo().frame(0);
				 System.out.println("Enter into frame");
				 driver.findElement(By.xpath("//input[@id=\"editBtn\"]")).click();
				 driver.findElement(By.xpath(comp_name)).sendKeys(compname);
				 driver.findElement(By.xpath(tax_id)).sendKeys(taxid);
				 driver.findElement(By.xpath(mob_num)).sendKeys(mobilenum);
				 System.out.println("enter details");
				 //Thread.sleep(5000);
				 
				  Select sc =new Select(driver.findElement(By.id("cmbCountry")));
				  List<WebElement> lst =sc.getOptions();
				  System.out.println(lst.size());
				
						/*for(int i=0;i<dd.size();i++)
				{
			       WebElement str =dd.get(i);
					System.out.println(str);
				}
				/* for(WebElement str :dd)
				 {
					 System.out.println(str.getText());
				 }*/
			  }
			  
//				 public void EnterIntoAdminFram() throws Exception
//				 
//				 {
//					 
//				 }
				 
				 
//				 Scanner input = new  Scanner(System.in);
//				 int  mobilenum= Integer.parseInt(input.nextLine());
//				 System.out.println("n value:"+mobilenum);
//				 
//				 Thread.sleep(5000);
				 
				 
                 //}
//				 public void stringTointeger() 
//				 {
//					 
//					 System.out.println("Enter only numbers");
//					 Scanner input = new  Scanner(System.in);
//					 int  mobilenum= Integer.parseInt(input.nextLine());
//					 System.out.println("n value:"+mobilenum);
//					 
//					
//				 }
//				 
//				 
			  
		  
		  public void benefits() throws Exception 
		  {
			 
			 
			  Actions a1 = new Actions(driver);
			  WebElement benfit= driver.findElement(By.xpath("(//a[@class=\"l1_link\"]/span)[5]"));
			  a1.moveToElement(benfit).perform();
			  System.out.println("mouse hover on benifts");
			  Thread.sleep(5000);
			  
			  WebElement benift1=driver.findElement(By.xpath("//a[@class=\"l2_link parent hsp\"]/span"));
			  a1.moveToElement(benift1).perform();
			  System.out.println(" again mouse hover on parent");
			  Thread.sleep(5000);
			  
			  WebElement benifit2 =driver.findElement(By.xpath("(//a[@class=\"hsp\"]/span)[1]"));
			  benifit2.click();
			  System.out.println("click on hsp");
			  Thread.sleep(5000);
		  }
			  public void SavingsPlans() throws Exception
			  {
				  driver.findElement(By.xpath("//input[@id=\"HspType4\"]")).click();
				  driver.findElement(By.xpath("//input[@id=\"saveBtn\"]")).click();
				  Thread.sleep(5000);
				  
			  }
			  
		      public void yearDropDown() throws Exception {
		    	  
			  Select  dd = new Select(driver.findElement(By.name("year")));
			  dd.selectByValue("2024");
			  Thread.sleep(2000);
			  System.out.println("Select dropdown done!!");
			  
			  Select dd1 = new Select(driver.findElement(By.name("cmbId")));
			  dd1.selectByVisibleText("Select");
			  Thread.sleep(2000);
			  driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
			  System.out.println("Select employee name");
			  
			  
			  
			  
			  //driver.findElement(By.xpath("//a[@class=\'l2_link leavetypes\']/span")).click(); 
			  // driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[2]")).click();
			  //driver.findElement(By.xpath("//input[@id='btnDel']")).click();
			  
			  //Thread.sleep(2000);
			 // System.out.println("Leave Section");
		 	
	
			  
		    }   
		  public void exitIntoFrame()
		 {
			driver.switchTo().defaultContent();
			System.out.println("Exit Into frame");
		 }
	
	   public void mouseHover() throws Exception
	    {
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='drop current']"))).perform();
		driver.findElement(By.xpath("//span[text()='Add Employee']")).click();
		System.out.println("Mouse Howver done");	
		Log.info("Mouse Over");
	   }
	
	   public void mouseHoverEmpList() throws Exception
	   {
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[@class='drop current']"))).perform();
		
		driver.findElement(By.xpath("/html/body/div[4]/ul/li[2]/ul/li[1]/a/span")).click();
		System.out.println("Mouse Howver done");	
	}
	
	
	
	
	public void logOut()
	{
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("LogOut Successfully Done !!!");
		Log.info("Lougout Successful");
		
	}
	public void closeBrowser()
	{
		driver.close();
		System.out.println("Close the browser");
		Log.info("close browser");
	}

	
		
	}
	


