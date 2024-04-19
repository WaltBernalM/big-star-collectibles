package com.example.bigstarcollectibles.dto.request;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductRequest {
    @NotNull String name;
}
