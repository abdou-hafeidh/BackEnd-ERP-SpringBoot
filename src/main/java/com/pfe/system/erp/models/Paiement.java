package com.pfe.system.erp.models;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="paiement")
public class Paiement {

	@Id
	private String id;
	
	@Size(max = 50)
	private String date_paiement;
	
	@Size(max = 50)
	private String montant;
	
	@Size(max = 50)
	private String designation;
	
	@Size(max = 50)
	private String type_paiement;

	public Paiement(String id, String date_paiement, String montant,
					String designation, String type_paiement) {
		this.id = id;
		this.date_paiement = date_paiement;
		this.montant = montant;
		this.designation = designation;
		this.type_paiement = type_paiement;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate_paiement() {
		return date_paiement;
	}

	public void setDate_paiement(String date_paiement) {
		this.date_paiement = date_paiement;
	}

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getType_paiement() {
		return type_paiement;
	}

	public void setType_paiement(String type_paiement) {
		this.type_paiement = type_paiement;
	}

	@Override
	public String toString() {
		return "Paiement [id=" + id + ", date_paiement=" + date_paiement + ", montant=" + montant + ", designation="
				+ designation + ", type_paiement=" + type_paiement + "]";
	}
	
	
}
