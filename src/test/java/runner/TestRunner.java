package runner;

import org.testng.annotations.DataProvider;

import Base.Randomized;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;


@CucumberOptions(features = {
"src/test/java/features" }, snippets = SnippetType.CAMELCASE, dryRun=true, glue = "steps", monochrome = true, tags = "@SmokeTest @Test", plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "summary" }

)


//{"json:target/cucumber.json", "pretty"}
public class TestRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider
//    @DataProvider (parallel = true) -- For parallel execution support (which is not going to work for our code)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
