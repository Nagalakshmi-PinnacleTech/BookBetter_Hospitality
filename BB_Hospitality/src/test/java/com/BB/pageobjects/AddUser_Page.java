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

import com.BB.base.Base_Test;

public class AddUser_Page  extends Base_Test {
	
	//1. create object of webdriver

	 private WebDriver driver;
	 private WebDriverWait wait;
	 
	//constructor
	 
	 public AddUser_Page(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     PageFactory.initElements(driver, this);
	 }
		 
	//identify webelements
	@FindBy(xpath = "//a[@class='_linkItem_v11ct_53 ' and  @href='/all-users']") 
	WebElement all_user_tab;
	@FindBy(xpath = "//button[@class=\"_primary_1sag5_1 _btnBlack_1sag5_327 _addBtn_zeq17_15\"]") 
	WebElement add_user_btn;

	@FindBy(xpath = "(//div[@class=\"reactSel__input-container css-1rgvke7\"])[1]") 
	WebElement inst_name;
	@FindBy(xpath = "(//div[@class=\"reactSel__input-container css-1rgvke7\"])[2]") 
	WebElement role; 
	@FindBy(xpath = "//input[@id='name']") 
	WebElement username;
	@FindBy(xpath = "//input[@id='email']") 
	WebElement useremail;
	@FindBy(xpath = "//textarea[@id='address']") 
	WebElement useraddress;
	@FindBy(xpath = "//input[@id='phone']") 
	WebElement userphone; 
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/*[name()='svg'][1]") 
	WebElement profile_pic;
	@FindBy(xpath = "//button[normalize-space()='Save']")
	WebElement save_btn;
	
	//identify action on webelement

	public void add_user_pop() throws InterruptedException 
	{
		all_user_tab.click();
		Thread.sleep(2000);
		add_user_btn.click();
		Thread.sleep(2000);
	}
	
	public void institute_role() throws InterruptedException 
	{
		Actions action1 = new Actions(driver);
		action1.moveToElement(inst_name).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown1 = new Actions(driver); 
		keyDown1.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(2000);
		Actions action2 = new Actions(driver);
		action2.moveToElement(role).click().build().perform();
		Thread.sleep(2000);
		Actions keyDown2 = new Actions(driver); 
		keyDown2.sendKeys(Keys.chord(Keys.ENTER)).perform();
		Thread.sleep(2000);
	}
	
	public void fill_user_detail(String name, String email, String adrs, String phone) throws InterruptedException {
		username.sendKeys(name);
		useremail.sendKeys(email);
		Thread.sleep(1000);
		useraddress.sendKeys(adrs);
		Thread.sleep(1000);
		userphone.sendKeys(phone);
		save_btn.click();
	}
	
	 public void uploadProfilePic()
	 {
		 
		 // Construct full file path
		String filePath = ("C://Users//Nagalakshmi S//Downloads//Kaagaz_20220117_120115988436-1 (1).jpg");
		// Ensure input is visible before sending file path
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.display = 'block';", profile_pic);

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.elementToBeClickable(profile_pic));
	    
	    // Upload the file
	    profile_pic.sendKeys(filePath);
	}           

}
