package org.example.branches;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.util.ApiClient;
import org.example.util.Constants;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Properties;


public class ListBranches {
    @Test
    public void checkIfGivenBranchPresentInResponse(){

        String baseUrl = Constants.BASE_URL + String.format(Constants.LIST_BRANCHES_ENDPOINT,
                Constants.properties.getProperty("USER_NAME"),Constants.properties.getProperty("REPOSITORY_1"));

        System.out.println(baseUrl);

        Response response = ApiClient.get(baseUrl);
        System.out.println(response.getBody().asString());
    }
}
