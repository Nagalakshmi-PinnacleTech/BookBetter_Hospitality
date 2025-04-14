package com.BB.listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.*;
import com.BB.base.Base_Test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestListeners extends Base_Test implements ITestListener{
	
	public void onTestFailure(ITestResult result) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        String methodName = result.getMethod().getMethodName();
        File dest = new File("screenshots/" + methodName + "_" + timestamp + ".png");
        try {
            FileUtils.copyFile(src, dest);
            System.out.println("Saved screenshot: " + dest.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
