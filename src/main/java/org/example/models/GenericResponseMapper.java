package org.example.models;

import lombok.Data;

@Data
public class GenericResponseMapper<T> {
    private Integer statusCode;
    private String message;
    private T response;

}
