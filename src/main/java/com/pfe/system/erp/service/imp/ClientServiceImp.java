package com.pfe.system.erp.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pfe.system.erp.models.Client;
import com.pfe.system.erp.repository.ClientRepository;
import com.pfe.system.erp.services.ClientService;

@Service
@Transactional
public class ClientServiceImp implements ClientService{
	
	@Autowired
	public ClientRepository clientRepository;

	@Override
	public Client insert(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public List<Client> getAllClient() {
		return clientRepository.findAll();
	}

	@Override
	public Client getClient(String id) {
		Optional<Client> clt = clientRepository.findById(id);
		return clt.get();
	}

	@Override
	public String deleteClient(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client update(Client client) {
		Client clt = clientRepository.findById(client.getId()).orElse(null);
		clt.setNom_clt(client.getNom_clt());
		clt.setPrenom_clt(client.getPrenom_clt());
		clt.setDate_nais_clt(client.getDate_nais_clt());
		clt.setAdresse_clt(client.getAdresse_clt());
		clt.setFix_clt(client.getFix_clt());
		clt.setFax_clt(client.getFax_clt());
		clt.setPortable_clt(client.getPortable_clt());
		clt.setEmail_clt(client.getEmail_clt());
		clt.setCreatedBy(client.getCreatedBy());
		return clientRepository.save(clt);
	}

	@Override
	public Client bannirClient(Client client) {
		Client clt = clientRepository.findById(client.getId()).orElse(null);
		clt.setBannir("0");
		return clientRepository.save(clt);
	}

	@Override
	public Client debannirClient(Client client) {
		Client clt = clientRepository.findById(client.getId()).orElse(null);
		clt.setBannir("1");
		return clientRepository.save(clt);
	}

}
