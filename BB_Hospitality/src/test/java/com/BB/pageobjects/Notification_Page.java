package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Notification_Page {
//1. create object of webdriver

 private WebDriver driver;
 private WebDriverWait wait;
	 
	//constructor
	 
 public Notification_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
	 }
	 
	//identify webelements
	@FindBy(xpath = "//div[@class='_bellIconImg_11psw_53']//div[contains(@class,'flex-center undefined')]//*[name()='svg']") 
	WebElement notification_icon; 
	@FindBy(xpath = "//div[@class='_notifyModal_qntcb_1 _notifyModalShow_qntcb_33']//div[2]//div[4]//button[1]") 
	WebElement view_booking; 
	@FindBy(xpath = "//button[normalize-space()='Ok, Got it']") 
	WebElement ok_button;
	@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'_outerContainer_7ly4b_1')]/main[contains(@class,'_mainContainer_7ly4b_17')]/header[contains(@class,'_header_11psw_1')]/div[contains(@class,'row-gap-1')]/div[contains(@class,'_notifyModal_qntcb_1 _notifyModalShow_qntcb_33')]/div[contains(@class,'_notifyRoot_qntcb_49')]/div[contains(@class,'_notify_qntcb_1')]/div[contains(@class,'_notifyTop_qntcb_83 flex-between')]/div[contains(@class,'row-gap-1')]/div[1]//*[name()='svg']") 
	WebElement close_ntfcn;
	
	public void notification() throws InterruptedException {
		notification_icon.click();
		Thread.sleep(1000);
		view_booking.click();
		Thread.sleep(1000);
		ok_button.click();
		Thread.sleep(1000);
		close_ntfcn.click();
		Thread.sleep(1000);
		}
}
