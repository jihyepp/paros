package com.wisdom.paros.global;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;

@SpringBootTest
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public abstract class SpringBootTestSupport {
    @Autowired protected EntityManagerFactory entityManagerFactory;
    protected EntityManager entityManager;
    protected EntityTransaction transaction;

    @PostConstruct
    public void init() {
        this.entityManager = entityManagerFactory.createEntityManager();
        this.transaction = entityManager.getTransaction();
    }

    protected <T> T save(T entity) {
        transaction.begin();
        try {
            entityManager.persist(entity);
            entityManager.flush();
            transaction.commit();
            entityManager.clear();

        } catch (Exception e) {
            transaction.rollback();
        }

        return entity;
    }
}
