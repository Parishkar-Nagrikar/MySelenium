package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by p-star on 4/23/2017.
 */
public class BrowseFrom
{

    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();

        //GoTo URL
       driver.get("http://softwaretesting-guru.blogspot.in/p/blog-page.html");

        driver.findElement(By.name("datafile"));

     //   element.sendKeys("C:\Users\Easy\Desktop\testfile.txt");


        System.out.println("Program completed");
    }


}
