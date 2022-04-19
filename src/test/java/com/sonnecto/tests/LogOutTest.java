package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LogOutTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void correctCredentialsLogin() {
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void logOut() {
        dashboardPage.MenuDropdown.click();
        dashboardPage.LogoutButton.click();
    }
}
