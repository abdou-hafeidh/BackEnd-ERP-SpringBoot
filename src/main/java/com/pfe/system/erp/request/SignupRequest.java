package com.pfe.system.erp.request;

import java.util.Set;

import javax.validation.constraints.*;
 
public class SignupRequest {
    
    @Size(min = 3, max = 20)
    private String username;
 
    
    @Size(max = 50)
    @Email
    private String email;
    
    
    @Size(max=100)
    private String nomUsers;
  	
    
    @Size(max=100)
    private String prenomUsers;
    
    
    @Size(min = 6, max = 40)
    private String password;
    
	
    @Size(max=100)
	private String posteUsers;
	
	
    @Size(max=100)
	private String telUsers;
	
	
    @Size(max=100)
	private String adresseUsers;
	
	
    @Size(max=100)
	private String dateNaissanceUsers;
	
	
    @Size(max=100)
	private String createdBy;
	
	
    @Size(max=100)
	private String createdDate;
	
    private Set<String> roles;
    
    @Size(max=10)
	private String bannir = "1";
    
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getNomUsers() {
		return nomUsers;
	}

	public void setNomUsers(String nomUsers) {
		this.nomUsers = nomUsers;
	}

	public String getPrenomUsers() {
		return prenomUsers;
	}

	public void setPrenomUsers(String prenomUsers) {
		this.prenomUsers = prenomUsers;
	}

	public String getPosteUsers() {
		return posteUsers;
	}

	public void setPosteUsers(String posteUsers) {
		this.posteUsers = posteUsers;
	}

	public String getTelUsers() {
		return telUsers;
	}

	public void setTelUsers(String telUsers) {
		this.telUsers = telUsers;
	}

	public String getAdresseUsers() {
		return adresseUsers;
	}

	public void setAdresseUsers(String adresseUsers) {
		this.adresseUsers = adresseUsers;
	}

	public String getDateNaissanceUsers() {
		return dateNaissanceUsers;
	}

	public void setDateNaissanceUsers(String dateNaissanceUsers) {
		this.dateNaissanceUsers = dateNaissanceUsers;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Set<String> getRoles() {
      return this.roles;
    }
    
    public void setRole(Set<String> roles) {
      this.roles = roles;
    }

	public String getBannir() {
		return bannir;
	}

	public void setBannir(String bannir) {
		this.bannir = bannir;
	}
       
}
