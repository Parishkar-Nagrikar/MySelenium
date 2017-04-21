package DoctorPlus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/20/2017.
 */
public class TestNGDemo1
{
    WebDriver driver;

    @BeforeMethod
    public void BeforeMethodFn()
    {
        System.out.println( "BeforeMethodFn called");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void myTest1()
    {
        System.out.println( "myTest1 called");
        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

    }
    @Test (priority =  0)
    public void myTest2()//In-correct credential
    {
        System.out.println("myTest2 called");
        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin1");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin1");
        driver.findElement(By.xpath("//*[@id='login']")).click();

    }
    @Test
    public void myTest3()//blanck credential
    {

        System.out.println( "myTest3 called");
        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("");
        driver.findElement(By.xpath("//*[@id='login']")).click();
    }
    @AfterMethod
   public void AfterMethodFn()
    {
        System.out.println( "AfterMethodFn called");
        driver.close();
        System.out.println("Program Completed");
    }
}
