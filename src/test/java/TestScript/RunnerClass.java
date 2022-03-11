package TestScript;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\FeatureFolder\\Exercise1.feature",
		                    "src\\test\\resources\\FeatureFolder\\Exercise2.feature",
		                    "src\\test\\resources\\FeatureFolder\\Exercise4.feature"},
                            plugin="html:target/report.html")
public class RunnerClass {

}
