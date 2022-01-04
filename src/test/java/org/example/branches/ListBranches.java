package org.example.branches;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.util.ApiClient;
import org.testng.annotations.Test;

import java.util.List;


public class ListBranches {
    @Test
    public void checkIfGivenBranchPresentInResponse(){

        Response response = ApiClient.get("https://api.github.com/repos/sadarshgowda/login-tests/branches");
        System.out.println(response.getBody().asString());

        /*Response respose = RestAssured.given()
                .get("https://api.github.com/repos/sadarshgowda/login-tests/branches")
                .then()
                .extract()
                .response();

        System.out.println(respose.getBody().asString());*/
    }
}
