package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckInOut_Page {

	//1. create object of webdriver
		private WebDriver driver;
		private WebDriverWait wait;
				 
	//constructor
	public CheckInOut_Page(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     PageFactory.initElements(driver, this);
	 }

	//identify webelements
//	@FindBy(xpath = "//button[@class='_iconBtn_hwibs_47 _btnBlue_hwibs_243 false ']") 
	@FindBy(xpath = "//div[@class='flex-center undefined false']") 
	WebElement checkin_icon;
	@FindBy(xpath = "//button[@class='_primary_hwibs_1 _btnBlue_hwibs_243 ']") 
	WebElement checkin_btn;

	@FindBy(xpath = "//div[@class='flex-center undefined false']")
	WebElement checkout_icon;
	@FindBy(xpath = "(//button[@class='_primary_hwibs_1 _btnNavy_hwibs_271 '])[2]") 
	WebElement checkout_btn;
	
	@FindBy(xpath = "(//button[@class='_primary_hwibs_1 _btnBlack_hwibs_327 '])[3]") 
	WebElement gen_invoice;
	
	public void checkIn() throws InterruptedException {
		Actions actions = new Actions(driver);
		 for (int i = 0; i < 8; i++) {
			    actions.sendKeys(Keys.PAGE_DOWN).perform();
			}
		 Thread.sleep(3000);
		 actions.sendKeys(Keys.TAB).perform();
		 checkin_icon.click();
		 Thread.sleep(2000);
		 checkin_btn.click();
		 }
	 
	 public void checkOut() throws InterruptedException {
		 checkout_icon.click();
		 Thread.sleep(2000);
		 checkout_btn.click();
		 gen_invoice.click();
		 }
}
