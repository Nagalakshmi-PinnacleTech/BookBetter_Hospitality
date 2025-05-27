package com.BB.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.BB.base.Base_Test;
import com.BB.pageobjects.AddPayment_Page;
import com.BB.pageobjects.CheckInOut_Page;
import com.BB.pageobjects.LoginPage;
import com.BB.pageobjects.WelcomePage;

public class Check_In_Out_Test extends Base_Test{
	
	@Test
	public void check_in_out() throws IOException, InterruptedException 
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
		
		CheckInOut_Page checkinout = new CheckInOut_Page(driver);
		checkinout.checkIn();
		checkinout.checkOut();

}
}
