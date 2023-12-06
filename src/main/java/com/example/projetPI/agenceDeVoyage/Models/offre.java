package com.example.projetPI.agenceDeVoyage.Models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class offre {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OFFRE_ID")
	private Long id ;
	@Column(name="nom")
	private String name ;
	private float prix;
	@ManyToOne
	@JoinColumn(name = "DESTINATION_ID", nullable = true)
	private destination destination;
	private String description;
	private String duree;
	private Date dateDeb;
	
	
	
	public offre() {
	}


	public offre(Long id, String name, float prix, destination destination, String description, String duree, Date dateDeb) {
		this.id = id;
		this.name = name;
		this.prix = prix;
		this.destination = destination;
		this.description = description;
		this.duree = duree;
		this.dateDeb = dateDeb;
	}



	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Long getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getPrix() {
		return prix;
	}



	public void setPrix(float prix) {
		this.prix = prix;
	}



	public destination getDestination() {
		return destination;
	}



	public void setDestination(destination destination) {
		this.destination = destination;
	}



	public String getDuree() {
		return duree;
	}



	public void setDuree(String duree) {
		this.duree = duree;
	}



	public Date getDate_deb() {
		return dateDeb;
	}



	public void setDate_deb(Date date_deb) {
		this.dateDeb = date_deb;
	}


	@Override
	public String toString() {
		return "offre [id=" + id + ", name=" + name + ", prix=" + prix + ", destination=" + destination
				+ ", description=" + description + ", duree=" + duree + ", dateDeb=" + dateDeb + "]";
	}



	
	
	
	
	
	
}
