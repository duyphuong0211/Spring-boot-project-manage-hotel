package com.example.hotel.Service;

import com.example.hotel.model.Users;
import com.example.hotel.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImplementation implements UserService {

	private UserRepository theUserRepo;
	
	public UserServiceImplementation(UserRepository UserRepo) {
		theUserRepo=UserRepo;
	}
	@Override
	public void save(Users user) {
		theUserRepo.save(user);
		
	}
	@Override
	public Users findUser(String username) {
		Users theUser=theUserRepo.findByUsername(username);
		return theUser;
	}
	@Override
	public List<Users> FindAllUsers() {
		
		return theUserRepo.findAll();
	}

}
