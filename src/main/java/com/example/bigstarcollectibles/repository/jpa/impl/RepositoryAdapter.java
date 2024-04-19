package com.example.bigstarcollectibles.repository.jpa.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;

public class RepositoryAdapter<T extends Serializable> {

    private Class<T> domainClass;
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public RepositoryAdapter() {
        if (getClass().getGenericSuperclass() instanceof Class) {
            this.domainClass = (Class<T>) getClass().getGenericSuperclass();
        } else if (getClass().getGenericSuperclass() instanceof ParameterizedType) {
            this.domainClass = (Class<T>) ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        }
    }

    public Class<T> getDomainClass() {
        return domainClass;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Session getSession() {
        Session session = entityManager.unwrap(Session.class);
        return session;
    }

    public DetachedCriteria getHibernateDetachedCriteria() {
        return DetachedCriteria.forClass(getDomainClass());
    }
}
