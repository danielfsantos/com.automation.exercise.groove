package com.automation.exercise.com.automation.exercise.groove;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 

public class ServiceHooks {
	
	
    @Before
    public void initializeTest(){
    	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
    }
    
    
    
    @After
    public void quitBrowser() {
    	
    }
 
}