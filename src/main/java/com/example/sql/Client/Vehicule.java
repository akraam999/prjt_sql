package com.example.sql.Client;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="Vehicule")
public class Vehicule {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_vehicule;
	@Column(name="vehicule_name")
	private String vehicule_name;
	@Column(name="marque")
	private String marque;
	@Column(name="model")
	private String model;
	@Column(name="annee")
	private Date annee;
	@ManyToOne
	@JoinColumn(name="id_client")
	private Client client;
	public Vehicule(Long id_vehicule, String vehicule_name, String marque, String model, Date annee, Client client) {
		super();
		this.id_vehicule = id_vehicule;
		this.vehicule_name = vehicule_name;
		this.marque = marque;
		this.model = model;
		this.annee = annee;
		this.client = client;
	}
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId_vehicule() {
		return id_vehicule;
	}
	public void setId_vehicule(Long id_vehicule) {
		this.id_vehicule = id_vehicule;
	}
	public String getVehicule_name() {
		return vehicule_name;
	}
	public void setVehicule_name(String vehicule_name) {
		this.vehicule_name = vehicule_name;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Date getAnnee() {
		return annee;
	}
	public void setAnnee(Date annee) {
		this.annee = annee;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}

	
	
}
