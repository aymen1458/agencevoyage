package com.example.projetPI.agenceDeVoyage.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class vol {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VOL_ID")
	private Long id; 
	private String depart ;
	private String arrivee;
	private String classe ;
	private float prix;
	private Date dateDep;
	
	
	
	
	public vol() {
	}

	public vol(Long id, String depart, String arrivee, float prix, Date dateDep) {
		this.id = id;
		this.depart = depart;
		this.arrivee = arrivee;
		this.prix = prix;
		this.dateDep = dateDep;
	}

	public Long getId() {
		return id;
	}
	
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getArrivee() {
		return arrivee;
	}
	public void setArrivee(String arrivee) {
		this.arrivee = arrivee;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public Date getDateDep() {
		return dateDep;
	}
	public void setDateDep(Date dateDep) {
		this.dateDep = dateDep;
	}

	@Override
	public String toString() {
		return "vol [id=" + id + ", depart=" + depart + ", arrivee=" + arrivee + ", prix=" + prix + ", dateDep="
				+ dateDep + "]";
	}
	
	
	
	

}
