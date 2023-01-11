package com.example.sql.Client;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Client")
public class Client {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_client;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom; 
	@Column(name="email")
	private String eail;
	@Column(name="password")
	private String password;
	public Client() {
		super();
	}
	public Client(Long id_client, String nom, String prenom, String eail, String password) {
		super();
		this.id_client = id_client;
		this.nom = nom;
		this.prenom = prenom;
		this.eail = eail;
		this.password = password;
	}
	public Long getId_client() {
		return id_client;
	}
	public void setId_client(Long id_client) {
		this.id_client = id_client;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEail() {
		return eail;
	}
	public void setEail(String eail) {
		this.eail = eail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
