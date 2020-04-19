package com.bezkoder.spring.jwt.mongodb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bezkoder.spring.jwt.mongodb.models.UserDiplome;
import com.bezkoder.spring.jwt.mongodb.security.services.UserDiplomeService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("userDiplome")
public class UserDiplomeController{
	
	@Autowired
	private UserDiplomeService userDiplomeService ;
	
	@PostMapping("/AddDiplome")
	public String createDiplome(@RequestBody UserDiplome userDiplome) {
		userDiplomeService.createDiplome(userDiplome);
		return "success";
	}

}
