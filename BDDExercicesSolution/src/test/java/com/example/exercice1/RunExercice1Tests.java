package com.example.exercice1;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" },
features = "classpath:cucumber/example1.feature")
public class RunExercice1Tests {
	
}
