package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSonMapper {
    ObjectMapper objectMapper = new ObjectMapper();

    public JSonModel[] getModels(String json) throws IOException {
        return objectMapper.readValue(json, JSonModel[].class);
    }
}
