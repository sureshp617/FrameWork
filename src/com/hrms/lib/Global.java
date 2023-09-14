package com.hrms.lib;

import org.openqa.selenium.WebDriver;


public class Global 
{
	
	
	 WebDriver driver;
	   
	   //Test data
	   String url ="http://127.0.0.1/orangehrm-2.6/login.php";
	   String userName="suresh";
	   String passWord="suresh";
	   
	   String lastname="suresh";
	   String firstname="pariki";
	   String midlename="pandla";
	   String nickname="hello";
	   
	   
	   String compname ="cognizant";
	   String taxid= "231413222";
	   String mobilenum = "9182095322"; 
	   
	   
   
	   
	   
	   
	   
	   
	   //Object
	   
	   String txt_User_Name="txtUserName";
	   String txt_Password="txtPassword";
	   String loginBtn="Submit";
	   
	   String mousehover="drop current";
	   String addemployee="Add Employee";
	   
	   String last_name="//input[@id='txtEmpLastName'][@type='text']";
	   
	   String first_name="//input[@id='txtEmpFirstName'][@type='text']";
	   
	   String midle_name="//input[@id='txtEmpMiddleName'][@type='text']";
	   String nick_name="//input[@id='txtEmpNickName'][@type='text']";
	   String saveBtn="//input[@id='btnEdit'][@type='button']";
	   
	   String emply_list="/html/body/div[4]/ul/li[2]/ul/li[1]/a/span";
	   
	   String comp_name="//input[@id='txtCompanyName']";
	   String tax_id="//input[@id='txtTaxID']";
	   String mob_num="//input[@id='txtPhone']";
	   
	   
	   
	   
	   
	   
	   
	   
	 
	   

}
