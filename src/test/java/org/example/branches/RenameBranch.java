package org.example.branches;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.restassured.response.Response;
import org.example.impl.GitServiceImpl;
import org.example.models.GenericResponseMapper;
import org.example.models.RenameBranchRequest;
import org.example.models.RenameBranchResponse;
import org.example.util.ApiClient;
import org.example.util.BaseTestCase;
import org.example.util.Constants;
import org.example.util.ObjectMapperWrapper;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;

public class RenameBranch extends BaseTestCase {

    @Test
    public void renameAndVerifyTheBranchName() throws Exception{

        GitServiceImpl gitServiceImpl = new GitServiceImpl();

        RenameBranchRequest renameBranchRequest = new RenameBranchRequest();
        renameBranchRequest.setNewName(Constants.RENAME_BRANCH_NAME);

        GenericResponseMapper<RenameBranchResponse> renameBranchResponse = gitServiceImpl.renameGitBranch(renameBranchRequest);
        System.out.println(renameBranchResponse.getResponse().getName());

    }
}
