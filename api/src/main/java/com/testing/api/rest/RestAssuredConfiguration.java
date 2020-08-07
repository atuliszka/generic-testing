package com.testing.api.rest;

import io.restassured.RestAssured;
import io.restassured.parsing.Parser;

public class RestAssuredConfiguration {

    public static void init () {
        RestAssured.defaultParser = Parser.JSON;
    }
}
