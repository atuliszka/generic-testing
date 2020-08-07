package com.testing.ui.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import static com.testing.properties.ConfigProperty.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Page {
    public WebDriver driver;
    public String baseUrl;
    private Wait<WebDriver> wait;

    private static final Duration TIMEOUT = Duration.ofSeconds(10);
    private static final Duration POLLING = Duration.ofSeconds(2);

    public Page (WebDriver driver) {
        this.driver = driver;
        this.baseUrl = UI_BASE_URL.getString();
        this.wait = new FluentWait<>(driver)
                .withTimeout(TIMEOUT)
                .pollingEvery(POLLING)
                .ignoring(NoSuchElementException.class);
        PageFactory.initElements(driver, this);
    }

    public void waitForElementToDisplay(WebElement element) {
        wait.until((ExpectedCondition<Boolean>) elem -> element.isDisplayed());
    }

    public static void assertIsDisplayed(WebElement element) {
        assertThat(element.isDisplayed(), is(true));
    }
}
