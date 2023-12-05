package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HpLp3065Page extends Utility {
    By verifyTextHpLp3065 = By.xpath("//h1[normalize-space()='HP LP3065']");
By quantityField = By.xpath("//input[@id='input-quantity']");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyTextYouHaveAddedHpLp3065ToYourShoppingCart = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartButton = By.xpath("//a[normalize-space()='shopping cart']");



    public String getVerifyTextHpLp3065(){
        return getTextFromElement(verifyTextHpLp3065);

    }
    public void selectDeliveryDate(String day, String month, String year) throws InterruptedException {
        clickOnElement(By.xpath("//i[@class='fa fa-calendar']"));
        clickOnElement(By.xpath("//div[@class='datepicker-days']//th[@colspan='5']"));

        while(true){
            String y = getTextFromElement(By.xpath("//div[@class='datepicker-months'] //th[@class='picker-switch']"));
            if(y.equalsIgnoreCase(year)){
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker-months']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        Thread.sleep(2000);
        clickOnElement(By.xpath("//span[normalize-space()='"+month+"']"));
        Thread.sleep(200);
        clickOnElement(By.xpath("//td[@class = 'day' and text() = '"+day+"']"));
    }

    public void sendDataToQuantityField(String quantity) {
        sendTextToElement(quantityField, quantity);
    }
    public void clickOnAddToCart(){
        mouseHoverToElementAndClick(addToCartButton);
    }
    public String getVerifyTextYouHaveAddedHpLp3065ToYourShoppingCart() {
        return getTextFromElement(verifyTextYouHaveAddedHpLp3065ToYourShoppingCart);
    }
    public void clickOnShoppingCart(){
        mouseHoverToElementAndClick(shoppingCartButton);

    }


}
