package com.pfe.system.erp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pfe.system.erp.models.Contrat;
import com.pfe.system.erp.services.ContratService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("contrat")
public class ContratController {
	
	@Autowired
	private ContratService contratService;
	
	@PostMapping("/AddContrat")
	public Contrat insert(@RequestBody Contrat contrat) {
		return contratService.insert(contrat);
	}
	
	@GetMapping("/ListContrat")
	public List<Contrat> getAllContrat() {
		return contratService.getAllContrat();
	}
	
	@GetMapping("/ListContrat/{id}")
	public Contrat getContrat(@PathVariable(value = "id") String id) {
		Contrat cnt =  contratService.getContrat(id);
		return cnt;
	}
	
	@PutMapping("UpdateContrat/{id}")
	public Contrat update(@RequestBody Contrat contrat) {
		return contratService.update(contrat);
	}

}
