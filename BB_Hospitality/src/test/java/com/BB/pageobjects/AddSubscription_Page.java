package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.BB.base.Base_Test;
import com.BB.utilities.ScrollUtils;

public class AddSubscription_Page extends Base_Test {
	
	//1. create object of webdriver

	 private WebDriver driver;
	 private WebDriverWait wait;
	 
	//constructor
	 
	 public AddSubscription_Page(WebDriver driver) {
	     this.driver = driver;
	     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	     PageFactory.initElements(driver, this);
	 }
		 
	//identify webelements
	@FindBy(xpath = "//a[@class='_linkItem_v11ct_53 ' and  @href=\'/subscriptions\']")  
	WebElement subscription_tab;
	@FindBy(xpath = "(//table//tbody//tr[1]//descendant::div//*[local-name()='svg'])[1]") 
	WebElement edit_sbscptn_icon; 
	@FindBy(xpath = "(//input[@value='Day dd/mm/yyyy'])[1]")  
	WebElement start_dt;
	@FindBy(xpath = "//button[@class=\"rdrDay rdrDayStartOfMonth\"]")  
	WebElement firstDay;
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[3]/button[2]")  
	WebElement done_btn;
	@FindBy(xpath = "//input[@class=\"_numberInput_1xobt_13\"]")  
	WebElement subs_amount; 
	@FindBy(xpath = "//button[@class=\"_primary_1sag5_1 _btnBlack_1sag5_327 \"]")  
	WebElement subs_save; 
	@FindBy(xpath = "//div[@class='reactSel__input-container css-1rgvke7']")  
	WebElement payment_mode;  
	@FindBy(xpath = "(//input[@class=\"_numberInput_1xobt_13\"])[2]")  
	WebElement amt_paid; 
	@FindBy(xpath = "(//input[@class='_inputSingleBox_mnnhu_19'])[3]")  
	WebElement payment_cal;  
	@FindBy(xpath = "//button[@class='rdrDay rdrDayEndOfMonth']")  
	WebElement lastday; 
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[2]/form[1]/div[2]/div[7]/div[1]/div[2]/div[3]/button[2]")  
	WebElement done_btn2; 
	@FindBy(xpath = "//button[@class=\"_primary_1sag5_1 _btnTransparent_1sag5_89 \"]")  
	WebElement addPay_btn; 
	@FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/button[2]")  
	WebElement final_save; 
	

	//identify action on webelement

	public void subscription_pop() throws InterruptedException 
	{
		subscription_tab.click();
		Thread.sleep(2000);
	}
    
    public void zoomout() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("document.body.style.zoom='80%'"); // Zoom out to 80%
    }
    
    public void edit_subscription() throws InterruptedException 
	{
    	edit_sbscptn_icon.click();
		Thread.sleep(2000);
	}
    
    public void fill_sub_detail(String amt) throws InterruptedException 
	{
    	start_dt.click();
    	Thread.sleep(1000);
    	firstDay.click();
		Thread.sleep(1000);
		done_btn.click();
		Thread.sleep(1000);
		subs_amount.clear();
		subs_amount.sendKeys(amt);
		Thread.sleep(1000);
	}
    
    public void payment_mode(String amtPaid) throws InterruptedException 
    {
    	Actions action = new Actions(driver);
    	action.moveToElement(payment_mode).click().build().perform();
    	Thread.sleep(1000);
    	Actions keyDown = new Actions(driver); 
    	keyDown.sendKeys(Keys.chord(Keys.ENTER)).perform();
    	Thread.sleep(1000);
    	amt_paid.sendKeys(amtPaid);
    }
    
    public void payment_detail() throws InterruptedException 
	{
    	payment_cal.click();
    	Thread.sleep(1000);
    	lastday.click();
		Thread.sleep(1000);
		done_btn2.click();
		Thread.sleep(1000);
		addPay_btn.click();
		Thread.sleep(1000);
		final_save.click();
	}

}
