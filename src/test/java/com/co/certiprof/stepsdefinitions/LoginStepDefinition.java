package com.co.certiprof.stepsdefinitions;

import com.co.certiprof.questions.ValidationProduct;
import com.co.certiprof.tasks.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.model.util.EnvironmentVariables;
import org.hamcrest.Matchers;

public class LoginStepDefinition {


    private EnvironmentVariables environmentVariable;

    @Given("He user is on the page")
    public void heUserIsOnThePage() {
        String webServiceEndpoint = EnvironmentSpecificConfiguration.from(environmentVariable)
                .getProperty("environments.default.webdriver.base.url");
        String URL = webServiceEndpoint.toString();
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(URL));

    }

    @When("he enter the credentials")
    public void heEnterTheCredentials() {

        OnStage.theActorInTheSpotlight().attemptsTo(Login.enter());

    }

    @Then("He could see the produtcs")
    public void heCouldSeeTheProdutcs() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidationProduct.validation()
                , Matchers.is("Sauce Labs Backpack")));

    }
}