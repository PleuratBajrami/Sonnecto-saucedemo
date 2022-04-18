package com.sonnecto.pages;

import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//h3[contains(text(),'any user')]")
    public WebElement errorLogin;

    public void login(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
    }
    public void negativeLoginTest(String username, String password){
        Driver.getDriver().get(ConfigurationReader.getProperty("siteurl"));
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();
        String expectedErrorTest = "Epic sadface: Username and password do not match any user in this service";
        String actualError = errorLogin.getText();

        Assert.assertEquals(expectedErrorTest, actualError);
    }
}
