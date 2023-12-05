package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By verifyTextYourAccountHasBeenCreated = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
By continueButton2 = By.xpath("//a[normalize-space()='Continue']");
By myAccountLink = By.xpath("//span[normalize-space()='My Account']");
By logoutOption = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");

By verifyTextAccountLogout = By.xpath("//h1[normalize-space()='Account Logout']");
By continueButton3 = By.xpath("//a[normalize-space()='Continue']");



    public String getVerifyTextYourAccountHasBeenCreated(){
        return getTextFromElement(verifyTextYourAccountHasBeenCreated);
    }
    public void clickOnContinueButton2(){
        mouseHoverToElementAndClick(continueButton2);
    }
    public void clickOnMyAccountLink(){
        mouseHoverToElementAndClick(myAccountLink);
    }
    public void clickOnLogoutOption(){
        mouseHoverToElementAndClick(logoutOption);
    }
    public String getVerifyTextAccountLogout(){
        return getTextFromElement(verifyTextAccountLogout);
    }
    public void clickOnContinueButton3(){
        mouseHoverToElementAndClick(continueButton3);
    }

}
