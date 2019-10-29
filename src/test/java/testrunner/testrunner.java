package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\Documents\\selenium\\casestudycucumber\\features\\feature4.feature",
glue= {"stepdefinition"},
tags= {"@tag2"},
plugin={"pretty","html:target/cucumber-html-report"})
public class testrunner {

}
