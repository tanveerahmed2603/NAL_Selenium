package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebdriverBasic {
    static WebDriver driver;
    public static void main(String[] args) {

        String browser = "safari";

        if(browser.equalsIgnoreCase("chrome")){
            driver = new ChromeDriver();
        } else if(browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if(browser.equalsIgnoreCase("safari")){
            driver = new SafariDriver();
        }

        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        //validation

        if(driver.getTitle().equalsIgnoreCase("google")){
            System.out.println("correct title passed");
        }else {
            System.out.println("Incorrect title");
        }

        driver.close();
    }
}

