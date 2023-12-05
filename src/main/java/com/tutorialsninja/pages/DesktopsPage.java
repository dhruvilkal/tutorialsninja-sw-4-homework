package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility{
By verifyTextDesktops = By.tagName("h2");
By sortByFilter = By.xpath("//select[@id='input-sort']");
    By allProductOnPage = By.tagName("h4");
    By HPLP3065ProductName = By.xpath("//a[normalize-space()='HP LP3065']");







//Verify the text ‘Desktops’

    public String getVerifyTextDesktops(){
        return getTextFromElement(verifyTextDesktops);

    }
    public List<WebElement> getAllProductTitleOnPage () {
        List<WebElement> products = driver.findElements(allProductOnPage);
        return products;
    }
    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilter, sortByOption);
    }
public void clickOnHPLP3065ProductName(){
        mouseHoverToElementAndClick(HPLP3065ProductName);
}



}
