package com.automation.exercise.com.automation.exercise.groove;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
 

public class ServiceHooks {
	public WebDriver driver;
	
    @Before
    public void initializeTest(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mãe\\Desktop\\com.automation.exercise.groove\\driver\\chromedriver.exe");
    }
    
 
}