package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
    public static void main(String[] args) throws InterruptedException {
        BrowseUtil bu = new BrowseUtil();
        WebDriver driver = bu.openBrowser("chrome");
        bu.getUrl("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        String title = bu.getTitle();
        System.out.println(title);
        bu.getCurrentUrl();

        By firstName = By.id("input-firstname");
        By lastName = By.id("input-lastname");
        By email = By.id("input-email");

        ElementUtil elementUtil = new ElementUtil(driver);
        elementUtil.doSendKeys(firstName,"Tanveer");
        elementUtil.doSendKeys(lastName,"Ahmed");
        elementUtil.doSendKeys(email,"Ahmed2603tanveer@gmail.com");

        Thread.sleep(5000);

        bu.closeBrowser();
    }
}
