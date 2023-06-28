package com.ashesh45.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashesh45.model.UserDtls;
import com.ashesh45.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDtls createUser(UserDtls user) {
		
		return userRepo.save(user);
	}
	

}
