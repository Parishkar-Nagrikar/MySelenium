package com11.parish.selenium.play;

import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExecuteService {

    public static void executeTest(String browserName , Application application) {
        System.out.println("Start execute () .. ");

        Browser browser = new Browser(browserName);
        List<Page> pages = application.getPages();

        for (Page page : pages) {

            List<LinkText> links = page.getLinkTexts();

            browser.maximizeWindow();
            browser.gotoUrl(application.getUrl());

            browser.waitForDefaultTime();

            for (LinkText link : links) {

                browser.clickByLinkText(link.getName());

                browser.waitForDefaultTime();

                Set<Map.Entry<String, String>> entrySet = link.getElements().entrySet();

                for (Map.Entry element : entrySet) {

                }

                browser.sendKey("Name", "Selenium");

                browser.clickByName("subscribe");

                browser.sendKey("comments" , "WelCome  to Selenium Training");

                new Select(browser.findElementByName("countries")).selectByVisibleText("Argentina");

                browser.clickByPath("(//input[@name='rating'])[3]");

            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Exit.. execute() ");
    }
}
