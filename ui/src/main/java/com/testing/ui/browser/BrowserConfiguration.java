package com.testing.ui.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserConfiguration {

    public static WebDriver getWebDriver(Browser browser) {
        switch (browser) {
            case CHROME:
                return getChromeDriver();
            case FIREFOX:
                return getFirefoxDriver();
            case EDGE:
                return getEdgeDriver();

            default:
                throw new RuntimeException("Browser type not supported: " + browser.name());
        }
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", "..//chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("test -type");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("disable-extension");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--ignore-certificate-errors");
        chromeOptions.addArguments("--disable-popup-blocking");
        chromeOptions.addArguments("disable-infobars");
        return new ChromeDriver(chromeOptions);
    }

    private static WebDriver getFirefoxDriver() {
        return null;
    }

    private static WebDriver getEdgeDriver() {
        return null;
    }
}
