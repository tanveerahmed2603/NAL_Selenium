package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorConcept {
    static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        System.out.println(driver.getTitle());

        //1st way


        //driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");
        //driver.findElement(By.id("input-password")).sendKeys("test123");

        //2nd way

        //WebElement email = driver.findElement(By.id("input-email"));
        //WebElement password = driver.findElement(By.id("input-password"));

        //email.sendKeys("test@gmail.com");
        // password.sendKeys("test123");

        //3rd way
//        By emailLocator = By.id("input-email");
//        By passwordLocator = By.id("input-password");

//        WebElement emailElement = driver.findElement(emailLocator);
//        WebElement passwordElement = driver.findElement(passwordLocator);

//        emailElement.sendKeys("test@gmail.com");
//        passwordElement.sendKeys("test123");



//        getElement(emailLocator).sendKeys("test@gmail.com");
//        getElement(passwordLocator).sendKeys("test123");

        //5Th way --> By locator with generic method (getElement() with action methods)
//        By emailLocator = By.id("input-email");
//        By passwordLocator = By.id("input-password");
//
//        doSendKeys(emailLocator,"test@gmail.com");
//        doSendKeys(passwordLocator,"test123");

        //6th Way
//        By emailLocator = By.id("input-email");
//        By passwordLocator = By.id("input-password");
//
//        ElementUtil elementUtil =new ElementUtil(driver);
//        elementUtil.doSendKeys(emailLocator,"test@gmail.com");
//        elementUtil.doSendKeys(passwordLocator,"test123");

        //driver.findElement(By.id("input-email")).sendKeys("test@gmail.com");

        String emailLocatorValue = "input-email";
        String passwordLocatorValue = "input-password";

        doSendKeys("id",emailLocatorValue, "test@gmail.com" );
        doSendKeys("id",passwordLocatorValue, "test@gmail.com" );


    }

    public static By getByLocator(String locatorType, String locatorValue){
        By locator = null;
        if ("id".equals(locatorType.toLowerCase())) {
            locator = By.id(locatorValue);
        } else {
            System.out.println("Please enter a proper locator type");
        }

        return locator;


    }


    //If use 6th approach then these two method is invalid
    public static WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public  static WebElement getElement(String locatorType, String locatorValue){
        return driver.findElement(getByLocator(locatorType, locatorValue));
    }

    public static void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }

    public static void doSendKeys(String locatorType, String locatorValue, String value) {
        getElement(locatorType,locatorValue).sendKeys(value);
    }


}
