package com.pfe.system.erp.services;

import java.util.List;

import com.pfe.system.erp.models.Client;
import com.pfe.system.erp.models.User;

public interface ClientService {
	
	public Client insert(Client client);
	
	public List<Client> getAllClient();
	
	public Client getClient(String id);
	
	public Client update(Client client);
	
	public String deleteClient(String id);
	
	public Client bannirClient(Client client);
	
	public Client debannirClient(Client client);

}
