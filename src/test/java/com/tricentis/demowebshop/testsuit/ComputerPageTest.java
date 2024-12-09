package com.tricentis.demowebshop.testsuit;

import com.tricentis.demowebshop.customlisteners.CustomListeners;
import com.tricentis.demowebshop.pages.BuildYourOwnComputer;
import com.tricentis.demowebshop.pages.ComputerPage;
import com.tricentis.demowebshop.pages.HomePage;
import com.tricentis.demowebshop.testbase.BaseTest;
import org.testng.annotations.*;
import resources.testdata.TestData;

@Listeners(CustomListeners.class)
public class ComputerPageTest extends BaseTest {

    HomePage homePage;
    ComputerPage computerPage;
    BuildYourOwnComputer buildYourOwnComputer;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        buildYourOwnComputer = new BuildYourOwnComputer();

    }

    @Test(groups = {"sanity"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        //Click on the COMPUTER tab
        homePage.setClickOnComputers();
        //Verify "Computer" text
        computerPage.setVerifyComputersText();

    }

    @Test(groups = {"smoke", "regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        //Click on the COMPUTER tab
        homePage.setClickOnComputers();
        //Click on the Desktops link
        computerPage.setClickOnDesktops();
        //Verify "Desktops" text
        computerPage.setVerifyDesktopsText();
    }

    @Test(dataProvider = "computerList",dataProviderClass = TestData.class)
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software) {
          //Click on the COMPUTER tab
          homePage.setClickOnComputers();
          //Click on the Desktops link
          computerPage.setClickOnDesktops();
          //Click on the product name "Build your own computer"
          computerPage.setClickOnBuildYourOwnComputer();
          //Select processor "processor"
          buildYourOwnComputer.setSelectProcessor(processor);
          //Select RAM "ram"
          buildYourOwnComputer.setSelectRam(ram);
          //Select HDD "hdd"
          buildYourOwnComputer.setSelectHDD(hdd);
          //Select OS "os"
          buildYourOwnComputer.setSelectOs(os);
          //Select Software "software"
          buildYourOwnComputer.setSelectSoftware(software);
          //Click on "ADD TO CART" Button
          buildYourOwnComputer.setClickOnAddToCart();
          //Verify the message "The product has been added to your shopping cart"
          buildYourOwnComputer.verifyProductAddedToCart();

    }
}
