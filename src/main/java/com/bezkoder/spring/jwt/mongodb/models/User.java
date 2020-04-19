package com.bezkoder.spring.jwt.mongodb.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
  @Id
  private String id;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 50)
  @Email
  private String email;

  @NotBlank
  @Size(max = 120)
  private String password;
  
  @NotBlank
  @Size(max=100)
  private String nomUsers;
	
  @NotBlank
  @Size(max=100)
  private String prenomUsers;
  
	@NotBlank
    @Size(max=100)
	private String posteUsers;
	
	@NotBlank
    @Size(max=100)
	private String telUsers;
	
	@NotBlank
    @Size(max=100)
	private String adresseUsers;
	
	@NotBlank
    @Size(max=100)
	private String dateNaissanceUsers;
	
	@NotBlank
    @Size(max=100)
	private String linkedin;
	
	@NotBlank
    @Size(max=100)
	private String imgLink;
	
	@NotBlank
    @Size(max=100)
	private String createdBy;
	
	
    @Size(max=100)
	private String createdDate;

  @DBRef
  private Set<Role> roles = new HashSet<>();
  
  private List<UserDiplome> userDiplome;
  
  private List<UserExperience> userExperience;

  public User() {
  }

  public User(String username, String email, String password, String nomUsers, String prenomUsers, 
		      String posteUsers , String telUsers, String adresseUsers, String dateNaissanceUsers,
		      String linkedin , String imgLink, String createdBy, String createdDate) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.nomUsers =nomUsers;
    this.prenomUsers =prenomUsers;
    this.posteUsers = posteUsers;
    this.telUsers = telUsers;
    this.adresseUsers = adresseUsers;
    this.dateNaissanceUsers = dateNaissanceUsers;
    this.linkedin = linkedin;
    this.imgLink = imgLink;
    this.createdBy = createdBy;
    this.createdDate = createdDate;
    
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

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

public String getLinkedin() {
	return linkedin;
}

public void setLinkedin(String linkedin) {
	this.linkedin = linkedin;
}

public String getImgLink() {
	return imgLink;
}

public void setImgLink(String imgLink) {
	this.imgLink = imgLink;
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

public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

public List<UserDiplome> getUserDiplome() {
	return userDiplome;
}

public void setUserDiplome(List<UserDiplome> userDiplome) {
	this.userDiplome = userDiplome;
}

public List<UserExperience> getUserExperience() {
	return userExperience;
}

public void setUserExperience(List<UserExperience> userExperience) {
	this.userExperience = userExperience;
}

  
}