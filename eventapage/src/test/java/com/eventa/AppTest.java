package com.eventa;



import org.openqa.selenium.By;
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
    @Test
            public void loginTest()
    {
        // ---------------------- Login Test --------------------------
        testHomepage.LaunchBrowser("chrome");
        pageA.ManageBrowserUtilities();
        testHomepage.NavigateToUrl("https://www.eventa.llc");
        testHomepage.login();
        testHomepage.testWithAttributeValue("Techno");
        pageA.CloseBrowser();
    }

    @Test
            public void logoutTest()
        {
            // ---------------------- Logout Test --------------------------
            testHomepage.LaunchBrowser("chrome");
            pageA.ManageBrowserUtilities();
            testHomepage.NavigateToUrl("https://www.eventa.llc");
            testHomepage.login();
            testHomepage.logout();
            pageA.CloseBrowser();

        }

    @Test
            public void basicTest()
            {
                testHomepage.LaunchBrowser("chrome");
                    pageA.ManageBrowserUtilities();
                    testHomepage.NavigateToUrl("https://www.eventa.llc");
                    testHomepage.login();

                    pageActions.driver.findElement(By.xpath("//body/section[3]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[2]/a[1]")).click();
                    String report =   pageActions.driver.findElement(By.id("organizer_profile_name")).getAttribute("value");
                    System.out.println(report);
                pageA.CloseBrowser();



            }


}
