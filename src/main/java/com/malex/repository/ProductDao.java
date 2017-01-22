package com.malex.repository;

import com.malex.model.Product;

import java.util.List;

/**
 * DAO Interface
 *
 * @author malex
 */
public interface ProductDao {

    void persist(Product product);

    List<Product> findAll();
}
