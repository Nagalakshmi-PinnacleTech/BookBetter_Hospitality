package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BB.utilities.ScrollUtils;

public class AddPayment_Page {
//1. create object of webdriver
	private WebDriver driver;
	private WebDriverWait wait;
			 
//constructor
public AddPayment_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
 }

//identify webelements
@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/div[1]/div[3]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div[31]/div[1]/div[1]") 
WebElement booking24th; 
@FindBy(xpath = "/html[1]/body[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]") 
WebElement popup_Booking;
@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/div[1]/div[1]/div[7]/table[1]/tbody[1]/tr[1]/td[9]/div[1]/button[5]") 
WebElement payment_icon;
@FindBy(xpath = " //div[@id='paymentType']//div[@class='reactSel__input-container css-1rgvke7']") 
WebElement paymentFor_dd;
@FindBy(xpath = "(//input[@class='_numberInput_1xobt_13'])[1]") 
WebElement amount;
@FindBy(xpath = "(//input[@class='_inputSingleBox_5g93c_17 undefined'])[1]") 
WebElement payment_calendar;
@FindBy(xpath = "(//button[@class='rdrDay rdrDayToday'])[1]") 
WebElement currentDate; 
@FindBy(xpath = "(//button[@class='_secondary_hwibs_61 false '])[2]") 
WebElement cal_select;
@FindBy(xpath = "(//div[@class=\"reactSel__input-container css-1rgvke7\"])[3]") 
WebElement payment_mode; 
@FindBy(xpath = "(//button[@class='_primary_hwibs_1 _btnBlack_hwibs_327 '])[1]") 
WebElement save_payment; 
//@FindBy(xpath = "(//div[@class='flex-center undefined '])[2]")
@FindBy(xpath = "//div[@class='flex-center undefined ']")
WebElement payment_close; 



 public  void scroll_selectBooking() throws InterruptedException {
	 Actions actions = new Actions(driver);
	 for (int i = 0; i < 8; i++) {
		    actions.sendKeys(Keys.PAGE_DOWN).perform();
		}
	 Thread.sleep(2000);
	 actions.sendKeys(Keys.END).perform();
	 booking24th.click();
	 Thread.sleep(2000);
	 popup_Booking.click();
	 Thread.sleep(3000);
 	}

 public void payment() throws InterruptedException {
	 Actions actions = new Actions(driver);
	 for (int i = 0; i < 8; i++) {
		    actions.sendKeys(Keys.PAGE_DOWN).perform();
		}
	 Thread.sleep(3000);
	 actions.sendKeys(Keys.TAB).perform();
	 Thread.sleep(2000);
	 payment_icon.click();
	 Thread.sleep(2000);
	 }

 public void fill_payment(String amt) throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(paymentFor_dd).click().build().perform();
		Actions keyDown1 = new Actions(driver); 
		keyDown1.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(2000);
		amount.sendKeys(amt);
		Thread.sleep(1000);
		payment_calendar.click();
		Thread.sleep(1000);
		currentDate.click();
		Thread.sleep(1000);
		cal_select.click();
		Thread.sleep(1000);
		action.moveToElement(payment_mode).click().build().perform();
		Actions keyDown2 = new Actions(driver); 
		keyDown2.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(1000);
		save_payment.click();
		Thread.sleep(2000);
		payment_close.click();
		Thread.sleep(1000);
	}
 
 
}