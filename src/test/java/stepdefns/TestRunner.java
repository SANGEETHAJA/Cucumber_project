package stepdefns;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions
	(
	
			monochrome= true,
	        plugin = {"pretty","html:target/html-cucumber","json:target/cucumber.json"},
			features ="src/test/java/features",
			glue = "stepdefns",
			tags= {"@sanity"}
			//tags = {"@sanity or @regression"}
			
			
	)

					
	public class TestRunner
	{	
	}
