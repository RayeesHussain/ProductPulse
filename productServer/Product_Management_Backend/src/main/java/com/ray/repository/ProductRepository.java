package com.ray.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ray.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{
	

}
