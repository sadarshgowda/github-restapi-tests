package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RenameBranchRequest {

    @JsonProperty("new_name")
    private String newName;
}
