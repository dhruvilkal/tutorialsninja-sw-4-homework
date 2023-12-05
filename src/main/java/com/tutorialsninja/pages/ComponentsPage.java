package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By verifyTextComponents =By.xpath("//h2[normalize-space()='Components']");






    //Verify the text ‘Components’
    public String getVerifyTextComponents() {
        return getTextFromElement(verifyTextComponents);
    }
}
