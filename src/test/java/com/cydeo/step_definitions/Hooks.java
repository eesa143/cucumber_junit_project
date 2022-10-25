package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    //@Before (order=1) // @Before annotation should be from io.cucumber.java
    public void setupScenario(){
        System.out.println("Setting up browser using cucumber @Before annotation for each scenario");
        Driver.getDriver().get("URL of Choice");

    }

    @After // @After annotation should be from io.cucumber.java
    public void teardownScenario(){
        // we will implement taking screenshot
        System.out.println("It will close browser using cucumber @After annotation for each scenario");
        Driver.closeDriver();

    }

    //@Before (value = "@login", order = 2)
    public void setupForLogin(){

    }

    //@Before (value = "@db", order = 3)
    public void setupDatabaseScenario(){

    }
}
