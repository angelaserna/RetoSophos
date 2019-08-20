package co.com.proyectobase.screenplay.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ComprarEnMetro.feature",
        tags = "@CasoExitoso",
        glue = "co.com.proyectobase.screenplay.stepdefinitions",
        snippets = SnippetType.CAMELCASE)

public class RunnerComprarEnMetro {
}
