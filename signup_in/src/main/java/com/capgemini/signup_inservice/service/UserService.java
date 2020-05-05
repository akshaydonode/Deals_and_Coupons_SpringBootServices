package com.capgemini.signup_inservice.service;

import org.springframework.stereotype.Service;

import com.capgemini.signup_inservice.entity.User;

@Service
public interface UserService {
	
	public User createUser(User user);
	
	public User findByEmail(String email);

}
