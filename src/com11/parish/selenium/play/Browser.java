package com11.parish.selenium.play;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Browser
{

    private WebDriver webdriver;
    private String name;

    public Browser(String name){
        setSystemProperties(this.name);
        if(this.name.equalsIgnoreCase("Chrome")){
            webdriver =  new ChromeDriver();
        }
        webdriver =  new ChromeDriver();
    }

    public void maximizeWindow() {
        webdriver.manage().window().maximize();
    }

    public void gotoUrl(String url) {
        webdriver.get(url);
    }

    public void waitForDefaultTime() {
        webdriver.manage().timeouts().implicitlyWait(Constants.DEFAULT_WAIT_FOR_SECONDS, TimeUnit.SECONDS);
    }

    public void clickByLinkText(String linkText) {
        webdriver.findElement(By.linkText(linkText)).click();
    }

    public void sendKey(String keyName, String keysValue) {
        findElementByName(keyName).sendKeys(keysValue);
    }
    public void clickByName(String name) {
        findElementByName(name).click();
    }

    public WebElement findElementByName(String keyName) {
        return webdriver.findElement(By.name(keyName));
    }
    public void clickByPath(String path)
    {
        webdriver.findElement(By.xpath(path)).click();
    }



    private  void setSystemProperties(String browserType)
    {
        if(browserType.equals("Chrome")){
            System.setProperty(Constants.WEBDRIVER_CHROME_DRIVER, Constants.DRIVERS_CHROMEDRIVER_EXE);
        }else{
            System.setProperty(Constants.WEBDRIVER_GECKO_DRIVER, Constants.DRIVERS_GECKODRIVER_EXE);
        }

    }
}
