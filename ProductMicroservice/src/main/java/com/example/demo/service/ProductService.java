package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repo.ProductRepository;

@Service
public class ProductService {
 
	@Autowired
	private ProductRepository productRepository;

	public Product productDetail(Product product) {
		// TODO Auto-generated method stub
		Product saveProduct = productRepository.save(product) ;
		return saveProduct;
	}
}
