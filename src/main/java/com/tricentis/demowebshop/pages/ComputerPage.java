package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']" )
    WebElement verifyComputersText;

    @CacheLookup
    @FindBy(xpath = "//img[@title='Show products in category Desktops']")
    WebElement clickOnDesktops;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement verifyDesktopsText;

    @CacheLookup
    @FindBy(linkText = "Build your own computer")
    WebElement clickOnBuildYourOwnComputer;

    public void setVerifyComputersText(){
        String message = getTextFromElement(verifyComputersText);
    }
    public void setClickOnDesktops(){
        clickOnElement(clickOnDesktops);
        CustomListeners.test.log(Status.PASS,"clicking on desktops");
        Reporter.log("clicking on desktops" + clickOnDesktops.toString());
    }
    public void setVerifyDesktopsText(){
        String message = getTextFromElement(verifyDesktopsText);
    }
    public void setClickOnBuildYourOwnComputer(){
        clickOnElement(clickOnBuildYourOwnComputer);
        CustomListeners.test.log(Status.PASS,"Clicking on Build your own Computer");
        Reporter.log("Clicking on Build your own computer" + clickOnBuildYourOwnComputer.toString());
    }
}
