package com.videogame;

import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class VideoGameAPITest {
    
    @Test
    public void test_getAllVideoGames() {
        Response response = given().when().get("http://localhost:8080/app/videogames");
        response.then().statusCode(200);
        System.out.println(response.asPrettyString());
        JsonSchemaValidator.matchesJsonSchemaInClasspath("GetAllVideoGames.json");
    }
}