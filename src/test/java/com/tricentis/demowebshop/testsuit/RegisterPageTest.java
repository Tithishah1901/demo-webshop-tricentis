package com.tricentis.demowebshop.testsuit;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.RegisterPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class RegisterPageTest extends BaseTest {

    HomePage homePage;
    RegisterPage registerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        registerPage = new RegisterPage();
    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
      //Click on the Register Link
      homePage.clickOnRegisterLink();
      //Verify "Register" text
       registerPage.registerText();
    }

    @Test(groups = {"smoke","regression"})
       public void verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory() {
       //Click on the Register Link
        homePage.clickOnRegisterLink();
        //Click on the "Register" button
        registerPage.setClickOnRegisterButton();
        //Verify the error message "First name is required."
        registerPage.FirstNameRequired();
        //Verify the error message "Last name is required."
        registerPage.lastNameRequired();
        //Verify the error message "Email is required."
        registerPage.emailIsRequired();
        //Verify the error message "Password is required."
        registerPage.passwordIsRequired();
        //Verify the error message "Password is required."
        registerPage.confirmPasswordIsRequired();

    }
      @Test(groups = {"regression"})
      public void verifyThatUserShouldCreateAccountSuccessfully() {
          //Click on the Register Link
          homePage.clickOnRegisterLink();
          // Select gender "Female"
          registerPage.selectGenderFemale();
          //Enter the first name
          registerPage.enterFirstName("Radhika");
          //Enter the last name
          registerPage.enterLastName("Shah");
          //Enter email
          registerPage.enterEmailInFiled("prince01234@gmail.com");
          //Enter password
          registerPage.enterPasswordInFiled("Prince1234");
          //Enter Confirm Password
          registerPage.enterConfirmPasswordInFiled("Prince1234");
          //Click on the "Register" button
          registerPage.setClickOnRegisterButton();
          //Verify the message "Your registration completed"
          registerPage.verifyRegisterMessage();
}

}
