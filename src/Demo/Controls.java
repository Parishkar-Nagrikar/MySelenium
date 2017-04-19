package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/14/2017.
 */
public class Controls
{
    public void Hover()
    {
        WebDriver webdriver =new FirefoxDriver();
        Actions actions =  new Actions(webdriver);
        WebElement we = webdriver.findElement(By.linkText("Selenium Practice page"));
        actions.moveToElement(we).build().perform();
    }

    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

       // System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

     //   WebDriver webdriver =new ChromeDriver();
        WebDriver webdriver =new FirefoxDriver();

        webdriver.manage().window().maximize();

        //GoTo URl
        webdriver.get("http://softwaretesting-guru.blogspot.in/p/main-page.html");

        webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
       //handle link text
        //webdriver.findElement(By.linkText("Selenium Practice page")).hover();
        webdriver.findElement(By.linkText("Selenium Practice page")).click();
        webdriver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


        //handle text Box
        webdriver.findElement(By.name("Name")).sendKeys("Selenium");
        //webdriver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Selenium");

        //handle Ckeck boX
        webdriver.findElement(By.name("subscribe")).click();

        //handle Text Area
        webdriver.findElement(By.name("comments")).sendKeys("WelCome  to SeleniUm Training");


///////////////////////////////////////////////////////////////////////////////////////////////
        // WebDriver driver = new FirefoxDriver();
        // driver.get("http://scriptinglogic.com/index.php/software-testing/selenium/operations-on-html-elements/");
// Enter the text in text box
        //  driver.findElement(By.id("txt")).sendKeys("hi text");

// Enter the text in Password
        // driver.findElement(By.id("pass")).sendKeys("password");

// enter the text in multi line text box
        //  driver.findElement(By.id("tArea")).sendKeys("This is line no.1\nThis is line no. 2");
/////////////////////////////////////////////////////////////////////////////////////////////

        //Handle DropDown
        new Select(webdriver.findElement(By.name("countries"))).selectByVisibleText("Argentina");

        //Handle Radio button
        webdriver.findElement(By.xpath("(//input[@name='rating'])[3]")).click();
        //(//input[@value='bad'])

       // webdriver.close();
        System.out.println("Program completed");
        Thread.sleep(1000);

    }
}