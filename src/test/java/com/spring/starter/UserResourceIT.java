package com.spring.starter;

import com.spring.starter.model.dto.UserCreate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest
class UserResourceIT {

    @Test
    void getUser() {
        given()
                .get("/trip/list-yellow")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("name", equalTo("Pedro"));
    }

    @Test
    void createUser() {
        given()
                .body(UserCreate.builder()
                        .age(25)
                        .name("Pedro")
                        .build())
                .post("/user")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("name", equalTo("Pedro"),
                        "age", equalTo(25));
    }

}
