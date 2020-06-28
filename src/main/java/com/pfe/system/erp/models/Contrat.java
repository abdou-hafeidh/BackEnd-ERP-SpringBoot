package com.pfe.system.erp.models;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="contrat")
public class Contrat {

	@Id
	private String id;
	
	@Size(max = 50)
	private String type_contrat;
	
	@Size(max = 50)
	private String nature_contrat;
	
	@Size(max = 50)
	private String date_debut_contrat;
	
	@Size(max = 50)
	private String date_fin_contrat;
	
	@Size(max = 50)
	private String nom_client;
	
	@Size(max = 50)
	private String montant;
	
	@Size(max = 50)
	private String datePaiement;
	
	@Size(max = 50)
	private String typePaiement;
		
	@Size(max = 50)
	private String createdBy;

	public Contrat(String id, String type_contrat, String nature_contrat,
				   String date_debut_contrat, String date_fin_contrat, String nom_client, 
				   String montant, String datePaiement, String typePaiement, String createdBy) {
		this.id = id;
		this.type_contrat = type_contrat;
		this.nature_contrat = nature_contrat;
		this.date_debut_contrat = date_debut_contrat;
		this.date_fin_contrat = date_fin_contrat;
		this.nom_client = nom_client;
		this.montant = montant;
		this.datePaiement = datePaiement;
		this.typePaiement = typePaiement;
		this.createdBy = createdBy;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType_contrat() {
		return type_contrat;
	}

	public void setType_contrat(String type_contrat) {
		this.type_contrat = type_contrat;
	}

	public String getNature_contrat() {
		return nature_contrat;
	}

	public void setNature_contrat(String nature_contrat) {
		this.nature_contrat = nature_contrat;
	}

	public String getDate_debut_contrat() {
		return date_debut_contrat;
	}

	public void setDate_debut_contrat(String date_debut_contrat) {
		this.date_debut_contrat = date_debut_contrat;
	}

	public String getDate_fin_contrat() {
		return date_fin_contrat;
	}

	public void setDate_fin_contrat(String date_fin_contrat) {
		this.date_fin_contrat = date_fin_contrat;
	}
	
	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}
	
	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getDatePaiement() {
		return datePaiement;
	}

	public void setDatePaiement(String datePaiement) {
		this.datePaiement = datePaiement;
	}

	public String getTypePaiement() {
		return typePaiement;
	}

	public void setTypePaiement(String typePaiement) {
		this.typePaiement = typePaiement;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	
}
