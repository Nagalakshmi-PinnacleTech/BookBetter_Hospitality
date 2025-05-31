package com.BB.pageobjects;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Settings_Page {
//1. create object of webdriver

 private WebDriver driver;
 private WebDriverWait wait;
	 
//constructor
	 
 public Settings_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
	 }
	 
//identify webelements
@FindBy(xpath = "//a[normalize-space()='Settings']")
WebElement settings;
@FindBy(xpath = "//a[normalize-space()='Add Particulars']")
WebElement add_particulars_tab;
@FindBy(xpath = "//body/div[@id='root']/div[contains(@class,'_outerContainer_7ly4b_1')]/main[contains(@class,'_mainContainer_7ly4b_17')]/div[contains(@class,'_mainContent_11psw_187')]/div[contains(@class,'settingsContainer')]/div[contains(@class,'mt-1')]/div[contains(@class,'col-gap-1')]/div[1]/div[1]/button[1]")
WebElement add_particulars_btn; 
@FindBy(xpath = "//body[1]/div[5]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[2]/div[1]/input[1]")
WebElement particulars_txtbx;
@FindBy(xpath = "//input[@value='0']")
WebElement rate_per_unit_txtbx;
@FindBy(xpath = "//body[1]/div[5]/div[1]/main[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")
WebElement save_particular;

//identify action on webelement
public void setting_paricular(String par_name, String rate) throws InterruptedException {
settings.click();
Thread.sleep(1000);
add_particulars_tab.click();
Thread.sleep(1000);
add_particulars_btn.click();
Thread.sleep(1000);
particulars_txtbx.sendKeys(par_name);
rate_per_unit_txtbx.sendKeys(rate);
Thread.sleep(1000);
save_particular.click();

	}
}