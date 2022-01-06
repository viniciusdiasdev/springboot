package com.educandoweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
