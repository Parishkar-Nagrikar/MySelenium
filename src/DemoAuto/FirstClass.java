package DemoAuto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by p-star on 4/2/2017.
 */

public class FirstClass
{
    public static void main(String[] args) throws InterruptedException
    {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

       //launch the browser
        WebDriver driver = new ChromeDriver();
         driver = new ChromeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //Goto URl
        String url="https://www.google.co.in";
        driver.get(url);

        //print page title
        String title= driver.getTitle();
        System.out.println("get Title = " + title);

        //print current APPLICATION_URL in the browser
        String cUrl=driver.getCurrentUrl();
        System.out.println("get CurrentUrl = "+cUrl);

        //print Page Source
        //String src=driver.getPageSource();
        //System.out.println(src);


        String newUrl="http://scriptinglogic.com/";
        driver.navigate().to(newUrl);

        driver.get(url);
       // driver.navigate().to(url);

        //one sec sleep time
        Thread.sleep(10000);

        driver.navigate().refresh();

        //Close the browser
       // driver.close();

        Thread.sleep(1000);

        driver.quit();
    }
}
