package DemoAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by p-star on 4/16/2017.
 */
public class Locators
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver webDriver =new ChromeDriver();

        //Goto URl
        webDriver.get("http://doctorplus.scriptinglogic.net/home/index.php");

        //Maximize the Browser
        webDriver.manage().window().maximize();

        //Click on LOGIN Link
        webDriver.findElement(By.linkText("Log in")).click();

        //Enter the LOGIN TEXT
        webDriver.findElement(By.id("login_session")).sendKeys("Admin");

        //Enter the Password
        webDriver.findElement(By.id("pwd_session")).sendKeys("admin");

        //Click on Enter
        webDriver.findElement(By.id("login")).click();

        System.out.println("Program completed");



    }

}
