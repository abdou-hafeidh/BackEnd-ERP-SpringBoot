package com.pfe.system.erp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.system.erp.models.Paiement;
import com.pfe.system.erp.services.PaiementService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("paiement")
public class PaiementController {
	
	@Autowired
	public PaiementService paiementService;
	
	@PostMapping("/AddPaiement")
	public Paiement insert(@RequestBody Paiement paiement) {
		return paiementService.insert(paiement);
	}
	
	@GetMapping("/allPaiment")
	public List<Paiement> getAllPaiement() {
		return paiementService.getAllPaiement();
		
	}

}
