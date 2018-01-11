package com.example.exercice0;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Assert;

public class Exercice0Steps {

	private int cukes;
	
	@Before
	public void setUp(){
		cukes = 0;
	}
	
	@Given("^I have (\\d+) cukes$")
	public void i_have_cukes(int arg1) throws Exception {
		cukes = arg1;
	}

	@When("^I eat (\\d+) cukes$")
	public void i_eat_cukes(int arg1) throws Exception {
		cukes -= arg1;
	}

	@Then("^I would have (\\d+) cukes$")
	public void i_would_have_cukes(int arg1) throws Exception {
		assertThat(cukes).isEqualTo(arg1);
	}

}
