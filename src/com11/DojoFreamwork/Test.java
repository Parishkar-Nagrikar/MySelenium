package com11.DojoFreamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import  java.lang.System;

public class Test {

    public void Hover()
    {
        WebDriver webdriver =new FirefoxDriver();
        Actions actions =  new Actions(webdriver);
        WebElement we = webdriver.findElement(By.linkText("Selenium Practice page"));
        actions.moveToElement(we).build().perform();
    }

    public static void main(String[] args) throws InterruptedException {
        Test controls = new Test();
        String typeOfBrowser = "Chrome";
        controls.drive(typeOfBrowser);
    }

    private void drive(String typeOfBrowser) throws InterruptedException
    {

        System.out.println("Start drive () .. ");

        setSystemProperties(typeOfBrowser);

        Browser browser = new Browser(typeOfBrowser);


        browser.setUrl(Constants.APPLICATION_URL);

        browser.waitForDefaultTime();

        browser.clickByLinkText("Selenium Practice page");

        browser.waitForDefaultTime();

        browser.sendKey("Name", "Selenium");

        browser.clickByName("subscribe");

        browser.sendKey("comments", "WelCome  to Selenium Training");

        new Select(browser.findElementByName("countries")).selectByVisibleText("Argentina");

        browser.clickByPath("(//input[@name='rating'])[3]");


        Thread.sleep(1000);

        browser.Exit();

    }
    private void setSystemProperties(String browserType)
    {
        if(browserType.equals("Chrome")){
            System.setProperty(Constants.WEBDRIVER_CHROME_DRIVER, Constants.DRIVERS_CHROMEDRIVER_EXE);
        }else{
            System.setProperty(Constants.WEBDRIVER_GECKO_DRIVER, Constants.DRIVERS_GECKODRIVER_EXE);
        }

    }
}

