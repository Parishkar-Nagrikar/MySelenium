package DoctorPlus;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/19/2017.
 */
public class JUnitDemo
{

    @Test
    public void myTest1()
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

        System.out.println("Program Completed");
    }
}
