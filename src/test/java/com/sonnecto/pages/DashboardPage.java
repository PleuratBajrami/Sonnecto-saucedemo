package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartLink;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;

    @FindBy(xpath = "(//div[@class='inventory_item_name'])")
    public List<WebElement> allProducts;

    public void listOfProcuts(int index){

            String a = "(//div[@class='inventory_item_name'])["+ index + "]";
            WebElement products = Driver.getDriver().findElement(By.xpath(a));
            products.click();

    }

}
