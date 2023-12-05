package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class LaptopsAndNotebooksTest extends BaseTest {
    HomePage homePage =new HomePage();
LaptopsAndNoteBooksPage laptopsAndNoteBooksPage =new LaptopsAndNoteBooksPage();
MacBookProductPage macBookProductPage =new MacBookProductPage();
ShoppingCartPage shoppingCartPage =new ShoppingCartPage();
CheckOutPage checkOutPage =new CheckOutPage();





    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        homePage.mouseHoverAndClickOnLaptopsAndNoteBooks();
        homePage.clickOnShowAllLaptopsAndNotebooks();

        String expectedText = "Laptops & Notebooks";
        String actualText = laptopsAndNoteBooksPage.getVerifyTextLaptopsAndNotebooks();
        Assert.assertEquals(expectedText,actualText);


    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverAndClickOnCurrencyDropdown();
        homePage.clickOnSterlingPoundCurrencyOption();

        homePage.mouseHoverAndClickOnLaptopsAndNoteBooks();
        homePage.clickOnShowAllLaptopsAndNotebooks();


        String actualLaptopAndNotebooksPageText = laptopsAndNoteBooksPage.getVerifyTextLaptopsAndNotebooks();
        String expectedLaptopAndNotebooksPageText = "Laptops & Notebooks";
        Assert.assertEquals(actualLaptopAndNotebooksPageText, expectedLaptopAndNotebooksPageText);

       // laptopsAndNoteBooksPage.selectSortByFilterByValue("Price (High > Low)");
        laptopsAndNoteBooksPage.clickOnMacBookProduct();

        String expectedText = "MacBook";
        String actualText = macBookProductPage.getVerifyTextMacBook();
        Assert.assertEquals(expectedText,actualText);

        macBookProductPage.clickOnAddToCart();

        String expectedText1 = "Success: You have added MacBook to your shopping cart!";
        String actualText1 = macBookProductPage.getVerifyTextSuccessYouHaveAddedMacBookToYourShoppingCart().substring(0,expectedText1.length());
        Assert.assertEquals(expectedText1,actualText1);
        macBookProductPage.clickOnShoppingCart();


        Thread.sleep(2000);
       String expectedText2 = "Shopping Cart";
       String actualText2 = shoppingCartPage.getVerifyTextShoppingCart().substring(0,expectedText2.length());
       Assert.assertEquals(expectedText2,actualText2);

        Thread.sleep(2000);
        String expectedText3 = "MacBook";
        String actualText3 = shoppingCartPage.getVerifyTextMacBook().substring(0,expectedText3.length());
        Assert.assertEquals(expectedText3,actualText3);
        Thread.sleep(2000);
shoppingCartPage.clickQtyBox();
Thread.sleep(2000);
shoppingCartPage.clearQtyBox();
shoppingCartPage.sendQtyInBox("2");

shoppingCartPage.clickOnUpdateButton();


        String expectedText4 = "Success: You have modified your shopping cart!";
        String actualText4 = shoppingCartPage.getVerifyTextSuccessYouHaveModifiedYourShoppingCart().substring(0,expectedText4.length());
        Assert.assertEquals(expectedText4,actualText4);

        String expectedText5 = "£737.45";
        String actualText5 = shoppingCartPage.getVerifyTextTotal().substring(0,expectedText5.length());
        Assert.assertEquals(expectedText5,actualText5);

        shoppingCartPage.clickOnCheckOutButton();

        String expectedText6 = "New Customer";
        String actualText6 = checkOutPage.getVerifyTextNewCustomer().substring(0,expectedText6.length());
        Assert.assertEquals(expectedText6,actualText6);

        checkOutPage.clickOnGuestCheckOutButton();
        checkOutPage.clickOnContinueButton();

        checkOutPage.sendFirstNameField("manish");
        checkOutPage.sendLastNameField("patel");
        Random random = new Random();
        checkOutPage.sendEmailField("manish"+random.nextInt()+"@gmail.com");
        checkOutPage.sendTelephoneField("074424856275");
        checkOutPage.sendAddressField("abc");
        checkOutPage.sendCityField("London");
        checkOutPage.sendPostCodeField("HA7 3FD");
        checkOutPage.selectCountry("United Kingdom");
        checkOutPage.selectState("Ghana");
        checkOutPage.clickOnContinueButton2();
        checkOutPage.sendTextInCommentField("MacBook is My Product");
        checkOutPage.clickOnTermAndConditionCheckBox();
        checkOutPage.clickOnContinueButton3();

        String expectedPaymentWarningMessage = "Warning: Payment method required!";
        String actualPaymentWarningMessage = checkOutPage.getPaymentWarningMessage().substring(0,expectedPaymentWarningMessage.length());
        Assert.assertEquals(actualPaymentWarningMessage, expectedPaymentWarningMessage);
    }
}
