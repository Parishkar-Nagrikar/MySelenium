import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by p-star on 4/6/2017.
 */
public class SecondClass
{
    public static void main(String[] args)
    {

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
      //  System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");


        WebDriver driver =new FirefoxDriver();



        driver.get("http://scriptinglogic.com/selenium/selenium-basic-methods/");


        System.out.println("Program completed");
    }
}
