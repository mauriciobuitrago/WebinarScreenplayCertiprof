package com.co.certiprof.questions;

import com.co.certiprof.userinterfaces.ProductPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidationProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(ProductPage.LBL_PRODUCT).answeredBy(actor);
    }

    public static ValidationProduct validation(){
        return new ValidationProduct();
    }
}
