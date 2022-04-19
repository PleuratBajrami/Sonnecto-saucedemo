package com.sonnecto.pages;

import com.github.javafaker.Faker;
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

        @FindBy(id = "checkout")
        public WebElement checkoutButton;

        @FindBy(id = "first-name")
        public WebElement firstNameInCheckout;

        @FindBy(id = "last-name")
        public WebElement lastNameInCheckout;

        @FindBy(id = "postal-code")
        public WebElement zipCodeInCheckout;

        @FindBy(id = "continue")
        public WebElement continueButtonInCheckout;

        @FindBy(id = "finish")
        public WebElement finishButtonForCheckout;

        @FindBy(xpath = "//h2")
        public WebElement orderConfirmation;


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

        public void userInformationForCheckout(){
            Faker faker = new Faker();
            firstNameInCheckout.sendKeys(faker.name().firstName());
            lastNameInCheckout.sendKeys(faker.name().lastName());
            zipCodeInCheckout.sendKeys(faker.address().zipCode());
            continueButtonInCheckout.click();
        }

        public void orderConfirmation(){
            Assert.assertTrue(orderConfirmation.isDisplayed());
        }



}
