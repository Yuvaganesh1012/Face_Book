package com.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature",glue = {"com\\stepdef","Hooks"},tags = "@Tc567",dryRun = false,
plugin = {"html:target\\report\\facebook.html"},
monochrome = true)
public class testrunner {

}
