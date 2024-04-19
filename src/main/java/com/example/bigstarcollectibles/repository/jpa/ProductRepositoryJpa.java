package com.example.bigstarcollectibles.repository.jpa;

import com.example.bigstarcollectibles.dto.resource.ProductResource;

import java.util.List;

public interface ProductRepositoryJpa {
    List<ProductResource> searchByName(String name);
}
