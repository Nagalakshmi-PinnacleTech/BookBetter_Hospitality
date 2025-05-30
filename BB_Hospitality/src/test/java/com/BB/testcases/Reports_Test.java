package com.BB.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BB.base.Base_Test;
import com.BB.pageobjects.Change_Password_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.Reports_View_export_Page;
import com.BB.pageobjects.WelcomePage;

public class Reports_Test extends Base_Test{
	@Test
	public void change_pw() throws IOException, InterruptedException 
	{
		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("kiwajo3927@deusa7.com","123456789");
		logger.info("login successful");
		
		Reports_View_export_Page rpts = new Reports_View_export_Page(driver);
		rpts.reports();
		logger.info("reports downloaded successfully");
	}
}


