package com.capgemini.signup_inservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.signup_inservice.entity.User;
import com.capgemini.signup_inservice.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signUp")
	public ResponseEntity<User> registerNewUser(@RequestBody User user){
		
		User newUser = userService.createUser(user);
		System.out.println(newUser);
		return new ResponseEntity<User>(newUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/signIn/{email}/{password}")
	public ResponseEntity<User> logInDetailsForUser(@PathVariable String email,@PathVariable String password) throws NullPointerException{

		System.out.println(email);
		System.out.println(password);
		
		User user = userService.findByEmail(email);
		
		if((user.getEmail().equals(email)) && (user.getPassword().equals(password))) {
			return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
		}
		
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);		
		
	}

}
