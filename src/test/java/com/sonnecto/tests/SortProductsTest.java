package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SortProductsTest {
    LoginPage loginPage = new LoginPage();

    DashboardPage dashboardPage = new DashboardPage();

    @Test
    public void correctCredentialsLogin(){

        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));

        dashboardPage.addToCartButton.click();

        Assert.assertTrue(dashboardPage.numberOfProductsOnIcon.isDisplayed());

    }
}
