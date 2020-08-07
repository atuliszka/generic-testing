package com.testing.ui.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class MainPage extends Page {

    private static final String MAIN_PAGE_TITLE = "JSONPlaceholder";
    private static final String MAIN_PAGE_SUBTITLE = "Fake Online REST API for Testing and Prototyping\nServing ~350M requests per month\nPowered by JSON Server + LowDB";

    private WebDriver driver;

    @FindBy(css = "h1")
    private WebElement mainTitle;

    @FindBy(css = "p[class=subtitle]")
    private WebElement mainSubtitle;

    public MainPage(WebDriver driver) {
        super(driver);
        driver.navigate().to(baseUrl);
    }

    public void assertThatMainTitleIsCorrect() {
        assertThat(mainTitle.getText(), equalTo(MAIN_PAGE_TITLE));
    }

    public void assertThatMainSubtitleIsCorrect() {
        assertThat(mainSubtitle.getText(), equalTo(MAIN_PAGE_SUBTITLE));
    }
}
