package org.example.util;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.util.Map;

public class ApiClient extends BaseTestCase {

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


    public static Response post(Object requestBody,String url, Map<String,String> pathParameter){

        RequestSpecification requestSpecification = RestAssured.given();


        if (BaseTestCase.headers() != null && !BaseTestCase.headers().isEmpty()) {
            requestSpecification.headers(BaseTestCase.headers());
        }

        if(pathParameter != null && !pathParameter.isEmpty()){
            requestSpecification.pathParams(pathParameter);
        }

        io.restassured.response.Response response = requestSpecification
                .body(requestBody)
                .log().all()
                .post(url)
                .then()
                .extract()
                .response();

        return response;

    }
}
