package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By verifyTextReturningCustomer = By.xpath("//h2[normalize-space()='Returning Customer']");
    By sendEmail = By.xpath("//input[@id='input-email']");
    By sendPassword = By.xpath("//input[@id='input-password']");
    By loginButton = By.xpath("//input[@value='Login']");
By verifyTextMyAccount = By.xpath("//h2[normalize-space()='My Account']");



    public String getVerifyTextReturningCustomer(){
        return getTextFromElement(verifyTextReturningCustomer);
    }

    public void sendEmail(String email){
        sendTextToElement(sendEmail, email);
    }

    public void sendPassword(String password){
        sendTextToElement(sendPassword, password);
    }
    public void clickOnLoginButton(){
        mouseHoverToElementAndClick(loginButton);

    }
    public String getVerifyTextMyAccount(){
        return getTextFromElement(verifyTextMyAccount);
    }

}
