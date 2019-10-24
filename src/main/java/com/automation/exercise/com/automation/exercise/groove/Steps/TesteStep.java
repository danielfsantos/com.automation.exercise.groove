package com.automation.exercise.com.automation.exercise.groove.Steps;

import com.automation.exercise.com.automation.exercise.groove.PageObjects.Ct01RegistryPage;

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
	public void inserir_um_email_Valido() throws Throwable {
			insertEmail();
	}

	@Então("^clicar no botão create an account$")
	public void clicar_no_botão_create_an_account() throws Throwable {
			clickBtnCreateAccount();
	}
}
