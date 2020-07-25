package com.pfe.system.erp.services;

import java.util.List;

import com.pfe.system.erp.models.Paiement;

public interface PaiementService {
	
	public Paiement insert(Paiement paiement);
	
	public List<Paiement> getAllPaiement();

}
