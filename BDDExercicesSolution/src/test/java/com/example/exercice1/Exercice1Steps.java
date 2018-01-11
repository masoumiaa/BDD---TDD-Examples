package com.example.exercice1;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Exercice1Steps {

	private Calculator calc = new Calculator();
	
	@Given("^the following groceries:$")
	public void the_following_groceries(List<Grocery> list) throws Exception {
		for (Grocery grocery : list) {
			Calculator.push(grocery);
		}
	}

	@When("^I pay (\\d+)$")
	public void i_pay(int arg1) throws Exception {
	    calc.setPayedMoney(arg1);
	}

	@Then("^my change should be (\\d+)$")
	public void my_change_should_be(int arg1) throws Exception {
	    int change = calc.getChange();
	    assertThat(change).isEqualTo(arg1);
	}
}
