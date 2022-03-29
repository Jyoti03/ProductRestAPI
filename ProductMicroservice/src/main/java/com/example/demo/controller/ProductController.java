package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@RestController
//@RequestMapping("/product")
public class ProductController {

		@Autowired
	        private ProductService productService;
		
		
		@PostMapping("/create")
		public Product createProduct(@RequestBody Product product)
		{
			return productService.productDetail(product);
		}
		
		//http://localhost:8081/create
}
