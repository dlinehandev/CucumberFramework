package runner;

import core.TestConfig;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner {

    @BeforeClass
    public static void test() throws Exception {
        String env = System.getenv("env").toLowerCase();
        TestConfig.load(env);
        TestConfig.addProperty("env",env);
    }
}
