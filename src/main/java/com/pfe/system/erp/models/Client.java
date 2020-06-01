package com.pfe.system.erp.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "client")
public class Client {
	
	@Id
	private String id;
	
	@Size(max = 50)
	private String nom_clt;
	
	@Size(max = 50)
	private String prenom_clt;
	
	@Size(max = 50)
	private String date_nais_clt;
	
	@Size(max = 50)
	private String adresse_clt;
	
	@Size(max = 50)
	private String fix_clt;
	
	@Size(max = 50)
	private String fax_clt;
	
	@Size(max = 50)
	private String portable_clt;
	
	@Size(max = 50)
	@Email
	private String email_clt;
	
	@Size(max = 50)
	private String createdBy;
	
	@Size(max=10)
	private String bannir = "1";

	public Client(String id, String nom_clt,  String prenom_clt, String date_nais_clt, String adresse_clt, String fix_clt,
			 String fax_clt, String portable_clt, String email_clt, String createdBy, String bannir) {
		this.id = id;
		this.nom_clt = nom_clt;
		this.prenom_clt = prenom_clt;
		this.date_nais_clt = date_nais_clt;
		this.adresse_clt = adresse_clt;
		this.fix_clt = fix_clt;
		this.fax_clt = fax_clt;
		this.portable_clt = portable_clt;
		this.email_clt = email_clt;
		this.createdBy = createdBy;
		this.bannir = bannir;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNom_clt() {
		return nom_clt;
	}

	public void setNom_clt(String nom_clt) {
		this.nom_clt = nom_clt;
	}

	public String getPrenom_clt() {
		return prenom_clt;
	}

	public void setPrenom_clt(String prenom_clt) {
		this.prenom_clt = prenom_clt;
	}

	public String getDate_nais_clt() {
		return date_nais_clt;
	}

	public void setDate_nais_clt(String date_nais_clt) {
		this.date_nais_clt = date_nais_clt;
	}

	public String getAdresse_clt() {
		return adresse_clt;
	}

	public void setAdresse_clt(String adresse_clt) {
		this.adresse_clt = adresse_clt;
	}

	public String getFix_clt() {
		return fix_clt;
	}

	public void setFix_clt(String fix_clt) {
		this.fix_clt = fix_clt;
	}

	public String getFax_clt() {
		return fax_clt;
	}

	public void setFax_clt(String fax_clt) {
		this.fax_clt = fax_clt;
	}

	public String getPortable_clt() {
		return portable_clt;
	}

	public void setPortable_clt(String portable_clt) {
		this.portable_clt = portable_clt;
	}

	public String getEmail_clt() {
		return email_clt;
	}

	public void setEmail_clt(String email_clt) {
		this.email_clt = email_clt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getBannir() {
		return bannir;
	}

	public void setBannir(String bannir) {
		this.bannir = bannir;
	}
}
