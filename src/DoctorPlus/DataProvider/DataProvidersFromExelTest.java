package DoctorPlus.DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by p-star on 5/7/2017.
 */
public class DataProvidersFromExelTest
{
    @Test(dataProvider = "getData")
    public  void Login(String uname,String pass)
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//2 parameters
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/openclinic/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys(uname);
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id='login']")).click();

        driver.close();

    }
    @DataProvider
    public Object[][] getData() throws IOException
    {

     FileInputStream fileInputStream = new FileInputStream("Data/data.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("Sheet1");

        int rowCount= worksheet.getPhysicalNumberOfRows();

        Object[][] data=new Object[rowCount][2];//Rows=4:Column=2

        for(int i=0;i<rowCount;i++) {
            HSSFRow row = worksheet.getRow(i);


            HSSFCell username = row.getCell(0);
            data[i][0] = username.getStringCellValue();

            HSSFCell password = row.getCell(1);
            data[i][1] = password.getStringCellValue();
        }
        return data;
    }
}
