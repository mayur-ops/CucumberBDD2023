package com.CucumberBDD2023.BaseClassPackage;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    public DriverFactory driverFactor = new DriverFactory();

    @Before
    public void setUp(){
       driverFactor.openBrowser();
    }

    @After
    public void tearDown(){
        driverFactor.closeBrowser();
    }
}

