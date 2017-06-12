package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by p-star on 4/16/2017.
 */
public class seleniumGuru
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver webDriver=new ChromeDriver();

        webDriver.manage().window().maximize();

        //GoTo URL
        webDriver.get("http://softwaretesting-guru.blogspot.in/p/blog-page.html");


        //Set Text
        webDriver.findElement(By.name("Name")).sendKeys("Selenium");

        //Un-Ckeck the Check BOx
        webDriver.findElement(By.name("subscribe")).click();

        //Set Text In Text-Field
        webDriver.findElement(By.name("comments")).sendKeys("WelCome To Selenium");

        //Select From DropDown
        Select dropDownSelect=new Select(webDriver.findElement(By.name("countries")));
        dropDownSelect.selectByVisibleText("Argentina");
      //  dropDownSelect.selectByValue("Afganistain");
      //  dropDownSelect.selectByIndex(1);

        //Multi-Select From DropDown
        Select multiSelect=new Select(webDriver.findElement(By.name("computerbrands")));
        multiSelect.selectByVisibleText("IBM");
        multiSelect.selectByValue("HP");
        multiSelect.selectByIndex(4);

        //Set Password Field
        webDriver.findElement(By.name("pwd")).sendKeys("Password");

        //Select Redio-Button
        webDriver.findElement(By.xpath("//input[@value='good']")).click();
        webDriver.findElement(By.xpath("//input[@value='excellent']")).click();
        webDriver.findElement(By.xpath("//input[@value='bad']")).click();


        ///photo
        WebElement fileInput = webDriver.findElement(By.name("photo"));
        fileInput.sendKeys("C:\\Users\\p-star\\Pictures\\regression-testing.jpg");

        //Click On Submit
        webDriver.findElement(By.xpath("//input[@value='Submit']")).click();






        System.out.println("Program completed");
    }
}
