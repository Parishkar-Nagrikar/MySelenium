package DoctorPlus.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 4/18/2017.
 */
public class xPathsDemo
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();

        //GoTo URl
        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        //Click On Login
        // 1. (//a[text()='Log in'])[1]
        //2..//*[@id='shortcuts']/li/a
        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

        //Click on Medical Record
        driver.findElement(By.xpath("//*[@id='content']//a[text()='Medical Records']")).click();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        //Click on to New Patient
        driver.findElement(By.xpath("//*[@id='content']//a[text()='New Patient']")).click();


        //Set Tax Identification Number (TIN)
        driver.findElement(By.xpath("//*[@id='nif']")).sendKeys("123");

        //Set Name
        driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("ABC");

        //Set surname1
        driver.findElement(By.xpath("//*[@id='surname1']")).sendKeys("XYZ1");

        //Set Surname
        driver.findElement(By.xpath("//*[@id='surname2']")).sendKeys("XYZ2");

        //Set address
        driver.findElement(By.xpath("//*[@id='address']")).sendKeys("Kothrud,Pune");//

        //Set phone_contact
        driver.findElement(By.xpath("//*[@id='phone_contact']")).sendKeys("9876543210");

        //Select Sex From DropDown Select'
        Select dropDownSelect=new Select(driver.findElement(By.xpath("//*[@id='sex']")));
        dropDownSelect.selectByVisibleText("Male");

        Select dropDownSelect2=new Select(driver.findElement(By.xpath("//*[@id='sex']")));
        dropDownSelect2.selectByVisibleText("Female");


        //Set race
        driver.findElement(By.xpath("//*[@id='race']")).sendKeys("Indian");

        //*[@id=''

        //Set DOB YYYY-MM-DD
        driver.findElement(By.xpath("//*[@id='year']")).sendKeys("1992");
        driver.findElement(By.xpath("//*[@id='month']")).sendKeys("08");
        driver.findElement(By.xpath(" //*[@id='day']")).sendKeys("25");

        //set Birth Place
        driver.findElement(By.xpath("//*[@id='birth_place']")).sendKeys("Mumbai");

        //set Decease Date
        driver.findElement(By.xpath(" //*[@id='dyear']")).sendKeys("2017");
        driver.findElement(By.xpath(" //*[@id='dmonth']")).sendKeys("08");
        driver.findElement(By.xpath("//*[@id='dday']")).sendKeys("25");

        //Set Sanitary Card Number (SCN)
        driver.findElement(By.xpath("//*[@id='nts']")).sendKeys("321");
        //*[@id=''

        //Set National Health Service Number (NHSN)
        driver.findElement(By.xpath("//*[@id='nss']")).sendKeys("654");

        //Set Family Situation
        driver.findElement(By.xpath("//*[@id='family_situation']")).sendKeys("Average");

        //Set Labour Situation:
        driver.findElement(By.xpath("//*[@id='labour_situation']")).sendKeys("Average");

        //Set education
        driver.findElement(By.xpath("//*[@id='education']")).sendKeys("BE Civil");

        //Set insurance_company
        driver.findElement(By.xpath("//*[@id='insurance_company']")).sendKeys("LIC");

        //Select Doc From DropDown
        Select dropDownSelectDoc=new Select(driver.findElement(By.xpath("//*[@id='id_member']")));
        dropDownSelectDoc.selectByVisibleText("ajay agrawal");

        //Click on Submit
        driver.findElement(By.xpath("//*[@id='save']")).click();
        System.out.println("Program Completed");

    }
}
