package com.BB.pageobjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SmokePage {
	
	//1. create object of webdriver

	 private WebDriver driver;
	 private WebDriverWait wait;
	 
	//constructor
	 
	 public SmokePage(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     PageFactory.initElements(driver, this);
	 }
	 
	//identify webelements
	
	@FindBy(xpath = "//div[@class='_bellIconImg_11psw_53']//div[contains(@class,'flex-center undefined')]//*[name()='svg']") 
	WebElement notification; 
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/header[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]") 
	WebElement ntfcn_close;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/header[1]/div[2]/a[1]/div[1]/*[name()='svg'][1]") 
	WebElement calendar; 
	@FindBy(xpath = "//div[contains(@class,'col-gap-0_5 _displayCard_y3sre_81')]//div[contains(@class,'')]//*[name()='svg']") 
	WebElement tab_arrow; 
	@FindBy(css = "div[class='reactSel__control css-1e42tsx-control'] div[class='reactSel__indicator reactSel__dropdown-indicator css-1w5oz2q-indicatorContainer'] svg path")
	WebElement cal_dd;

	@FindBy(xpath = "(//div[@class='flex-center undefined '])[14]")
	WebElement profile_dd;
	@FindBy(xpath = "//button[normalize-space()='My Profile']")
	WebElement myProfile;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/*[name()='svg'][1]/*[name()='use'][1]")
	WebElement close_myProfile;
	
	@FindBy(xpath = "//button[normalize-space()='Institution Profile']")
	WebElement instProfile;
	@FindBy(xpath = "//div[contains(@aria-describedby,':rfi:')]//*[name()='svg']")
	WebElement close_instProfile;
	
	@FindBy(xpath = "//button[normalize-space()='Change Password']")
	WebElement changePW;
	@FindBy(xpath = "//div[contains(@class,'flex-between mb-2')]//div[contains(@class,'')]//*[name()='svg']")
	WebElement close_changePW;
	
	@FindBy(xpath = "//a[contains(@class,'_profileOption_1tcd0_37')]")
	WebElement IncExp;
	@FindBy(xpath = "//div[contains(@class,'flex-center _btnHome_jiy9q_1')]//*[name()='svg']")
	WebElement home_icon;
	
	@FindBy(xpath = "//button[normalize-space()='Logout']")
	WebElement logout;
	
	@FindBy(xpath = "//a[normalize-space()='Rates']")
	WebElement rates;
	@FindBy(xpath = "//a[normalize-space()='Reports']")
	WebElement reports;
	@FindBy(xpath = "//a[normalize-space()='Settings']")
	WebElement settings;

	//identify action on webelement

	public void smoke() throws InterruptedException {
		notification.click();
		ntfcn_close.click();
		calendar.click();
		Thread.sleep(3000);
		calendar.click();
		tab_arrow.click();
		Thread.sleep(2000);
	}
	
	public void profileSection() throws InterruptedException {
		profile_dd.click();
		Thread.sleep(2000);
		myProfile.click();
		Thread.sleep(1000);
		close_myProfile.click();
		Thread.sleep(1000);
		profile_dd.click();
		instProfile.click();
		Thread.sleep(1000);
		close_instProfile.click();
		Thread.sleep(1000);
		profile_dd.click();
		changePW.click();
		Thread.sleep(1000);
		close_changePW.click();
		Thread.sleep(1000);
		profile_dd.click();
		IncExp.click();
		Thread.sleep(1000);
		home_icon.click();
	}
	
	public void all_reports() throws InterruptedException {
		reports.click();
	    List<WebElement> allReports = driver.findElements(By.xpath("//div[@class='_reportNav_kcex8_15  false']"));
	    for (int i = 0; i < allReports.size(); i++) {
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(allReports.get(i)))
	            .click();
	        Thread.sleep(1000);
	     }
	}
	
	public void all_settings() throws InterruptedException {
		settings.click();
	    List<WebElement> allSettings = driver.findElements(By.xpath("//a[@class='_settingsNav_1c8xo_1  false']"));
	    for (int i = 0; i < allSettings.size(); i++) {
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(allSettings.get(i)))
	            .click();
	        Thread.sleep(1000);
	     }
	}
}

	
