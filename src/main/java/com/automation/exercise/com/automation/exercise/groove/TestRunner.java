package com.automation.exercise.com.automation.exercise.groove;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(tags="@api", features="src/test/java/features",plugin = "json:target/cucumber-report.json")
public class TestRunner extends AbstractTestNGCucumberTests{
}