package DoctorPlus.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/21/2017.
 */
public class DoctorPlusTestNg
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

    @Test (priority = 1)
    public void LogingIn()
    {
        System.out.println( "LogingIn called");
        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

    }
    @Test(priority = 2)
    public void NevigateToRegistrationPatientPage()
    {
        System.out.println( "NevigateToRegistrationPatientPage called");

        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

        //Click on Medical Record
        driver.findElement(By.linkText("Medical Records")).click();

        //Click on to New Patient
        driver.findElement(By.linkText("New Patient")).click();
    }
    @Test(priority = 0)
    public void RegisterPatient()
    {
        System.out.println( "RegisterPatient called");

        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

        //Click on Medical Record
        driver.findElement(By.linkText("Medical Records")).click();

        //Click on to New Patient
        driver.findElement(By.linkText("New Patient")).click();


        driver.findElement(By.id("nif")).sendKeys("123");

        //Set Name
        driver.findElement(By.id("first_name")).sendKeys("ABC");

        //Set surname1
        driver.findElement(By.id("surname1")).sendKeys("XYZ1");

        //Set Surname
        driver.findElement(By.id("surname2")).sendKeys("XYZ2");

        //Set address
        driver.findElement(By.id("address")).sendKeys("Kothrud,Pune");

        //Set phone_contact
        driver.findElement(By.id("phone_contact")).sendKeys("9876543210");

        //Select Sex From DropDown Select
        Select dropDownSelect=new Select(driver.findElement(By.id("sex")));
        dropDownSelect.selectByVisibleText("Male");

        Select dropDownSelect2=new Select(driver.findElement(By.id("sex")));
        dropDownSelect2.selectByVisibleText("Female");

        //Set race
        driver.findElement(By.id("race")).sendKeys("Indian");

        //Set DOB YYYY-MM-DD
        driver.findElement(By.id("year")).sendKeys("1992");
        driver.findElement(By.id("month")).sendKeys("08");
        driver.findElement(By.id("day")).sendKeys("25");

        //set Birth Place
        driver.findElement(By.id("birth_place")).sendKeys("Mumbai");

        //set Decease Date
        driver.findElement(By.id("dyear")).sendKeys("2017");
        driver.findElement(By.id("dmonth")).sendKeys("08");
        driver.findElement(By.id("dday")).sendKeys("25");

        //Set Sanitary Card Number (SCN)
        driver.findElement(By.id("nts")).sendKeys("321");

        //Set National Health Service Number (NHSN)
        driver.findElement(By.id("nss")).sendKeys("654");

        //Set Family Situation
        driver.findElement(By.id("family_situation")).sendKeys("Average");

        //Set Labour Situation:
        driver.findElement(By.id("labour_situation")).sendKeys("Average");

        //Set education
        driver.findElement(By.id("education")).sendKeys("BE Civil");

        //Set insurance_company
        driver.findElement(By.id("insurance_company")).sendKeys("LIC");

        //Select Doc From DropDown
        Select dropDownSelectDoc=new Select(driver.findElement(By.id("id_member")));
        dropDownSelectDoc.selectByVisibleText("ajay agrawal");

        //Click on Submit
        driver.findElement(By.id("save")).click();

    }
    @AfterMethod
    public void AfterMethodFn()
    {
        System.out.println( "AfterMethodFn called");
        driver.close();
        System.out.println("Program Completed");
    }
}