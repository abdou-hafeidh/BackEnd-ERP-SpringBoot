package com.bezkoder.spring.jwt.mongodb.service.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.spring.jwt.mongodb.models.User;
import com.bezkoder.spring.jwt.mongodb.models.UserDiplome;
import com.bezkoder.spring.jwt.mongodb.repository.UserRepository;
import com.bezkoder.spring.jwt.mongodb.security.services.UserService;

@Service
@Transactional
public class UserServiceImp implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	PasswordEncoder encoder;
	
	@Override
	public User updateUsers(User user) {
		User usr = userRepository.findById(user.getId()).orElse(null);
		usr.setId(user.getId());
		usr.setUsername(user.getUsername());
		usr.setEmail(user.getEmail());
		usr.setPassword(encoder.encode(user.getPassword()));
		usr.setNomUsers(user.getNomUsers());
		usr.setPrenomUsers(user.getPrenomUsers());
		usr.setPosteUsers(user.getPosteUsers());
		usr.setTelUsers(user.getTelUsers());
		usr.setAdresseUsers(user.getAdresseUsers());
		usr.setDateNaissanceUsers(user.getDateNaissanceUsers());
		usr.setLinkedin(user.getLinkedin());
		usr.setImgLink(user.getImgLink());
		usr.setUserDiplome(user.getUserDiplome());
		usr.setUserExperience(user.getUserExperience());
		return userRepository.save(usr);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUsers(String id) {
		Optional <User> usr = userRepository.findById(id);
		return usr.get();
	}

	@Override
	public String deleteUsers(String id) {
		Optional <User> usr = userRepository.findById(id);
		if(usr.isPresent()) {
			 userRepository.deleteById(id);
			 return "Users is deleted by id "+ id;
		}
		throw new RuntimeException("Users not found");
	}

}
