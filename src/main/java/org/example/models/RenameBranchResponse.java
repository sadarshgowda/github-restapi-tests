package org.example.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class RenameBranchResponse {
    private String name;
}
