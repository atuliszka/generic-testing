package com.testing.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public enum ConfigProperty {
    API_BASE_URL("api.base.url"),
    UI_BASE_URL("ui.base.url"),
    UI_BROWSER("ui.browser");

    private static ResourceBundle properties;

    private String value;

    ConfigProperty(String value) {
        getProperties();
        this.value = value;
    }

    public String getString() {
        return Objects.nonNull(System.getProperty(value)) ? System.getProperty(value) : properties.getString(value);
    }

    private static void getProperties() {
        try {
            FileInputStream fis = new FileInputStream("..\\application.properties");
            properties = new PropertyResourceBundle(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
