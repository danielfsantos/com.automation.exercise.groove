package com.automation.exercise.com.automation.exercise.groove;

import cucumber.api.java.Before;
 

public class ServiceHooks {
    @Before
    public void initializeTest(){
        System.out.println("Esta Passando ?");
    }
 
}