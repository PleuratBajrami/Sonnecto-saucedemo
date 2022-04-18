package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class ReachSocialMediaTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void ReachAllSocialMediaTest (){
        loginPage.login (ConfigurationReader.getProperty ("username"),ConfigurationReader.getProperty ("password"));


    }
}
