package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by P-star on 5/31/2017.
 */
public class infosys
{
    public static void main(String[] args)
    {
       // System.setProperty("Webdriver.chrome.driver","E:\\Development\\MySelenium\\Drivers");
        System.setProperty("webdriver.chrome.driver","E:\\Development\\MySelenium\\Drivers\\chromedriver.exe");


        WebDriver driver;
        driver=new ChromeDriver();

        driver.manage().window().maximize();
       // driver.manage().window().maximize();


        driver.get("https://www.google.co.in/?gfe_rd=cr&ei=SzYuWbruNKLT8gf3mp64CA");

        driver.findElement(By.linkText("Gmail")).click();

        System.out.println("Programe Executed");

    }
}
