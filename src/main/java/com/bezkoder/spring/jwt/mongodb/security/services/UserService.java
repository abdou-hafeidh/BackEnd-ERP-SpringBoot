package com.bezkoder.spring.jwt.mongodb.security.services;

import java.util.List;


import com.bezkoder.spring.jwt.mongodb.models.User;

public interface UserService {

	public User updateUsers(User user);
	
	public List<User> getAllUsers();
	
	public User getUsers(String id);
	
	public String deleteUsers(String id);
}
