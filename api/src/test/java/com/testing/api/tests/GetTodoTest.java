package com.testing.api.tests;

import com.testing.api.jsonplaceholder.TodoClient;
import com.testing.api.jsonplaceholder.model.GetTodoResponse;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class GetTodoTest {

    private Response firstTodoResponse;

    @BeforeAll
    void setUp() {
        this.firstTodoResponse = TodoClient.getTodo(1);
    }

    @Test
    void firstTodoIsAlwaysPresent() {
        assertThat(firstTodoResponse.getStatusCode(), equalTo(HttpStatus.SC_OK));
    }

    @Test
    void firstTodoHasCorrectTitle() {
        GetTodoResponse getTodoResponse = TodoClient.getBody(firstTodoResponse);
        assertThat(getTodoResponse.title, equalTo("delectus aut autem"));
    }
}
