package com.testing.api.tests;

import com.testing.api.jsonplaceholder.TodoClient;
import com.testing.api.jsonplaceholder.model.Todo;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PostTodoTest {

    private int testUserId = 21;

    @Test
    void validTodoCanBePosted() {
        Todo todo = Todo.getRandomTodo(testUserId);
        Response postTodoResponse = TodoClient.postTodo(todo);
        assertThat(postTodoResponse.getStatusCode(), equalTo(HttpStatus.SC_CREATED));
    }
}
