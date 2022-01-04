package org.example.util;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class ApiClient {

    public static Response get(String url, Map<String,String> queryParams, Map<String,String> headers){
        io.restassured.response.Response response = RestAssured.given()
                .headers(headers)
                .queryParams(queryParams)
                .get(url)
                .then()
                .extract()
                .response();

        return response;
    }

    public static Response get(String url){
        return get(url,null,null);
    }

    public static Response get(String url, Map<String,String> queryParams){
        return get(url,queryParams,null);
    }
}
