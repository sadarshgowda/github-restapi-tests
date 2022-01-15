package org.example.branches;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.example.impl.GitServiceImpl;
import org.example.models.Branch;
import org.example.models.GenericResponseMapper;
import org.example.util.ApiClient;
import org.example.util.Constants;
import org.example.util.ObjectMapperWrapper;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Properties;


public class ListBranches {
    @Test
    public void checkIfGivenBranchPresentInResponse() throws Exception {

        String input = "main";

        GitServiceImpl gitServiceImpl = new GitServiceImpl();

        GenericResponseMapper<List<Branch>> listBranchResponse = gitServiceImpl.listBranch();

        boolean result = listBranchResponse.getResponse().stream().anyMatch(item -> item.getName().equals(input));

        Assert.assertTrue(result);

    }
}
