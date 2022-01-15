package org.example.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.response.Response;
import org.example.util.GitService;
import org.example.models.Branch;
import org.example.models.GenericResponseMapper;
import org.example.models.RenameBranchRequest;
import org.example.models.RenameBranchResponse;
import org.example.util.ApiClient;
import org.example.util.Constants;
import org.example.util.StringUtil;

import java.util.HashMap;
import java.util.List;

public class GitServiceImpl implements GitService {

    @Override
    public GenericResponseMapper<RenameBranchResponse> renameGitBranch(RenameBranchRequest renameBranchRequest) throws Exception {
        HashMap<String,String> params = new HashMap<>();
        params.put("owner","sadarshgowda");
        params.put("repo","github-restassured-restapi");
        params.put("branch","test1");

        String baseUrl = Constants.BASE_URL + Constants.RENAME_BRANCH_ENDPOINT;

        Response response = ApiClient.post(renameBranchRequest,baseUrl,params);

        return StringUtil.toGenericResponse(response, new TypeReference<RenameBranchResponse>() {});

    }

    @Override
    public GenericResponseMapper<List<Branch>> listBranch() throws Exception{
        String baseUrl = Constants.BASE_URL + String.format(Constants.LIST_BRANCHES_ENDPOINT,
                Constants.properties.getProperty("USER_NAME"),Constants.properties.getProperty("REPOSITORY_1"));

        Response response = ApiClient.get(baseUrl);

        return StringUtil.toGenericResponse(response, new TypeReference<List<Branch>>() {});
    }
}
