package com.example.exercice3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" },
features = "classpath:cucumber/example3.feature")
public class RunExercice3Tests {
	
}
