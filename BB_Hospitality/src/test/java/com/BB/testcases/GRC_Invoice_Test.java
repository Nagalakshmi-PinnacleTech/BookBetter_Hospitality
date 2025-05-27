package com.BB.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BB.base.Base_Test;
import com.BB.pageobjects.AddPayment_Page;
import com.BB.pageobjects.EditBooking_Page;
import com.BB.pageobjects.GRC_Invoice_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;

public class GRC_Invoice_Test extends Base_Test {
	@Test
	public void editBooking() throws IOException, InterruptedException 
	{
		logger.info("***************TestCase Verify Login starts*****************"); 

		WelcomePage wpg = new WelcomePage(driver);

		wpg.clickOnLogin();
		logger.info("Clicked on Login link");

		LoginPage loginpg = new LoginPage(driver);

		loginpg.login("kiwajo3927@deusa7.com","123456789");
		logger.info("login successful");
		
		AddPayment_Page addpay = new AddPayment_Page(driver);
		addpay.scroll_selectBooking();
		
		GRC_Invoice_Page grc = new GRC_Invoice_Page(driver);
		
	}

}
