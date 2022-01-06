package org.example.util;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.HashMap;
import java.util.Map;

public class ApiClient {

    public static Response get(String url, Map<String,String> queryParams, Map<String,String> headers){
        RequestSpecification requestSpecification = RestAssured.given();

        if (headers != null && !headers.isEmpty()) {
            requestSpecification.headers(headers);
        }

        if(queryParams != null && !queryParams.isEmpty()){
            requestSpecification.queryParams(queryParams);
        }

        io.restassured.response.Response response = requestSpecification
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
