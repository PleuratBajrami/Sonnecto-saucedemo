package com.sonnecto.tests;

import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @Test
    public void correctCredentialsLogin(){
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    @Test
    public void invalidCrendentialsLogin(){
        loginPage.negativeLoginTest("besnik", "bossi");
    }
}
