package com.sonnecto.tests;

import com.sonnecto.pages.CartPage;
import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class CheckoutTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    CartPage cartPage = new CartPage();

    @Test
    public void correctCredentialsLogIn(){
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        dashboardPage.cartLink.click();
        cartPage.checkoutButton.click();
        cartPage.userInformationForCheckout();
        cartPage.finishButtonForCheckout.click();
        cartPage.orderConfirmation();
    }
}
