package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by P-star on 6/10/2017.
 */
public class NewFirst
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");

        WebDriver driver=new ChromeDriver();

    }
}