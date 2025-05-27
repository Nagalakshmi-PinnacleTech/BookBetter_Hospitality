package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddBooking_Page {
	//1. create object of webdriver
	private WebDriver driver;
	private WebDriverWait wait;
		 
	//constructor
	public AddBooking_Page(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     PageFactory.initElements(driver, this);
	 }
	
	//identify webelements
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]") 
	WebElement calendar_popup; 
	@FindBy(xpath = "//div[contains(@class,'rdrMonths rdrMonthsHorizontal')]//span[contains(text(),'31')]") 
	WebElement date_27; 
	@FindBy(xpath = "//button[normalize-space()='Select']") 
	WebElement select_btn; 
	@FindBy(xpath = "//div[@class='reactSel__control css-1h7uovc-control']//div[@class='reactSel__indicator reactSel__dropdown-indicator css-1w5oz2q-indicatorContainer']//*[name()='svg']") 
	WebElement timerange; 
	@FindBy(xpath = "//div[@class='_timeWrap_xvojv_1 _timePicker_18d4s_97']//input[1]") 
	WebElement timeslot; 
//	@FindBy(xpath = "(//div[@class='MuiClock-wrapper css-1b5m8nj']/child::span[@class='MuiClockNumber-root css-1db5svu'])[1]") 
	@FindBy(xpath = "//div[@class='MuiClock-squareMask css-6oh4ak']")
	WebElement One_clock;
	@FindBy(xpath = "//button[normalize-space()='Done']") 
	WebElement clock_done; 
	@FindBy(xpath = "(//div[@class='flex-center _checkboxInput_e5au6_17 false '])[1]") 
	WebElement first_room; 
	@FindBy(xpath = "//button[@class='_primary_hwibs_1 _btnBlack_hwibs_327 _addBtn_87006_65 false\']") 
	WebElement add_booking; 
	
	@FindBy(xpath = "//input[@id='name']") 
	WebElement cust_name; 
	@FindBy(xpath = "//input[@id='email']") 
	WebElement cust_email;
	@FindBy(xpath = "//textarea[@id='address']") 
	WebElement cust_address;
	@FindBy(xpath = "//input[@id='phone']") 
	WebElement cust_phone;
	@FindBy(xpath = "//input[@id='guest_id_no']") 
	WebElement cust_ID;
	@FindBy(xpath = "//button[normalize-space()='Save']") 
	WebElement cust_save;
	@FindBy(xpath = "//button[normalize-space()='Confirm']") 
	WebElement confirm_btn;

	//identify action on webelement

	public void sel_date() throws InterruptedException {
		calendar_popup.click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click()", calendar_popup);
		Thread.sleep(2000);
//		for (int i = 0; i < 2; i++) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(date_27));
//		((JavascriptExecutor) driver).executeScript("arguments[0].click();", date_27);
//		}
		date_27.click();
		date_27.click();
		select_btn.click();
	}
	
	public void select_time24() throws InterruptedException 
	{
		Actions action = new Actions(driver);
		action.moveToElement(timerange).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown = new Actions(driver); 
//		keyDown.sendKeys(Keys.chord(Keys.DOWN, Keys.ENTER)).perform();
		keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void sel_fromHour() throws InterruptedException {
		timeslot.click();
//		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(One_clock));
		One_clock.click();
		Thread.sleep(2000);
		clock_done.click();
		Thread.sleep(1000);
		first_room.click();
		Thread.sleep(1000);
		add_booking.click();
		Thread.sleep(1000);
	}
	
	public void Cust_detail(String name, String email, String address, String phoneNum) throws InterruptedException {
		cust_name.sendKeys(name);
		cust_email.sendKeys(email);
		cust_address.sendKeys(address);
		cust_phone.sendKeys(phoneNum);
//		cust_ID.sendKeys(ID);
		Thread.sleep(2000);
		cust_save.click();
		Thread.sleep(2000);
		confirm_btn.click();
		Thread.sleep(2000);
	}
}
