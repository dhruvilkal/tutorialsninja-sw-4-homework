package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {
    By verifyTextNewCustomer = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckOut = By.xpath("//input[@value='guest']");
By continueButton = By.xpath("//input[@id='button-account']");
    By FirstNameField = By.name("firstname");
    By LastNameField = By.name("lastname");
    By EmailField = By.id("input-payment-email");
    By TelephoneField = By.name("telephone");
    By Address1Field = By.name("address_1");
    By CityField = By.name("city");
    By PostCodeField = By.name("postcode");
    By CountryDropdown = By.name("country_id");
    By StateDropDown = By.name("zone_id");

    By continueButton2 = By.xpath("//input[@id='button-guest']");
    By commentArea = By.xpath("//textarea[@name='comment']");
    By termAndConditionCheckbox = By.xpath("//input[@name='agree']");
By continueButton3 =By.xpath("//input[@id='button-payment-method']");
    By paymentWarningWarning = By.xpath("//div[@class='alert alert-danger alert-dismissible']");




    public String getVerifyTextNewCustomer(){
        return getTextFromElement(verifyTextNewCustomer);
    }
    public void clickOnGuestCheckOutButton(){
        mouseHoverToElementAndClick(guestCheckOut);
    }
    public void clickOnContinueButton(){
        mouseHoverToElementAndClick(continueButton);
    }

    public void sendFirstNameField(String firstname) {
        sendTextToElement(FirstNameField, firstname);
    }

    public void sendLastNameField(String lastname) {
        sendTextToElement(LastNameField, lastname);
    }

    public void sendEmailField(String email) {
        sendTextToElement(EmailField, email);
    }

    public void sendTelephoneField(String number) {
        sendTextToElement(TelephoneField, number);
    }

    public void sendAddressField(String address) {
        sendTextToElement(Address1Field, address);
    }

    public void sendCityField(String city) {
        sendTextToElement(CityField, city);
    }

    public void sendPostCodeField(String postalCode) {
        sendTextToElement(PostCodeField, postalCode);
    }

    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(CountryDropdown, country);
    }

    public void selectState(String state){
        selectByVisibleTextFromDropDown(StateDropDown, state);
    }
    public void clickOnContinueButton2(){
        mouseHoverToElementAndClick(continueButton2);
    }
    public void sendTextInCommentField(String comment) {
        sendTextToElement(commentArea, comment);
    }
    public void clickOnTermAndConditionCheckBox(){
        mouseHoverToElementAndClick(termAndConditionCheckbox);
    }
    public void clickOnContinueButton3(){
        mouseHoverToElementAndClick(continueButton3);
    }
    public String getPaymentWarningMessage () {
        return getTextFromElement(paymentWarningWarning);
    }
}
