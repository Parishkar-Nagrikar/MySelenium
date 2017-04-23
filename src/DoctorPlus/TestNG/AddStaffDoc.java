package DoctorPlus.TestNG;

import Util.Utitily;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/23/2017.
 */
public class AddStaffDoc
{
    @Test
    public void Login()
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

        //
        driver.findElement(By.linkText("Admin")).click();
        //
        driver.findElement(By.linkText("Staff Members")).click();
        //
        driver.findElement(By.linkText("Add New Doctor")).click();
        //
        driver.findElement(By.name("nif")).sendKeys("123");
        //
        driver.findElement(By.name("collegiate_number")).sendKeys("321");
        //
        String first_name=Utitily.getName();
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
        driver.findElement(By.name("save")).click();

        //                 Staff member,       First Name       Surname1      Surname2  ,    has been added.
        String expected = "Staff member,"+" "+ first_name +" "+ surname1+" "+ surname2+","+" has been added.";
        String actual;

        try
        {
            actual = driver.findElement(By.xpath("//*[@id=\"content\"]/p[1]")).getText();
            Assert.assertEquals(actual,expected);

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
