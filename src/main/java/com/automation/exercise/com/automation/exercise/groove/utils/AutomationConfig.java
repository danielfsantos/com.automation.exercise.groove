package com.automation.exercise.com.automation.exercise.groove.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationConfig {

	public WebDriver driver() {
		WebDriver dr = new ChromeDriver();
		return dr;
	}
	
}
