package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class ImagesUtil {
    static WebDriver driver;

    // You have to get the count of all the images on the page
    //then Capture the src/alt of each image on the console
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        ElementUtil eu = new ElementUtil(driver);
        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println(imageList.size());
        By images = By.tagName("img");
        List<String> attributeList = eu.getAttributeList(images, "src");
        List<String> attributeList2 = eu.getAttributeList(images, "alt");
        eu.printElementList(attributeList);
        eu.printElementList(attributeList2);


    }

}
