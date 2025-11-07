package ru.netology.rest;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {

    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("HI")
                .when().log().all()
                .post("/post")
                .then().log().all()
                .statusCode(200)
                .body("data", equalTo("Hello")); // Исправленная проверка
    }
}
