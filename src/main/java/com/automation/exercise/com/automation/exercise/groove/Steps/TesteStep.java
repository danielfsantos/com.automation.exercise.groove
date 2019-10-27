package com.automation.exercise.com.automation.exercise.groove.Steps;

import com.automation.exercise.com.automation.exercise.groove.PageObjects.Ct01RegistryPage;
import com.automation.exercise.com.automation.exercise.groove.utils.Utility;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class TesteStep extends Ct01RegistryPage {

	
	@Dado("^que eu esteja na home$")
	public void homePage() throws Throwable {
		getPage();
	
	}

	@Quando("^clicar em se Sign in$")
	public void openSignIn() throws Throwable {
		clickBtnSignIn();
	}

	@Quando("^inserir um email Valido$")
	public void insertValidEmail() throws Throwable {
			insertEmail();
	}

	@Então("^clicar no botão create an account$")
	public void openCreateAnAccountPage() throws Throwable {
			clickBtnCreateAccount();
	}
	
	@Então("^preencher os campos de cadastro$")
	public void fillRegistrationFields() throws Throwable {
	  checkRadioMr();
	  insertInputFirstName();
	  insertInputLastName();
	  insertPassword();
	  selectDaysValue();
	  selectMonthValue();
	  selectYearValue();
	  insertAdress();
	  insertCity();
	  selectState();
	  insertZipCode();
	  selectCountry();
	  insertMobilePhone();
	  insertAlias();
	  
	}
	
	@Quando("^clicar no botão Register$")
	public void clickRegister() throws Throwable {
		clickBtnRegister();  
	}

	@Então("^a tela My Account sera apresentada$")
	public void verifyWelcomeMyccount() throws Throwable {
		welcomeTextHasVisible(); 
	}
}
