package com.co.certiprof.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ProductPage {

    public static final Target LBL_PRODUCT = Target.the("capturar el nombre del producto")
            .locatedBy("//*[text()='Sauce Labs Backpack']");
}
