package org.selenium.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    //************************Constructor************************************
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //************************PageVariables************************************
    String URL = "https://www.legion-it.academy/";
    //************************WebElements************************************
    @FindBy(how = How.XPATH, using = "//*[contains(text(), 'LEGION IT ACADEMY')]")
    public WebElement legionTitle;


    @FindBy(xpath = "//*[text()='All Courses']")
    public WebElement courseButton;

    //************************PageMethods************************************
    public HomePage givenIAmaHomePage() {
        driver.get(URL);
        return this;
    }
    public HomePage verifyHomePageIsLoaded(){
        Assertions.assertTrue(legionTitle.isDisplayed());
        return this;
    }
    public CoursesPage whenIClickCourseTab(){
        courseButton.click();
        return new PageGenerator(driver).getPage(CoursesPage.class);
    }

}

