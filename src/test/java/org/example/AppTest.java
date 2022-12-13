package org.example;

import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
//    @Test
//    public void requestUsZipCode90210_checkContentType_expectApplicationJson() {
//        given().
//                when().
//                get("http://zippopotam.us/AR/1601").
//                then().
//                assertThat().
//                contentType(ContentType.JSON);
//    }

    @Test
    public void requestUsZipCode90210_logRequestAndResponseDetails() {
        given().
                log().all().
                when().
                get("http://zippopotam.us/AR/1601").
                then().
                log().body();
    }
}