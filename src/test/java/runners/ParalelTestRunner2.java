package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\Pcucumber-reports2.html",
                "json:target/json-reports/Pcucumber2.json",
                "junit:target/xml-report/Pcucumber2.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@paralel2",
        dryRun = false //eksik adımları bulmak istiyorsak true, normal test için false
)


public class ParalelTestRunner2 {
}
