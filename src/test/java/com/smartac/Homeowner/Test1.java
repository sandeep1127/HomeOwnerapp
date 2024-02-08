package com.smartac.Homeowner;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Test1 {
  
	
	 @Test
  public void f() {
  }
	  
	 
	 
	 
	 
  @BeforeClass
  public void beforeClass() throws MalformedURLException {
	  
	  DesiredCapabilities dc = new DesiredCapabilities();
	  
	  dc.setCapability("platformName", "Android");
	  dc.setCapability("deviceName", "Nokia5.4");
	  dc.setCapability("UDID", "PD21BDD464038424");
	  dc.setCapability("automationName", "UiAutomator2");
	  dc.setCapability("appPackage", "");
	  dc.setCapability("appActivity", "");
	  
	  
	  String appUrl = System.getProperty("user.dir"); // This give path till Project
	  URL url = new URL("http://0.0.0.0:4723/");  // Here we provide the URL of our APPIUM Server. From Appium 2.0 we don't to need to add /wd/hub/ to the URL
	  
	  
	
	  AppiumDriver driver = new AppiumDriver(url, dc);  // Creating driver session gets created using URL of appium server and capabilities we gave.  Here we could aslo use "AndroidDriver" as well if we're working only for Android device
	  String sessionId = driver.getSessionId().toString();
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
