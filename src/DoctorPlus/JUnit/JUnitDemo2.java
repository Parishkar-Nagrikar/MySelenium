package DoctorPlus.JUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/20/2017.
 */
public class JUnitDemo2
{
   static WebDriver driver;

    @BeforeClass
    public static void BeforeFn()
    {
        System.out.println( "BeforeClassFn called");
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
    @Test
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
    @AfterClass
    public static void AfterFn()
    {
        System.out.println( "AfterClassFn called");
        driver.close();
        System.out.println("Program Completed");
    }
}

