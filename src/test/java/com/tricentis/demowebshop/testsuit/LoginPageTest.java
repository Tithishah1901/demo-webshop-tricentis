package com.tricentis.demowebshop.testsuit;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.pages.LoginPage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {


    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test(groups ={"sanity"} )
    public void userShouldNavigateToLoginPageSuccessFully() {
//    Click on the login link
        homePage.clickOnLoginLink();
//    verify that the "Welcome, Please Sign In!" message display
        loginPage.getWelcomeText();
    }

    @Test(groups = {"smoke","regression"})
    public void verifyTheErrorMessageWithInValidCredentials() {
        //Click on the login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.setEnterEmailId("tithi.123@gmail.com");
        //Enter Password
        loginPage.enterPassword("tithi123");
        //Click on the Login Button
        loginPage.clickOnLoginButton();
        //Verify that the Error message
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage, "Error message not displayed");
    }

    @Test(groups = {"regression"})
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials() {
        //Click on the login link
        homePage.clickOnLoginLink();
        //Enter EmailId
        loginPage.setEnterEmailId("Radhika.shah1901@gmail.com");
        //Enter Password
        loginPage.enterPassword("Radhika123");
        //Click on the Login Button
        loginPage.clickOnLoginButton();
        //Verify that the LogOut link is displayed
        homePage.clickOnLogout();
    }

   @Test(groups = {"regression"})
    public void VerifyThatUserShouldLogOutSuccessFully() {
      //Click on the login link
       homePage.clickOnLoginLink();
       //Enter EmailId
       loginPage.setEnterEmailId("Radhika.shah1901@gmail.com");
       //Enter Password
       loginPage.enterPassword("Radhika123");
       //Click on the Login Button
       loginPage.clickOnLoginButton();
       //Click on the LogOut Link
       homePage.clickOnLogout();
       //Verify that the LogIn Link Display
       homePage.setVerifyLoginLink();

    }
}
