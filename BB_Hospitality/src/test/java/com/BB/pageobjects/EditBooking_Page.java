package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditBooking_Page {
//1. create object of webdriver
	private WebDriver driver;
	private WebDriverWait wait;
			 
//constructor
public EditBooking_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
 }

//identify webelements

@FindBy(xpath = "(//button[@class='_iconBtn_hwibs_47 _btnTheme_hwibs_211  '])[2]") 
WebElement edit_bkng;
@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/main[1]/div[1]/div[1]/div[9]/button[3]/div[1]/*[name()='svg'][1]") 
WebElement confirm_edit;


public void editBooking() throws InterruptedException {
	Actions actions = new Actions(driver);
	 for (int i = 0; i < 8; i++) {
		    actions.sendKeys(Keys.PAGE_DOWN).perform();
		}
	 Thread.sleep(3000);
	 actions.sendKeys(Keys.TAB).perform();
	 edit_bkng.click();
	 Thread.sleep(2000);
	 confirm_edit.click();
	 }

}
