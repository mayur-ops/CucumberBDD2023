package com.CucumberBDD2023;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/Resource/HomePage.feature")
//@CucumberOptions(features = "src/test/Resource/HomePage.feature", tags = "  @IndividualSearch")
//@CucumberOptions(features = "src/test/Resource/HomePage.feature", tags = "@MultipleSearch")
@CucumberOptions(features = "src/test/Resource/ResultPage.feature", tags = "@ResultPage",
        plugin = {"html:target/cucumber-html-report",
        "json:target/cucumber-json-report.json",
        "junit:target/cucumber-xml-report.xml",
        "pretty:target/cucumber-pretty-report.txt"})
//@CucumberOptions(plugin = {"pretty"})

public class RunCukeTest {

}

// Dev code
// pushing code into my branch

