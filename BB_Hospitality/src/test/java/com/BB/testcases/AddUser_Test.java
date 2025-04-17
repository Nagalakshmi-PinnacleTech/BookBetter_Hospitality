package com.BB.testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.BB.base.Base_Test;
import com.BB.pageobjects.AddUser_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import com.BB.utilities.ReadConfig;


public class AddUser_Test extends Base_Test{
	
	@Test
	public void AddUser() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("test123@gmail.com","Pinnacle@123");
		logger.info("login successful");
		
		AddUser_Page adduser = new AddUser_Page(driver);
		adduser.add_user_pop();
		adduser.institute_role();
		adduser.fill_user_detail("user_test1", "userTest1@gmail.com", "Udupi", "8877665554");
		
		}	

}
