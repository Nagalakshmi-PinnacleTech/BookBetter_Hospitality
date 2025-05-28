package com.BB.pageobjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditProfile_Page {
//1. create object of webdriver
	 private WebDriver driver;
	 private WebDriverWait wait;
	 
//constructor
public EditProfile_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
 }
 
//identify webelements
@FindBy(xpath = "(//div[@class='flex-center undefined '])[14]")
WebElement profile_dd;
@FindBy(xpath = "//button[normalize-space()='My Profile']")
WebElement myProfile;
@FindBy(xpath = "/html[1]/body[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/*[name()='svg'][1]/*[name()='use'][1]")
WebElement close_myProfile; 
@FindBy(xpath = "//input[@id='name']")
WebElement editName; 
@FindBy(xpath = "//button[@class='_primary_hwibs_1 _btnBlack_hwibs_327 ']")
WebElement saveEdit; 

public void editProfile(String name) {
	profile_dd.click();
	myProfile.click();
	editName.sendKeys(name);
	saveEdit.click();
}

	}
