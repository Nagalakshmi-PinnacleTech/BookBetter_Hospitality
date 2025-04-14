package com.BB.testcases;

import com.BB.base.Base_Test;
import java.io.IOException;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;
import org.testng.annotations.Test;
import com.BB.utilities.ReadConfig;


public class LoginTest extends Base_Test{
	
	@Test
	public void VerifyLogin() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("rafala9421@inveitro.com","Aa@123456789");
		logger.info("login successful");

	}
}