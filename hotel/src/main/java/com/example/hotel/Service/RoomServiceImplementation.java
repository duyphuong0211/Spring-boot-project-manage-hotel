package com.example.hotel.Service;


import com.example.hotel.model.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.hotel.repository.RoomRepository;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class RoomServiceImplementation implements RoomService {
	
	@Autowired
	private RoomRepository theRoomRepo;

	@Override
	public void saveRoom(Room theRoom) {
		
		theRoomRepo.save(theRoom);
		

	}

	@Override
	public List<Room> getAvailableRooms() {
		
		List<Room> theRoom=theRoomRepo.findAll();
		return theRoom;
	}

	@Override
	public Room getRoom(int RoomNo) {
		
		Optional<Room> result=theRoomRepo.findById(RoomNo);
		
		Room theRoom=null;
		
		if(result.isPresent()) {
			theRoom=result.get();
		}
		else {
			throw new RuntimeException("Room No is not found");
		}
		return theRoom;
	}

}
