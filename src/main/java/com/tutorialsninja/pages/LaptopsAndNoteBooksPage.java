package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBooksPage extends Utility {
    By verifyTextLaptopsAndNotebooks = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");

    By sortByFilter = By.xpath("//select[@id='input-sort']");
    By MacBookProductName = By.xpath("//a[normalize-space()='MacBook']");










    //Verify the text ‘Laptops & Notebooks’
    public String getVerifyTextLaptopsAndNotebooks(){
        return getTextFromElement(verifyTextLaptopsAndNotebooks);

    }
    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilter, sortByOption);
    }
    public void clickOnMacBookProduct () {
        clickOnElement(MacBookProductName);
    }

}
