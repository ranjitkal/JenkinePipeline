package com.qa.Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/Login.feature"
		,glue= {"com.qa.stepdef"}
		)

public class TestRunner {

	
	
}
