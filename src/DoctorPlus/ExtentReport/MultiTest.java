package DoctorPlus.ExtentReport;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
/**
 * Created by p-Star on 6/11/2017.
 */

public class MultiTest
{
    WebDriver driver;
    ExtentReports extent;
   @BeforeClass
    public void BeforeFn()
    {
        extent = new ExtentReports("Extent-Reort/report.html",true, NetworkMode.OFFLINE);
        System.out.println( "BeforeFn called");
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public void myTest1()//correct credential
    {
        System.out.println( "myTest1 called");
        //1
        //2
        ExtentTest test = extent.startTest("MyTest1 Status","MyTest1 Complete Status");
        //3
        test.log(LogStatus.INFO, "Start Extent Report for myTest1");

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
            actual = driver.findElement(By.linkText("Logout")).getText();
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

     //   driver.findElement(By.linkText("Logout")).click();
        extent.endTest(test);
    }
    @Test
    public void myTest2()//In-correct credential
    {
        System.out.println("myTest2 called");
        //1
        //2
        ExtentTest test = extent.startTest("MyTest2 Status","MyTest2 Complete Status");
        //3
        test.log(LogStatus.INFO, "Start Extent Report for myTest2");

        System.out.println("myTest2 called");
        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin1");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin1");
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

     //   driver.findElement(By.linkText("Logout")).click();

        extent.endTest(test);
    }
    @Test
    public void myTest3()//blanck credential
    {
        System.out.println( "myTest3 called");

        //1
        //2
        ExtentTest test = extent.startTest("MyTest3 Status","MyTest3 Complete Status");
        //3
        test.log(LogStatus.INFO, "Start Extent Report for myTest3");

        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("");
        driver.findElement(By.xpath("//*[@id='login']")).click();

        String expected = "Logout";
        String actual;
        try
        {
            actual = driver.findElement(By.linkText("Logout1")).getText();
            org.testng.Assert.assertEquals(actual, expected);

        }
        catch (Exception e)
        {
            //System.out.println(e.printStackTrace());
            driver.close();
            System.out.println("Program Terminated with");
            e.printStackTrace(System.out);
            actual="";
        }
     //   driver.findElement(By.linkText("Logout")).click();

        extent.endTest(test);
    }
    @AfterClass
    public void AfterFn()
    {
        System.out.println("AfterFn called");
        driver.close();
        System.out.println("Program Completed");
        extent.flush();
    }
}