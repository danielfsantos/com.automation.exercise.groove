package com.automation.exercise.com.automation.exercise.groove.PageObjects;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.github.javafaker.Faker;

public class Ct01RegistryPage {
	public WebDriver driver = new ChromeDriver();
	public Faker faker = new Faker();
	public WebDriverWait wait = new WebDriverWait(driver, 20);
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
	public final String inputAdress = "//input[@id='address1']";
	public final String inputCity = "//input[@id='city']";
	public final String selectState = "//select[@id='id_state']";
	public final String inputZipCode = "//input[@id='postcode']";
	public final String selectCountry = "//select[@id='id_country']";
	public final String inputMobilePhone = "//input[@id='phone_mobile']";
	public final String btnRegister = "//button[@id='submitAccount']";
	public final String inputAlias = "//input[@id='alias']";
	public final String welcomeText = "//p[@class='info-account']";
	

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
		drpDay.selectByValue(String.valueOf(faker.number().numberBetween(1, 31)));	
	}
	
	public void selectMonthValue() {
		Select drpMonth = new Select(driver.findElement(By.xpath(selectMonth)));
		drpMonth.selectByValue(String.valueOf(faker.number().numberBetween(1, 12)));
	}
	
	public void selectYearValue() {
		Select drpYear = new Select(driver.findElement(By.xpath(selectYear)));
		drpYear.selectByValue(String.valueOf("1994"));
	}
	
	public void insertAdress() {
		driver.findElement(By.xpath(inputAdress)).sendKeys(faker.address().streetName());
	}
	
	public void insertCity() {
		driver.findElement(By.xpath(inputCity)).sendKeys(faker.address().city());
	}
	
	public void selectState() {
		Select drpState = new Select(driver.findElement(By.xpath(selectState)));
		drpState.selectByValue(String.valueOf(rand.nextInt(50)));
	}
	
	public void insertZipCode() {
		driver.findElement(By.xpath(inputZipCode)).sendKeys(String.valueOf(faker.number().numberBetween(10000, 50000)));
	}
	
	public void selectCountry() {
		Select drpCountry = new Select(driver.findElement(By.xpath(selectCountry)));
		drpCountry.selectByValue("21");
		
	}
	
	public void insertMobilePhone() {
		driver.findElement(By.xpath(inputMobilePhone)).sendKeys(faker.phoneNumber().cellPhone());
	}
	
	public void insertAlias() {
		driver.findElement(By.xpath(inputAlias)).sendKeys(faker.gameOfThrones().house());
	}
	
	
	public void clickBtnRegister() {
		driver.findElement(By.xpath(btnRegister)).click();
	}
		
	public void welcomeTextHasVisible() {
		WebElement welcome = driver.findElement(By.xpath(welcomeText));	
		Assert.assertTrue(welcome.isDisplayed());
		Assert.assertEquals(welcome.getText(), "Welcome to your account. Here you can manage all of your personal information and orders.");
	}
	
	public void quitPage() {
		driver.close();
	}
	
}
