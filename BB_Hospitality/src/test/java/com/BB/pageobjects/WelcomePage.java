package com.BB.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	//1. create object of webdriver
			WebDriver ldriver;

			//constructor
			public WelcomePage(WebDriver rdriver)
			{
				ldriver = rdriver;
				PageFactory.initElements(rdriver, this);
			}


			//identify webelements
			@FindBy(xpath = "//a[@class='btn btn-outline-light']") 
			WebElement login_btn;
			
			
			//identify action on webelement
			public void clickOnLogin()
			{
				login_btn.click();
			}
			
			public String getPageTitle()
			{
				return(ldriver.getTitle());
			}
			
}
