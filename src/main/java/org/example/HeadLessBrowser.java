package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessBrowser {
    public static void main(String[] args) {

        /**
         * Headless means no browser lauch/Hidden browser
         * Test is happening behind the scene
         * fast
         */
        WebDriverManager.chromedriver().setup();

        ChromeOptions  co = new ChromeOptions();
        //co.addArguments("--headless");
        co.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(co);

        driver.get("https://www.cricinfo.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

    }
}
