package org.example.models;

import lombok.Data;

import java.util.List;

@Data
public   class RequiresStatusCheck {
    private List<String> contexts;
    private String enforcementLevel;
}
