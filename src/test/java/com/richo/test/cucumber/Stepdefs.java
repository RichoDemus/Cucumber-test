package com.richo.test.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Stepdefs
{
	private Belly belly;

	@Given("^I have a belly$")
	public void I_have_a_belly()
	{
		belly = new Belly();
		Assert.assertNotNull(belly);
	}

	@When("^I eat (\\d+) cukes$")
	public void i_eat_cukes(int arg1) throws Throwable {
		belly.eat(arg1);
	}

	@Then("^my belly should be full$")
	public void my_belly_should_be_full() throws Throwable {
		Assert.assertTrue(belly.isFull());
	}

	@Then("^my belly should not be full$")
	public void my_belly_should_not_be_full() throws Throwable {
		Assert.assertFalse(belly.isFull());
	}
}
