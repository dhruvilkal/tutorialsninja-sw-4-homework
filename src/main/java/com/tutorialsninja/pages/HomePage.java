package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
By desktops = By.xpath("//a[normalize-space()='Desktops']");
    By showAllDesktopsSubMenu = By.xpath("//a[normalize-space()='Show AllDesktops']");
By laptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
By showAllLaptopsAndNotebooks = By.xpath("//a[normalize-space()='Show AllLaptops & Notebooks']");
By components = By.xpath("//a[normalize-space()='Components']");
By showAllComponents = By.xpath("//a[normalize-space()='Show AllComponents']");
By currencyDropdown = By.xpath("//span[normalize-space()='Currency']");
By sterlingPoundCurrencyOption = By.xpath("//button[normalize-space()='£Pound Sterling']");
By myAccount = By.xpath("//span[normalize-space()='My Account']");
By registerOption = By.xpath("//a[normalize-space()='Register']");
By login = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']");






//1.1 Mouse hover on “Desktops” Tab and click
public void mouseHoverAndClickOnDesktops(){
    mouseHoverToElementAndClick(desktops);
}
    public void clickOnShowAllDesktopsSubMenu () {
        mouseHoverToElementAndClick(showAllDesktopsSubMenu);
    }
    public void mouseHoverAndClickOnLaptopsAndNoteBooks(){
    mouseHoverToElementAndClick(laptopsAndNotebooks);
    }
    public void clickOnShowAllLaptopsAndNotebooks(){
    mouseHoverToElementAndClick(showAllLaptopsAndNotebooks);
    }
    public void mouseHoverAndClickOnComponents(){
    mouseHoverToElementAndClick(components);
    }
    public void clickOnShowAllComponents(){
    mouseHoverToElementAndClick(showAllComponents);
    }
    public void mouseHoverAndClickOnCurrencyDropdown(){
    mouseHoverToElementAndClick(currencyDropdown);
    }
    public void clickOnSterlingPoundCurrencyOption(){
    mouseHoverToElementAndClick(sterlingPoundCurrencyOption);
    }
    public void clickOnMyAccount(){
    mouseHoverToElementAndClick(myAccount);
    }
    public void clickOnRegisterOption(){
    mouseHoverToElementAndClick(registerOption);
    }
    public void clickOnLogin(){
    mouseHoverToElementAndClick(login);
    }



}
