package com.BB.pageobjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings_AddBill_Page {
//1. create object of webdriver

 private WebDriver driver;
 private WebDriverWait wait;
	 
//constructor
	 
 public Settings_AddBill_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
 }
		 
	//identify webelements
	@FindBy(xpath = "//a[normalize-space()='Settings']")
	WebElement settings;
	@FindBy(xpath = "//a[normalize-space()='Add Bill Types']")
	WebElement add_bills_tab;
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")
	WebElement add_bills_btn; 
	@FindBy(xpath = "//div[@class='_topCatBlock_n11pn_15']//div[2]//input[1]")
	WebElement bills_txtbx;
	@FindBy(xpath = "//div[@class='_topCatBlock_n11pn_15']//div[2]//input[1]")
	WebElement deleteBill_txtbx;
	@FindBy(xpath = "(//button[@class='_primary_hwibs_1 _btnBlack_hwibs_327 '])[2]")
	WebElement save_bills;
	
	//identify action on webelement
	public void setting_bills(String billname) throws InterruptedException {
	settings.click();
	Thread.sleep(1000);
	add_bills_tab.click();
	Thread.sleep(1000);
	add_bills_btn.click();
	Thread.sleep(1000);
	bills_txtbx.sendKeys(billname);
	Thread.sleep(1000);
	save_bills.click();
	}
}
