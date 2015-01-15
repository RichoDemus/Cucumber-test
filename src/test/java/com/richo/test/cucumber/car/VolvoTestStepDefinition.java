package com.richo.test.cucumber.car;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class VolvoTestStepDefinition
{
	private Volvo volvo;
	private CarKeys carKeys;

	@Given("^that I have a car$")
	public void that_I_have_a_car() throws Throwable
	{
		volvo = new Volvo();
		Assert.assertNotNull(volvo);
	}

	@Given("^that I have car keys$")
	public void that_I_have_car_keys() throws Throwable
	{
		carKeys = new CarKeys(volvo);
		Assert.assertNotNull(carKeys);
	}

	@When("^I press the lock button on my kar keys$")
	public void i_press_the_lock_button_on_my_kar_keys() throws Throwable
	{
		carKeys.lock();
	}

	@Then("^The car should be locked$")
	public void the_car_should_be_locked() throws Throwable
	{
		Assert.assertTrue(volvo.isLocked());
	}
}
