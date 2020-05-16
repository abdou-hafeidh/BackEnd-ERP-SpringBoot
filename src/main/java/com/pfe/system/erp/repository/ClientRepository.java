package com.pfe.system.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pfe.system.erp.models.Client;

public interface ClientRepository extends MongoRepository<Client, String>{

}
