package com.tricentis.demowebshop.pages;

import com.aventstack.extentreports.Status;
import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Register']" )
    WebElement register;

    @CacheLookup
    @FindBy(xpath = "//input[@id='register-button']")
    WebElement clickOnRegisterButton;

    @CacheLookup
    @FindBy(xpath = "//span[@for='FirstName']")
    WebElement firstNameRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='LastName']")
    WebElement lastNameRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='Email']")
    WebElement emailIsRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='Password']")
    WebElement passwordIsRequired;

    @CacheLookup
    @FindBy(xpath = "//span[@for='ConfirmPassword']")
    WebElement confirmPasswordRequired;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Female']")
    WebElement selectGenderFemale;

    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement enterLastName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement enterEmailId;

    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement enterPassword;

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement enterConfirmPassword;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement getRegisterMessage;

    public String registerText(){
        String message = getTextFromElement(register);
        return message;
    }
    public void setClickOnRegisterButton(){
        clickOnElement(clickOnRegisterButton);
        CustomListeners.test.log(Status.PASS,"clicking on register button");
    }
    public String FirstNameRequired(){
        String message = getTextFromElement(firstNameRequired);
        CustomListeners.test.log(Status.PASS, "Firstname is required");
        return message;
    }
    public String lastNameRequired(){
        String message = getTextFromElement(lastNameRequired);
        CustomListeners.test.log(Status.PASS, "Last is required");
        return message;
    }
    public String emailIsRequired(){
        String message = getTextFromElement(emailIsRequired);
        CustomListeners.test.log(Status.PASS, "Email is required");
        return message;
    }
    public String passwordIsRequired(){
        String message = getTextFromElement(passwordIsRequired);
        CustomListeners.test.log(Status.PASS, "password is required");
        return message;
    }
    public String confirmPasswordIsRequired(){
        String message = getTextFromElement(confirmPasswordRequired);
        CustomListeners.test.log(Status.PASS, "Confirm Password is required");
        return message;
    }
    public void selectGenderFemale(){
        clickOnElement(selectGenderFemale);
    }
    public void enterFirstName(String name){
     sendTextToElement(enterFirstName, name);
     CustomListeners.test.log(Status.PASS,"Enter firstname" + name);
    }
    public void enterLastName(String name){
        sendTextToElement(enterLastName, name);
        CustomListeners.test.log(Status.PASS,"Enter Lastname" + name);
    }
    public void enterEmailInFiled(String email){
        sendTextToElement(enterEmailId, email);
        CustomListeners.test.log(Status.PASS,"Enter email in email filed" + email);
    }
    public void enterPasswordInFiled(String password){
        sendTextToElement(enterPassword, password);
        CustomListeners.test.log(Status.PASS,"Enter password in password filed" + password);
    }
    public void enterConfirmPasswordInFiled(String confirmPassword){
        sendTextToElement(enterConfirmPassword, confirmPassword);
        CustomListeners.test.log(Status.PASS,"Enter confirm password in password filed" + confirmPassword);
    }
    public void verifyRegisterMessage(){
        String message = getTextFromElement(getRegisterMessage);
    }
}
