package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By verifyTextShoppingCart = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By verifyTextHpLp3065 =By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By deliveryDate = By.xpath("//table[@class = 'table table-bordered']//small[1]");
    By verifyTextProduct21 = By.xpath("//td[normalize-space()='Product 21']");
    By totalPrice = By.cssSelector("tbody tr td:nth-child(6)");
    By verifyTextMacBook = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");


    By clickOnBox = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By clearBox = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By addInBox =By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");

    By updateButton = By.xpath("//i[@class='fa fa-refresh']");
    By verifyTextSuccessYouHaveModifiedYourShoppingCart = By.xpath("//div[@class='alert alert-success alert-dismissible']");
By verifyTextTotal = By.xpath("//tbody//tr//td[6]");

By checkOutButton = By.xpath("//a[@class='btn btn-primary']");






    public String getVerifyTextShoppingCart(){
        return getTextFromElement(verifyTextShoppingCart);
    }
    public String getVerifyTextHpLp3065(){
        return getTextFromElement(verifyTextHpLp3065);
    }
    public String getDeliveryDate() {
        return getTextFromElement(deliveryDate);
    }
    public String getVerifyTextProduct21(){
        return getTextFromElement(verifyTextProduct21);
    }
    public String getTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public String getVerifyTextMacBook(){
        return getTextFromElement(verifyTextMacBook );
    }
public void clickQtyBox(){
        mouseHoverToElementAndClick(clickOnBox);
}
public void clearQtyBox(){
clearInput(clearBox);
}
public void sendQtyInBox(String Quantity){
        sendTextToElement(addInBox,Quantity);

}
public void clickOnUpdateButton(){
        mouseHoverToElementAndClick(updateButton);
}
    public String getVerifyTextSuccessYouHaveModifiedYourShoppingCart(){
        return getTextFromElement(verifyTextSuccessYouHaveModifiedYourShoppingCart);
    }

    public String getVerifyTextTotal(){
        return getTextFromElement(verifyTextTotal);
    }
    public void clickOnCheckOutButton(){
        mouseHoverToElementAndClick(checkOutButton);
    }
}
