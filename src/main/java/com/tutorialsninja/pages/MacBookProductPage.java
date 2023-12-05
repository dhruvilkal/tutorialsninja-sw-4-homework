package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookProductPage extends Utility {

    By verifyTextMacBook = By.xpath("//h1[normalize-space()='MacBook']");
By addToCart = By.xpath("//button[@id='button-cart']");
    By verifyTextSuccessYouHaveAddedMacBookToYourShoppingCart = By.xpath("//div[@class='alert alert-success alert-dismissible']");
By shoppingCart = By.xpath("//a[normalize-space()='shopping cart']");






    public String getVerifyTextMacBook(){
        return getTextFromElement(verifyTextMacBook);
    }
    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCart);
    }
    public String getVerifyTextSuccessYouHaveAddedMacBookToYourShoppingCart(){
        return getTextFromElement(verifyTextSuccessYouHaveAddedMacBookToYourShoppingCart);
    }
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCart);
    }
}
