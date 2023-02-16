package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementDisplayed {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        System.out.println(driver.getTitle());
        ElementUtil eu = new ElementUtil(driver);

        By emailId = By.id("input-email");
//        boolean flag = driver.findElement(emailId).isDisplayed();
//        System.out.println(flag);
        if(eu.doIsDisplayed(emailId)){
            System.out.println("Element is displayed");
        } else {
            System.out.println("Element not found");
        }


    }

}
