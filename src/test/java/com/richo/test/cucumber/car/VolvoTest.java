package com.richo.test.cucumber.car;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty", features = "target/test-classes/com/richo/test/cucumber/car/volvo.feature")
public class VolvoTest
{

}
