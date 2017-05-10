package DoctorPlus.DataProvider;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by P-star on 5/8/2017.
 */
public class DataProvidersFormFromExel
{

    @Test(dataProvider = "getData")
    public  void Login(String tin,String collegiate_number,String first_name,String surname1,String surname2,String address,String phone_contact,String login)
    {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");//2 parameters
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://localhost/openclinic/auth/login_form.php");
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//*[@id='login_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='pwd_session']")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id='login']")).click();

        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.linkText("Staff Members")).click();

        driver.findElement(By.linkText("Add New Doctor")).click();

        driver.findElement(By.id("nif")).sendKeys(tin);

        driver.findElement(By.id("collegiate_number")).sendKeys(collegiate_number);

        driver.findElement(By.id("first_name")).sendKeys(first_name);

        driver.findElement(By.id("surname1")).sendKeys(surname1);

        driver.findElement(By.id("surname2")).sendKeys(surname2);

        driver.findElement(By.id("address")).sendKeys(address);

        driver.findElement(By.id("phone_contact")).sendKeys(phone_contact);

        driver.findElement(By.id("login")).sendKeys(login);

        driver.findElement(By.id("save")).click();
        driver.close();

    }
    @DataProvider
    public Object[][] getData() throws IOException
    {

        FileInputStream fileInputStream = new FileInputStream("Data/data1.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet worksheet = workbook.getSheet("Sheet2");

        int rowCount= worksheet.getPhysicalNumberOfRows();

        Object[][] data=new Object[rowCount][8];//Rows=4:Column=2

        for(int i=0;i<rowCount;i++)
        {
            HSSFRow row = worksheet.getRow(i);


            HSSFCell tin = row.getCell(0);

            if(tin==null)
            {
                data[i][0] = "";
            }
            else
            {
                tin.setCellType(CellType.STRING);
                data[i][0] = tin.getStringCellValue();//column X row
            }

            HSSFCell collegiate_number = row.getCell(1);
            if(collegiate_number==null)
            {
                data[i][1] = "";
            }
            else
            {
                collegiate_number.setCellType(CellType.STRING);
                data[i][1] = collegiate_number.getStringCellValue();
            }

            HSSFCell first_name = row.getCell(2);
            if(first_name==null)
            {
                data[i][2] = "";
            }
            else
            {
                first_name.setCellType(CellType.STRING);
                data[i][2] = first_name.getStringCellValue();
            }

            HSSFCell surname1 = row.getCell(3);
            if(surname1==null)
            {
                data[i][3] = "";
            }
            else
            {
                surname1.setCellType(CellType.STRING);
                data[i][3] = surname1.getStringCellValue();
            }

            HSSFCell surname2 = row.getCell(4);
            if(surname2==null)
            {
                data[i][4] = "";
            }
            else
            {
                surname2.setCellType(CellType.STRING);
                data[i][4] = surname2.getStringCellValue();
            }

            HSSFCell address = row.getCell(5);
            if(address==null)
            {
                data[i][5] = "";
            }
            else
            {
                address.setCellType(CellType.STRING);
                data[i][5] = address.getStringCellValue();
            }

            HSSFCell phone_contact = row.getCell(6);
            if(phone_contact==null)
            {
                data[i][6] = "";
            }
            else
            {
                phone_contact.setCellType(CellType.STRING);
                data[i][6] = phone_contact.getStringCellValue();
            }
            HSSFCell login = row.getCell(7);
            if(login==null)
            {
                data[i][7] = "";
            }
            else
            {
                login.setCellType(CellType.STRING);
                data[i][7] = login.getStringCellValue();
            }

        }
        return data;
    }

}
