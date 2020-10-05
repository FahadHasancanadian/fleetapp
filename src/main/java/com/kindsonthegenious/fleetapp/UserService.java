package com.kindsonthegenious.fleetapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kindsonthegenious.fleetapp.model.User;

@Service
public class UserService {
	
    @Autowired private BCryptPasswordEncoder encoder;
	
	@Autowired private UserRepository userRepository;
	
	public void save(User user) {
		
       user.setPassword(encoder.encode(user.getPassword()));
		
		userRepository.save(user);
		
	}
	
	
}
