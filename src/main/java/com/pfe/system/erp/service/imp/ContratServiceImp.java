package com.pfe.system.erp.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfe.system.erp.models.Contrat;
import com.pfe.system.erp.repository.ContratRepository;
import com.pfe.system.erp.services.ContratService;

@Service
@Transactional
public class ContratServiceImp implements ContratService{
	
	@Autowired
	public ContratRepository contratRepository;

	@Override
	public Contrat insert(Contrat contrat) {		
		return contratRepository.save(contrat);
	}

	@Override
	public List<Contrat> getAllContrat() {
		
		return contratRepository.findAll();
	}

	@Override
	public Contrat getContrat(String id) {
		Optional<Contrat> cnt = contratRepository.findById(id);
		return cnt.get();
	}

	@Override
	public Contrat update(Contrat contrat) {
		Contrat cnt = contratRepository.findById(contrat.getId()).orElse(null);
		cnt.setId(contrat.getId());
		cnt.setType_contrat(contrat.getType_contrat());
		cnt.setType_contrat(contrat.getType_contrat());
		cnt.setDate_debut_contrat(contrat.getDate_debut_contrat());
		cnt.setDate_fin_contrat(contrat.getDate_fin_contrat());
		cnt.setMontant(contrat.getMontant());
		cnt.setTypePaiement(contrat.getTypePaiement());
		cnt.setCreatedBy(contrat.getCreatedBy());
		return contratRepository.save(cnt);
	}

}
