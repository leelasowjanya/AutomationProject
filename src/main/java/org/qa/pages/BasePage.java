package org.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected JavascriptExecutor javascriptExecutor;

    public BasePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        actions = new Actions(driver);
    }

    protected void elementToBeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    protected void click(String xpath){
        driver.findElement(By.xpath(xpath)).click();
    }
    protected void waitForFewSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
    /*
    this method helps to scroll to the element which is already available in DOM
     */
    protected void moveToTheElement(WebElement element){
        try {
            //actions.moveToElement(element).click().perform();
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        } catch (Exception e) {
            e.getMessage();
            throw new RuntimeException(e);
        }
    }
    /*
    to click on the elements using Java Script executor
     */
    protected void clickUsingJavaScript(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
    /*
        this method helps to scroll to the element which are not loaded in the DOM until it displays
     */
    protected void scrollToTheElement(WebElement element){
        boolean elementNotVisible = true;
        while (elementNotVisible){
            try{
                element.isDisplayed();
                elementNotVisible = false;
            }catch (Exception e){
                ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500);");
            }
        }
    }
}
