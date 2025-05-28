package com.BB.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BB.base.Base_Test;
import com.BB.pageobjects.EditProfile_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;

public class EditProfile_Test extends Base_Test {
	
	@Test
	public void editProfile() throws IOException, InterruptedException 
	{
		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("kiwajo3927@deusa7.com","123456789");
		logger.info("login successful");
		
		EditProfile_Page edit = new EditProfile_Page(driver);
		edit.editProfile("Ashraya1");
		logger.info("Profile updated successfully");
	}		

}
