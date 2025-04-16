package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

//1. create object of webdriver

 private WebDriver driver;
 private WebDriverWait wait;
 
//constructor
 
 public LoginPage(WebDriver driver) {
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

//identify action on webelement

public void login(String user, String pass) throws InterruptedException {
	registeredUsersEmail.sendKeys(user);
	registeredUsersPwd.sendKeys(pass);
	Thread.sleep(2000);
	submitLogin.click();
	Thread.sleep(2000);
}
	}