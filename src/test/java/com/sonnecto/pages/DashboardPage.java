package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartLink;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

}
