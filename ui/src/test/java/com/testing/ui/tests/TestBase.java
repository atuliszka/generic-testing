package com.testing.ui.tests;

import com.testing.ui.browser.Browser;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static com.testing.properties.ConfigProperty.*;
import static com.testing.ui.browser.BrowserConfiguration.getWebDriver;

public class TestBase {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = getWebDriver(Browser.valueOf(UI_BROWSER.getString()));
    }

    @AfterEach
    public void shutdown() {
        driver.quit();
    }
}
