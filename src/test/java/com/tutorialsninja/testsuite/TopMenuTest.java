package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

HomePage homePage = new HomePage();
DesktopsPage desktopsPage =new DesktopsPage();
LaptopsAndNoteBooksPage laptopsAndNoteBooksPage =new LaptopsAndNoteBooksPage();
ComponentsPage componentsPage = new ComponentsPage();




@Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() throws InterruptedException {
    Thread.sleep(2000);
homePage.mouseHoverAndClickOnDesktops();
Thread.sleep(2000);
homePage.clickOnShowAllDesktopsSubMenu();

    String expectedText = "Desktops";
    String actualText = desktopsPage.getVerifyTextDesktops();
    Assert.assertEquals(expectedText,actualText);
}
@Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
   homePage.mouseHoverAndClickOnLaptopsAndNoteBooks();
   homePage.clickOnShowAllLaptopsAndNotebooks();
    String expectedText = "Laptops & Notebooks";
    String actualText = laptopsAndNoteBooksPage.getVerifyTextLaptopsAndNotebooks();
    Assert.assertEquals(expectedText,actualText);

}
@Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
homePage.mouseHoverAndClickOnComponents();
homePage.clickOnShowAllComponents();
    String expectedText = "Components";
    String actualText = componentsPage.getVerifyTextComponents();
    Assert.assertEquals(expectedText,actualText);

}
}
