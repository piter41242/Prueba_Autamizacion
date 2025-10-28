package co.com.AutoPractice.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/automation_practice.feature",
        glue = {"co.com.AutoPractice.stepsdefinitions", "co.com.AutoPractice.utils.hooks"},
        snippets = SnippetType.CAMELCASE)


public class PracticeRunner {

}
