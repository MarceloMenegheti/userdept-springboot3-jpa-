package com.menegheti.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.menegheti.userdept.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}