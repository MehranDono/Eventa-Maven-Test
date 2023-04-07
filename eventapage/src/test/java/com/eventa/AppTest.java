package com.eventa;

import org.testng.Assert;
import org.testng.annotations.*;



/**
 * Unit test for simple App.
 */
public class AppTest
{
      // Page objects
            homepage testHomepage = new homepage();
            pageActions pageA = new pageActions();

    /**
     * Rigorous Test :-)
     */
    @Test(priority = 1)
            public void loginTest()
    {
        // ---------------------- Login Test --------------------------
        testHomepage.LaunchBrowser("chrome");
        pageA.ManageBrowserUtilities();
        testHomepage.NavigateToUrl("https://www.eventa.llc");
        testHomepage.login();
        Assert.assertEquals(testHomepage.validateProfileNameExist("Techno"), true, "Failed Profile Name is not found");
        
    }

    @Test(priority = 2)
            public void logoutTest()
        {
            // ---------------------- Logout Test --------------------------
            testHomepage.LaunchBrowser("chrome");
            pageA.ManageBrowserUtilities();
            testHomepage.NavigateToUrl("https://www.eventa.llc");
            testHomepage.login();
            testHomepage.logout();
            Assert.assertEquals(testHomepage.validateProfileNameNotExsit("James williams"), true,
                    "Failed ProfileName is not Expected at this point");

        }

    @AfterMethod
            public void tearDown()
            {
                pageA.CloseBrowser();
            }


}
