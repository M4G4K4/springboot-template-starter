package com.spring.starter;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

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
	void insertUser(){
		given()
				.post("/api/hello")
				.then()
				.statusCode(HttpStatus.OK.value())
				.body("name", equalTo("Pedro"));
	}

}
