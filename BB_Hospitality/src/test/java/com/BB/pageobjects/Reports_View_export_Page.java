package com.BB.pageobjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Reports_View_export_Page {
//1. create object of webdriver
 private WebDriver driver;
 private WebDriverWait wait;
 
//constructor
public Reports_View_export_Page(WebDriver driver) {
     this.driver = driver;
     this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     PageFactory.initElements(driver, this);
 }
	 
//identify webelements
@FindBy(xpath = "//a[normalize-space()='Reports']")
WebElement reports;
@FindBy(xpath = "//div[@class='_chartContainer_ps6pt_1 _chartActive_ps6pt_21']//button[@type='button'][normalize-space()='View Report']")
WebElement view_reports;
@FindBy(xpath = "//div[@class='_chartContainer_ps6pt_1 _chartActive_ps6pt_21']//button[@type='button'][normalize-space()='Download']")
WebElement download_reports;

public void reports() throws InterruptedException {
	reports.click();
	Thread.sleep(4000);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", view_reports);
	view_reports.click();
	download_reports.click();
	}

}
