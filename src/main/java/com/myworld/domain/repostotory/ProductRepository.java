package com.myworld.domain.repostotory;

import org.springframework.data.repository.CrudRepository;

import com.myworld.domain.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
