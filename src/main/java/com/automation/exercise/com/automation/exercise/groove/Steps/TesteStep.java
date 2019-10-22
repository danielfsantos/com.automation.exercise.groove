package com.automation.exercise.com.automation.exercise.groove.Steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class TesteStep {

	@Dado("^que eu esteja na home$")
	public void homePage() throws Throwable {
	   
	  System.out.println("Passou aqui ?");
	}

	@Quando("^clicar em se cadastrar$")
	public void ClickInRegistry() throws Throwable {
	 
		System.out.println("e aqui ?");
	}

	
}
