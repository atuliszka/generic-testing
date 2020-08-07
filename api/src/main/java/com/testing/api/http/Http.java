package com.testing.api.http;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static com.testing.properties.ConfigProperty.*;
import static io.restassured.RestAssured.given;

public class Http {

    public static RequestSpecification request() {
        return given().log().uri().spec(new RequestSpecBuilder().build()).baseUri(API_BASE_URL.getString());
    }
}
