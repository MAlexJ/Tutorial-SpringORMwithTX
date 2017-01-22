package com.malex.repository.impl;

import com.malex.repository.ProductDao;
import com.malex.model.Product;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProductDaoImpl implements ProductDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void persist(Product product) {
        em.persist(product);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return em.createQuery("SELECT p FROM Product p").getResultList();
    }

}
