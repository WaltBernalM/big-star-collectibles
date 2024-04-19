package com.example.bigstarcollectibles.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
public class Product {
    @Id private Integer id;
    private String name;
    private String description;
    private String color;
    private String imagePath;
    private BigDecimal rating;
    private BigDecimal price;
    private Integer reviewsCount;
    private Integer categoryId;
    private Integer robotId;
}