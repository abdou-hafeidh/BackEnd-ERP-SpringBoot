package com.pfe.system.erp.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfe.system.erp.models.UserDiplome;
import com.pfe.system.erp.repository.UserDiplomeRepository;
import com.pfe.system.erp.services.UserDiplomeService;

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
