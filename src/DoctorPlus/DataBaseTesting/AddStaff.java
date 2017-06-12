package DoctorPlus.DataBaseTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * Created by P-star on 5/9/2017.
 */
public class AddStaff
{
    @Test
    public void AddStaff_()throws ClassNotFoundException,SQLException
    {
        String tin="1211";
        String collegiate_number="1212";
        String first_name="Rp";
        String surname1="n";
        String surname2="R";
        String address="pune";
        String phone_contact="321";
        String login="pnr1234";

        ArrayList<String> expected = new ArrayList<>();
        expected.add(tin);
        expected.add(collegiate_number);
        expected.add(first_name);
        expected.add(surname1);
        expected.add(surname2);
        expected.add(address);
        expected.add(phone_contact);
        expected.add(login);

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

        //JDBC connection
        Class.forName("com.mysql.jdbc.Driver");

        //creating Connection
        String url="jdbc:mysql://localhost:3306/openclinic";
        String uNAme="root";
        String password="";
        Connection con= DriverManager.getConnection(url, uNAme, password);

        //Creating Stratment
        Statement st=con.createStatement();

        //Creating Query
        String sqlSelect="select * from staff_tbl where login='"+login+"'";

        ResultSet rs=st.executeQuery(sqlSelect);

        ArrayList<String> actual=new ArrayList<>();

        while (rs.next())
        {
            actual.add(rs.getString("nif"));
            actual.add(rs.getString("collegiate_number"));
            actual.add(rs.getString("first_name"));
            actual.add(rs.getString("surname1"));
            actual.add(rs.getString("surname2"));
            actual.add(rs.getString("address"));
            actual.add(rs.getString("phone_contact"));
            actual.add(rs.getString("login"));
        }
/*
        expected.add(tin);
        expected.add(collegiate_number);
        expected.add(first_name);
        expected.add(surname1);
        expected.add(surname2);
        expected.add(address);
        expected.add(phone_contact);
        expected.add(login);
*/
        Assert.assertEquals(actual,expected);
 }
}
