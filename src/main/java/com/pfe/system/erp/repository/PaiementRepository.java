package com.pfe.system.erp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pfe.system.erp.models.Paiement;

public interface PaiementRepository extends MongoRepository<Paiement, String>{

}
