package com.educandoweb.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
