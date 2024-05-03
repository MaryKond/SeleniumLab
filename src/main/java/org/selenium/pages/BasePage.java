package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage extends PageGenerator{
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        super(driver);
        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
    }
    void clickElement (WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable((By)element)).click();
    }
    public WebElement waitForElement(WebElement element){
        return wait.until(ExpectedConditions.visibilityOf(element));

    }
}
