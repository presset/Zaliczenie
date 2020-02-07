package Cucumber.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Feature/zakupSwetra.feature",
        plugin = {"pretty","html:out"})
public class ZakupSwetraTest {
}
