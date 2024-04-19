package com.example.bigstarcollectibles.dto.resource;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductResource extends GenericResource implements Serializable {
    private Integer id;
    private String name;
    private String description;
    private Integer rating;
    private String color;
    private String imagePath;
    private BigDecimal price;
    private CategoryResource category;
    private RobotResource robot;
}
