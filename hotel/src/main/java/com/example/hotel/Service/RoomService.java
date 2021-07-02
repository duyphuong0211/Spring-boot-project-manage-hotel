package com.example.hotel.Service;


import com.example.hotel.model.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
	
	public void saveRoom(Room theRoom);
	
	public List<Room> getAvailableRooms();
	
	public Room getRoom(int RoomNo);

}
