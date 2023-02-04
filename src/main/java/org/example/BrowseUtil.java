package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowseUtil {
    WebDriver driver;

    /**
     * This method will take a String browser and do a validation
     * @param browser
     * @return
     */
    public WebDriver openBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            return driver = new ChromeDriver();
        }
        if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            return driver = new FirefoxDriver();
        }
        if (browser.equalsIgnoreCase("safari")) {
            WebDriverManager.safaridriver().setup();
            return driver = new SafariDriver();
        }
        return driver;
    }

    /**
     * This method will return the url of the page
     * @param url
     */
    public void getUrl(String url){
        if(url == null){
            System.out.println("Url is null");
        } else if(url.indexOf("http") == -1){  // -1 means string no value is present
            System.out.println("http is missing");
        }
        driver.get(url);
    }

    /**
     * This method will call the get print the title of the page
     */
    public String getTitle(){
       return driver.getTitle();

    }

    /**
     * This method should print the current url of the page
     */
    public String getCurrentUrl(){
        return driver.getCurrentUrl();

    }

    /**
     * This mehtod will call the close method and close the browser
     */
    public void closeBrowser(){
         driver.close();
    }

    /**
     * This method will quit the browser
     */
    public void quitBrowser(){
        driver.quit();
    }
}
