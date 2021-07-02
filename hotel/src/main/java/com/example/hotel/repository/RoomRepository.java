package com.example.hotel.repository;


import com.example.hotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	@Query(" select u from Room u where u.bookedStatus=false") 
	public List<Room> findAll();
}
