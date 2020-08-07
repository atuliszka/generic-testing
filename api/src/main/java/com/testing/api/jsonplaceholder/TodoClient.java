package com.testing.api.jsonplaceholder;

import com.testing.api.http.Http;
import com.testing.api.jsonplaceholder.model.GetTodoResponse;
import com.testing.api.jsonplaceholder.model.Todo;
import io.restassured.response.Response;

public class TodoClient {

    private static final String TODOS_PATH = "/todos/";
    private static final String CONTENT_TYPE = "application/json; charset=UTF-8";

    public static Response getTodo(int todoId) {
        return Http.request().pathParam("todo", todoId).get(TODOS_PATH + "{todo}");
    }

    public static Response postTodo(Todo todo) {
        return Http.request().contentType(CONTENT_TYPE).body(todo).post(TODOS_PATH);
    }

    public static GetTodoResponse getBody(Response getTodoResponse) {
        return getTodoResponse.as(GetTodoResponse.class);
    }
}
