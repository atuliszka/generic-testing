package com.testing.ui.tests;

import com.testing.ui.model.MainPage;
import org.junit.jupiter.api.Test;

public class MainPageTests extends TestBase {

    @Test
    void mainPageContainsCorrectMainTitle() {
        MainPage mainPage = new MainPage(driver);
        mainPage.assertThatMainTitleIsCorrect();
    }

    @Test
    void mainPageContainsCorrectSubtitle() {
        MainPage mainPage = new MainPage(driver);
        mainPage.assertThatMainSubtitleIsCorrect();
    }
}
