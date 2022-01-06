package com.educandoweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
