package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,String> {
    Product findByIdAndName(String id, String name);

}
