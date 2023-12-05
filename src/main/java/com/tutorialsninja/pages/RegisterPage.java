package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By verifyTextRegisterAccount =By.xpath("//h1[normalize-space()='Register Account']");
    By FirstNameField = By.name("firstname");
    By LastNameField = By.name("lastname");
    By EmailField = By.id("input-email");
    By TelephoneField = By.name("telephone");
    By PasswordField = By.xpath("//input[@id='input-password']");
    By ConfirmPasswordField = By.xpath("//input[@id='input-confirm']");
By yesButton = By.xpath("//label[normalize-space()='Yes']");
By privacyPolicy = By.xpath("//input[@name='agree']");
By continueButton = By.xpath("//input[@value='Continue']");

    public String getVerifyTextRegisterAccount(){
        return getTextFromElement(verifyTextRegisterAccount);
    }

    public void sendFirstNameField(String firstname){
        sendTextToElement(FirstNameField, firstname);
    }

    public void sendLastNameField(String lastname){
        sendTextToElement(LastNameField, lastname);
    }

    public void sendEmailField(String email){
        sendTextToElement(EmailField, email);
    }

    public void sendTelephoneField(String number){
        sendTextToElement(TelephoneField, number);
    }

    public void sendPasswordField(String password){
        sendTextToElement(PasswordField, password);
    }

    public void sendConfirmPasswordField(String confirmPassword){
        sendTextToElement(ConfirmPasswordField, confirmPassword);
    }
    public void clickOnYesButton(){
        mouseHoverToElementAndClick(yesButton);
    }
    public void clickOnPrivacyPolicy(){
        mouseHoverToElementAndClick(privacyPolicy);
    }
    public void clickOnContinue(){
        mouseHoverToElementAndClick(continueButton);
    }

}
