package org.example.models;

import lombok.Data;

@Data
public   class RequiresStatusCheck {
    private String[] contexts;
    private String enforcementLevel;
}
