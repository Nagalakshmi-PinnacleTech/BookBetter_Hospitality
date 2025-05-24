package com.BB.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.commons.logging.Log;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import com.BB.utilities.ReadConfig;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test {
    
	ReadConfig readConfig = new ReadConfig();

	String url = readConfig.getBaseUrl();
	String browser = readConfig.getBrowser();

	public String emailAddress = readConfig.getEmail() ;
	String password = readConfig.getPassword();
	
	
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		//launch browser
		switch(browser.toLowerCase())
		{
		case "chrome":
//			ChromeOptions options = new ChromeOptions();
//			options.addArguments("start-maximized"); // or "window-size=1920,1080"
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "msedge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			driver = null;
			break;
		}

		//implicit wait of 20 secs
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		//for logging
		logger = LogManager.getLogger("BB_hospitality");
		
		//open url
		driver.get(url);
		logger.info("URL launched");
		
		//Mazimize current window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);
}

//	@AfterClass
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }

}
