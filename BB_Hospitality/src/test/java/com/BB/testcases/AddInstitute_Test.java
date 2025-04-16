package com.BB.testcases;

import java.io.IOException;
import org.testng.annotations.Test;

import com.BB.base.Base_Test;
import com.BB.pageobjects.AddInstitute_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import com.BB.utilities.ReadConfig;

public class AddInstitute_Test extends Base_Test {
	
	@Test
	public void VerifyLogin() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("test123@gmail.com","Pinnacle@123");
		logger.info("login successful");
		
		AddInstitute_Page addIns = new AddInstitute_Page(driver);
		addIns.all_Institute_pop();
		addIns.fill_inst_detail("AutoInstitute", "9988776666", "autoInst@gmail.co.in", "Banglore", "with Basic plan");
		addIns.template();
		addIns.pricingplan();
}
	}
