package com.example.bigstarcollectibles.repository;

import com.example.bigstarcollectibles.domain.Product;
import com.example.bigstarcollectibles.repository.jpa.ProductRepositoryJpa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.validation.annotation.Validated;

@Validated
public interface ProductRepository extends JpaRepository<Product, Integer>, ProductRepositoryJpa {
}

