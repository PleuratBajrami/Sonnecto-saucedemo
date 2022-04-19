package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.apache.commons.exec.DaemonExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownAcces {

    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void correctCredentialsLogin(){

        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

        dashboardPage.sortDrodownProducts(3);

    }



}
