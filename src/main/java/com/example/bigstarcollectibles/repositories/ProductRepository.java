package com.example.bigstarcollectibles.repositories;

import com.example.bigstarcollectibles.beans.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE %:searchString%")
    List<Product> searchByName(@Param("searchString") String keyword);
}
