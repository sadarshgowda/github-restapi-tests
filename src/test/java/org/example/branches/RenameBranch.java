package org.example.branches;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.restassured.response.Response;
import org.example.util.ApiClient;
import org.example.util.BaseTestCase;
import org.example.util.Constants;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;

public class RenameBranch extends BaseTestCase {

    @Test
    public void renameAndVerifyTheBranchName(){

        JSONObject obj = new JSONObject();
        obj.put("new_name","test");

        String baseUrl = Constants.BASE_URL + Constants.RENAME_BRANCH_ENDPOINT;


        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE)
                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);

        HashMap<String,String> params = new HashMap<>();
        params.put("owner","sadarshgowda");
        params.put("repo","github-restassured-restapi");
        params.put("branch","test1");

        Response response = ApiClient.post(obj,baseUrl,params);

        System.out.println(response.getBody().asString());
    }
}
