package com.capgemini.signup_inservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.signup_inservice.dao.UserDao;
import com.capgemini.signup_inservice.entity.User;
import com.capgemini.signup_inservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	private UserDao userDao;

	@Override
	public User createUser(User user) {
		
		return userDao.save(user);
	}

	@Override
	public User findByEmail(String email) {
	
		return userDao.findByEmail(email);
	}

}
