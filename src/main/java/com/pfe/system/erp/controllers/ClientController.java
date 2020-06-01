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

import com.pfe.system.erp.models.Client;
import com.pfe.system.erp.models.User;
import com.pfe.system.erp.services.ClientService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@PostMapping("/AddClient")
	public Client insert(@RequestBody Client client) {
		return clientService.insert(client);		
	}
	
	@GetMapping("/listClient")
	public List<Client> getAllClient() {
		return clientService.getAllClient();
	}
	
	@GetMapping("/listClient/{id}")
	public Client getClient(@PathVariable(value = "id") String id) {
		Client clt = clientService.getClient(id);
		return clt;
	}

	@PutMapping("/updateClient/{id}")
	public Client update(@RequestBody Client client) {
		return clientService.update(client);
	}
	
	@PutMapping("bannirClient/{id}")
	public Client bannirUsers(@RequestBody Client client) {
		return clientService.bannirClient(client);
	}
	
	@PutMapping("debannirClient/{id}")
	public Client debannirUsers(@RequestBody Client client) {
		return clientService.debannirClient(client);
	}
}
