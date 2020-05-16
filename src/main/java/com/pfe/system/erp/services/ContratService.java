package com.pfe.system.erp.services;

import java.util.List;

import com.pfe.system.erp.models.Contrat;


public interface ContratService {

	public Contrat insert(Contrat contrat);
	
	public List<Contrat> getAllContrat();
	
	public Contrat getContrat(String id);
	
	public Contrat update(Contrat contrat);
	
}
