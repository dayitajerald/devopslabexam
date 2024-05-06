package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
    @Autowired
    private ProductRepo repo;
    
    public Product checkProd(String id, String name){
        Product item = repo.findByIdAndName(id, name);
        return item;
    }

    public void addProd(String id, String name){
        Product item = new Product();
        item.setId(id);
        item.setName(name);
        repo.save(item);
    }

}
