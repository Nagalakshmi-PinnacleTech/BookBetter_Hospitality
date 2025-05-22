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
	 //Already registered users
	 
	@FindBy(xpath = "//input[@id='email']") 
	WebElement registeredUsersEmail;

	@FindBy(xpath = "//input[@type='password']") 
	WebElement registeredUsersPwd;

	@FindBy(xpath = "//button[@class='_primary_1sag5_1 _btnBlack_1sag5_327 _btnLogin_1hjy5_91']")
	WebElement submitLogin; 
	
	@FindBy(xpath = "//div[@class=\'_redDot_11psw_71\']") 
	WebElement notification; 
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/header[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]") 
	WebElement ntfcn_close;
	
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/header[1]/div[2]/a[1]/div[1]/*[name()='svg'][1]") 
	WebElement calendar; 
	
	@FindBy(xpath = "//div[contains(@class,'col-gap-0_5 _displayCard_y3sre_81')]//div[contains(@class,'')]//*[name()='svg']") 
	WebElement tab_arrow; 
	
	@FindBy(css = "div[class='reactSel__control css-1e42tsx-control'] div[class='reactSel__indicator reactSel__dropdown-indicator css-1w5oz2q-indicatorContainer'] svg path")
	WebElement cal_dd;
	
	
	
	@FindBy(xpath = "//div[@class='profile-letter flex-center']")
	WebElement profile_dd;
	
	//identify action on webelement
	public void login(String user, String pass) throws InterruptedException {
		registeredUsersEmail.sendKeys(user);
		registeredUsersPwd.sendKeys(pass);
		Thread.sleep(2000);
		submitLogin.click();
		Thread.sleep(2000);
	}
	
	public void smoke() throws InterruptedException {
		notification.click();
		ntfcn_close.click();
		calendar.click();
		Thread.sleep(3000);
		calendar.click();
		tab_arrow.click();
	}
	
	public void profile() throws InterruptedException {
	    List<WebElement> buttons = driver.findElements(By.xpath("(//div[@class='flex-center undefined '])[14]"));
	    for (int i = 0; i < buttons.size(); i++) {
	        new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.elementToBeClickable(buttons.get(i)))
	            .click();
		    }
	}
}

	
