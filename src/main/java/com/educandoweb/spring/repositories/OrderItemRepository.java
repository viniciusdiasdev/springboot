package com.educandoweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	

}
