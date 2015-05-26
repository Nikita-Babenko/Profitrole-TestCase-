package com.eviltester.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static junit.framework.Assert.*;


public class MyProfitRoleTest {


     @Test
    public void startWebDriver() {
    WebDriver driver = new FirefoxDriver();

         driver.navigate().to("http://seleniumsimplified.com");

         assertTrue("title should start differently",
                 driver.getTitle().startsWith("Selenium Simplified"));
         driver.close();
     }
}
