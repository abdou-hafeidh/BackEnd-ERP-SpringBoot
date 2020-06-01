package com.pfe.system.erp.services;


import org.springframework.data.domain.Pageable;

import com.pfe.system.erp.models.User;

import java.util.List;

import org.springframework.data.domain.Page;

public interface UserService {

	public User updateUsers(User user);

	public User bannirUsers(User user);
	
	public User debannirUsers(User user);
	
	public Page<User> getAllUsers(Pageable pageable);
	
	public User getUsers(String id);
	
	public String deleteUsers(String id);
	
	public List<User> getUserByCreated(String username);
	
}
