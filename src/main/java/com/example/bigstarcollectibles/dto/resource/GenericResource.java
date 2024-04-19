package com.example.bigstarcollectibles.dto.resource;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GenericResource {
    private Integer code;
    private String message;

    public GenericResource() {}

    public GenericResource(String message, Integer code) {
        this.message = message;
        this.code = code;
    }
}
