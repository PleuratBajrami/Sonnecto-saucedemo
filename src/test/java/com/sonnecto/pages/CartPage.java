package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class CartPage {
    public CartPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='cart_quantity']")
    public WebElement addedProducts;

    @FindBy(id = "remove-sauce-labs-backpack")
    public WebElement removeProductButton;

    public void verifyUserOnCartPage(){
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Swag Labs";
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    public void verifyAddedProductsAreVisible(){
        Assert.assertTrue(addedProducts.isDisplayed());
    }
    public void verifyRemoveProducts(){
        Assert.assertTrue(addedProducts.isDisplayed());
    }

}
