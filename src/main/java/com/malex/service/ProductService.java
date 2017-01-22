package com.malex.service;

import com.malex.model.Product;

import java.util.Collection;
import java.util.List;

/**
 * @author malex
 */
public interface ProductService {

    void add(Product product);

    void addAll(Collection<Product> products);

    List<Product> listAll();
}
