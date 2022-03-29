package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
