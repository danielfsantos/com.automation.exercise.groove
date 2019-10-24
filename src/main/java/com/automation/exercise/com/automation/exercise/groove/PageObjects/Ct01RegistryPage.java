package com.automation.exercise.com.automation.exercise.groove.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ct01RegistryPage {
	public WebDriver driver = new ChromeDriver();
	public final String Url = "http://automationpractice.com/";
	public final String btnSignIn = "//div/a[@class='login']";
	public final String txtEmailCreate = "//div/input[@name='email_create']";
	public final String btnCreateAccount = "//button[@id='SubmitCreate']";

	public void getPage() {
		driver.get(Url);
		driver.manage().window().maximize();
	}

	public void clickBtnSignIn() {
		driver.findElement(By.xpath(btnSignIn)).click();
	}

	public void insertEmail() {
		driver.findElement(By.xpath(txtEmailCreate)).sendKeys("teste@teste.com.br");
	}

	public void clickBtnCreateAccount() {
		driver.findElement(By.xpath(btnCreateAccount)).click();
	}

}
