package Stepdefinations;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\Raju\\Documents\\mobile\\src\\test\\java\\resources\\check.feature",},
        format= {"pretty","html:target/09122017"})
public class NewTest {

}
