package projectRunning;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="ProjectFeature\\CreateAccount.feature",glue="projectClass\\ACcreate.java",format= {"pretty","html:target/Create"})

public class CreationAC {

}
