package com.educandoweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
