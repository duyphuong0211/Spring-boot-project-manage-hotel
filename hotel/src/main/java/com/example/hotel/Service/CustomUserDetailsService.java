package com.example.hotel.Service;


import com.example.hotel.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.hotel.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user=repository.findByUsername(username);
		CustomUserDetails userDetails=null;
		if(user!=null) {
			userDetails=new CustomUserDetails();
			userDetails.setUser(user);
		}
		else {
			throw new UsernameNotFoundException("user not exist with name: "+username);
		}
		return userDetails;
		
	}

}
