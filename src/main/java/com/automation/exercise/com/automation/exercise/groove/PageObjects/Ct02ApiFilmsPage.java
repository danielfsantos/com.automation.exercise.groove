package com.automation.exercise.com.automation.exercise.groove.PageObjects;

import cucumber.api.java.en.Given;
import static org.hamcrest.core.IsEqual.equalTo;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class Ct02ApiFilmsPage {
		//public final String Url = "​https://swapi.co/api/films/?format=json";
		
		
		@SuppressWarnings("unused")
		public void getUrlApiresults() {
			//Response response = get(Url).andReturn();
			JsonPath jsonpath = RestAssured.given()
					.header("Aceept","application/json")
					.parameter("results.director", "George Lucas")
					.parameter("results.producer", "Rick McCallum")
					.get("https://swapi.co/api/films/?format=json").andReturn().jsonPath();
           System.out.println(jsonpath.getString("results.title"));
			
			
			//	given().get(Url).andReturn().jsonPath();
		}
		
}
