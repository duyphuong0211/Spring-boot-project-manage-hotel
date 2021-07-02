package com.example.hotel.repository;


import com.example.hotel.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {

	Users findByUsername(String username);
	
	

}
