package com.sonnecto.tests;

import com.google.common.base.Verify;
import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetAppStateTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void resetAppState() {
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        dashboardPage.addToCartButton.click();
        dashboardPage.menuDropdown.click();
        dashboardPage.resetButton.click();
        Assert.assertFalse(!dashboardPage.shoppingCartNumber.isDisplayed());
    }
}
