package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.AccountPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class MyAccountsTest extends BaseTest {
HomePage homePage = new HomePage();
RegisterPage registerPage =new RegisterPage();
LoginPage loginPage = new LoginPage();
AccountPage accountPage =new AccountPage();






    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
homePage.clickOnMyAccount();
homePage.clickOnRegisterOption();

        String expectedText = "Register Account";
        String actualText = registerPage.getVerifyTextRegisterAccount().substring(0,expectedText.length());
        Assert.assertEquals(expectedText,actualText);
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        homePage.clickOnMyAccount();
        homePage.clickOnLogin();


        String expectedText = "Returning Customer";
        String actualText = loginPage.getVerifyTextReturningCustomer().substring(0,expectedText.length());
        Assert.assertEquals(expectedText,actualText);

    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        homePage.clickOnMyAccount();
        homePage.clickOnRegisterOption();
        registerPage.sendFirstNameField("manish");
        registerPage.sendLastNameField("patel");
        Random random = new Random();
        registerPage.sendEmailField("manish"+random.nextInt()+"@gmail.com");
        registerPage.sendTelephoneField("07587402065");
        registerPage.sendPasswordField("abc123");
        registerPage.sendConfirmPasswordField("abc123");
        registerPage.clickOnYesButton();
        registerPage.clickOnPrivacyPolicy();
        registerPage.clickOnContinue();

        String expectedText = "Your Account Has Been Created!";
        String actualText = accountPage.getVerifyTextYourAccountHasBeenCreated().substring(0,expectedText.length());
        Assert.assertEquals(expectedText,actualText);

        accountPage.clickOnContinueButton2();

        accountPage.clickOnMyAccountLink();
        accountPage.clickOnLogoutOption();

        String expectedText1 = "Account Logout";
        String actualText1 = accountPage.getVerifyTextAccountLogout().substring(0,expectedText1.length());
        Assert.assertEquals(expectedText1,actualText1);

        accountPage.clickOnContinueButton3();
    }

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        homePage.clickOnMyAccount();
        homePage.clickOnLogin();
        Random random = new Random();
        loginPage.sendEmail("mohan"+random.nextInt()+"@gmail.com");
        loginPage.sendPassword("abc123");
        loginPage.clickOnLoginButton();

        String expectedText = "My Account";
        String actualText = loginPage.getVerifyTextMyAccount().substring(0,expectedText.length());
        Assert.assertEquals(expectedText,actualText);
        accountPage.clickOnMyAccountLink();
        accountPage.clickOnLogoutOption();

        String expectedText1 = "Account Logout";
        String actualText1 = accountPage.getVerifyTextAccountLogout().substring(0,expectedText1.length());
        Assert.assertEquals(expectedText1,actualText1);

        accountPage.clickOnContinueButton3();
    }
}
