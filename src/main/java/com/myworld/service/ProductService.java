package com.myworld.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myworld.domain.Product;
import com.myworld.domain.repostotory.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	
	public List<Product>allProduct()
	{
		return (List<Product>) productRepository.findAll();
		
	}
	
	public Product saveProduct(Product product)
	{
		return productRepository.save(product);
	}

}
