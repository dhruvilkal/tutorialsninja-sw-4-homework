package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.HpLp3065Page;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DesktopsTest extends BaseTest {
    HomePage homePage =new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HpLp3065Page hpLp3065Page =new HpLp3065Page();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();




    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        homePage.mouseHoverAndClickOnDesktops();
        homePage.clickOnShowAllDesktopsSubMenu();


        List<WebElement> list = desktopsPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l: list) {
            originalList.add(l.getText());
        }
        Collections.reverse(originalList);
        //System.out.println(originalList);

        desktopsPage.sortByFilter("Name (Z - A)");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = desktopsPage.getAllProductTitleOnPage();
        for (WebElement l: list) {
            sortedList.add(l.getText());
        }
        //System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
homePage.mouseHoverAndClickOnCurrencyDropdown();
homePage.clickOnSterlingPoundCurrencyOption();
homePage.mouseHoverAndClickOnDesktops();
homePage.clickOnShowAllDesktopsSubMenu();

        List<WebElement> list = desktopsPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l: list) {
            originalList.add(l.getText().toLowerCase(Locale.ROOT));
        }
        Collections.sort(originalList);
        System.out.println(originalList);

        desktopsPage.sortByFilter("Name (A - Z)");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = desktopsPage.getAllProductTitleOnPage();
        for (WebElement l: list) {
            sortedList.add(l.getText().toLowerCase(Locale.ROOT));
        }
        System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);


        desktopsPage.clickOnHPLP3065ProductName();

        String expectedText = "HP LP3065";
        String actualText = hpLp3065Page.getVerifyTextHpLp3065();
        Assert.assertEquals(expectedText,actualText);

        hpLp3065Page.selectDeliveryDate("28","Nov", "2023");
        hpLp3065Page.sendDataToQuantityField(Keys.CONTROL + "a");

        hpLp3065Page.sendDataToQuantityField("1");
        hpLp3065Page.clickOnAddToCart();

        String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!";
        String actualText1 = hpLp3065Page.getVerifyTextYouHaveAddedHpLp3065ToYourShoppingCart().substring(0,expectedText1.length());
        Assert.assertEquals(expectedText1,actualText1);

        Thread.sleep(2000);
        hpLp3065Page.clickOnShoppingCart();

        Thread.sleep(2000);
        String expectedText2 = "Shopping Cart";
        String actualText2 = shoppingCartPage.getVerifyTextShoppingCart().substring(0,expectedText2.length());
        Assert.assertEquals(expectedText2,actualText2);

        String expectedDeliveryDate = "Delivery Date:2023-11-28";
        String actualDeliveryDate = shoppingCartPage.getDeliveryDate().substring(0, expectedDeliveryDate.length());
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate);

        String expectedText4 = "Product 21";
        String actualText4 = shoppingCartPage.getVerifyTextProduct21().substring(0,expectedText4.length());
        Assert.assertEquals(expectedText4,actualText4);

        String expectedPrice = "£74.73";
        String actualPrice = shoppingCartPage.getTotalPrice().substring(0, expectedPrice.length());
        Assert.assertEquals(actualPrice, expectedPrice);

    }
}
