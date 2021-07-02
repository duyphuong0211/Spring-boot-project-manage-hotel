package com.example.hotel.Service;

import com.example.hotel.model.Users;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
	
	public void save(Users user);
	
	public Users findUser(String username);
	
	public List<Users> FindAllUsers();

}
