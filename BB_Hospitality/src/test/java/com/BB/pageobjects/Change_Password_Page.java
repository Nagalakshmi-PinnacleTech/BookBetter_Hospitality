package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Change_Password_Page {
	
	//1. create object of webdriver
		 private WebDriver driver;
		 private WebDriverWait wait;
		 
	//constructor
	public Change_Password_Page(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     PageFactory.initElements(driver, this);
	 }
	 
	//identify webelements
	@FindBy(xpath = "(//div[@class='flex-center undefined '])[14]")
	WebElement profile_dd;
	@FindBy(xpath = "//button[normalize-space()='Change Password']")
	WebElement changePW;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	WebElement enter_PW;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	WebElement confirm_newPW;
	@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/button[2]")
	WebElement savePW;
	@FindBy(xpath = "//div[contains(@class,'flex-between mb-2')]//div[contains(@class,'')]//*[name()='svg']")
	WebElement close_changePW; 
	
	public void change_PW(String newPW, String confirmPW) {
		profile_dd.click();
		changePW.click();
		enter_PW.sendKeys(newPW);
		confirm_newPW.sendKeys(confirmPW);
		savePW.click();
		}
	}

