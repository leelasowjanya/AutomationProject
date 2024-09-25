package org.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
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
}
