package com.sonnecto.pages;

import com.sonnecto.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import java.util.List;

public class DashboardPage {
    public DashboardPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement cartLink;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    public WebElement addToCartButton;


    @FindBy(className = "product_sort_container")
    public WebElement dropDown;
    public void sortDrodownProducts(int index){

        Select select = new Select(dropDown);
        select.selectByIndex(index);

    }

    @FindBy(className = "shopping_cart_badge")
    public WebElement number_of_products_added_on_the_cart_icon;


    @FindBy(xpath = "(//div[@class='inventory_item_name'])")
    public List<WebElement> allProducts;

    public void listOfProcuts(int index){


        String a = "(//div[@class='inventory_item_name'])["+ index + "]";
        WebElement products = Driver.getDriver().findElement(By.xpath(a));
        products.click();

            String a = "(//div[@class='inventory_item_name'])["+ index + "]";
            WebElement products = Driver.getDriver().findElement(By.xpath(a));
            products.click();

    }

}
