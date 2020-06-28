package com.pfe.system.erp.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfe.system.erp.models.Paiement;
import com.pfe.system.erp.repository.PaiementRepository;
import com.pfe.system.erp.services.PaiementService;

@Service
@Transactional
public class PaiementServiceImp implements PaiementService {

	@Autowired
	public PaiementRepository paiementRepository;
	
	@Override
	public Paiement insert(Paiement paiement) {
		// TODO Auto-generated method stub
		return paiementRepository.save(paiement);
	}

}
