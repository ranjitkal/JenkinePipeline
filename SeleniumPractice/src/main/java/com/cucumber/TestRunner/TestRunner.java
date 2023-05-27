package com.cucumber.TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;		
	

@RunWith(Cucumber.class)				
@CucumberOptions(
		features={"src/main/java/com/cucumber/feacture/login.feature"},
		glue="com/cucumber/stepdef",
monochrome = true,
//tags = "@Sanity"
//scenarios under @sanity tag will be executed
//plugin = {"pretty","html:target/cucumber-reports/reports_html.html"})
plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRunner {

}
