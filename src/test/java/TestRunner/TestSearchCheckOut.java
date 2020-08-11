package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)				
@CucumberOptions(features="src/test/java/Features/SearchCheckoutlist.feature",
glue={"StepDefinitionSearch","HooksSearch"},
tags="@SelTest",
monochrome=true,
dryRun=false,
strict=true,
plugin= {"pretty","html:target/cucumber","json:target/cucumber.json","junit:target/cukes.xml"})	


public class TestSearchCheckOut {

}
