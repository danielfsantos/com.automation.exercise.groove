package com.automation.exercise.com.automation.exercise.groove;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigServices {
	 public WebDriver driver = new ChromeDriver();
	
	public ConfigServices(){
		System.setProperty("webdriver.chrome.driver", "com.automation.exercise.groove/driver/chromedriver.exe");
	}
	
	 public void initializateSite() {
		 driver.get("http://www.google.com.br");
	 }
 
    //driver.get("http://www.bing.com/");
    
    
    
    
    
    
    
    
    
}
