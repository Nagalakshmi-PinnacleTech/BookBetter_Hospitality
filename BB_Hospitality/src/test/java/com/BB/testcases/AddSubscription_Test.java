package com.BB.testcases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.BB.base.Base_Test;
import com.BB.pageobjects.AddSubscription_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;

public class AddSubscription_Test extends Base_Test {
	
	@Test
	public void AddSubscription() throws IOException, InterruptedException 
	{

		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("test123@gmail.com","Pinnacle@123");
		logger.info("login successful");
		
		AddSubscription_Page addSub = new AddSubscription_Page(driver);
		
		addSub.subscription_pop();
		addSub.zoomout();
        addSub.edit_subscription();
        addSub.fill_sub_detail("50000");
        addSub.payment_mode("50000");
        addSub.payment_detail();
	}
	
}