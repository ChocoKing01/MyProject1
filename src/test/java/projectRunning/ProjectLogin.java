package projectRunning;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="ProjectFeature\\Logpagein.feature",glue="projectClass",format= {"pretty","html:target/Create"})

public class ProjectLogin {

}
