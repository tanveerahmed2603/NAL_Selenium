package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.example.FindElementsConcept.getElements;


public class ElementUtil {
    private final WebDriver driver;

    public ElementUtil(WebDriver driver) {
        this.driver = driver;
    }

    public By getByLocator(String locatorType, String locatorValue){
        By locator = null;
        switch (locatorType.toLowerCase()){
            case "id" :
                locator = By.id(locatorValue);
                break;
            case "name" :
                locator = By.name(locatorValue);
                break;
            case "classname" :
                locator = By.className(locatorValue);
                break;
            case "xpath" :
                locator = By.xpath(locatorValue);
                break;
            case "cssselector" :
                locator = By.cssSelector(locatorValue);
                break;
            case "linkedtext" :
                locator = By.linkText(locatorValue);
                break;
            case "partiallinkedtext" :
                locator = By.partialLinkText(locatorValue);
                break;
            case "tagname" :
                locator = By.tagName(locatorValue);
                break;
            default:
                System.out.println("Please enter the right locator type");
                break;

        }

        return locator;

    }

    public  WebElement getElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> getElements(By locator){
        return driver.findElements(locator);
    }
    public  WebElement getElement(String locatorType, String locatorValue){
        return driver.findElement(getByLocator(locatorType, locatorValue));
    }

    public void doSendKeys(By locator, String value) {
        getElement(locator).sendKeys(value);
    }
    public  void doSendKeys(String locatorType, String locatorValue, String value) {
        getElement(locatorType,locatorValue).sendKeys(value);
    }

    public  void doClick(By locator) {
        getElement(locator).click();
    }

    public  void doClick(String locatorType, String locatorValue) {
        getElement(locatorType,locatorValue).click();
    }
    public  String doGetText(By locator) {
        return getElement(locator).getText();
    }
    public boolean doIsDisplayed(By locator){
        return getElement(locator).isDisplayed();
    }

    public List<String> getElementsTextList(By locator){
        List<WebElement> elementList = getElements(locator);
        List<String> elementTextList = new ArrayList<String>();

        for(WebElement e: elementList){
            String elementText = e.getText();
            if(!elementText.isEmpty()){
                elementTextList.add(elementText);
            }
        }
        return elementTextList;
    }

    public void printElementList(List<String> elementList){
        for(String e: elementList){
            System.out.println(e);
        }
    }

    public List<String> getAttributeList(By locator, String attributeName){
        List<WebElement> elementList = getElements(locator);
        List<String> attributeList = new ArrayList<>();

        for( WebElement e: elementList){
            String attributeValue =  e.getAttribute(attributeName);
            attributeList.add(attributeValue);

        }
        return attributeList;

    }

    public int getElementsCount(By locator){
        return getElements(locator).size();
    }

}
