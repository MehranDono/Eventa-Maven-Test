package com.eventa;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homepage extends pageActions {

     public void LaunchBrowser(String browserName)
    {

        if(browserName.equals("chrome"))
        {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

             driver = new ChromeDriver(options);
        } else if (browserName.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }

    }

    public void NavigateToUrl(String url)
    {
        driver.get(url);
    }

    public  void login() {
        // log into landing page

        ClickElement(signInLink);
        insertValues(userNameInputBox, "techno");
        insertValues(passwordInputBox, "12345678");
        ClickElement(signInButton);
        ClickElement(myOrganizerProfile);

    }

    public  void logout() {
        // log out from the website application

        ClickElement(organizerName);
        ClickElement(signOutLink);

    }

    public  String testProfileName(String prfileName) 
    {
        // Testing profile name

        try {
            getElementValue(prfileName);
            String expResult = prfileName;
            String actualResult = getElementValue(profileNameInputBox);

            if (expResult.equalsIgnoreCase(actualResult)) {
                System.out.println("Test Passed!!!!!!!!!  Profile name matches!! ");
            } else {
                System.out.println("Test Failed!!! Profile Name does not match!");
            }
        } catch (Exception e) {

            System.out.println("Nothing found!!!!  Failed!!");
        } 
        return null;
    }

    public  String testWithAttributeValue(String prfileName) 
        {
            // Testing profile name
    
            try {
                getElementValue(prfileName);
                String expResult = prfileName;
                String actualResult = getElementAttribute(profileNameInputBox, "value");
    
                if (expResult.equalsIgnoreCase(actualResult)) {
                    System.out.println("Test Passed!!!!!!!!!  Profile name matches!! ");
                } else {
                    System.out.println("Test Failed!!! Profile Name does not match!");
                }
            } catch (Exception e) {
    
                System.out.println("Nothing found!!!!  Failed!!");
            } 
            return null;
        }




    // Variables containing locators
    public String signUpButton = ("xpath://span[contains(text(),'Sign up')]");
    public String signUpAttendee = ("xpath://*[contains(text(),' Attendee')]");
    public String signUpOrgnazier = ("xpath://*[contains(text(),' Organizer')]");
    public String signInLink = ("xpath://span[contains(text(),'Sign in')]");
    public String signUpLink = ("xpath://span[contains(text(),'Sign up')]");
    public String userNameInputBox = ("name:_username");
    public String passwordInputBox = ("name:_password");
    public String rememberMeRadioButton = ("xpath://label[contains(text(),'Remember me')]");
    public String signInButton = ("xpath://button[contains(text(),'Sign in')]");
    public String organizerName = ("xpath://body/section[1]/div[1]/div[1]/div[3]/div[1]/div[1]/a[1]/div[1]/span[1]");
    public String signOutLink = ("xpath://*[contains(text(),' Sign out')]");
    //locators from Dashboard
    public String profileNameInputBox = ("xpath://input[@id='organizer_profile_name']");
    public String myOrganizerProfile = ("xpath://body/section[3]/div[1]/div[1]/aside[1]/div[1]/ul[1]/li[2]/a[1]");
    public String DashboardMenuHeading = ("xpath://body[1]/section[2]/div[1]/h4[1]");

}
