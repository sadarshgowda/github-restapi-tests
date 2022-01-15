package org.example.util;

import com.fasterxml.jackson.core.type.TypeReference;
import io.restassured.response.Response;
import org.example.models.GenericResponseMapper;

public class StringUtil {
    public static <T>  GenericResponseMapper<T> toGenericResponse(Response response, TypeReference<T> type) throws Exception{
        T t = null ;
        String message = null;
        int statusCode = response.statusCode();
        t = ObjectMapperWrapper.getMapper().readValue(response.asString(),type);

        GenericResponseMapper<T> genericResponseMapper = new GenericResponseMapper<>();
        genericResponseMapper.setMessage(message);
        genericResponseMapper.setStatusCode(statusCode);
        genericResponseMapper.setResponse(t);

        return genericResponseMapper;

    }
}
