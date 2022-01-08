package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class Branch {
    private String name;

    private Commit commit;

    @JsonProperty("protected")
    private Boolean protectedState;

    private BranchProtection protection;

    private String protectionUrl;

}
