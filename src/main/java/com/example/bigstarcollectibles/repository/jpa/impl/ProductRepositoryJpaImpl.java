package com.example.bigstarcollectibles.repository.jpa.impl;

import com.example.bigstarcollectibles.domain.Product;
import com.example.bigstarcollectibles.dto.resource.ProductResource;
import com.example.bigstarcollectibles.repository.jpa.ProductRepositoryJpa;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryJpaImpl extends RepositoryAdapter<Product> implements ProductRepositoryJpa {
    @Override
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        super.setEntityManager(entityManager);
    }

    @Override
    public List<ProductResource> searchByName(String name) {
        CriteriaBuilder criteriaBuilder = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<ProductResource> criteriaQuery = criteriaBuilder.createQuery(ProductResource.class);

        Root<Product> productRoot = criteriaQuery.from(Product.class);

        List<Predicate> predicates = new ArrayList<>(0);

//        predicates.add(criteriaBuilder.like(productRoot.get(Product_.name), name));

        return null;
    }
}
