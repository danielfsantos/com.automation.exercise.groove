package com.automation.exercise.com.automation.exercise.groove.Steps;

import com.automation.exercise.com.automation.exercise.groove.PageObjects.Ct02ApiFilmsPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;

public class Ct02ApiFilmsStep extends Ct02ApiFilmsPage{

	@Dado("^o endereço da api$")
	public void getUrlApi() throws Throwable {
	 getUrlApiresults();
	}
	
	
	@Então("^a api retornara o resultado dos filmes$")
	public void a_api_retornara_o_resultado_dos_filmes() throws Throwable {
	   
	}
}
