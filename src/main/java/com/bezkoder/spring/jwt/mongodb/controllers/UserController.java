package com.bezkoder.spring.jwt.mongodb.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.models.UserDiplome;
import com.bezkoder.spring.jwt.mongodb.security.services.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/listUsers")
	public List<User> getAllUsers(){
		return userService.getAllUsers();
	}
	
	@GetMapping("listUsers/{id}")
	public User getUsers(@PathVariable(value = "id") String id) {
		User usr = userService.getUsers(id);
		return usr;
	}
	
	@PutMapping("updateUser/{id}")
	public User updateUsers(@RequestBody User user) {
		return userService.updateUsers(user);
	}
	
	@DeleteMapping("deleteUser/{id}") 
	public String deleteUsers(@PathVariable(value="id") @Valid String id) {
		return userService.deleteUsers(id);
	}

}
