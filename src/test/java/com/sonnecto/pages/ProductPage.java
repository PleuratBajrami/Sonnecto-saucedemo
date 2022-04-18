package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ProductPage {
    public ProductPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    public WebElement productVisible;

    public void verifyUserSeesProduct(){
        Assert.assertTrue(productVisible.isDisplayed());
    }
}
