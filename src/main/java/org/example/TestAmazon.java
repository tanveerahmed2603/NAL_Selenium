package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAmazon {
    public static void main(String[] args) {


        BrowseUtil bu = new BrowseUtil();
        bu.openBrowser("chrome");
        bu.getUrl("https://www.google.com");
        String currentUrl = bu.getCurrentUrl();
        System.out.println(currentUrl);
        String pageTitle = bu.getTitle();
        System.out.println(pageTitle);
        bu.closeBrowser();
    }
}
