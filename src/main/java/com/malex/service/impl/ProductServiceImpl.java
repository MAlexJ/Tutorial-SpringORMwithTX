package com.malex.service.impl;

import com.malex.repository.ProductDao;
import com.malex.model.Product;

import java.util.Collection;
import java.util.List;

import com.malex.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public void add(Product product) {
        productDao.persist(product);
    }

    @Override
    public void addAll(Collection<Product> products) {
        for (Product product : products) {
            productDao.persist(product);
        }
    }

    @Override
    public List<Product> listAll() {
        return productDao.findAll();

    }

}
