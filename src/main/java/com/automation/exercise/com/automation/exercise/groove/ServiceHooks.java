package com.automation.exercise.com.automation.exercise.groove;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
 

public class ServiceHooks {
	
		
    @Before
    public void initializeTest(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daniel\\eclipse-workspace\\com.automation.exercise.groove\\driver\\chromedriver.exe");
    }
 
}