package com.co.certiprof.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("ingresar un usuario")
            .locatedBy("//input[@id='user-name']");

    public static final Target TXT_PASSWORD = Target.the("ingresar una contrasena")
            .locatedBy("//input[@id='password']");

   public static final Target BTN_LOGIN = Target.the("clock en el boton login")
            .locatedBy("//input[@id='login-button']");




}
