package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class LinksTextUtil {
        static WebDriver driver;
        // You have to get the count of all the links/images on the page
        //Then Return a listK<String> ---> this will hold the text of each link
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://www.amazon.com");
            //List<WebElement> linkElements = driver.findElements(By.tagName("a"));
            ElementUtil eu = new ElementUtil(driver);
            By links = By.tagName("a");
            System.out.println(eu.getElementsCount(links));

            List<String> actList = eu.getElementsTextList(links);
            for(String e: actList){
                System.out.println(e);
            }
    }

}
