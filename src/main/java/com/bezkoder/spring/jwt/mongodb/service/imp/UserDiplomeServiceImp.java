package com.bezkoder.spring.jwt.mongodb.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bezkoder.spring.jwt.mongodb.models.UserDiplome;
import com.bezkoder.spring.jwt.mongodb.repository.UserDiplomeRepository;
import com.bezkoder.spring.jwt.mongodb.security.services.UserDiplomeService;

@Service
@Transactional
public class UserDiplomeServiceImp implements UserDiplomeService{
	
	@Autowired
	private UserDiplomeRepository userDiplomeRepository;

	@Override
	public UserDiplome createDiplome(UserDiplome userDiplome) {
		// TODO Auto-generated method stub
		return userDiplomeRepository.save(userDiplome);
	}

}
