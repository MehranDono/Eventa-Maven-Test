package com.eventa;







public class App 
{
    public static void main( String[] args )
    {
        // Page objects
        homepage testHomepage = new homepage();
        pageActions pageA = new pageActions();

        // Login Test
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Mehran\\Desktop\\Java selenium\\Eventa\\src\\drivers\\chromedriver.exe");

        testHomepage.LaunchBrowser("chrome");
        pageA.ManageBrowserUtilities();
        testHomepage.NavigateToUrl("https://www.eventa.llc");
        testHomepage.login();
        testHomepage.logout();
        pageA.CloseBrowser(); 
    }
}
