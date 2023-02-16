package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsConcept {
    static WebDriver driver;
    // You have to get the count of all the links/images on the page
    //then print the text of each link on the console
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
       //List<WebElement> linkElements = driver.findElements(By.tagName("a"));

       By images = By.tagName("a");
       List<WebElement> linkElements = getElements(images);

        //System.out.println("total links: " + linkElements.size());

//        for(int i=1; i<linkElements.size();i++){
//            String text = linkElements.get(i).getText();
//            if(!text.isEmpty()){
//                System.out.println(text);
//            }
//
//        }

        for (WebElement e: linkElements) {
            String text = e.getText();
            if(!text.isEmpty()){
                System.out.println(text);
            }
        }
    }

    public static List<WebElement> getElements(By locator){
        return driver.findElements(locator);

    }


}
