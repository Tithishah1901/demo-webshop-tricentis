package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputer extends Utility {

    @CacheLookup
    @FindBy(id = "product_attribute_16_5_4")
    WebElement selectProcessor;

    @CacheLookup
    @FindBy(id = "product_attribute_16_6_5")
    WebElement selectRam;

    @CacheLookup
    @FindBy(xpath = "//input[@type='radio'][@name='product_attribute_16_3_6']")
    WebElement selectHDD;

    @CacheLookup
    @FindBy(xpath = "//input[@type='radio'][@name='product_attribute_16_4_7']")
    WebElement selectOs;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox'][@name='product_attribute_16_8_8']")
    WebElement selectSoftware;

    @CacheLookup
    @FindBy(xpath = "//input[@id='add-to-cart-button-16']")
    WebElement clickOnAddToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/p[1]")
    WebElement verifyProductAddedToCart;


    public void setSelectProcessor(String processor) {
        Reporter.log("Select Processor" + processor+ "to processor dropdown"+ selectProcessor.toString()+ "<br>");
        selectByVisibleTextFromDropDown(selectProcessor, processor );
    }
    public void setSelectRam(String ram) {
        Reporter.log("Select Ram" + ram+ "to ram dropdown"+ selectRam.toString()+ "<br>");
        selectByVisibleTextFromDropDown(selectRam,ram );
    }
    public void setSelectHDD(String hdd){
        clickOnElement(selectHDD);
        Reporter.log("clicking on hdd" + selectHDD.toString());
    }
    public void setSelectOs(String os){
        clickOnElement(selectOs);
        Reporter.log("clicking on Os" + selectOs.toString());
    }
    public void setSelectSoftware(String software){
        clickOnElement(selectSoftware);
        Reporter.log("clicking on hdd" + selectSoftware.toString());
    }

    public void setClickOnAddToCart(){
        clickOnElement(clickOnAddToCart);
        Reporter.log("Clicking on add to Cart"+ clickOnAddToCart.toString());
    }
    public String verifyProductAddedToCart (){
        String message =  getTextFromElement(verifyProductAddedToCart);
        CustomListeners.test.log(Status.PASS, "click on Add to Cart ");
        Reporter.log("Select software" + verifyProductAddedToCart + "from softwareoptions " + verifyProductAddedToCart.toString() + "<br>");
        return message;
    }

}
