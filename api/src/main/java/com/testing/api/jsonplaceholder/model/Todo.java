package com.testing.api.jsonplaceholder.model;

import lombok.Builder;
import org.apache.commons.lang3.RandomStringUtils;

@Builder
public class Todo {
    private String title;
    private String body;
    private int userId;

    public static Todo getRandomTodo(int userId) {
        return Todo.builder()
                .body(RandomStringUtils.random(100, true, true))
                .title(RandomStringUtils.random(10, true, true))
                .userId(userId)
                .build();
    }
}
