package com.automation.exercise.com.automation.exercise.groove.PageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.exercise.com.automation.exercise.groove.utils.Utility;
import com.github.javafaker.Faker;

public class Ct01RegistryPage {
	public WebDriver driver = new ChromeDriver();
	public Faker faker = new Faker();
	public WebDriverWait wait = new WebDriverWait(driver, 20);
	public Utility Utils = new Utility();
	public Random rand = new Random();
	
	public final String Url = "http://automationpractice.com/";
	public final String btnSignIn = "//div/a[@class='login']";
	public final String txtEmailCreate = "//div/input[@name='email_create']";
	public final String btnCreateAccount = "//button[@id='SubmitCreate']";
	public final String radioMr = "//div/label/div[@id='uniform-id_gender1']";
	public final String radioMrs = "//div/label/div[@id='uniform-id_gender2']";
	public final String inputFirstName = "//div/input[@id='customer_firstname']";
	public final String inputLastName = "//div/input[@id='customer_lastname']";
	public final String inputPassword = "//div/input[@id='passwd']";
	public final String SelectDays = "//select[@id='days']";
	public final String selectMonth = "//select[@id='months']";
	public final String selectYear = "//select[@id='years']";
	

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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(radioMr)));
		driver.findElement(By.xpath(radioMr)).click();
	}
	
	public void checkRadiosMrs() {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(radioMrs)));
		driver.findElement(By.xpath(radioMrs)).click();
	}
	
	public void insertInputFirstName() {
		driver.findElement(By.xpath(inputFirstName)).sendKeys(faker.name().firstName());
	}
	
	public void insertInputLastName() {
		driver.findElement(By.xpath(inputLastName)).sendKeys(faker.name().lastName());
	}
	
	public void insertPassword() {
		driver.findElement(By.xpath(inputPassword)).sendKeys("123456");
	}

	public void selectDaysValue() {
		Select drpDay = new Select(driver.findElement(By.xpath(SelectDays)));
		drpDay.selectByValue(String.valueOf(rand.nextInt(31)));	
	}
	
	public void selectMonthValue() {
		Select drpMonth = new Select(driver.findElement(By.xpath(selectMonth)));
		drpMonth.selectByValue(String.valueOf(rand.nextInt(12)));
	}
	
	public void selectYearValue() {
		Select drpYear = new Select(driver.findElement(By.xpath(selectYear)));
		drpYear.selectByValue("1994");
	}
	
}
