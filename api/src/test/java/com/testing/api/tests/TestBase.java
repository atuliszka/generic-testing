package com.testing.api.tests;

import com.testing.api.rest.RestAssuredConfiguration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    static void setUp() {
        RestAssuredConfiguration.init();
    }
}
