package com.automation.exercise.com.automation.exercise.groove.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class Ct01RegistryPage {
	public WebDriver driver = new ChromeDriver();
	public Faker faker = new Faker();
	
	public final String Url = "http://automationpractice.com/";
	public final String btnSignIn = "//div/a[@class='login']";
	public final String txtEmailCreate = "//div/input[@name='email_create']";
	public final String btnCreateAccount = "//button[@id='SubmitCreate']";
	public final String radioMr = "//div/label/div[@id='uniform-id_gender1']";
	public final String radioMrs = "//div/label/div[@id='uniform-id_gender2']";

	public void getPage() {
		driver.get(Url);
		driver.manage().window().maximize();
	}

	public void clickBtnSignIn() {
		driver.findElement(By.xpath(btnSignIn)).click();
	}

	public void insertEmail() {
		driver.findElement(By.xpath(txtEmailCreate)).sendKeys(faker.name().firstName()+"@teste.com.br");
	}

	public void clickBtnCreateAccount() {
		driver.findElement(By.xpath(btnCreateAccount)).click();
	}
	
	public void checkRadioMr() {
		driver.findElement(By.xpath(radioMr)).click();
	}
	
	public void checkRadiosMrs() {
		driver.findElement(By.xpath(radioMrs)).click();
	}

}
