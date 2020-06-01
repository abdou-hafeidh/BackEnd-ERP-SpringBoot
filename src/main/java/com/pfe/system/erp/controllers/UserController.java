package com.pfe.system.erp.controllers;

import org.springframework.data.domain.Pageable;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.system.erp.models.User;
import com.pfe.system.erp.services.UserService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/listUsers")
	public Page<User> getAllUsers(Pageable pageable){
		return userService.getAllUsers(pageable);
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
	
	@PutMapping("bannirUser/{id}")
	public User bannirUsers(@RequestBody User user) {
		return userService.bannirUsers(user);
	}
	
	@PutMapping("debannirUser/{id}")
	public User debannirUsers(@RequestBody User user) {
		return userService.debannirUsers(user);
	}
	
	@DeleteMapping("deleteUser/{id}") 
	public String deleteUsers(@PathVariable(value="id") @Valid String id) {
		return userService.deleteUsers(id);
	}
	
	@GetMapping("listMember/{id}")
	public List<User> getUserByCreated(@PathVariable(value="id") String id) {
		return userService.getUserByCreated(id);
	}


}
