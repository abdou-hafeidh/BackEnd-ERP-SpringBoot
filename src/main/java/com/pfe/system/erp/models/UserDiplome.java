package com.pfe.system.erp.models;

import javax.validation.constraints.Size;


public class UserDiplome {

	  	  
	  private String annee;
	  
	  @Size(max = 50)
	  private String lieu;
	  
	  @Size(max = 50)
	  private String diplome;
	  
	  @Size(max = 50)
	  private String etablissement;

	public UserDiplome() {
		
	}

	public UserDiplome(String annee, String lieu, String diplome, String etablissement) {
		this.annee = annee;
		this.lieu = lieu;
		this.diplome = diplome;
		this.etablissement = etablissement;
	}


	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	@Override
	public String toString() {
		return "UserDiplome [annee=" + annee + ", lieu=" + lieu + ", diplome=" + diplome
				+ ", etablissement=" + etablissement + "]";
	}
	  
	  
	  
	  
	  
}
