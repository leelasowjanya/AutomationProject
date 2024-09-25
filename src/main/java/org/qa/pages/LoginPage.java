package org.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.qa.constants.Constants;
import org.testng.Assert;

public class LoginPage  extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//a[(@class='zgh-login' and text()='Sign In')]")
    public  WebElement signInButton;
    @FindBy(id = "login_id")
    public  WebElement userId;
    @FindBy(id = "nextbtn")
    public  WebElement nextButton;
    @FindBy(id = "password")
    public  WebElement password;
    @FindBy(xpath = "//span[@id='acntIcn']//parent::div")
    public  WebElement profileIcon;
    @FindBy(xpath = "//*[@data-zcqa='profilePicture_signOut']")
    public  WebElement signOutButton;

    public void goToZohoPage(){
        driver.navigate().to(Constants.zoho_url);
    }
    public void clickOnSignIn(){
        signInButton.click();
        elementToBeVisible(userId);
        Assert.assertTrue(userId.isDisplayed());
    }
    public void loginToZoho(String userName, String passWord){
        userId.sendKeys(userName);
        nextButton.click();
        elementToBeVisible(password);
        password.sendKeys(passWord);
        nextButton.click();
    }
    public void logOutFromZoho(){
        elementToBeVisible(profileIcon);
        profileIcon.click();
        elementToBeVisible(signOutButton);
        signOutButton.click();
    }
}
