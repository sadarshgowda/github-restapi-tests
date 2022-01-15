package org.example.util;

import org.example.models.Branch;
import org.example.models.GenericResponseMapper;
import org.example.models.RenameBranchRequest;
import org.example.models.RenameBranchResponse;

import java.util.List;

public interface GitService {
    GenericResponseMapper<RenameBranchResponse> renameGitBranch(RenameBranchRequest renameBranchRequest) throws Exception;
    GenericResponseMapper<List<Branch>> listBranch() throws Exception;
}
