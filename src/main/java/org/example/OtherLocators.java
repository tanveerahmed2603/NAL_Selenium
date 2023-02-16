package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OtherLocators {
    public static WebDriver driver;
    public static void main(String[] args) {
        driver = new ChromeDriver();
        //driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
        driver.get("https://www.freshworks.com/");
        System.out.println(driver.getTitle());
        //driver.findElement(By.name("username")).sendKeys("test@gmail.com");
        //driver.findElement(By.name("password")).sendKeys("test123");
//        By emailID = By.name("username");
//        By passwordID = By.name("password");
//
//        ElementUtil eu = new ElementUtil(driver);
//        eu.doSendKeys(emailID, "tanveer@gmail.com");
//        eu.doSendKeys(passwordID, "Test123");

        //className
        //driver.findElement(By.className("form-control")).sendKeys("tanu");

        // xpath --> Not an attribute, its an address of an element inside HTML dom
        // //*[@id="input-email"] --> relative path
        // /html/body/main/div[2]/div/div/form/fieldset[1]/div[4]/div/input  --> absolute path (never use)
        //CSSselector
        //linkedText

        //driver.findElement(By.linkText("Register")).click();
//        By registerLink = By.linkText("Register");
//        doClick(registerLink);

//        ElementUtil eu = new ElementUtil(driver);
//
//        String register = "Register";
//        eu.doClick("linkedText",register);
        ElementUtil eu = new ElementUtil(driver);

        By header = By.tagName("h1");
        if (eu.doGetText(header).contains("Love your software")) {
            System.out.println("h1 headeer is correct");
        } else {
            System.out.println("Incorrect H1");
        }


    }

    public static WebElement getElement(By locator) {
        return driver.findElement(locator);
    }

    public static void doClick(By locator) {
        getElement(locator).click();
    }






}


