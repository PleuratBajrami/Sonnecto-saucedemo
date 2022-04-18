package com.sonnecto.tests;

import com.sonnecto.pages.DashboardPage;
import com.sonnecto.pages.LoginPage;
import com.sonnecto.pages.ProductPage;
import com.sonnecto.utilities.BrowserUtilties;
import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import org.testng.annotations.Test;

public class SeeDetailsOfProductsTest {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ProductPage productPage = new ProductPage();

    @Test
    public void UserSeesDetailsOfProduct(){
        loginPage.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        for (int i = 1; i <=6; i++) {
            dashboardPage.listOfProcuts(i);
            BrowserUtilties.sleep(2);
            Driver.getDriver().navigate().back();
            BrowserUtilties.sleep(3);
        }

    }
}
