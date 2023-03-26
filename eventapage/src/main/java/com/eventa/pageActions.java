package com.eventa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class pageActions {

     public  static WebDriver driver;

    public  void ManageBrowserUtilities() 
    {
        driver.manage().window().maximize();
    }

    public  void ClickElement(String locators)
    {
        if(locators.contains("xpath")){
            driver.findElement(By.xpath(locators.split(":")[1])).click();
        } else if ((locators.contains("css"))){
                    driver.findElement(By.cssSelector(locators.split(":")[1])).click();
        } else if ((locators.contains("name"))){
            driver.findElement(By.name(locators.split(":")[1])).click();
        } else if ((locators.contains("id"))){
            driver.findElement(By.id(locators.split(":")[1])).click();
        } else if ((locators.contains("linkText"))){
            driver.findElement(By.linkText(locators.split(":")[1])).click();
        }

        //Sleep for exceptions e
        try{
            Thread.sleep(1000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }


    }

    public  void insertValues(String locators, String value)
    {

        if(locators.contains("xpath")){
                    driver.findElement(By.xpath(locators.split(":")[1])).sendKeys(value);
                } else if ((locators.contains("css"))){
                            driver.findElement(By.cssSelector(locators.split(":")[1])).sendKeys(value);
                } else if ((locators.contains("name"))){
                    driver.findElement(By.name(locators.split(":")[1])).sendKeys(value);
                } else if ((locators.contains("id"))){
                    driver.findElement(By.id(locators.split(":")[1])).sendKeys(value);
                } else if ((locators.contains("linktext"))){
                    driver.findElement(By.linkText(locators.split(":")[1])).sendKeys(value);
                }


    }

    public  void CloseBrowser()
    {
        driver.quit();
    }

    public  String getElementValue(String locators)
        {
            //Sleep for exceptions e
                        try{
                            Thread.sleep(1000);
                        } catch(InterruptedException e){
                            e.printStackTrace();
                        }
        

            if(locators.contains("xpath")){
                return driver.findElement(By.xpath(locators.split(":")[1])).getText();
            } else if ((locators.contains("css"))){
                return   driver.findElement(By.cssSelector(locators.split(":")[1])).getText();
            } else if ((locators.contains("name"))){
                return driver.findElement(By.name(locators.split(":")[1])).getText();
            } else if ((locators.contains("id"))){
                return driver.findElement(By.id(locators.split(":")[1])).getText();
            } else if ((locators.contains("linkText"))){
                return driver.findElement(By.linkText(locators.split(":")[1])).getText();
            }
                return null;
    
        }

    public String getWebElementText(String locators) {

        //Sleep for exceptions e
                                try{
                                    Thread.sleep(1000);
                                } catch(InterruptedException e){
                                    e.printStackTrace();
                                }
                                
		return driver.findElement(By.xpath(locators)).getText();
	


    }

    public  String getElementAttribute(String locators, String attribute)
            {
                //Sleep for exceptions e
                            try{
                                Thread.sleep(1000);
                            } catch(InterruptedException e){
                                e.printStackTrace();
                            }
            
    
                if(locators.contains("xpath")){
                    return driver.findElement(By.xpath(locators.split(":")[1])).getAttribute(attribute);
                } else if ((locators.contains("css"))){
                    return   driver.findElement(By.cssSelector(locators.split(":")[1])).getAttribute(attribute);
                } else if ((locators.contains("name"))){
                    return driver.findElement(By.name(locators.split(":")[1])).getAttribute(attribute);
                } else if ((locators.contains("id"))){
                    return driver.findElement(By.id(locators.split(":")[1])).getAttribute(attribute);
                } else if ((locators.contains("linkText"))){
                    return driver.findElement(By.linkText(locators.split(":")[1])).getAttribute(attribute);
                }
                    return null;
        
            }
}


