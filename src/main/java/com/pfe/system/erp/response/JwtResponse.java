package com.pfe.system.erp.response;

import java.util.List;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private String id;
	private String username;
	private String nomUsers;	
	private String prenomUsers;	
	private String posteUsers;
	private String email;
	private List<String> roles;

	public JwtResponse(String accessToken, String id, String username, String nomUsers, String prenomUsers, String posteUsers, 
			String email, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
	    this.nomUsers =nomUsers;
	    this.prenomUsers =prenomUsers;
	    this.posteUsers = posteUsers;
		this.email = email;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}
}
