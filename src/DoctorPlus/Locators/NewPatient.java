package DoctorPlus.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by p-star on 4/16/2017.
 */
public class NewPatient
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver webDriver=new ChromeDriver();

        //Goto URL
        webDriver.get("http://doctorplus.scriptinglogic.net/home/index.php");

        webDriver.manage().window().maximize();

        //click on Login
        webDriver.findElement(By.linkText("Log in")).click();

        //Enter ID Password
        webDriver.findElement(By.id("login_session")).sendKeys("Admin");
        webDriver.findElement(By.id("pwd_session")).sendKeys("admin");

        //Click on Login
        webDriver.findElement(By.id("login")).click();

        //Click on Medical Record
        webDriver.findElement(By.linkText("Medical Records")).click();

        //Click on to New Patient
        webDriver.findElement(By.linkText("New Patient")).click();

        //Set Tax Identification Number (TIN)
        webDriver.findElement(By.id("nif")).sendKeys("123");

        //Set Name
        webDriver.findElement(By.id("first_name")).sendKeys("ABC");

        //Set surname1
        webDriver.findElement(By.id("surname1")).sendKeys("XYZ1");

        //Set Surname
        webDriver.findElement(By.id("surname2")).sendKeys("XYZ2");

        //Set address
        webDriver.findElement(By.id("address")).sendKeys("Kothrud,Pune");

        //Set phone_contact
        webDriver.findElement(By.id("phone_contact")).sendKeys("9876543210");

        //Select Sex From DropDown Select
        Select dropDownSelect=new Select(webDriver.findElement(By.id("sex")));
        dropDownSelect.selectByVisibleText("Male");

        Select dropDownSelect2=new Select(webDriver.findElement(By.id("sex")));
        dropDownSelect2.selectByVisibleText("Female");


        //Set race
        webDriver.findElement(By.id("race")).sendKeys("Indian");

        //Set DOB YYYY-MM-DD
        webDriver.findElement(By.id("year")).sendKeys("1992");
        webDriver.findElement(By.id("month")).sendKeys("08");
        webDriver.findElement(By.id("day")).sendKeys("25");

        //set Birth Place
        webDriver.findElement(By.id("birth_place")).sendKeys("Mumbai");

        //set Decease Date
        webDriver.findElement(By.id("dyear")).sendKeys("2017");
        webDriver.findElement(By.id("dmonth")).sendKeys("08");
        webDriver.findElement(By.id("dday")).sendKeys("25");

        //Set Sanitary Card Number (SCN)
        webDriver.findElement(By.id("nts")).sendKeys("321");


        //Set National Health Service Number (NHSN)
        webDriver.findElement(By.id("nss")).sendKeys("654");

        //Set Family Situation
        webDriver.findElement(By.id("family_situation")).sendKeys("Average");

        //Set Labour Situation:
        webDriver.findElement(By.id("labour_situation")).sendKeys("Average");

        //Set education
        webDriver.findElement(By.id("education")).sendKeys("BE Civil");

        //Set insurance_company
        webDriver.findElement(By.id("insurance_company")).sendKeys("LIC");

        //Select Doc From DropDown
        Select dropDownSelectDoc=new Select(webDriver.findElement(By.id("id_member")));
        dropDownSelectDoc.selectByVisibleText("ajay agrawal");

        //Click on Submit
        webDriver.findElement(By.id("save")).click();


        System.out.println("Program Completed");

    }

}
