package DoctorPlus.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 5/4/2017.
 */
public class DataProviders
{

    @Test(dataProvider = "getData")
    public  void Login(String uname,String pass)
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//2 parameters
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://doctorplus.scriptinglogic.net/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys(uname);
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id='login']")).click();

        driver.close();

    }
    @DataProvider
    public Object[][] getData()
    {
        Object[][] data=new Object[4][2];//Rows=4:Column=2

        //1st Row
        data[0][0]="Vaisahli";
        data[1][0]="vaishali";

        //2nd Row
        data[1][0]="admin";
        data[1][1]="renu";

        //3rd Row
        data[2][0]="";
        data[2][1]="";

        //4th Row
        data[3][0]="admin";
        data[3][1]="admin";


        return data;

    }
}
