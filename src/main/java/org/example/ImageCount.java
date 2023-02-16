package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ImageCount {
    static WebDriver driver;

    // You have to get the count of all the images on the page
    //then print the text of each link on the console
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        List<WebElement> imageList = driver.findElements(By.tagName("img"));
        System.out.println(imageList.size());

        for(WebElement e: imageList){
          String altValue =  e.getAttribute("alt");
          String srcValue = e.getAttribute("src");
          System.out.println(altValue +"-------->" + srcValue);
        }
    }
}
