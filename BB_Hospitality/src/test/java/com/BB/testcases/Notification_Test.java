package com.BB.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.BB.base.Base_Test;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.Notification_Page;
import com.BB.pageobjects.WelcomePage;

public class Notification_Test extends Base_Test{
	@Test
	public void notification() throws IOException, InterruptedException 
	{
		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("kiwajo3927@deusa7.com","123456789");
		logger.info("login successful");
		
		Notification_Page ntfcn = new Notification_Page(driver);
		ntfcn.notification();
	}
}
