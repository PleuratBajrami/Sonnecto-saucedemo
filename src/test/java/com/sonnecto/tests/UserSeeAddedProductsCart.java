package com.sonnecto.tests;

import com.sonnecto.pages.CartPage;
import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class UserSeeAddedProductsCart {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    CartPage cartPage = new CartPage();

    @Test
    public void userSeeTheProductsOnTheCartTest(){
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        dashboardPage.addToCartButton.click();
        dashboardPage.cartLink.click();
        cartPage.verifyUserOnCartPage();
        cartPage.verifyAddedProductsAreVisible();
    }
}
