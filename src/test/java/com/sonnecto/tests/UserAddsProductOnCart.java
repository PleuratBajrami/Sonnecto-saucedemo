package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class UserAddsProductOnCart {
    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void userSelectsFromDropdown(){

        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

        dashboardPage.sortDrodownProducts(2);

    }
}
