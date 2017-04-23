package DoctorPlus.TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/23/2017.
 */
public class AssertDemo
{
    @Test
    public void Login()//blanck credential
    {
        System.out.println("Login called");
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();


        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();


        String expected = "Logout";
        String actual;

        try
        {
            actual = driver.findElement(By.linkText("Logout1")).getText();
            Assert.assertEquals(actual, expected);

        }
        catch (Exception e)
        {
            //System.out.println(e.printStackTrace());
            driver.close();
            System.out.println("Program Terminated with");
            e.printStackTrace(System.out);

            actual="";
        }
        driver.close();
        System.out.println("Program Completed");
    }
}
