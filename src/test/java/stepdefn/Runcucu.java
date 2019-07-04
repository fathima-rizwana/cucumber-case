package stepdefn;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/register.feature","src/test/resources/Login.feature","src/test/resources/search.feature","src/test/resources/cart.feature"},
                 glue="stepdefn",plugin="json:target/jsonreport.json")
public class Runcucu {

}
