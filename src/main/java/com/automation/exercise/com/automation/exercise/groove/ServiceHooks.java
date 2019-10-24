package com.automation.exercise.com.automation.exercise.groove;

import cucumber.api.java.Before;
 

public class ServiceHooks {
	
    @Before
    public void initializeTest(){
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mãe\\Desktop\\com.automation.exercise.groove\\driver\\chromedriver.exe");
    }
 
    
   
    
}