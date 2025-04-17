package com.BB.pageobjects;

import java.time.Duration;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BB.base.Base_Test;

public class AddInstitute_Page  extends Base_Test {
	
//1. create object of webdriver

 private WebDriver driver;
 private WebDriverWait wait;
 
//constructor
 
 public AddInstitute_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
 }
	 
//identify webelements
@FindBy(xpath = "//a[@class='_linkItem_v11ct_53 ' and  @href='/all-institutes']") 
WebElement all_Institute;
@FindBy(xpath = "//button[@class='_primary_1sag5_1 _btnBlack_1sag5_327 _addBtn_2h7mt_15']") 
WebElement add_institute_btn;

@FindBy(xpath = "//input[@id='name']")
WebElement instNane_txt;
@FindBy(xpath = "//input[@id='phone']")
WebElement phone_txt;
@FindBy(xpath = "//input[@id='email']")
WebElement email_txt;
@FindBy(xpath = "(//div[@class='reactSel__input-container css-1rgvke7'])[1]")
WebElement template;
@FindBy(xpath = "(//div[@class='reactSel__input-container css-1rgvke7'])[2]")
WebElement selectplan;
@FindBy(xpath = "//textarea[@id='address']")
WebElement address;
@FindBy(xpath = "//textarea[@id='description']")
WebElement description;
@FindBy(xpath = "//button[@class='_primary_1sag5_1 _btnBlack_1sag5_327 ']")
WebElement save_btn;	

//identify action on webelement

public void all_Institute_pop() throws InterruptedException 
{
	all_Institute.click();
	Thread.sleep(2000);
	add_institute_btn.click();
	Thread.sleep(2000);
}
   
public void fill_inst_detail(String name, String phone, String email, String adrs, String dscptn) throws InterruptedException {
	instNane_txt.sendKeys(name);
	phone_txt.sendKeys(phone);
	Thread.sleep(2000);
	email_txt.sendKeys(email);
	Thread.sleep(2000);
	address.sendKeys(adrs);
	description.sendKeys(dscptn);
}

public void template() throws InterruptedException 
{
	Actions action = new Actions(driver);
	action.moveToElement(template).click().build().perform();
	Thread.sleep(2000);
	Actions keyDown = new Actions(driver); 
	keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
	Thread.sleep(2000);
}

public void pricingplan() throws InterruptedException 
{
	Actions action = new Actions(driver);
	action.moveToElement(selectplan).click().build().perform();
	Thread.sleep(2000);
	Actions keyDown = new Actions(driver); 
	keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
	Thread.sleep(2000);
	save_btn.click();
}
   
}
