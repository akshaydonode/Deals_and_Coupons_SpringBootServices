package com.capgemini.signup_inservice.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.signup_inservice.entity.User;

@Repository
public interface UserDao extends MongoRepository<User, String>{
	
	User findByEmail(String email); 

}
