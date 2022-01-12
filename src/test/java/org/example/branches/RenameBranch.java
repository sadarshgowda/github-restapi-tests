package org.example.branches;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.restassured.response.Response;
import org.example.models.RenameBranchRequest;
import org.example.util.ApiClient;
import org.example.util.BaseTestCase;
import org.example.util.Constants;
import org.json.JSONObject;
import org.testng.annotations.Test;
import java.util.HashMap;

public class RenameBranch extends BaseTestCase {

    @Test
    public void renameAndVerifyTheBranchName() throws Exception{

        String baseUrl = Constants.BASE_URL + Constants.RENAME_BRANCH_ENDPOINT;

        RenameBranchRequest renameBranchRequest = new RenameBranchRequest();
        renameBranchRequest.setNewName("test1");

        HashMap<String,String> params = new HashMap<>();
        params.put("owner","sadarshgowda");
        params.put("repo","github-restassured-restapi");
        params.put("branch","test");

        Response response = ApiClient.post(renameBranchRequest,baseUrl,params);

        System.out.println(response.getBody().asString());
    }
}
