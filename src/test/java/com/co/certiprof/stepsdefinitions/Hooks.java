package com.co.certiprof.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.it.Ma;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed
    WebDriver hisDriver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("userMao");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisDriver));
    }



}
