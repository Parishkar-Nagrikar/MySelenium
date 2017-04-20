package com11.DojoFreamwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Browser
{
    private WebDriver webdriver;

    public Browser(String typeOfBrowser)
    {
        if(typeOfBrowser.equalsIgnoreCase("Chrome"))
        {
            webdriver = new ChromeDriver();
            webdriver.manage().window().maximize();
            System.out.println("Test Started in Chrome  .. ");

        }
        else
        {
            webdriver = new FirefoxDriver();
            webdriver.manage().window().maximize();
            System.out.println("Test Started in FireFox  .. ");
        }
    }
    public void Exit()
    {
        webdriver.close();
        System.out.println("Test Completed...");

    }

    public void setUrl(String url)
    {
        webdriver.get(url);
    }

    public void waitForDefaultTime()
    {
        webdriver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_FOR_SECONDS, TimeUnit.SECONDS);
    }

    public void clickByLinkText(String linkText)
    {
        webdriver.findElement(By.linkText(linkText)).click();
    }

    public void sendKey(String name, String key)
    {
        findElementByName(name).sendKeys(key);
    }

    public void clickByName(String name)
    {
        findElementByName(name).click();
    }

    public WebElement findElementByName(String name)
    {
        return webdriver.findElement(By.name(name));
    }

    public void clickByPath(String path)
    {
        webdriver.findElement(By.xpath(path)).click();
    }

}
