package DoctorPlus.ExtentReport;

import Util.Utitily;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.relevantcodes.extentreports.NetworkMode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;


/**
 * Created by p-Star on 6/11/2017.
 */
public class ExtentReportDemo
{

    @Test
    public void Login()
    {
        //1
        ExtentReports extent = new ExtentReports("Extent-Reort/report.html",true, NetworkMode.OFFLINE);
        //2
        ExtentTest test = extent.startTest("Status","Complete Status");
        //3
        test.log(LogStatus.INFO, "Start Extent Report");

        System.out.println("Login called");
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver =new ChromeDriver();
        driver.manage().window().maximize();


        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        test.log(LogStatus.INFO, "Url hitting");

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();
        test.log(LogStatus.INFO, "Entered the Credentials");
        //
        driver.findElement(By.linkText("Admin")).click();
        test.log(LogStatus.INFO, "clicked on admin link");
        //
        driver.findElement(By.linkText("Staff Members")).click();
        test.log(LogStatus.INFO, "clicked on staff members link");
        //
        driver.findElement(By.linkText("Add New Doctor")).click();
        test.log(LogStatus.INFO, "Clicked on new Doctor");
        //
        driver.findElement(By.name("nif")).sendKeys("123");
        //
        driver.findElement(By.name("collegiate_number")).sendKeys("321");
        //
        String first_name= Utitily.getName();
        driver.findElement(By.name("first_name")).sendKeys(first_name);
        //
        String surname1=Utitily.getName();
        driver.findElement(By.name("surname1")).sendKeys(surname1);
        //
        String surname2=Utitily.getName();
        driver.findElement(By.name("surname2")).sendKeys(surname2);
        //
        String address=Utitily.getName();
        driver.findElement(By.name("address")).sendKeys(address);
        //
        String phone_contact=Utitily.getID();
        driver.findElement(By.name("phone_contact")).sendKeys(phone_contact);
        //
        String login=Utitily.getName();
        driver.findElement(By.name("login")).sendKeys(login);//
        //
        test.log(LogStatus.INFO, "Enter the Data");
        driver.findElement(By.name("save")).click();
        test.log(LogStatus.INFO, "Clicked on save");

      /*  //                 Staff member,       First Name       Surname1      Surname2  ,    has been added.
        String expected = "Staff member,"+" "+ first_name +" "+ surname1+" "+ surname2+","+" has been added.";
        String actual;

        try
        {
            actual = driver.findElement(By.xpath("/[@id=\"content\"]/p[1]")).getText();
            Assert.assertEquals(actual, expected);

        }
        catch (Exception e)
        {
            //System.out.println(e.printStackTrace());
            driver.close();
            System.out.println("Program Terminated with");
            e.printStackTrace(System.out);

            actual="";
        }*/
        driver.close();
        System.out.println("Program Completed");
        //4
        extent.endTest(test);
        //5
        extent.flush();
    }
}