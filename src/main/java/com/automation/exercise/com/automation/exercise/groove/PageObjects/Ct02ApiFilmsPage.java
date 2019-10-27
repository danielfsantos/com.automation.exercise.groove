package com.automation.exercise.com.automation.exercise.groove.PageObjects;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.path.json.JsonPath;

public class Ct02ApiFilmsPage {
		//public final String Url = "​https://swapi.co/api/films/?format=json";
		public final String baseurl = "https://swapi.co/api/films/?format=json";
		
		@SuppressWarnings("unused")
		public void getUrlApiresults() {
			 RestAssured.given()
					.header("Acept","application/json")
					.get(baseurl).then().assertThat().statusCode(200);
		}
		
		
		public void resultFilmTitles() {
			JsonPath jsonpath = RestAssured.given().get(baseurl).andReturn().jsonPath();
			System.out.println(jsonpath.get("results.title"));
			
		}
		
}
