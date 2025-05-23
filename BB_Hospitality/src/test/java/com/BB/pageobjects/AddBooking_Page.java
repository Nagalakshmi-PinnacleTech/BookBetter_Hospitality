package com.BB.pageobjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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
		 
	

}
