package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement clickOnLogout;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement verifyLoginLink;

    @CacheLookup
    @FindBy(xpath = "//ul[@class='top-menu']//a[normalize-space()='Computers']")
    WebElement clickOnComputers;


    public void clickOnLoginLink(){
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS,"Clicking on Login Link");
    }
    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS,"Clicking On RegisterLink");
    }
    public void clickOnLogout(){
        clickOnElement(clickOnLogout);
        CustomListeners.test.log(Status.PASS,"Clicking on logoutLink");
    }
    public String setVerifyLoginLink(){
        String message = getTextFromElement(verifyLoginLink);
        return message;
    }
    public void setClickOnComputers(){
        clickOnElement(clickOnComputers);
        CustomListeners.test.log(Status.PASS,"Clicking on computer tab");
        Reporter.log("Clicking on computer link" + clickOnComputers.toString());
    }
}
